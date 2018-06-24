package main.java.model;

public class Contact {
  private String firstName;
  private String lastName;

  public Contact(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() { return this.firstName; }

  public String getLastName() { return this.lastName; }
}