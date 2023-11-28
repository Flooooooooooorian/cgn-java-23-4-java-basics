public class Array {

    public static void main(String[] args) {
        String person1 = "Jokob";
        String person2 = "Vanessa";
        String person3 = "Alexandra";
        String person4 = "Vincent";


        String[] persons = new String[8];

        persons[0] = "Jakob";
        persons[1] = "Vanessa";
        persons[2] = "Alexandra";
        persons[3] = "Vincent";

        System.out.println(persons[0]);
        System.out.println(persons[2]);
        System.out.println(persons[7]);


        int[] numbers = {6, 8, 2, 946, 14, 8, 16, 10, 8 ,1};

        System.out.println(numbers[0]);

        numbers[0] = 7;

        System.out.println(numbers[0]);


        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }

        for (String person : persons) {
            System.out.println(person);
        }
    }
}
