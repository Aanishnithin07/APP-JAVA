package tutorial4;

class Movie {
    String title;
    int[] ratings; // from 5 viewers

    Movie(String title, int[] ratings) {
        this.title = title;
        this.ratings = ratings;
    }

    double getAverageRating() {
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.length;
    }
}

public class MovieRatings {
    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("Inception", new int[]{5, 4, 5, 5, 4}),
            new Movie("Interstellar", new int[]{4, 5, 5, 4, 5}),
            new Movie("Tenet", new int[]{3, 4, 4, 3, 4}),
            new Movie("Dunkirk", new int[]{4, 4, 5, 4, 4})
        };

        Movie best = movies[0];
        for (Movie m : movies) {
            if (m.getAverageRating() > best.getAverageRating()) {
                best = m;
            }
        }

        System.out.println("Best Movie: " + best.title + 
                           " with average rating " + best.getAverageRating());
    }
}
