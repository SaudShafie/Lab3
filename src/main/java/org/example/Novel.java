package org.example;

import java.util.AbstractList;
import java.util.ArrayList;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String auteur, String ISBN, int stock, ArrayList<Review> review, String genre, double price) {
        super(title, auteur, ISBN, stock, review,price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String getMediaType() {
        return (this.getAverageRating()>=4.5)?"Bestselling Novel":"Novel";
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
