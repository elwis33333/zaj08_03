package factory;

public class FactoryMain {
    public static void main(String[] args) {
        Report pdfDoc = FactoryReport.getReport("pdf", "Some data ...");
        Report xmlDoc = FactoryReport.getReport("XML", "Some data ...");
        Report csvDoc = FactoryReport.getReport("csv", "Some data ...");

        pdfDoc.print();
        xmlDoc.print();
        csvDoc.print();
    }
}
