package com.kunal.usermanagementsystem.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int userId;
    @NotBlank
    private String userName;
    @Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{4}", message = "Enter a Valid Date of Birth (DD-MM-YYYY)")
    private String dateOfBirth;
    @Email
    private String email;
    @Pattern(regexp = "[0-9]{12}", message = "Phone number must be contains 12 digits!")
    private String phoneNo;
    @Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{2}", message = "Enter a Valid Date (DD-MM-YYYY)")
    private String date;
    @Pattern(regexp = "[0-9]{2}-[0-9]{2}", message = "Enter a Valid time (HH:MM)")
    private String time;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNo;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNo = phoneNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
