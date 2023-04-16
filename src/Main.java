import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey("Michel", new ArrayList<>(Arrays.asList(
                new Trick("joue de la guitare", Trick.TrickType.MUSIC),
                new Trick("fait la roue", Trick.TrickType.STUNT),
                new Trick("joue de la flûte", Trick.TrickType.MUSIC),
                new Trick("marche sur les mains", Trick.TrickType.STUNT),
                new Trick("lance des bananes", Trick.TrickType.STUNT)
        )));
        Monkey monkey2 = new Monkey("Janis", new ArrayList<>(Arrays.asList(
                new Trick("joue de la cornemuse", Trick.TrickType.MUSIC),
                new Trick("joue du piano", Trick.TrickType.MUSIC),
                new Trick("danse", Trick.TrickType.STUNT),
                new Trick("joue du piano", Trick.TrickType.MUSIC),
                new Trick("lance des orange", Trick.TrickType.STUNT)
        )));

        Trainer trainer1 = new Trainer(monkey1, "Albert");
        Trainer trainer2 = new Trainer(monkey2, "Joe");

        Viewer viewer = new Viewer();

        System.out.println("Le show commence !");

        while (trainer1.hasTrick() && trainer2.hasTrick()) {
            viewer.watch(trainer1.givesAnOrderToMonkey(), trainer1.getMonkey().getName());
            viewer.watch(trainer2.givesAnOrderToMonkey(), trainer2.getMonkey().getName());
        }

        System.out.println("Le show est terminé.");
    }
}