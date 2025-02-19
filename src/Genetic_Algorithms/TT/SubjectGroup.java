package Genetic_Algorithms.TT;

import java.util.List;

public class SubjectGroup {

    // ----------- Attributes ---------------------------------

    int groupIndex;
    List<String> subjects;

    // ----------- Constructor --------------------------------

    public SubjectGroup(int groupIndex, List<String> subjects) {
        this.groupIndex = groupIndex;
        this.subjects = subjects;
    }

}
