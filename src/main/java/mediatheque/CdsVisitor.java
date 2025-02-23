package mediatheque;

public class CdsVisitor implements ItemVisitor {

    @Override
    public void visit(CD cd) {
        System.out.println("CD { title = " + cd.getTitle() + " , numberOfTracts = " + cd.getNumberOfTracks() + " }");
    }

    @Override
    public void visit(Book book) {
        // Ne rien faire
    }
}