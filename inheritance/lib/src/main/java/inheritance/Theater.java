package inheritance;

import java.util.ArrayList;

public class Theater {

    private String name;
    private ArrayList<String> movieShowings;
    private ArrayList<Review> userTheaterReview;
    public int reviewCounter = 0;

    public Theater(String name) {
        this.name = name;
        movieShowings = new ArrayList<>();
        userTheaterReview = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<String> getMovieShowings() {
        return movieShowings;
    }

    public void setMovieShowings(ArrayList<String> movieShowings) {
        this.movieShowings = movieShowings;
    }

    public ArrayList<Review> getUserTheaterReview() {
        return userTheaterReview;
    }

    public void setUserRestaurantReview(ArrayList<Review> userRestaurantReview) {
        this.userTheaterReview = userRestaurantReview;
    }

    public void addMovie(String movie){
        movieShowings.add(movie);
    }

    public void removeMovie(String movie, String newMovie){
        movieShowings.remove(movie);
        movieShowings.add(newMovie);
    }

    public void addTheaterReview(Review review) {
        if (!userTheaterReview.contains(review)){
            userTheaterReview.add(review);
            reviewCounter++;
        }
    }

    @Override
    public String toString(){
        return "Theater: " + this.getName() ;
    }
}
