package org.example.jxut.model;

public class Grade {
    private int GradeId;
    private String GradeName;

    public Grade(int gradeId, String gradeName) {
        GradeId = gradeId;
        GradeName = gradeName;
    }

    public int getGradeId() {
        return GradeId;
    }

    public void setGradeId(int gradeId) {
        GradeId = gradeId;
    }

    public String getGradeName() {
        return GradeName;
    }

    public void setGradeName(String gradeName) {
        GradeName = gradeName;
    }
}
