package service;

import model.Teacher;

import java.util.List;

public interface ITeacherService {
    Teacher addTeacher(Teacher teacher);

    void updateTeacher(String name, Teacher teacher);

    boolean deleteTeacher(String name, Teacher teacher);

    List<Teacher> getAllTeacher();
}
