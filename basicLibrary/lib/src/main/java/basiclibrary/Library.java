/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
}

public int[] roll(int[] n) {

    int[] arrayToReturn = new int[n.length];

    for (int i = 0; i < n.length; i++) {
        arrayToReturn[n.length - 1 - i] = n[i];
    }
    return arrayToReturn;
}

    public static void main(String[] args) {
        System.out.println(roll(4));
    }