import java.util.ArrayList;

public class Expense {
    private int id;
    private String description;
    private User payer;
    private double amount;
    private ArrayList<User> users;

    public Expense(int id, String description, User payer, double amount, ArrayList<User> users) {
        this.id = id;
        this.description = description;
        this.payer = payer;
        this.amount = amount;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User getPayer() {
        return payer;
    }

    public double getAmount() {
        return amount;
    }
}
