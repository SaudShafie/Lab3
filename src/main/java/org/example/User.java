package org.example;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList;
    private ArrayList<Media> shoppingCart;

    public User(String username, String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void addPurchaseMedia(Media purchaseMedia) {
        this.purchaseMediaList.add(purchaseMedia);
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }
    public void addShoppingCart(Media media) {
        this.shoppingCart.add(media);
    }
    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    public void addToCart(Media media) {
        this.shoppingCart.add(media);
    }
    public void removeFromCart(Media media) {
        this.shoppingCart.remove(media);
    }
    public void checkOut(){
        for (Media x:shoppingCart){
            this.purchaseMediaList.add(x);

        }
        this.setShoppingCart(new ArrayList<Media>());

    }

    @Override
    public String toString() {
        return "username='" + username + "\n" +
                "email='" + email + "\n" +
                "purchaseMediaList=" + purchaseMediaList +
                "\nshoppingCart=" + shoppingCart +
                "\n-------------------------------------";
    }
}
