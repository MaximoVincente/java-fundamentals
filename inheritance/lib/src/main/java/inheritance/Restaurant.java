/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.ArrayList;

public class Restaurant {

    private String name;
   private double stars;
   private String dollarSign;

   private ArrayList<Review> review = new ArrayList<>();

    public Restaurant(String name, double stars, String dollarSign) {
        this.name = name;
        this.stars = stars;
        this.dollarSign = dollarSign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        while (stars <= 5 || stars >= 0){
        }
        this.stars = stars;
    }

    public String getDollarSign() {
        return dollarSign;
    }

    public void setDollarSign(String dollarSign) {
        this.dollarSign = dollarSign;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" + " Stars: " + this.getStars() + "\n" + " Dollar Signs: " + this.getDollarSign();
    }

    public void addReview() {
        return
    }
}
