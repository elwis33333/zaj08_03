package visitor;

public class DiscDVD implements Element{

    private String title;
    private float price;
    private float weight;
    public float tax;
    private boolean inPromotion=false;

    public DiscDVD(String title, float price, float weight, float tax) {
        this.title = title;
        this.price = price;
        this.weight = weight;
        this.tax = tax;
    }

    @Override
    public float accept(MyVisitor visitor) {
        return visitor.visit(this);
    }
    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getTax() {
        return tax;
    }
    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isInPromotion() {
        return inPromotion;
    }

    public void setInPromotion(boolean inPromotion) {
        this.inPromotion = inPromotion;
    }
}