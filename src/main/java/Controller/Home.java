package Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Home extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

//        List<ApplicantInput> applicantInputs = CSVParser.getApplicantInputs("input.csv");
//
//        for (ApplicantInput applicantInput : applicantInputs){
//            ApplicantRecord record = ReportBuilder.generateReport(applicantInput);
//
////            System.out.println(record);
//
//            PDFGenerator.generatePDF(record);
//        }

        System.out.println("Ping");

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/home.fxml"));

        Scene newScene = new Scene(root, 472,128);
        primaryStage.setScene(newScene);
        primaryStage.setTitle("My Life My Future");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
