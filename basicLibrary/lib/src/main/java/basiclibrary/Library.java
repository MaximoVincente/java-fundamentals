/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;
import java.util.Random;


public class Library {
    public boolean someLibraryMethod() {
        return true;

    }

    public int[] roll(int n) {

        int[] arrayToReturn = new int[n];
        int randomRoll = 0;
        Random diceRoll = new Random();
        // roll a dice
        // roll a dice n times
        for (int i = 0; i < n; i++) {
            randomRoll = diceRoll.nextInt(5) + 1;
            // store the result in an array
            arrayToReturn[i] = randomRoll;
        }
        //return an array
        return arrayToReturn;
    }

    public boolean containsDuplicate (int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < i; j++) {
                if (n[i] == n[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public double calculateAverage (double[] n){
        double sum = 0.0;
        for (int i = 0; i < n.length; i++) {
           sum = sum + n[i];
        }
        return sum/n.length;
    }

    public int[] LowestAverageTemp(int[][] n){
        int arrayIndex = 0;

        double lowAverage = average(n[arrayIndex]);

        for (int i = 1; i < n.length; i++) {
            double tempAverage = average(n[i]);
            if(tempAverage < lowAverage) {
                lowAverage = tempAverage;
                arrayIndex = i;
            }
        }
        return n[arrayIndex];
    }

}