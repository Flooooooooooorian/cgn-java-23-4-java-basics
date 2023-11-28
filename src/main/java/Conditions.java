public class Conditions {
    public static void main(String[] args) {

        System.out.println("Hallo");

        String password = "geheim";

        if ("geheim" == password) {
            System.out.println("Passwort ist korrekt!");
        } else {
            System.out.println("Passwort ist falsch!");
        }

        System.out.println("Fertig");


        int count = 25;

        if (count == 25) {
            System.out.println("Zahl ist 25");
        } else if (count == 26) {
            System.out.println("Zahl ist 26");
        } else {
            System.out.println("Zahl ist nicht 25 und auch nicht 26!");
        }


        login();
        login();
        login();
        login();
        login();
        login();
        login();
        login();
    }

    public static void login() {
        System.out.println("Login:");
        System.out.println("Email:");
        System.out.println("Password:");
    }

    public static int addition(int valueA, int valueB) {
        System.out.println(valueA);
        System.out.println(valueB);
        System.out.println(valueA + valueB);

        return valueA + valueB;
    }
}
