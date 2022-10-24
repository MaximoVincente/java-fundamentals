public class App {
    public static String plurarizeAnimal(String animal, int count) {

        if (count > 1) {
            return "I own " + count + " " + animal + "s";
        } else {
            return "I own " + count + " " + animal;
        }
    }

    public static void main(String[] args) {

        System.out.println(plurarizeAnimal("dog", 1));
    }
}
