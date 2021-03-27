package rozwiazania.zad41;

public class MovieDemo {

/*    Zadanie powtórkowe:
    Pomyśl o jakiejś rzeczy. Jeśli nie masz pomysłu wybierz coś z następującej listy:

    paczka, kwiat, pies, pralka, książka, telewizor, papuga, statek, szkola, pogoda, produkt, lek, figurka, wykres, film, portfel, posiłek, państwo, buty, telefon, bankomat, zdrapka

    Przygotuj klasę do tworzenia obiektów wybranego typu oraz nadaj im 3 cechy (prywatne).
    Dla każdej z cech zastanów się jak ma być uzupełniana, zawsze przy tworzeniu obiektu jak np. cena produktu czy automatycznie ustawiana na stałą wartość (przebieg = 0 dla nowego samochodu) a może ma być losowana lub generowana? Przygotuj odpowiedni/e konstruktory.
    Stwórz 2 różne przykłądowe obiekty w mainie. Wyświetl je wykorzystując metodę toString
    Przygotuj dwa zachowania (metody), zastosuj w conajmniej jednej z nich zwracanie lub  przyjmowanie wartości np.
    Kwiat: zakwitnij()
    Papuga: uczSieSlowa(String slowo)
    Figurka: pomaluj(String kolor)
    przygotuj pomocniczą klasę która wykorzysta stworzony obiekt i wykona jakieś zadanie z nim związane np:
    Ogród: zerwijZakwitnieteKwiaty(Kwiat[] kwiaty)
    Pirat: nakarmPapuge(Papuga papuga)
    Kolekcjoner: pomalujCzarneFigurki(Figurka[] figurki)
    pamiętaj, żeby stosować gettery, settery oraz własne metody aby posługiwać się swoimi obiektami np:

    public void podpiszKsiazke(Ksiazka ksiazka){
        if ( ! ksiazka.isPodpisana() ) {
            ksiazka.setPodpis(“J. K. Rowling”);
        }
    }*/

    public static void main(String[] args) {
        Movie movie = new Movie("Braveheart");
        Movie movie2 = new Movie("300 Spartan");
        Movie movie3 = new Movie("Smoleńsk");


        movie2.watch();
        movie.giveRating(5);
        movie2.giveRating(4);
        movie3.giveRating(2);

        System.out.println(movie);
        System.out.println(movie2);
        System.out.println(movie3);

        Movie[] movies = {movie,movie2,movie3};

        Netflix netflix = new Netflix(movies);
        netflix.showUnwatchedMovies();
        netflix.watchMovie("Matrix");
        netflix.watchMovie("Smoleńsk");
        netflix.showUnwatchedMovies();
    }
}
