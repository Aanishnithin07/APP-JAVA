
package tutorial3;

class Movie {
    String title;
    String genre;
    double rating;

    void showDetails() {
        System.out.println("Title: " + title + ", Genre: " + genre + ", Rating: " + rating);
    }

    public static void main(String[] args) {
        Movie mv = new Movie();
        mv.title = "Inception";
        mv.genre = "Sci-Fi";
        mv.rating = 8.8;

        mv.showDetails();
    }
}
