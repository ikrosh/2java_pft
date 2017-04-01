package ua.ikrosh.ab.model;

public class ContactData {
  private final String lastname;
  private final String firstname;
  private final String address;
  private final String email;
  private final String homePhone;
  private final String group;

  public ContactData(String lastname, String firstname, String address, String email, String homePhone, String group) {
    this.lastname = lastname;
    this.firstname = firstname;
    this.address = address;
    this.email = email;
    this.homePhone = homePhone;
    this.group = group;
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

  public String getGroup() { return group; }
}
