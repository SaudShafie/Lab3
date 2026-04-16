package org.example;

import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String artist;

    public Music(String title, String auteur, String ISBN, String artist,double price) {
        super(title, auteur, ISBN,price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void listen(User user){
        user.addPurchaseMedia(this);

    }
    public ArrayList<Music> generalPlayList(ArrayList<Music> musicCatalog){
        ArrayList<Music> generalPlayList=new ArrayList<>();
        for (int i = 0; i < musicCatalog.size(); i++) {
            if(musicCatalog.get(i).getAuteur().equalsIgnoreCase(this.getAuteur())){
                generalPlayList.add(musicCatalog.get(i));
            }

        }
        return generalPlayList;
    }

    public String getMediaType(){
        return (this.getPrice()>=10)?"Premium Music":"Music";
    }

    @Override
    public String toString() {
        return "\nName: " +this.getTitle()+
                "\nartist: " + artist + "\nPrice: " +this.getPrice()+"\nISBN:"+this.getISBN()+"\n------------------"
               ;
    }
}
