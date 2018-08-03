package Controller;

import Model.ApplicantInput;
import Model.ApplicantRecord;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;


public class Home extends Application {

    @FXML public Button vGenerateReports;
    public Button vValidateCSV;

    public static void main(String[] args) {
        preConditionCheck();
        launch(args);
    }

    private static void preConditionCheck() {
        File outputFolder = new File("output");
        if (!outputFolder.exists()){
            new File("output").mkdir();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/home.fxml"));

        Scene newScene = new Scene(root, 280,110);
        primaryStage.setScene(newScene);
        primaryStage.setTitle("My Life My Future");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void validateCSV(ActionEvent actionEvent) {

        FileChooser fc = new FileChooser();
        fc.setTitle("Select the source CSV file");
        File file = fc.showOpenDialog( (Stage) vValidateCSV.getScene().getWindow());
        CSVParser.validateCSV(file.getAbsolutePath());
    }

    public void generateReports(ActionEvent actionEvent) {
        Queue<ApplicantInput> jobQueue = new ArrayDeque<>();

        FileChooser fc = new FileChooser();
        fc.setTitle("Select the source CSV file");
        File file = fc.showOpenDialog( (Stage) vGenerateReports.getScene().getWindow());

        // validate file
        CSVParser.validateCSV(file.getAbsolutePath());

        CSVParser.getApplicantInputs(file.getAbsolutePath(), jobQueue);

        int recordsCount = jobQueue.size();
        while (!jobQueue.isEmpty()){
            ApplicantInput input = jobQueue.poll();
            ApplicantRecord record = ReportBuilder.generateReport(input);
            PDFGenerator.generatePDF(record);
        }
        // TODO:vr too many file opens. optimise it
        File f = new File("output");

        String message = "Generated " + recordsCount + " records at " + f.getAbsolutePath();;

        alert(Alert.AlertType.INFORMATION, "Generation Success", message);
    }

    private void alert(Alert.AlertType type, String header, String message) {
        Alert alert = new Alert(type);
        alert.setTitle("MLMF Record Processor");
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
