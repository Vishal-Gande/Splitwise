
import java.util.HashMap;

public class SplitwiseService {

    // make it singular

    private HashMap<Integer, User> users;
    private HashMap<Integer, Group > groups;
    private HashMap<Integer, Expense> expenses;

    public SplitwiseService() {
        users = new HashMap<>();
        groups = new HashMap<>();
        expenses = new HashMap<>();
    }

    public void addUser(User user) {

        if(users.containsKey(user.getId())) System.out.println("User with id " + user.getId() + " already exists");

        else
        {
            users.put(user.getId(), user);
            System.out.println("user with id " + user.getId() + " added");
        }
    }

    public void addGroup(Group group) {

        if(groups.containsKey(group.getId()))  System.out.println("Group with id " + group.getId() + " already exists");

        else
        {
            groups.put(group.getId(), group);
            System.out.println("group with id " + group.getId() + " added");
        }
    }

    public void addExpense(Expense expense) {
        expenses.put(expense.getId(),expense);
        System.out.println("expense with id " + expense.getId() + " added");

        // update each user's balances
        this.updateBalances(expense);
    }

    private void updateBalances(Expense expense) {

    for(User user : expense.getUsers() )
    {
        user.updateBalance(expense.getPayer(), expense.getAmount());
    }


    }

    public void displayBalances(User user) {
        System.out.println("displaying balances of user " + user.getName());
        user.displayBalance();
    }

}
