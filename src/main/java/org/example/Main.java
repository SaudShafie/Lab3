package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Music song1 = new Music("وطن عمري", "الضويحي", "m1", "عبدالعزيز", 13);
        Music song2 = new Music(" فزيت من نومي", "الضويحي", "m1", "عبدالعزيز", 13);
        ArrayList<Media> pList1 = new ArrayList<Media>();
        pList1.add(song1);
        ArrayList<Media> pList2 = new ArrayList<Media>();
        pList2.add(song2);
        User u1 = new User("sss1", "ss@gmail.com", pList1, new ArrayList<Media>());
        User u2 = new User("sss2", "ss2@gmail.com", pList2, new ArrayList<Media>());

        Review r1 = new Review(u1.getUsername(), 3, "Bad");
        Review r2 = new Review(u2.getUsername(), 5, "Good");
        Review r3 = new Review(u2.getUsername(), 5, "too bad");
        Review r4 = new Review(u2.getUsername(), 5, "Good");
        Review r5 = new Review(u1.getUsername(), 4, "too bad");
        Review r6 = new Review(u1.getUsername(), 1, "too bad");
        Review r7 = new Review(u2.getUsername(), 3, "Bad");
        Review r8 = new Review(u1.getUsername(), 3, "Bad");

        ArrayList<Review> re1 = new ArrayList<Review>();
        re1.add(r1);
        re1.add(r2);
        ArrayList<Review> re2 = new ArrayList<Review>();
        re2.add(r3);
        re2.add(r5);
        ArrayList<Review> re3 = new ArrayList<Review>();
        re3.add(r4);
        re3.add(r6);
        ArrayList<Review> re4 = new ArrayList<Review>();
        re4.add(r7);
        re4.add(r8);


        Novel nBook1 = new Novel("Back to dark", "Saud", "N1-33", 10, re1, "deadly", 166);
        Novel nBook2 = new Novel("Out from dark", "Saud", "N1-31", 10, re2, "deadly", 200);
        AcademicBook aBook1 = new AcademicBook("Math101", "saud", "23r", 50, re3, "Math", 10);
        AcademicBook aBook2 = new AcademicBook("Math102", "saud", "22r", 44, re4, "Math", 15);
        Movie m1 = new Movie("The boys1", "Saud", "21m", 133, 13);
        Movie m2 = new Movie("The boys2", "Saud", "22m", 100, 15);
        ArrayList<User> users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        ArrayList<Media> media = new ArrayList<Media>();
        media.add(song1);
        media.add(song2);
        media.add(nBook1);
        media.add(nBook2);
        media.add(aBook1);
        media.add(aBook2);
        media.add(m1);
        media.add(m2);


        Store store = new Store(users, media);
        //Store methods--------------------------------->
        //Adding users and display them:
//        store.displayUsers();
//        store.addUsers(new User("sss3", "ss3@mail.com", new ArrayList<Media>(), new ArrayList<Media>()));
//        store.displayUsers();
        //Adding Media and display them:
//        store.displayMedia();
//        store.addMedia(new Music("اتبعك ويضيع العمر", "الضويحي", "m3", "عبدالعزيز", 13));
//        store.displayMedia();
        //Searching for Book and display it:
//        try {
//            Book searchBookook=store.searchBook("Out from dark");
//            System.out.println("The Book is found: "+searchBookook.toString());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        //User methods--------------------------------->
        Music song3=new Music("اتبعك ويضيع العمر", "الضويحي", "m3", "عبدالعزيز", 13);
        //Adding to the cart and removeing:
//        u1.addToCart(song3);
//        System.out.println(u1.getShoppingCart().toString());
//        u1.removeFromCart(song3);
//        System.out.println(u1.getShoppingCart().toString());
        //Adding to the cart and checkingOut and seeing the parches list:
        u1.addToCart(song3);
        System.out.println(u1.getShoppingCart().toString());
        u1.checkOut();
        System.out.println("Shoping Cart ="+u1.getShoppingCart().toString());
        System.out.println(u1.getPurchaseMediaList().toString());
        //Music methods--------------------------------->
        //listen method and Purchase List of the user:
        song3.listen(u2);
        ArrayList<Music> musicCatalog=new ArrayList<Music>();
        musicCatalog.add(song1);
        musicCatalog.add(song2);
//        System.out.println(u2.getPurchaseMediaList().toString());
        //playlist generation and get type method:
//        System.out.println(song3.generalPlayList(musicCatalog).toString());
//        System.out.println(song3.getMediaType());
        //Book methods--------------------------------->
        //Avg and is it bestseller?
//        System.out.println(aBook2.getAverageRating());
//        System.out.println("is it bestseller?"+aBook2.isBestSeller());
        //restocking
//        System.out.println(aBook2.getStock());
//        aBook2.retock(1);
//        System.out.println(aBook2.getStock());
        //Book review adding
//        System.out.println(aBook1.getReview().toString());
//        aBook1.addReview(new Review("Saud",3,"not bad"));
//        System.out.println(aBook1.getReview().toString());
        //book parching
//        System.out.println("Before adding to the PurchaseMediaList");
//        System.out.println(u2.getPurchaseMediaList().toString());
//        try {
//
//            nBook1.purchase(u2);
//            System.out.println("After adding to the PurchaseMediaList");
//            System.out.println(u2.getPurchaseMediaList().toString());
//
//        } catch (Exception e) {
//        System.out.println(e.getMessage());
//        }
        //get book type
//        System.out.println(nBook1.getMediaType());
//        System.out.println(aBook1.getMediaType());
        //Movie methods--------------------------------->
        //Watch method:
//        System.out.println("Before adding to the PurchaseMediaList");
//        System.out.println(u2.getPurchaseMediaList().toString());
//        try {
//
//            m2.watch(u2);
//            System.out.println("After adding to the PurchaseMediaList");
//            System.out.println(u2.getPurchaseMediaList().toString());
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        //recommenSimilarMovies method:
//        ArrayList<Movie> moiveCatalog=new ArrayList<Movie>();
//        Movie m3 = new Movie("The boys3", "Saud", "25m", 100, 20);
//        moiveCatalog.add(m1);
//        moiveCatalog.add(m2);
//        System.out.println(m3.recommenSimilarMovies(moiveCatalog));
//        System.out.println(m3.getMediaType());
        //get type movie
//        System.out.println(m2.getMediaType());
        //Novel and Academic  methods--------------------------------->
//        System.out.println(nBook2.getMediaType());
//        System.out.println(aBook1.getMediaType());








    }
}