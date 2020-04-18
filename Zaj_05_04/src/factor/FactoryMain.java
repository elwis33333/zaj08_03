package factor;

public class FactoryMain {
    public static void main(String[] args) {
        Report pdfDoc = FactoryReport.getReport("pdf","dwadwa");
        Report xmlDoc = FactoryReport.getReport("xml","dawdwa");
        pdfDoc.print();
        xmlDoc.print();
    }
}
