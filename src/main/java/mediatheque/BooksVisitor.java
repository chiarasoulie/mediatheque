package mediatheque;

public class BooksVisitor implements ItemVisitor{

    @Override
    public void visit(Book book) {
        System.out.println("Book :" + book.getTitle() +"-"+book.getAuthor() );
    }

    @Override
    public void visit(CD cd) {
        // Ne rien faire
    }
}