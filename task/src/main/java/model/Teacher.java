package model;

import lombok.Data;

@Data
public class Teacher {
    private String teacherName;
    private String gender;
    private int age;
    private String classCode;

    public Teacher(){

    }

    public Teacher(String teacherName, String gender, int age, String classCode) {
        this.teacherName = teacherName;
        this.gender = gender;
        this.age = age;
        this.classCode = classCode;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", classCode='" + classCode + '\'' +
                '}';
    }
}
