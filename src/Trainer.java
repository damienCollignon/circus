public class Trainer {
    private Monkey monkey;
    private String name;

    public Trainer(Monkey monkey, String name) {
        setMonkey(monkey);
        setName(name);
        System.out.println(name + " se prépare avec le singe " + monkey.getName());
    }

    public Trick givesAnOrderToMonkey() {
        if(hasTrick()) {
            System.out.println(name + " donne un ordre à " + monkey.getName());
            return monkey.doingTrick();
        }
        return null;
    }
    public boolean hasTrick() {
        return monkey.getTricks().size() > 0;
    }

    public Monkey getMonkey() {
        return monkey;
    }

    public void setMonkey(Monkey monkey) {
        this.monkey = monkey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
