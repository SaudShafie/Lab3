package org.example;

import java.util.AbstractList;
import java.util.ArrayList;

public class Store {
    private ArrayList<User> users;
    private ArrayList<Media>media;

    public Store(ArrayList<User> users, ArrayList<Media> media) {
        this.users = users;
        this.media = media;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public void addUsers(User user) {
        this.users.add(user);
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }
    public void displayUsers(){
        System.out.println("Users: ");
        for (User x: this.users) {
            System.out.println(x.toString());
        }
    }
    public void addMedia(Media media) {
        this.media.add(media);
    }
    public void displayMedia(){
        System.out.println("Media: ");
        for (Media x: this.media) {
            System.out.println(x.toString());
        }
    }
        public Book searchBook(String title) throws Exception {
        int k=-1;
            for (int i = 0; i < media.size(); i++) {
                if (media.get(i).getTitle().equalsIgnoreCase(title)){
                    k=i;
                }
            }
            if(k==-1)throw new Exception("there is no such book");
            return (Book) media.get(k);
    }



}
