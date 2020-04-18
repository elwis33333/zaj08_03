package factory;

public class PDFReport_v2 implements Report {
    private String reportBody;

    public PDFReport_v2(String data) {
        this.reportBody = data;
    }

    @Override
    public void print() {
        System.out.println("PDF Report V2");
        System.out.println(reportBody);
        System.out.println("------------------------------");
    }
}
