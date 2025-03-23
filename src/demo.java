import java.util.ArrayList;

public class demo {

    public static void main(String[] args) {

        SplitwiseService service = new SplitwiseService();

        User u1 = new User(1,"vish","vish@gmail");
        User u2 = new User(2,"prav","vish@gmail");
        User u3 = new User(3,"neet","vish@gmail");
        User u4 = new User(4,"shasri","vish@gmail");

        service.addUser(u1);
        service.addUser(u2);
        service.addUser(u3);
        service.addUser(u4);

        ArrayList<User>g = new ArrayList<>();
        g.add(u1);
        g.add(u2);
        g.add(u3);
        g.add(u4);
        Expense e1 = new Expense(1,"fuel", u1, 1000, g );
        Expense e2 = new Expense(2,"food", u1, 2000, g );
        Expense e3 = new Expense(3,"drink", u2, 100, g );

        service.addExpense(e1);
        service.addExpense(e2);
        service.addExpense(e3);
        service.displayBalances(u1);
        service.displayBalances(u2);



        //Expense e2 = new Expense(2,"food", u2, 2000, g );
    }
}
