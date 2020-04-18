package visitor;

class DeliveryVisitor implements MyVisitor{
    private static final float PACKAGE_FACTOR=1.15f;
    public float visit(Book book){ return book.getWeight() * PACKAGE_FACTOR;}
    public float visit(DiscDVD discDVD){ return discDVD.getWeight() * PACKAGE_FACTOR;}
    public float visit(Perfume perfume){ return perfume.getWeight() * PACKAGE_FACTOR;}
}
