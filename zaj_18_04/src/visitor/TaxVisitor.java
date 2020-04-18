package visitor;

public class TaxVisitor implements MyVisitor {

    public float visit(Book book){ return book.getPrice() * (book.getTax()-1);}
    public float visit(DiscDVD discDVD){ return discDVD.getPrice() * (discDVD.getTax()-1);}
    public float visit(Perfume perfume){ return perfume.getPrice() * (perfume.getTax()-1);}
}
