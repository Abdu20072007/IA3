package Genetic_Algorithms.TimeTable1;

public class Student {

    String name;
    String[] stSubj = new String[6]; // st stands for student and Subj means subject

    public Student() {
        this.name = name;
        this.stSubj = stSubj;
    }

    public String[] getSubjects() {
        return stSubj;
    }

    // This method allows us to assign he subjects of the student
    public String setSubjects(String[] stSubj, int subjectIndex) {
        return stSubj[subjectIndex];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
