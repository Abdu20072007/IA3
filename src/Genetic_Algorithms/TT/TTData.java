package Genetic_Algorithms.TT;

public class TTData {

    // Class rooms
    static String[] classrooms = new String[21];

    static {
        classrooms[0] = "A1";
        classrooms[1] = "A2";
        classrooms[2] = "B1";
        classrooms[3] = "B2";
        classrooms[4] = "C1";
        classrooms[5] = "C2";
        classrooms[6] = "D1";
        classrooms[7] = "D2";
        classrooms[8] = "E1";
        classrooms[9] = "E2";
        classrooms[10] = "F1";
        classrooms[11] = "F2";
        classrooms[12] = "G1";
        classrooms[13] = "G2";
        classrooms[14] = "H1";
        classrooms[15] = "H2";
        classrooms[16] = "I1";
        classrooms[17] = "I2";
        classrooms[18] = "J1";
        classrooms[19] = "J2";
        classrooms[20] = "K1";

    }

    // Creating the data for the subjects
    static String[] subjects = new String[36];

    static {

        subjects[0] = "Y9English";
        subjects[1] = "Y9Maths";
        subjects[2] = "Y9ICT";
        subjects[3] = "Y9Environmental Studies";
        subjects[4] = "Y9Maltese";
        subjects[5] = "Y9Religion";
        subjects[6] = "Y9Physics";
        subjects[7] = "Y9Chemistry";
        subjects[8] = "Y9Biology";
        subjects[9] = "Y9French";
        subjects[10] = "Y9Italian";
        subjects[11] = "Y9Spanish";
        subjects[12] = "Y10English";
        subjects[13] = "Y10Maths";
        subjects[14] = "Y10ICT";
        subjects[15] = "Y10Environmental Studies";
        subjects[16] = "Y10Maltese";
        subjects[17] = "Y10Religion";
        subjects[18] = "Y10Physics";
        subjects[19] = "Y10Chemistry";
        subjects[20] = "Y10Biology";
        subjects[21] = "Y10French";
        subjects[22] = "Y10Italian";
        subjects[23] = "Y10Spanish";
        subjects[24] = "Y11English";
        subjects[25] = "Y11Maths";
        subjects[26] = "Y11ICT";
        subjects[27] = "Y11Environmental Studies";
        subjects[28] = "Y11Maltese";
        subjects[29] = "Y11Religion";
        subjects[30] = "Y11Physics";
        subjects[31] = "Y11Chemistry";
        subjects[32] = "Y11Biology";
        subjects[33] = "Y11French";
        subjects[34] = "Y11Italian";
        subjects[35] = "Y911Spanish";

    }

    // Initialising the data for the Teachers

    static Teacher[] teachers = new Teacher[8];

    static {

        for (int j = 0; j < 8; j++) {
            teachers[j] = new Teacher();
        }

        teachers[0].name = "Jack Smith";
        teachers[0].tSubj = teachers[0].setSubject(subjects, 0);

        teachers[1].name = "Jonathon Smith";
        teachers[1].tSubj = teachers[1].setSubject(subjects, 1);

        teachers[2].name = "Michael Ings";
        teachers[2].tSubj = teachers[2].setSubject(subjects, 2);

        teachers[3].name = "Maria Buttigieg";
        teachers[3].tSubj = teachers[3].setSubject(subjects, 3);

        teachers[4].name = "Donald Sturridge";
        teachers[4].tSubj = teachers[4].setSubject(subjects, 4);

        teachers[5].name = "Marcus Sanchez";
        teachers[5].tSubj = teachers[5].setSubject(subjects, 5);

        teachers[6].name = "Diego Pohjola";
        teachers[6].tSubj = teachers[6].setSubject(subjects, 6);

        teachers[7].name = "Paul Cardona";
        teachers[7].tSubj = teachers[7].setSubject(subjects, 7);
    }

    // Initialising the data for the students

    static Student[] students = new Student[120];

    static {
        students[0] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[1] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[2] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[3] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[4] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[5] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[6] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[7] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[8] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[9] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[10] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[11] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[12] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[13] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[14] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[15] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[16] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[17] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[18] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[19] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[20] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[21] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[22] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[23] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[24] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[25] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[26] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[27] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[28] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[29] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[30] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[31] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[32] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[33] = new Student("Student4", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[34] = new Student("Student5", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[35] = new Student("Student6", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[36] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 7, 9);
        students[37] = new Student("Student1", subjects, 0, 1, 2, 3, 4, 5, 8, 10);
        students[38] = new Student("Student2", subjects, 0, 1, 2, 3, 4, 5, 6, 11);
        students[39] = new Student("John", subjects, 0, 1, 2, 3, 4, 5, 7, 9);

        students[40] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[41] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[42] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[43] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[44] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[45] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[46] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[47] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[48] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[49] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[50] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[51] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[52] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[53] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[54] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[55] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[56] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[57] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[58] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[59] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[60] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[61] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[62] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[63] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[64] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[65] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[66] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[67] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[68] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[69] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[70] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[71] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[72] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[73] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[74] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[75] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[76] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);
        students[77] = new Student("Student4", subjects, 12, 13, 14, 15, 16, 17, 18, 23);
        students[78] = new Student("Student2", subjects, 12, 13, 14, 15, 16, 17, 19, 21);
        students[79] = new Student("Student3", subjects, 12, 13, 14, 15, 16, 17, 20, 22);

        students[80] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[81] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[82] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[83] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[84] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[85] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[86] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[87] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[88] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[89] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[90] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[91] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[92] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[93] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[94] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[95] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[96] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[97] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[98] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[99] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[100] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[101] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[102] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[103] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[104] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[105] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[106] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[107] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[108] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[109] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[110] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[111] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[112] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[113] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[114] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[115] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[116] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);
        students[117] = new Student("Student3", subjects, 24, 25, 26, 27, 28, 29, 32, 34);
        students[118] = new Student("Student4", subjects, 24, 25, 26, 27, 28, 29, 30, 35);
        students[119] = new Student("Student2", subjects, 24, 25, 26, 27, 28, 29, 31, 33);

    }

}