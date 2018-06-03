package university;

import java.util.ArrayList;
import java.util.List;

public class CachedData {
    private List<Faculty> faculties;
    private List<Student> students;

    private static CachedData instance = new CachedData();

    private CachedData(){
        this.faculties = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public List<Faculty> getFaculties() {
        return new ArrayList<>(faculties);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public static CachedData getInstance(){
        return instance;
    }
}
