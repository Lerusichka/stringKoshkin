package ru.kors.springstudents.service.imp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kors.springstudents.bodel.Student;
import ru.kors.springstudents.repository.InMemoryStudent;
import ru.kors.springstudents.service.StudentService;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudent repository ;
    @Override
    public List<Student> findAllStudent(){
            return repository.findAllStudent();
    }
    @Override
    public Student saveStudent(Student student){
        return repository.saveStudent(student);
    }
    @Override
    public Student findByEmail(String email){
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
