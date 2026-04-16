package org.example;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> review;

    public Book(String title, String auteur, String ISBN, int stock,  ArrayList<Review>review,double price) {
        super(title, auteur, ISBN,price);
        this.stock = stock;
        this.review = review;
    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void addReview(Review review) {
        this.review.add(review) ;
    }

    public int getStock() {
        return stock;
    }

    public void retock(int quantity) {
        this.stock += quantity;
        System.out.println("Done restocking! we have in the stock "+this.stock+" Books");
    }
    public double getAverageRating() {
        double sum=0;
        double numOfReviews=0;

        for (int i = 0; i < this.review.toArray().length; i++) {
            numOfReviews++;
            sum+=this.review.get(i).getRating();
        }
        return sum/numOfReviews;
    }
    public void purchase(User user) throws Exception {
        if (stock==0)throw new Exception("need to restoke");
        user.addPurchaseMedia(this);
        this.stock-=1;


    }
    public  boolean isBestSeller(){
        return (this.getAverageRating()>=4.5);
    }



    public String getMediaType(){
        return (this.isBestSeller())?"Bestselling Book":"Book";
    }

    @Override
    public String toString() {
        return "\nTitle: " +this.getTitle()+
                "\nstock=" + stock +
                "\nauteur: " + this.getAuteur() +
                "\nprice: "+this.getPrice();
    }
}
