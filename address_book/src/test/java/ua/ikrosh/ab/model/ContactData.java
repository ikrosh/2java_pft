package ua.ikrosh.ab.model;

public class ContactData {
  private final String lastname;
  private final String firstname;
  private final String address;
  private final String email;
  private final String homePhone;

  public ContactData(String lastname, String firstname, String address, String email, String homePhone) {
    this.lastname = lastname;
    this.firstname = firstname;
    this.address = address;
    this.email = email;
    this.homePhone = homePhone;
  }

  public String getLastname() {
    return lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public String getHomePhone() {
    return homePhone;
  }
}
