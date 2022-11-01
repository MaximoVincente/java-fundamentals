package inheritance;

public class Review  {

    private String body;
    private double starRating;
    private String author;



    public Review(double starRating, String body, String author) {

        this.body = body;
        this.starRating = starRating;
        this.author = author;

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return  "Star Rating: " + getStarRating() + " Review: " + getBody() + " Author: " + getAuthor();
    }
}
