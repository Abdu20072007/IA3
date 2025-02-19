package Genetic_Algorithms.TT;

public class Teacher {

    public Teacher() {
        this.name = name;
        this.tSubj = tSubj;
    }

    String name;
    String tSubj; // t means teacher

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return tSubj;
    }

    public String setSubject(String[] subjects, int subjectIndex) {
        return this.tSubj = subjects[subjectIndex];

    }

}
