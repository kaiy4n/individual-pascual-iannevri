
package com.joysistvi.day21.encap;

public class UserAccount {

    // Private fields (Encapsulation)
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Parameterized Constructor
    public UserAccount(String firstName, String middleName,
                       String lastName, String address,
                       String email, String password) {

        // Initialize fields using this keyword
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;

        // Use setters to ensure email and password validation
        setEmail(email);
        setPassword(password);
    }

    // Getter and Setter for First Name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for Middle Name
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // Getter and Setter for Last Name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for Email
    public String getEmail() {
        return email;
    }

    // Setter for Email with validation
    public void setEmail(String email) {

        String emailRegex =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if (email.matches(emailRegex)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException(
                    "Invalid email format. Please try again."
            );
        }
    }

    // Getter for Password
    public String getPassword() {
        return password;
    }

    // Setter for Password with validation
    public void setPassword(String password) {

        // At least 8 characters, one letter, and one number
        if (password.length() >= 8
                && password.matches(".*[A-Za-z].*")
                && password.matches(".*[0-9].*")) {

            this.password = password;

        } else {
            throw new IllegalArgumentException(
                    "Password must contain at least 8 characters, "
                            + "one letter, and one number."
            );
        }
    }

    // Override toString() method
    @Override
    public String toString() {

        return "\n--- User Account Created ---"
                + "\nFull Name: " + firstName + " "
                + middleName + " " + lastName
                + "\nEmail: " + email
                + "\nAddress: " + address;
    }
}
