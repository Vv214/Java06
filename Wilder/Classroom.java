package Wilder;

public class Classroom {

    public static void main(String[] args) {
        Wilder[] classroom = new Wilder[4];
        classroom[0] = new Wilder("Toto", true);
        classroom[1] = new Wilder("Tata", false);
        classroom[2] = new Wilder("Soso", true);
        classroom[3] = new Wilder("Sisi", false);
        for (Wilder eleve : classroom) {
            String message = eleve.whoAmI(eleve.getfirstName(), eleve.isAware());
            System.out.println(message);
        }
    }
}
