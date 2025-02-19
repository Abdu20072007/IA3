package Genetic_Algorithms.TT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Random;

public class Timetables {

    static int numOfTimetables = 1000;

    static int days = 5;

    static int periods = 8;

    static int lessons = 12;

    static int lastGen = 20000;

    // Mutation rate
    static double mutRate = 0.8;

    // Crossover rate
    static double xoRate = 0.7;

    // The number of timetable population members that will be selected for a
    // tournament
    static int tournamentSize = 5;

    // This 4D array stores all of the timetable population members
    static Timetables[][][][] timetable = new Timetables[numOfTimetables][days][periods][lessons];

    // Slot is referring to a lesson
    String slot;

    // Room is referring to a classroom
    String room;

    static int[] fitness = new int[numOfTimetables];

    public static String setTimetableSlot(String[] lesson, int index) {
        return lesson[index];
    }

    public static String setSlotRoom(String[] classroom, int index) {
        return classroom[index];
    }

    public static void main(String[] args) throws FileNotFoundException {

        // Create a population of timetables
        // -----------------------------------------------------------------------------------------------

        int randomNum;

        for (int i = 0; i < numOfTimetables; i++) {

            int[] count = new int[TTData.subjects.length];

            for (int j = 0; j < days; j++) {

                for (int h = 0; h < periods; h++) {

                    for (int k = 0; k < lessons; k++) {
                        timetable[i][j][h][k] = new Timetables();

                        if (Math.random() > 0.6) {
                            // int count2 = 0;
                            // do {
                            randomNum = (int) (Math.random() * TTData.subjects.length);
                            // count2++;
                            // } while (count[randomNum] >= 5 && count2 < 10000);
                            timetable[i][j][h][k].slot = setTimetableSlot(TTData.subjects, randomNum);
                            count[randomNum]++;
                            int randomNum2 = (int) (Math.random() * TTData.classrooms.length);
                            timetable[i][j][h][k].room = setSlotRoom(TTData.classrooms, randomNum2);
                        } else {
                            timetable[i][j][h][k].slot = "Free";
                            timetable[i][j][h][k].room = "Free";

                        }

                    }

                }

            }

            // Fitness test the population
            // Fitness in this program is unconventional,here, the smaller the fitness, the
            // better the timetable is
            fitness[i] = Fitness.studentTest(timetable[i], TTData.students, TTData.subjects)
                    + Fitness.subjectTest(timetable[i], TTData.subjects)
                    + Fitness.roomsTest(TTData.classrooms, timetable[i]);

            System.out.println(
                    fitness[i] + "   " + i + " - " + Fitness.studentTest(timetable[i], TTData.students, TTData.subjects)
                            + " - " + Fitness.subjectTest(timetable[i], TTData.subjects)
                            + " - " + Fitness.roomsTest(TTData.classrooms, timetable[i]));

        }

        // start a
        // tournament-------------------------------------------------------------------------------------------------------------------

        // This array will store random, distinct, indexes of the timetable population

        int elite = 10000;

        for (int tournamentNo = 0; tournamentNo < lastGen; tournamentNo++) {
            // pull 5 population members at random

            int[] randIndex = new int[tournamentSize];
            int Winner;
            int[] Loser = new int[randIndex.length - 1];

            randIndex = Utilities.randDistinctInts(tournamentSize, (numOfTimetables - 1));

            // have a fight, see who has best chromosomes

            int best = 0;
            for (int i = 1; i < randIndex.length; i++) {
                if (fitness[randIndex[best]] > fitness[randIndex[i]]) {
                    best = i;
                }
            }

            Winner = randIndex[best];

            int j = 0;
            for (int i = 0; i < randIndex.length; i++) {
                if (randIndex[i] != Winner) {
                    Loser[j] = randIndex[i];
                    j++;
                }
            }

            for (int g = 0; g < Loser.length; g++) {

                for (int i = 0; i < days; i++) {

                    for (int h = 0; h < periods; h++) {

                        for (int k = 0; k < lessons; k++) {

                            // maybe do some cross over
                            if (Math.random() < xoRate) {

                                timetable[Loser[g]][i][h][k].slot = timetable[Winner][i][h][k].slot;
                                timetable[Loser[g]][i][h][k].room = timetable[Winner][i][h][k].room;
                            }
                            // maybe do some mutation
                            if (Math.random() < mutRate) {
                                if (Math.random() > 0.5) {

                                    randomNum = (int) (Math.random() * TTData.subjects.length);

                                    timetable[g][i][h][k].slot = setTimetableSlot(TTData.subjects, randomNum);
                                    if (Fitness.roomsTest(TTData.classrooms, timetable[Loser[g]]) != 0) {
                                        int randomNum2 = (int) (Math.random() * TTData.classrooms.length);
                                        timetable[g][i][h][k].room = setSlotRoom(TTData.classrooms, randomNum2);
                                    }
                                } else {
                                    timetable[g][i][h][k].slot = "Free";
                                    timetable[g][i][h][k].room = "Free";
                                }

                            }

                        }

                    }

                }

                fitness[Loser[g]] = Fitness.studentTest(timetable[Loser[g]], TTData.students, TTData.subjects)
                        + Fitness.subjectTest(timetable[Loser[g]], TTData.subjects)
                        + Fitness.roomsTest(TTData.classrooms, timetable[Loser[g]]);

                if (fitness[Loser[g]] < elite) {
                    System.out.println("Good solution found at generation " + tournamentNo);
                    System.out.println("Timetable:" + Loser[g]);
                    System.out.println("Fitness:" + fitness[Loser[g]]);

                    elite = fitness[Loser[g]];

                }

                // then test to see if the new population member
                // is a winner

            }

            // if (tournamentNo >= (lastGen - 700) && tournamentNo <= (lastGen - 650)) {
            // mutRate = 0.8;
            // tournamentSize = 100;
            // } else {
            // mutRate = 0.1;
            // tournamentSize = 7;
            // }

            if (tournamentNo % 1000 == 0) {
                System.out.println("Generation " + (tournamentNo));
            }

            // if we are at the last generation, print out the best timetable
            // ----------------------------------------------------------------------
            if (tournamentNo == (lastGen - 1)) {
                System.out.println("\n");
                for (int o = 0; o < Loser.length; o++) {

                    System.out.println("Timetable:" + Loser[o]);
                    System.out.println("Fitness:" + fitness[Loser[o]] + " - "
                            + Fitness.studentTest(timetable[Loser[o]], TTData.students, TTData.subjects) + " - "
                            + Fitness.subjectTest(timetable[Loser[o]], TTData.subjects) + " - "
                            + Fitness.roomsTest(TTData.classrooms, timetable[Loser[o]]) + "\n");

                }

                System.out.println("Timetable:" + Winner);
                System.out.println("Fitness:" + fitness[Winner]);

                for (int i = 0; i < numOfTimetables; i++) {
                    fitness[i] = Fitness.studentTest(timetable[i], TTData.students, TTData.subjects)
                            + Fitness.subjectTest(timetable[i], TTData.subjects)

                            + Fitness.roomsTest(TTData.classrooms, timetable[i]);

                }
                int minimum = 0;
                for (int i = 1; i < numOfTimetables; i++) {
                    if (fitness[minimum] > fitness[i]) {
                        minimum = i;

                    }

                }

                System.out.println("The best timetable was: " + minimum);
                System.out.println("Fitness: " + fitness[minimum] + " - "
                        + Fitness.studentTest(timetable[minimum], TTData.students, TTData.subjects) + " - "
                        + Fitness.subjectTest(timetable[minimum], TTData.subjects) + " - "
                        + Fitness.roomsTest(TTData.classrooms, timetable[minimum]));

                File csvFile = new File("TimetableSolution.csv");
                PrintWriter out = new PrintWriter(csvFile);

                for (int i = 0; i < days; i++) {
                    out.printf("%s, %s, %s, %s", "Day " + (i + 1), "          ", "          ", "\n");
                    for (int h = 0; h < periods; h++) {
                        for (int k = 0; k < lessons; k++) {
                            out.printf("%s, %s, %s", timetable[minimum][i][h][k].slot, timetable[minimum][i][h][k].room,
                                    "          ");
                        }
                        out.printf("\n");

                    }
                }

                out.close();

            }

        }

    }
}