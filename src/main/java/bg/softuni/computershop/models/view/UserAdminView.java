package bg.softuni.computershop.models.view;

public class UserAdminView {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Double money;

    public UserAdminView() {
    }

    public String getUsername() {
        return username;
    }

    public UserAdminView setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserAdminView setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserAdminView setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserAdminView setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserAdminView setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public UserAdminView setMoney(Double money) {
        this.money = money;
        return this;
    }
}
