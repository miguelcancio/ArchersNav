package com.mobdeve.group5.archersnav.data.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public class User {

    private String idNumber;
    private String fullName;
    @NonNull
    @PrimaryKey
    private String dlsuEmail;
    private String role;
    private String password;

    public User(String fullName, String idNumber, String dlsuEmail, String role, String password) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.dlsuEmail = dlsuEmail;
        this.role = role;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDlsuEmail() {
        return dlsuEmail;
    }

    public void setDlsuEmail(String dlsuEmail) {
        this.dlsuEmail = dlsuEmail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
