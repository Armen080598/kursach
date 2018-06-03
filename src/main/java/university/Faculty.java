package university;

import java.util.LinkedList;
import java.util.List;

public class Faculty {
    private Integer id;
    private String name;
    private List<Student> students;

    public Faculty(Integer id, String name){
        this.id = id;
        this.name = name;
        this.students = new LinkedList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean deleteStudent(Integer id){
        for(int i = 0 ; i < this.students.size() ; ++i){
            if(this.students.get(i).getId().equals(id)){
                this.students.remove(i);
                return true;
            }
        }
        return false;
    }

    public void addStudent(Student student){
        if(student == null){
            throw new IllegalArgumentException("Passed Student can not be null");
        }
        this.students.add(student);
    }
}
