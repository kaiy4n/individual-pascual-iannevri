package com.joysistvi.day20.encapsulation;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Constructor
    public UserAccount(String firstName, String middleName,
                       String lastName, String address,
                       String email, String password) {

        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setAddress(address);
        setEmail(email);
        setPassword(password);

    }

    //
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    //
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {

        // Check if email follows a basic email format
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if (email.matches(emailRegex)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException(
                    "Invalid email format. Please enter a valid email address."
            );
        }
    }

    //
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {

        // Check minimum length, at least one letter, and at least one number
        if (password.length() >= 8
                && password.matches(".*[A-Za-z].*")
                && password.matches(".*[0-9].*")) {

            this.password = password;

        } else {
            throw new IllegalArgumentException(
                    "Invalid password. It must contain at least 8 characters, "
                            + "one letter, and one number."
            );
        }
    }
}
