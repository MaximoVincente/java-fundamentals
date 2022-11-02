package inheritance;

import java.util.ArrayList;

class MovieReview extends Review{
    public String movieName;
    MovieReview(String movieName, double starRating, String body, String author){
        super(starRating, body, author);
        this.movieName = movieName;

    }
}
