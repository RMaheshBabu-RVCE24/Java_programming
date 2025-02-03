/* problem-1: Votting in India
conditions: Age>=18
            Citizen=Indian
*/
public class Main {
    public static void main(String[] args) {
        int age = 20;
        String citizen = "Indian";
        if (age >= 18 & citizen == "Indian") {
            System.out.println("Person can vote");
        } else {
            System.out.println("Person cannot vote");
        }
    }
    }
