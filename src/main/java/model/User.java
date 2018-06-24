package main.java.model;

public class User {
  private int id;
  private String name;
  private String email;

  public User(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public int getId() { return this.id; }

  public String getName() { return this.name; }

  public String getEmail() { return this.email; }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("id ").append(this.getId());
    sb.append("name ").append(this.getName());
    return sb.toString();
  }
}