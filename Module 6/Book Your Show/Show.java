public class Show {
    String moviename;
    String datetime;
    String[] seats;
    Show (String moviename, String datetime, String[] seats) {
        this.moviename = moviename;
        this.datetime = datetime;
        this.seats = seats;
    }
    public String getMovie() {
    return this.moviename ;
    }
    public String getDateTime() {
    return this.datetime ;
    }
    public String[] getSeats() {
    return this.seats ;
    }
    public String toString(){
        String t = this.moviename +" : "+ this.datetime+"\n"+"Available seats:-";
        for(int i = 0; i < seats.length;i++){
            if(seats[i] != null){
                t += seats[i] + " ";
            }
		}
        return t;
    }
    public void printTickets(Patron p) {
        if (p.ticket!= "") {
            System.out.println("\nMovie name: " + moviename + ": Date: " + datetime);
            System.out.println("Patron name: " + p.PatronName + " Patron mobile no. : " + p.PatronNum + " \nConfirmed Seat numbers: " + p.ticket +"\n");
        }
        else {
            System.out.println("You are trying to book tickets which are already booked or not there.So Booking is failed");
        }
    }
    public void bookAShow(Patron p, String[] bookedSeats) {
        String ticket = "";
        int c = 0;
        for (int i = 0; i < seats.length;i++){
            for (int j = 0; j < bookedSeats.length;j++){
                if (seats[i] != null) {
                    if (seats[i].equals(bookedSeats[j])) {
                        ticket += seats[i] + " ";
                        seats[i] = null;
                    }
                }
                else {
                    c += 1;
                }
            }
        }
        p.setTicket(ticket);
        }
    }
