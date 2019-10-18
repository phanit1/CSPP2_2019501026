final class Menu {
    private Menu() {

    }
    /**.
     * this is a main function.
     * @param args , used for main  function.
     */
    public  static void main(final String[] args) {
    CardCatalog catalog = new CardCatalog();
    Card a = new Card("HOund", "Holmes", "thrilling");
    Card b = new Card("HOun", "Holme", "thrill");
    catalog.addCard(a);
    catalog.addCard(b);
    catalog.printCatalog();
    System.out.println(catalog.searchTitle("HOund"));
    System.out.println(catalog.searchAuthor("Holme"));
    catalog.removeTitle("HOund");
    catalog.printCatalog();
}
}
