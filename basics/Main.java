import java.lang.Math;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Main {
    public static String plurarizeAnimal(String animal, int count) {

        if (count > 1) {
            return "I own " + count + " " + animal + "s";
        } else {
            return "I own " + count + " " + animal;
        }
    }

    public static String flipNHeads(int n) {
        int counter = 0;
        int totalCounter = 0;

        while (counter < n) {
            totalCounter++;
            if (Math.random() < .5) {
                System.out.println("tails");
                counter = 0;
            }else {
                counter++;
                System.out.println("heads");
            }
        }
        if (totalCounter > 1) {
            return ("It took " + totalCounter + " " + "flips to flip" + " " + n + " heads in a row.");
        }else{
            return ("It took " + totalCounter + " " + "flip to flip" + " " + n + " " + "head in a row.");
        }
    }

    public static void clock() throws InterruptedException{
        while (true){
            LocalTime now = LocalTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(plurarizeAnimal("dog", 3));
        System.out.println(flipNHeads(4));
        clock();
    }
}