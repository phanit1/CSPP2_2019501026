public class Patron {
    String PatronName;
    String PatronNum;
    String ticket;
    Patron(String PatronName, String PatronNum) {
        this.PatronName = PatronName;
        this.PatronNum = PatronNum;
    }
    public void setTicket(String t) {
        this.ticket = t;
    }
    public String toString() {
        return this.ticket;
    }
}
