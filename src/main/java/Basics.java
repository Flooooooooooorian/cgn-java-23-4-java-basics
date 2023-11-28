public class Basics {

    public static void main(String[] args) {
        System.out.println("Hallo cgn-java-23-4!!!");
        System.out.println("Mein erstes Java Programm");
        System.out.println("Tschüüüs");

        String myName = "Florian";
        //myName = "Zeshan";

        System.out.println(myName);

        int myAge = 27;
        System.out.println(myAge);

        boolean isOver18 = true;
        System.out.println(isOver18);

        double kommaZahl2 = 0.1111;
        System.out.println(kommaZahl2);


        int sum = myAge * 3;
        System.out.println(sum);

        String text = "Hallo: " + myName + 2;
        System.out.println(text);

        boolean isZeshan = myName == "Zeshan";

        System.out.println(isOver18 || isZeshan);

        System.out.println(0.1 + 0.2);
    }
}
