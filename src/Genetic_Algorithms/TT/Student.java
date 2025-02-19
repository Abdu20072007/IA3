package Genetic_Algorithms.TT;

public class Student {

    String name;
    String[] stSubj = new String[8]; // st stands for student and Subj means subject
    static int numOfSubjects = 8;

    public Student(String name, String[] subject, int subjectIndex1, int subjectIndex2, int subjectIndex3,
            int subjectIndex4, int subjectIndex5, int subjectIndex6, int subjectIndex7, int subjectIndex8) {
        this.name = name;

        stSubj[0] = subject[subjectIndex1];
        stSubj[1] = subject[subjectIndex2];
        stSubj[2] = subject[subjectIndex3];
        stSubj[3] = subject[subjectIndex4];
        stSubj[4] = subject[subjectIndex5];
        stSubj[5] = subject[subjectIndex6];
        stSubj[6] = subject[subjectIndex7];
        stSubj[7] = subject[subjectIndex8];
    }

}