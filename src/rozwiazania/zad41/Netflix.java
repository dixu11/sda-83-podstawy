package rozwiazania.zad41;

public class Netflix {

    private Movie[] movies;

    public Netflix(Movie[] movies) {
        this.movies = movies;
    }

    public void showUnwatchedMovies(){ // wyświetla tytuły wszystkich nie obejzanych filmów
        System.out.println("Twoje nie obejzane filmy: ");
        for(Movie movie: movies){
            if (!movie.isWatched()) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public void watchMovie(String movieTitle){
        for(Movie movie: movies){
           if(movie.getTitle().equalsIgnoreCase(movieTitle) ){
               System.out.println("Oglądasz film: " + movie.getTitle());
               movie.watch();
               return; // przerywam jeśli znajdzie film
           }
        }
        System.out.println("Nie ma filmu o tym tytule :(");
    }


}
