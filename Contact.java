package org.bitleet.saraf.contact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private int image;
    private String name;
    private String phone;
    private String email;


    public Contact(int image, String name){
        this.image = image;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public int getImage(){
        return image;
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public static List<Contact> generateContacts() {
        List<Contact> contactList = new ArrayList<>();

        contactList.add(new Contact(R.drawable.mark, "Mark Zuckerburg"));
        contactList.add(new Contact(R.drawable.bill, "Bill Gates"));
        contactList.add(new Contact(R.drawable.benbernanke, "Ben Bernanke"));
        contactList.add(new Contact(R.drawable.ic_person_black_24dp,"teve Jobs"));
        return contactList;
    }
}

