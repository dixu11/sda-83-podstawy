package rozwiazania.zad41;

public class Movie {
    private String title;
    private int yourRating = 0; // 1-5 -> 0 -> brak oceny
    private boolean watched = false;

    public Movie(String title) {
        this.title = title;
    }

    public void watch(){
        watched = true;
    }

    public void giveRating(int rating){
        if (rating < 1 || rating > 5) {
            System.out.println("Ocena z niepoprawnego zakresu");
            return;
        }
        yourRating = rating;
    }

    public String getTitle(){
        return title;
    }

    public boolean isWatched(){
        return watched;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", yourRating=" + yourRating +
                ", watched=" + watched +
                '}';
    }
}
