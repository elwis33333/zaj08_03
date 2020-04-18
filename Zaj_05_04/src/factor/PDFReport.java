package factor;

public class PDFReport implements Report{

    private String reportBody;

    public PDFReport(String data) {
        this.reportBody = data;
    }

    @Override
    public void print() {
        System.out.println("PDF Report");
        System.out.println(reportBody);
    }
}
