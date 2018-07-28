package Logic;

public class SectionOne {
    public static String getProfession(int choice){
        switch (choice) {
            case 1: return "Agriculture, Food & Natural Resources\n" +
                    "The production, processing, marketing, distribution, financing, and development of agricultural commodities and resources including food, fiber, wood products, natural resources, horticulture, and other plant and animal products/resources.\n";
            case 2: return "Architecture & Construction\n" +
                    "Careers in designing, planning, managing, building, and maintaining the built environment.\n";
            case 3: return "Arts, A/V Technology & Communications\n" +
                    "Designing, producing, exhibiting, performing, writing, and publishing multimedia content including visual and performing arts and design, journalism, and entertainment services.\n";
            case 4: return "Business Management & Administration\n" +
                    "Business Management and Administration careers encompass planning, organizing, directing and evaluating business functions essential to efficient and productive business operations. Business Management and Administration career opportunities are available in every sector of the economy.\n";
            case 5: return "Education & Training \n" +
                    "Planning, managing, and providing education and training services, and related learning support services.\n";
            case 6: return "Finance\n" +
                    "Planning, services for financial and investment planning, banking, insurance, and business financial management.\n";
            case 7: return "Government & Public Administration\n" +
                    "Executing governmental functions to include governance; national security; Foreign Service; planning; revenue and taxation; regulation; and management and administration at the local, state, and federal levels.\n";
            case 8: return "Health Science\n" +
                    "Planning, managing, and providing therapeutic services, diagnostic services, health informatics, support services, and biotechnology research and development.\n";
            case 9: return "Hospitality & Tourism \n" +
                    "Hospitality and Tourism encompasses the management, marketing and operations of restaurants and other food services, lodging, attractions, and recreation events and travel-related services. \n";
            case 10: return "Human Services\n" +
                    "Preparing individuals for employment in career pathways that relate to families and human needs. Career Counselling, Academic Consultant, Personal Counselor \n";
            case 11: return "Information Technology\n" +
                    "Building linkages in IT occupations framework for entry-level, technical, and professional careers related to the design, development, support and management of hardware, software, multimedia, and systems integration services.\n";
            case 12: return "Law, Public Safety, Corrections & Security\n" +
                    "Planning, managing, and providing legal, public safety, protective services and homeland security, including professional and technical support services.\n";
            case 13: return "Manufacturing\n" +
                    "Planning, managing and performing the processing of materials into intermediate or final products and related professional and technical support activities such as production planning and control, maintenance, and manufacturing/process engineering.\n";
            case 14: return "Marketing, Sales & Services\n" +
                    "Planning, managing, and performing marketing activities to reach organizational objectives.\n";
            case 15: return "Science, Technology, Engineering & Mathematics\n" +
                    "Planning, managing, and providing scientific research and professional and technical services (e.g., physical science, social science, engineering), including laboratory and testing services, and research and development services.\n";
            case 16: return "Transportation, Distribution & Logistics\n" +
                    "Planning, management, and movement of people, materials, and goods by road, pipeline, air, rail and water and related professional and technical support services such as transportation infrastructure planning and management, logistics services, mobile equipment, and facility maintenance.\n";
            default: return "error";
        }
    }
}
