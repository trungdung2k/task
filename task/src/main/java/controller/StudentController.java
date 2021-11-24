package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.ClassRepository;
import repository.FacultyRepository;
import repository.StudentRepository;
import repository.TeacherRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ClassRepository classRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private FacultyRepository facultyRepository;


    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentRepository.addStudent(student);
    }

    @PutMapping("/update")
    public void updateStudent (@RequestParam("id") long id , @RequestBody Student student){
        studentRepository.updateStudent(id , student);
    }

    @DeleteMapping("/delete")
    public boolean deleteStudent(@PathVariable long id ){
        return  studentRepository.deleteStudent(id);
    }



}
