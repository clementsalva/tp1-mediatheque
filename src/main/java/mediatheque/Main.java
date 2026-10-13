package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("J.K Rolling", "Harry Potter"));
        mediatheque.addItem( new CD(18, "Destin"));
        mediatheque.addItem( new CD(19, "ALVALM"));
        mediatheque.addItem( new CD(18, "C'est pas des LOL"));
        mediatheque.addItem( new CD(18, "Loin du monde"));
        mediatheque.addItem( new CD(18, "Jefe"));
        mediatheque.addItem( new CD(18, "MILS 2.0"));
        System.out.println("==Print Catalog==");
        mediatheque.printCatalog();
        System.out.println("\n==Print Only Book==");
        Visitor v1= new printOnlyBooks();
        mediatheque.accept(v1);
        System.out.println("\n==Print Only CD==");
        Visitor v2= new printOnlyCDs();
        mediatheque.accept(v2);
    }
}