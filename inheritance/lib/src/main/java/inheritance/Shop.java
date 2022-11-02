package inheritance;

import java.util.ArrayList;

public class Shop {

    private String name;
    private String description;
    private String dollarSign;

    public int reviewCounter = 0;

    private ArrayList<Review> userShopReview;
    public Shop(String name, String description, String dollarSign) {
        this.name = name;
        this.description = description;
        this.dollarSign = dollarSign;
        userShopReview = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDollarSign() {
        return dollarSign;
    }

    public void setDollarSign(String dollarSign) {
        this.dollarSign = dollarSign;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " Description: " + this.getDescription() + " Dollar Signs: " + this.getDollarSign();
    }

    public void addShopReview(Review review) {
        if (!userShopReview.contains(review)){
            userShopReview.add(review);
            reviewCounter++;
        }
    }

}
