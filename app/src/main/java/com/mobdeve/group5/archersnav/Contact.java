package com.mobdeve.group5.archersnav;

import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {
    private String firstName;
    private String lastName;
    private String number;
    private String email;
    private String address;
    private String relationship;
    private int id; // Assuming there is an ID for the contact

    // Constructor
    public Contact(String firstName, String lastName, String number, String relationship, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.relationship = relationship;
        this.email = email;
        this.address = address != null ? address : ""; // Default to empty string if address is null
        this.id = -1; // Default id value if not provided
    }


    // Getter and setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public int getId() {
        return id;
    }

    // Parcelable methods
    protected Contact(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        number = in.readString();
        email = in.readString();
        address = in.readString();
        relationship = in.readString();
        id = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(number);
        dest.writeString(email);
        dest.writeString(address);
        dest.writeString(relationship);
        dest.writeInt(id);
    }

    // Implement describeContents method
    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    @Override
    public String toString() {
        // Only show essential fields initially
        return firstName + " " + lastName + "\n" + number + "\n" + relationship;
    }
}
