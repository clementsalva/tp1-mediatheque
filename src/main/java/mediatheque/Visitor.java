package mediatheque;

public interface Visitor {
        void visit(Book b);
        void visit(CD c);

    }
