package factor;

public class FactoryReport {

    public static Report getReport(String type, String reportData){
        switch(type.toUpperCase()){
            case "PDF" :
                return new PDFReport(reportData);
            case "XML" :
                return new XMLReport(reportData);
            case "HTML":
                return null;
            case "JSON":
                return null;
            default:
                return null;
        }
    }
}
