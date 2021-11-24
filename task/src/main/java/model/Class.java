package model;

import lombok.Data;

@Data
public class Class {
    private String classCode;
    private String className;
    private String facultyName;
    private String teacherName;

    public Class(){

    }

    public Class(String classCode, String className, String facultyName, String teacherName) {
        this.classCode = classCode;
        this.className = className;
        this.facultyName = facultyName;
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classCode='" + classCode + '\'' +
                ", className='" + className + '\'' +
                ", faculty='" + facultyName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
