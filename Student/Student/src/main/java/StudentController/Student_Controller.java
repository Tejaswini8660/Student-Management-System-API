package StudentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.StudentRepository;
import student.restapi.entity.Student;

import java.util.List;

@RestController
public class Student_Controller
{
    @Autowired
    StudentRepository repo;
    @GetMapping("/student2")
   public List<Student> getAllStudent(){
        List<Student> Student=repo.findAll();
       return Student;
   }
   @PostMapping("/student2/add")
public void createStudent(@RequestBody Student Student){
repo.save(Student);

}
@PutMapping("/student2/update/{id}")
public Student updateStudent(@PathVariable int id) {
    Student student = repo.findById(id).orElseThrow();
    student.setName("Rahul");
    student.setPercentage(92);
    repo.save(student);
    return student;
}

@DeleteMapping("/student/delete/{id}")
public void removeStudent(@PathVariable int id) {
    Student student = repo.findById(id).orElseThrow();
    repo.delete(student);
}
}