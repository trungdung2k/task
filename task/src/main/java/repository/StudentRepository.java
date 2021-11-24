package repository;

import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student , Long> {

    Student getById(long id);

    Student addStudent(Student student);

    void updateStudent(long id, Student student);

    boolean deleteStudent(long id);
}
