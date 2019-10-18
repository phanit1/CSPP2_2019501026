class CardCatalog {
    /**.
     * menu is used for array of cards.
     */
    private Card[] menu;
    /**.
     * cardCount is used for count of cards in menu.
     */
    private int cardCount;
    CardCatalog() {
        final int hundred = 100;
        this.cardCount = 0;
        this.menu = new Card[hundred];
    }
        public void addCard(final Card card) {
            menu[cardCount] = card;
            cardCount++;
        }
        public Card searchTitle(final String searchTitle) {
            for (int i = 0; i < cardCount; i++) {
                if (menu[i].getTitle() == searchTitle) {
                    return menu[i];
                }
            }
        return null;
        }
        public Card searchAuthor(final String searchAuthor) {
            for (int i = 0; i < cardCount; i++) {
                if (menu[i].getAuthor() == searchAuthor) {
                    return menu[i];
                }
            }
        return null;
        }
        public Card searchSubject(final String searchSubject) {
            for (int i = 0; i < cardCount; i++) {
                if (menu[i].getSubject() == searchSubject) {
                    return menu[i];
                }
            }
        return null;
        }
        public boolean removeTitle(final String removeTitle) {
            for (int i = 0; i < cardCount; i++) {
                if (menu[i].getTitle() == removeTitle) {
                    for (int j = i + 1; j < cardCount; j++) {
                        menu[i] = menu[j];
                        i++;
                    }
                    menu[cardCount] = null;
                    cardCount--;
                    return true;
                }
            }
            return false;
        }
        public void printCatalog() {
            for (int i = 0; i < cardCount; i++) {
                System.out.println(menu[i]);
            }
        }
}
