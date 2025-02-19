package Genetic_Algorithms.TimeTable1;

public class Fitness {

    public static int studentTest(Timetables[][][][] timetables, Student[] students,
            int timetableIndex) {

        int fitnessScore = 0;

        int j = 0;

        for (j = 0; j < 5; j++) {
            int h = 0;

            for (h = 0; h < 8; h++) {
                int k = 0;

                for (k = 0; k < 4; k++) {

                    for (int i2 = 0; i2 < 40; i2++) {
                        int lessonsPerPeriod = 0; // This variable accounts for how many lessons students will have in
                                                  // one week,
                        for (int j2 = 0; j2 < 6; j2++) {
                            if (students[i2].stSubj[j2] == timetables[timetableIndex][j][h][k].slot) {

                                lessonsPerPeriod++;

                            }
                        }
                        if (lessonsPerPeriod != 1)
                            fitnessScore++;

                    }
                }

            }

        }

        return fitnessScore;

    }

    public static int roomsTest(String[] classrooms, Timetables[][][][] timetables, int timetableIndex) {
        int fitnessScore = 0;
        int roomUse = 0;

        int j = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            for (j = 0; j < 5; j++) {
                int h = 0;

                for (h = 0; h < 8; h++) {
                    int k = 0;
                    roomUse = 0;
                    for (k = 0; k < 4; k++) {

                        if (classrooms[i2] == timetables[timetableIndex][j][h][k].room)
                            roomUse++;

                    }
                    if (roomUse > 1) {
                        fitnessScore = fitnessScore + 30;
                    }
                }

            }
        }
        return fitnessScore;

    }

    public static int subjectTest(Timetables[][][][] timetables, int timetableIndex, String[] subjects) {
        int fitnessScore = 0;
        int j = 0;
        int[] lessonsPerSubj = new int[8];
        for (j = 0; j < 5; j++) {
            int h = 0;

            for (h = 0; h < 8; h++) {
                int k = 0;
                for (k = 0; k < 4; k++) {

                    for (int i = 0; i < 8; i++) {
                        if (subjects[i] == timetables[timetableIndex][j][h][k].slot) {
                            lessonsPerSubj[i]++;
                        }
                    }

                }

            }

        }
        for (int i2 = 0; i2 < 8; i2++) {
            if (lessonsPerSubj[i2] != 5)
                fitnessScore = fitnessScore + 5;
        }
        return fitnessScore;
    }

}
