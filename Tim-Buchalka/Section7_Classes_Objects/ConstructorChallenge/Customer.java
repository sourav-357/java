package Section7_Classes_Objects.ConstructorChallenge;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Nobody", "nobody@nowhere.com");
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
