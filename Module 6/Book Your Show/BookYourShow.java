public class BookYourShow {
    public Show[] shows;
    public int showCount;
    BookYourShow() {
        this.shows = new Show[10];
        this.showCount = 0;
    }

    public void addAShow(Show show) {
            shows[showCount] = show;
            showCount++;        
    }

    public void printShows() {
        for(int i = 0; i <showCount; i++) {
            System.out.println(shows[i].toString());
        }
    }

    public Show getAShow(String moviename, String datetime) {
        for (int i = 0; i < showCount; i++) {

                if (shows[i].getMovie().equals(moviename) && shows[i].getDateTime().equals(datetime)) {
                    return shows[i];
                }
            }
        return null;
    }
    public boolean removeAMovie(String movieName) {
            for (int i = 0; i < showCount; i++) {
                if (shows[i].getMovie() == movieName) {
                    for (int j = i + 1; j < showCount; j++) {
                        shows[i] = shows[j];
                        i++;
                    }
                    shows[showCount] = null;
                    showCount--;
                    return true;
                }
            }
            return false;
        }
}
