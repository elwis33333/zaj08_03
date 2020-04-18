package factory;

public class FactoryReport {

    public static Report getReport(String type, String reportData) {
        switch (type.toUpperCase()) {
            case "PDF":
                return new PDFReport_v2(reportData);
            case "XML":
                return new XMLReport(reportData);
            case "HTML":
            case "JSON":
            case "CSV":
                return new NoneReport();
            default:
                return null;
        }

    }

}
