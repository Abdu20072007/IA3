package Genetic_Algorithms.TimeTable1;

public class Timetable {

    // Attributes

    int fitnessScore;
    String slot;
    String room;

    // Behaviour

    public String setTimetableSlot(String[] lesson, int randomNum) {
        return lesson[randomNum];

    }

    public Timetable getTimetables(Timetable timetable) {
        return timetable;
    }

    public static String setSlotRoom(String[] classroom, int randomNum) {
        return classroom[randomNum];
    }
}
