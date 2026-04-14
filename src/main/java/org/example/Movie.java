package org.example;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private int duration;

    public Movie(String title, String auteur, String ISBN, int duration,double price) {
        super(title, auteur, ISBN,price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void watch(User user){
        user.addPurchaseMedia(new Movie(this.getTitle(), this.getAuteur(), this.getISBN(), this.duration,this.getPrice()));
    }
    public ArrayList<Movie> recommenSimilarMovies(ArrayList<Movie>movieCatalog){
        ArrayList<Movie> recommenSimilarMovies = new ArrayList<Movie>();
        for (int i = 0; i < movieCatalog.size(); i++) {
            if(movieCatalog.get(i).getAuteur().equalsIgnoreCase(this.getAuteur())){
                recommenSimilarMovies.add(movieCatalog.get(i));
            }

        }
        return recommenSimilarMovies;

    }
    public String getMediaType(){
        return (duration>=120)?"Long movie":"Move";
    }


    @Override
    public String toString() {
        return "\nMovie " +"\nTitle: "+getTitle()+"\nAuteur: "+this.getAuteur()+"\nISBN: "+this.getISBN()+
                "\nduration:" + duration +
                "\nprice: "+this.getPrice()+"\n----------------------------";
    }
}
