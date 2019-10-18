class Card {
    /**.
     * title is used for declaring title of book.
     */
    private String title;
    /**.
    * author is used for declaring author of book.
    * author
    */
    private String author;
    /**.
    * subject is used for declaring subject of book.
    * subject
    */
    private String subject;
Card(final String t, final String a, final String s) {
    this.title = t;
    this.author = a;
    this.subject = s;
}
public String toString() {
    return "{ Title = " + this.title + ", Author = " + this.author
    +  ", Subject = " + this.subject + " }";
}
public String getTitle() {
    return this.title;
}
public String getAuthor() {
    return this.author;
}
public String getSubject() {
    return this.subject;
}
public void setName(final String toSet) {
    this.title = toSet;
}
public void setEmail(final String toSet) {
    this.author = toSet;
}
public void setPhoneNumber(final String toSet) {
    this.subject = toSet;
}
}
