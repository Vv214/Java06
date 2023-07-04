package Wilder;

public class App {

    public static void main(String[] args) {
        Wilder[] eleves = new Wilder[4];
        eleves[0] = new Wilder("Toto", true);
        eleves[1] = new Wilder("Tata", false);
        eleves[2] = new Wilder("Soso", true);
        eleves[3] = new Wilder("Sisi", false);
        for (Wilder eleve : eleves) {
            String message = eleve.whoAmI(eleve.getfirstName(), eleve.isAware());
            System.out.println(message);
        }
    }
}
