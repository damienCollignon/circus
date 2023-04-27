import java.util.ArrayList;
public class Monkey {
    public Monkey(String name, ArrayList<Trick> tricks) {
        setTricks(tricks);
        setName(name);
    }

    private ArrayList<Trick> tricks;
    private String name;

    public Trick doingTrick() {
        if(!tricks.isEmpty()) {
            System.out.println(name + " joue son tour!");
            var trick = this.tricks.get(0);
            this.tricks.remove(0);
            return trick;
        }
        return null;
    }

    public ArrayList<Trick> getTricks() {
        return tricks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTricks(ArrayList<Trick> tricks) {
        this.tricks = tricks;
    }
}
