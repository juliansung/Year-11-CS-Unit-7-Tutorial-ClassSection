public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    public Student(String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        id = studentCount;
        studentCount++;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getYearLevel(){
        return yearLevel;
    }

    public void setYearLevel(int yearLevel){
        this.yearLevel=yearLevel;
    }

    public int getStudentCount(){
        return studentCount;
    }

    public boolean equals(Student other){
        if(toString(this).equals(toString(other))) return true;
        return false;
    }

    public String toString(Student student){
        return "ID: " + id + ", first name: " + firstName + ", last name: " + lastName + ", age: " + age;
    }




}
