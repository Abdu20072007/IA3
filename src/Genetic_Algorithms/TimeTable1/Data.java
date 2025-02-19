package Genetic_Algorithms.TimeTable1;

public class Data {

    {
        // Class rooms
        String[] classrooms = new String[6];
        classrooms[0] = "A1";
        classrooms[1] = "A2";
        classrooms[2] = "B1";
        classrooms[3] = "B2";
        classrooms[4] = "C1";
        classrooms[5] = "C2";

        // Creating the data for the subjects
        String[] subjects = new String[8];
        subjects[0] = "Maths";
        subjects[1] = "English";
        subjects[2] = "Physics";
        subjects[3] = "Chemistry";
        subjects[4] = "Biology";
        subjects[5] = "French";
        subjects[6] = "Italian";
        subjects[7] = "Spanish";

        // Initialising the data for the Teachers

        Teacher[] teachers = new Teacher[8];
        for (int i = 0; i < 8; i++) {
            teachers[i] = new Teacher();
        }
        teachers[0].name = "Jack Smith";
        teachers[0].tSubj = teachers[0].setSubject(subjects, 0);

        teachers[1].name = "Jonathon Smith";
        teachers[1].tSubj = teachers[0].setSubject(subjects, 1);

        teachers[2].name = "Michael Ings";
        teachers[2].tSubj = teachers[0].setSubject(subjects, 2);

        teachers[3].name = "Maria Buttigieg";
        teachers[3].tSubj = teachers[0].setSubject(subjects, 3);

        teachers[4].name = "Donald Sturridge";
        teachers[4].tSubj = teachers[0].setSubject(subjects, 4);

        teachers[5].name = "Marcus Sanchez";
        teachers[5].tSubj = teachers[0].setSubject(subjects, 5);

        teachers[6].name = "Diego Pohjola";
        teachers[6].tSubj = teachers[0].setSubject(subjects, 6);

        teachers[7].name = "Paul Cardona";
        teachers[7].tSubj = teachers[0].setSubject(subjects, 7);

        // Initialising the data for the students

        Student[] students = new Student[40];

        for (int i = 0; i < 40; i++) {
            students[i] = new Student();
        }

        students[0].name = "John";
        students[0].stSubj[0] = students[0].setSubjects(subjects, 0);
        students[0].stSubj[1] = students[0].setSubjects(subjects, 1);
        students[0].stSubj[2] = students[0].setSubjects(subjects, 2);
        students[0].stSubj[3] = students[0].setSubjects(subjects, 3);
        students[0].stSubj[4] = students[0].setSubjects(subjects, 4);

        students[1].name = "Alice";
        students[1].stSubj[0] = students[0].setSubjects(subjects, 0);
        students[1].stSubj[1] = students[0].setSubjects(subjects, 1);
        students[1].stSubj[2] = students[0].setSubjects(subjects, 5);
        students[1].stSubj[3] = students[0].setSubjects(subjects, 6);
        students[1].stSubj[4] = students[0].setSubjects(subjects, 4);

        students[2].name = "Bob";
        students[2].stSubj[0] = students[2].setSubjects(subjects, 3);
        students[2].stSubj[1] = students[2].setSubjects(subjects, 1);
        students[2].stSubj[2] = students[2].setSubjects(subjects, 7);
        students[2].stSubj[3] = students[2].setSubjects(subjects, 5);
        students[2].stSubj[4] = students[2].setSubjects(subjects, 0);

        students[3].name = "Sophia";
        students[3].stSubj[0] = students[3].setSubjects(subjects, 2);
        students[3].stSubj[1] = students[3].setSubjects(subjects, 4);
        students[3].stSubj[2] = students[3].setSubjects(subjects, 6);
        students[3].stSubj[3] = students[3].setSubjects(subjects, 1);
        students[3].stSubj[4] = students[3].setSubjects(subjects, 0);

        students[4].name = "Liam";
        students[4].stSubj[0] = students[4].setSubjects(subjects, 7);
        students[4].stSubj[1] = students[4].setSubjects(subjects, 5);
        students[4].stSubj[2] = students[4].setSubjects(subjects, 3);
        students[4].stSubj[3] = students[4].setSubjects(subjects, 2);
        students[4].stSubj[4] = students[4].setSubjects(subjects, 1);

        students[5].name = "Emma";
        students[5].stSubj[0] = students[5].setSubjects(subjects, 6);
        students[5].stSubj[1] = students[5].setSubjects(subjects, 3);
        students[5].stSubj[2] = students[5].setSubjects(subjects, 2);
        students[5].stSubj[3] = students[5].setSubjects(subjects, 0);
        students[5].stSubj[4] = students[5].setSubjects(subjects, 7);

        students[6].name = "Noah";
        students[6].stSubj[0] = students[6].setSubjects(subjects, 4);
        students[6].stSubj[1] = students[6].setSubjects(subjects, 7);
        students[6].stSubj[2] = students[6].setSubjects(subjects, 0);
        students[6].stSubj[3] = students[6].setSubjects(subjects, 5);
        students[6].stSubj[4] = students[6].setSubjects(subjects, 1);

        students[7].name = "Mia";
        students[7].stSubj[0] = students[7].setSubjects(subjects, 2);
        students[7].stSubj[1] = students[7].setSubjects(subjects, 3);
        students[7].stSubj[2] = students[7].setSubjects(subjects, 6);
        students[7].stSubj[3] = students[7].setSubjects(subjects, 1);
        students[7].stSubj[4] = students[7].setSubjects(subjects, 0);

        students[8].name = "James";
        students[8].stSubj[0] = students[8].setSubjects(subjects, 3);
        students[8].stSubj[1] = students[8].setSubjects(subjects, 7);
        students[8].stSubj[2] = students[8].setSubjects(subjects, 4);
        students[8].stSubj[3] = students[8].setSubjects(subjects, 0);
        students[8].stSubj[4] = students[8].setSubjects(subjects, 1);

        students[9].name = "Olivia";
        students[9].stSubj[0] = students[9].setSubjects(subjects, 5);
        students[9].stSubj[1] = students[9].setSubjects(subjects, 0);
        students[9].stSubj[2] = students[9].setSubjects(subjects, 2);
        students[9].stSubj[3] = students[9].setSubjects(subjects, 7);
        students[9].stSubj[4] = students[9].setSubjects(subjects, 1);

        students[10].name = "Lucas";
        students[10].stSubj[0] = students[10].setSubjects(subjects, 6);
        students[10].stSubj[1] = students[10].setSubjects(subjects, 5);
        students[10].stSubj[2] = students[10].setSubjects(subjects, 1);
        students[10].stSubj[3] = students[10].setSubjects(subjects, 4);
        students[10].stSubj[4] = students[10].setSubjects(subjects, 0);

        students[11].name = "Amelia";
        students[11].stSubj[0] = students[11].setSubjects(subjects, 1);
        students[11].stSubj[1] = students[11].setSubjects(subjects, 6);
        students[11].stSubj[2] = students[11].setSubjects(subjects, 2);
        students[11].stSubj[3] = students[11].setSubjects(subjects, 7);
        students[11].stSubj[4] = students[11].setSubjects(subjects, 0);

        students[12].name = "Ethan";
        students[12].stSubj[0] = students[12].setSubjects(subjects, 4);
        students[12].stSubj[1] = students[12].setSubjects(subjects, 1);
        students[12].stSubj[2] = students[12].setSubjects(subjects, 3);
        students[12].stSubj[3] = students[12].setSubjects(subjects, 7);
        students[12].stSubj[4] = students[12].setSubjects(subjects, 0);

        students[13].name = "Isabella";
        students[13].stSubj[0] = students[13].setSubjects(subjects, 2);
        students[13].stSubj[1] = students[13].setSubjects(subjects, 0);
        students[13].stSubj[2] = students[13].setSubjects(subjects, 6);
        students[13].stSubj[3] = students[13].setSubjects(subjects, 4);
        students[13].stSubj[4] = students[13].setSubjects(subjects, 7);

        students[14].name = "Mason";
        students[14].stSubj[0] = students[14].setSubjects(subjects, 3);
        students[14].stSubj[1] = students[14].setSubjects(subjects, 5);
        students[14].stSubj[2] = students[14].setSubjects(subjects, 1);
        students[14].stSubj[3] = students[14].setSubjects(subjects, 6);
        students[14].stSubj[4] = students[14].setSubjects(subjects, 0);

        students[15].name = "Charlotte";
        students[15].stSubj[0] = students[15].setSubjects(subjects, 7);
        students[15].stSubj[1] = students[15].setSubjects(subjects, 2);
        students[15].stSubj[2] = students[15].setSubjects(subjects, 3);
        students[15].stSubj[3] = students[15].setSubjects(subjects, 4);
        students[15].stSubj[4] = students[15].setSubjects(subjects, 0);

        students[16].name = "Logan";
        students[16].stSubj[0] = students[16].setSubjects(subjects, 1);
        students[16].stSubj[1] = students[16].setSubjects(subjects, 6);
        students[16].stSubj[2] = students[16].setSubjects(subjects, 5);
        students[16].stSubj[3] = students[16].setSubjects(subjects, 2);
        students[16].stSubj[4] = students[16].setSubjects(subjects, 7);

        students[17].name = "Ava";
        students[17].stSubj[0] = students[17].setSubjects(subjects, 4);
        students[17].stSubj[1] = students[17].setSubjects(subjects, 3);
        students[17].stSubj[2] = students[17].setSubjects(subjects, 0);
        students[17].stSubj[3] = students[17].setSubjects(subjects, 6);
        students[17].stSubj[4] = students[17].setSubjects(subjects, 5);

        students[18].name = "Jackson";
        students[18].stSubj[0] = students[18].setSubjects(subjects, 2);
        students[18].stSubj[1] = students[18].setSubjects(subjects, 1);
        students[18].stSubj[2] = students[18].setSubjects(subjects, 7);
        students[18].stSubj[3] = students[18].setSubjects(subjects, 0);
        students[18].stSubj[4] = students[18].setSubjects(subjects, 4);

        students[19].name = "Ella";
        students[19].stSubj[0] = students[19].setSubjects(subjects, 6);
        students[19].stSubj[1] = students[19].setSubjects(subjects, 5);
        students[19].stSubj[2] = students[19].setSubjects(subjects, 3);
        students[19].stSubj[3] = students[19].setSubjects(subjects, 2);
        students[19].stSubj[4] = students[19].setSubjects(subjects, 1);

        students[20].name = "Aiden";
        students[20].stSubj[0] = students[20].setSubjects(subjects, 0);
        students[20].stSubj[1] = students[20].setSubjects(subjects, 4);
        students[20].stSubj[2] = students[20].setSubjects(subjects, 6);
        students[20].stSubj[3] = students[20].setSubjects(subjects, 7);
        students[20].stSubj[4] = students[20].setSubjects(subjects, 2);

        students[21].name = "Scarlett";
        students[21].stSubj[0] = students[21].setSubjects(subjects, 7);
        students[21].stSubj[1] = students[21].setSubjects(subjects, 2);
        students[21].stSubj[2] = students[21].setSubjects(subjects, 1);
        students[21].stSubj[3] = students[21].setSubjects(subjects, 6);
        students[21].stSubj[4] = students[21].setSubjects(subjects, 5);

        students[22].name = "Elijah";
        students[22].stSubj[0] = students[22].setSubjects(subjects, 3);
        students[22].stSubj[1] = students[22].setSubjects(subjects, 0);
        students[22].stSubj[2] = students[22].setSubjects(subjects, 4);
        students[22].stSubj[3] = students[22].setSubjects(subjects, 5);
        students[22].stSubj[4] = students[22].setSubjects(subjects, 7);

        students[23].name = "Grace";
        students[23].stSubj[0] = students[23].setSubjects(subjects, 6);
        students[23].stSubj[1] = students[23].setSubjects(subjects, 3);
        students[23].stSubj[2] = students[23].setSubjects(subjects, 1);
        students[23].stSubj[3] = students[23].setSubjects(subjects, 0);
        students[23].stSubj[4] = students[23].setSubjects(subjects, 4);

        students[24].name = "Oliver";
        students[24].stSubj[0] = students[24].setSubjects(subjects, 2);
        students[24].stSubj[1] = students[24].setSubjects(subjects, 7);
        students[24].stSubj[2] = students[24].setSubjects(subjects, 6);
        students[24].stSubj[3] = students[24].setSubjects(subjects, 5);
        students[24].stSubj[4] = students[24].setSubjects(subjects, 3);

        students[25].name = "Zoe";
        students[25].stSubj[0] = students[25].setSubjects(subjects, 1);
        students[25].stSubj[1] = students[25].setSubjects(subjects, 0);
        students[25].stSubj[2] = students[25].setSubjects(subjects, 4);
        students[25].stSubj[3] = students[25].setSubjects(subjects, 7);
        students[25].stSubj[4] = students[25].setSubjects(subjects, 2);

        students[26].name = "Benjamin";
        students[26].stSubj[0] = students[26].setSubjects(subjects, 5);
        students[26].stSubj[1] = students[26].setSubjects(subjects, 3);
        students[26].stSubj[2] = students[26].setSubjects(subjects, 2);
        students[26].stSubj[3] = students[26].setSubjects(subjects, 6);
        students[26].stSubj[4] = students[26].setSubjects(subjects, 0);

        students[27].name = "Lily";
        students[27].stSubj[0] = students[27].setSubjects(subjects, 4);
        students[27].stSubj[1] = students[27].setSubjects(subjects, 1);
        students[27].stSubj[2] = students[27].setSubjects(subjects, 7);
        students[27].stSubj[3] = students[27].setSubjects(subjects, 2);
        students[27].stSubj[4] = students[27].setSubjects(subjects, 5);

        students[28].name = "Henry";
        students[28].stSubj[0] = students[28].setSubjects(subjects, 6);
        students[28].stSubj[1] = students[28].setSubjects(subjects, 0);
        students[28].stSubj[2] = students[28].setSubjects(subjects, 3);
        students[28].stSubj[3] = students[28].setSubjects(subjects, 4);
        students[28].stSubj[4] = students[28].setSubjects(subjects, 7);

        students[29].name = "Emily";
        students[29].stSubj[0] = students[29].setSubjects(subjects, 5);
        students[29].stSubj[1] = students[29].setSubjects(subjects, 1);
        students[29].stSubj[2] = students[29].setSubjects(subjects, 6);
        students[29].stSubj[3] = students[29].setSubjects(subjects, 3);
        students[29].stSubj[4] = students[29].setSubjects(subjects, 2);

        students[30].name = "Sebastian";
        students[30].stSubj[0] = students[30].setSubjects(subjects, 0);
        students[30].stSubj[1] = students[30].setSubjects(subjects, 4);
        students[30].stSubj[2] = students[30].setSubjects(subjects, 2);
        students[30].stSubj[3] = students[30].setSubjects(subjects, 7);
        students[30].stSubj[4] = students[30].setSubjects(subjects, 5);

        students[31].name = "Harper";
        students[31].stSubj[0] = students[31].setSubjects(subjects, 3);
        students[31].stSubj[1] = students[31].setSubjects(subjects, 6);
        students[31].stSubj[2] = students[31].setSubjects(subjects, 1);
        students[31].stSubj[3] = students[31].setSubjects(subjects, 0);
        students[31].stSubj[4] = students[31].setSubjects(subjects, 7);

        students[32].name = "Matthew";
        students[32].stSubj[0] = students[32].setSubjects(subjects, 5);
        students[32].stSubj[1] = students[32].setSubjects(subjects, 0);
        students[32].stSubj[2] = students[32].setSubjects(subjects, 4);
        students[32].stSubj[3] = students[32].setSubjects(subjects, 3);
        students[32].stSubj[4] = students[32].setSubjects(subjects, 2);

        students[33].name = "Hannah";
        students[33].stSubj[0] = students[33].setSubjects(subjects, 6);
        students[33].stSubj[1] = students[33].setSubjects(subjects, 1);
        students[33].stSubj[2] = students[33].setSubjects(subjects, 7);
        students[33].stSubj[3] = students[33].setSubjects(subjects, 4);
        students[33].stSubj[4] = students[33].setSubjects(subjects, 0);

        students[34].name = "Daniel";
        students[34].stSubj[0] = students[34].setSubjects(subjects, 3);
        students[34].stSubj[1] = students[34].setSubjects(subjects, 2);
        students[34].stSubj[2] = students[34].setSubjects(subjects, 7);
        students[34].stSubj[3] = students[34].setSubjects(subjects, 5);
        students[34].stSubj[4] = students[34].setSubjects(subjects, 1);

        students[35].name = "Abigail";
        students[35].stSubj[0] = students[35].setSubjects(subjects, 0);
        students[35].stSubj[1] = students[35].setSubjects(subjects, 6);
        students[35].stSubj[2] = students[35].setSubjects(subjects, 4);
        students[35].stSubj[3] = students[35].setSubjects(subjects, 3);
        students[35].stSubj[4] = students[35].setSubjects(subjects, 7);

        students[36].name = "William";
        students[36].stSubj[0] = students[36].setSubjects(subjects, 5);
        students[36].stSubj[1] = students[36].setSubjects(subjects, 2);
        students[36].stSubj[2] = students[36].setSubjects(subjects, 1);
        students[36].stSubj[3] = students[36].setSubjects(subjects, 6);
        students[36].stSubj[4] = students[36].setSubjects(subjects, 0);

        students[37].name = "Sophie";
        students[37].stSubj[0] = students[37].setSubjects(subjects, 7);
        students[37].stSubj[1] = students[37].setSubjects(subjects, 4);
        students[37].stSubj[2] = students[37].setSubjects(subjects, 3);
        students[37].stSubj[3] = students[37].setSubjects(subjects, 2);
        students[37].stSubj[4] = students[37].setSubjects(subjects, 5);

        students[38].name = "Alexander";
        students[38].stSubj[0] = students[38].setSubjects(subjects, 1);
        students[38].stSubj[1] = students[38].setSubjects(subjects, 6);
        students[38].stSubj[2] = students[38].setSubjects(subjects, 0);
        students[38].stSubj[3] = students[38].setSubjects(subjects, 7);
        students[38].stSubj[4] = students[38].setSubjects(subjects, 3);

        students[39].name = "Avery";
        students[39].stSubj[0] = students[39].setSubjects(subjects, 4);
        students[39].stSubj[1] = students[39].setSubjects(subjects, 5);
        students[39].stSubj[2] = students[39].setSubjects(subjects, 2);
        students[39].stSubj[3] = students[39].setSubjects(subjects, 1);
        students[39].stSubj[4] = students[39].setSubjects(subjects, 0);

    }
}