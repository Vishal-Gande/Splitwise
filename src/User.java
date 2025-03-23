import java.util.HashMap;
import java.util.Map;

public class User {

    private int id;
    private String name;
    private String email;
    private HashMap<User, Double> balances ;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balances = new HashMap<>();
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public void updateBalance(User payer, double balance) {
        //System.out.println("updating balances..");

        // Add to existing balance or initialize if not present
        //this.balances.put(payer, balances.getOrDefault(payer, 0.0) + balance);

        //System.out.println("Total balances: " + this.balances.size());

        System.out.println("Updated Balances:");
        this.balances.put(payer, balances.getOrDefault(payer, 0.0) + balance);
        payer.balances.put(this, payer.balances.getOrDefault(this, 0.0) - balance);
        for (Map.Entry<User, Double> entry : balances.entrySet()) {
            System.out.println("User: " + entry.getKey().getName() + ", Balance: " + entry.getValue());
        }
    }

    public void displayBalance() {
        //System.out.println(this.balances.size());
        for(Map.Entry<User, Double> entry : balances.entrySet()) {
            System.out.println(" - " + this.getName() + " owes User: " + entry.getKey().getName() + ", Balance: " + entry.getValue());
        }
    }

}
