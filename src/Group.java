import java.util.ArrayList;

public class Group {

    private int id;
    private String name;
    private ArrayList<Integer> users; //stores user IDs


    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
