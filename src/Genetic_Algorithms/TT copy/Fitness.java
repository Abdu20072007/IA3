package Genetic_Algorithms.TT;

import java.util.Objects;

public class Fitness {

    public static int studentTest(Timetables[][][] timetable, Student[] students, String[] subjects) {

        int fitnessScore = 0;

        int lessonsPerPeriod = 0;

        for (int student = 0; student < students.length; student++) {
            for (int day = 0; day < Timetables.days; day++) {

                for (int period = 0; period < Timetables.periods; period++) {

                    lessonsPerPeriod = 0;
                    for (int k = 0; k < Timetables.lessons; k++) {
                        for (int j2 = 0; j2 < Student.numOfSubjects; j2++) {

                            if (Objects.equals(students[student].stSubj[j2], timetable[day][period][k].slot)) {

                                lessonsPerPeriod++;

                            }
                        }

                    }
                    if (lessonsPerPeriod != 1)
                        fitnessScore = fitnessScore + Math.abs((lessonsPerPeriod - 1));

                }

            }

        }
        return fitnessScore;
    }

    public static int roomsTest(String[] classrooms, Timetables[][][] timetable) {
        int fitnessScore = 0;
        int roomUse = 0;

        for (int i2 = 0; i2 < classrooms.length; i2++) {
            for (int j = 0; j < Timetables.days; j++) {

                for (int h = 0; h < Timetables.periods; h++) {

                    roomUse = 0;
                    for (int k = 0; k < Timetables.lessons; k++) {

                        if (Objects.equals(classrooms[i2], timetable[j][h][k].room))
                            roomUse++;

                    }
                    if (roomUse > 1) {
                        fitnessScore = fitnessScore + (roomUse - 1);
                    }
                }

            }
        }
        return fitnessScore;

    }

    public static int subjectTest(Timetables[][][] timetable, String[] subjects) {
        int fitnessScore = 0;

        int[] lessonsPerSubj = new int[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            for (int j = 0; j < Timetables.days; j++) {

                for (int h = 0; h < Timetables.periods; h++) {

                    for (int k = 0; k < Timetables.lessons; k++) {

                        if (Objects.equals(subjects[i], timetable[j][h][k].slot)) {
                            lessonsPerSubj[i]++;
                        }

                    }

                }

            }
            if (lessonsPerSubj[i] != 5)
                fitnessScore = fitnessScore + Math.abs(5 - lessonsPerSubj[i]);
        }

        return fitnessScore;
    }

}