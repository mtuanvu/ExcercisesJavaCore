package StudentManagement;

public class Student {
    private int id;
    private String fullName;
    private Date birthDate;
    private float averageScore;
    private Class aClass;

    public String TheCourse(){
        return this.aClass.getCourse();
    }

    public String AverageScore(){
        if (this.averageScore >= 5){
            return "Pass";
        }
        return "Not Pass";
    }

    public String BirthDate(Student student){
        if(this.birthDate.getDay() == student.birthDate.getDay()){
            return "Coincide";
        }
        return "Not identical";
    }

    public Student(int id, String fullName, Date birthDate, float averageScore, Class aClass) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.averageScore = averageScore;
        this.aClass = aClass;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }
}
