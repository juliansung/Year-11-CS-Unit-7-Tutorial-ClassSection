import java.util.ArrayList;

public class ClassSection {

    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> student = new ArrayList<>();

    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject=subject;
        this.capacity=capacity;
        this.yearLevel=yearLevel;
    }

    public String getSubject(){return subject;}

    public void setSubject(String subject){this.subject=subject;}

    public int getCapacity(){return capacity;}

    public void setCapacity(int capacity){this.capacity=capacity;}

    public int getYearLevel(){return yearLevel;}

    public void setYearLevel(int yearLevel){this.yearLevel=yearLevel;};

    public ArrayList<Student> getStudents(){return student;}

    public void addStudent(Student student){
        if(yearLevel==student.getYearLevel() && (!isStudentEnrolled(student))){
            this.student.add(student);
        }
    }

    public void removeStudent(Student student){
        this.student.remove(student);
    }

    public boolean isStudentEnrolled(Student student){
        for(int i=0; i<this.student.size()-1;i++){
            if(this.student.get(i).equals(student)){
                return true;
            }

        }
        return false;
    }

    public String toString(){
        String output = "subject = " + subject + ", capacity = " + capacity + ", students = " + student.toString();
        return output;
    }
}
