package itAcademy.exam7.students.repository;

import itAcademy.exam7.students.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
    Optional<Student> findAllByFullName(List<Student> name);
}
