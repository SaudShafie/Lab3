package org.example;

import java.util.AbstractList;
import java.util.ArrayList;

public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, int stock, ArrayList<Review> review, String subject, double price) {
        super(title, auteur, ISBN, stock, review,price);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public String getMediaType() {
        return (this.getAverageRating()>=4.5)?"Bestselling AcademicBook":"AcademicBook";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
