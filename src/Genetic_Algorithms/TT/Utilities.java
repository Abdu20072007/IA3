package Genetic_Algorithms.TT;

public class Utilities {

    public static int[] randDistinctInts(int numOfInts, int max) {

        int[] randInts = new int[numOfInts];

        int i = 0;

        while (i < numOfInts) {

            randInts[i] = (int) (Math.random() * (max + 1));
            boolean isDistinct = true;

            for (int j = 0; j < i; j++) {
                if (randInts[i] == randInts[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct)
                i++;

        }

        return randInts;
    }

    public static void main(String[] args) {

        int[] randInts = new int[10];

        randInts = randDistinctInts(10, 100);

        for (int i = 0; i < 10; i++) {
            System.out.println("Random Integers: " + randInts[i]);
        }
    }

}