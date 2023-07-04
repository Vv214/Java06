package Wilder;

public class Wilder {

    private String firstName;
    private boolean aware;

    Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public String getfirstName() {
        return this.firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI(String firstName, boolean aware) {
        String sayHello;
        if (aware) {
            sayHello = "Je m'appelle " + firstName + " et je suis " + aware;
        } else {
            sayHello = "Je m'appelle " + firstName + " et je ne suis pas " + aware;
        }
        return sayHello;
    }
}
