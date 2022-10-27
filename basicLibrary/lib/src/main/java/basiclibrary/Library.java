/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.w3c.dom.ls.LSOutput;

import java.util.*;


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

    public boolean containsDuplicate(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < i; j++) {
                if (n[i] == n[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public int calculateAverage(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        return sum / n.length;
    }

    public int[] lowestAverageTemp(int[][] n) {
        int arrayIndex = 0;

        int minAverage = calculateAverage(n[arrayIndex]);

        for (int i = 1; i < n.length; i++) {
            int tempAverage = calculateAverage(n[i]);
            if (tempAverage < minAverage) {
                minAverage = tempAverage;
                arrayIndex = i;
            }
        }
        return n[arrayIndex];
    }


    // Use a hashset of type integer to track all unique temps seen
    // Iterate from min to the max temp and create a string containing any temp not seen during the month.
    //return that string
    public String minMaxTemp(int[][] n) {

        HashSet<Integer> temps = new HashSet<>();
        int maxTemp = -1;
        int minTemp = 99;
        //iterate through matrix
        for (int[] array : n) {
            for (int value : array) {
                temps.add(value);
                if (value > maxTemp) {
                    maxTemp = value;
                }
                if (value < minTemp) {
                    minTemp = value;
                }
            }
        }
        String response = "High: " + maxTemp + "\n" + "Low: " + minTemp + "\n";

        for (int i = minTemp; i < maxTemp; i++) {
            if (!temps.contains(i)) {
                response += "Never saw temperature: " + i + "\n";
            }
        }
        return response;
    }

    public String tally(String vote[]){
        Map<String, Integer> votes = new HashMap<String, Integer>();
        for (String el : vote) {
            if (votes.keySet().contains(el))
                votes.put(el, votes.get(el) + 1);
            else
                votes.put(el, 1);
        }

        int maxVal = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxVal) {
                maxVal = val;
                winner = key;
            }
            else if (val == maxVal && winner.compareTo(key) > 0)
                winner = key;
        }
        String response = winner + "received the most votes!";
        return response;
    }
}



















