package StudentManagement;

public class Class {
    private String nameClass;
    private String course;

    public Class(String nameClass, String course) {
        this.nameClass = nameClass;
        this.course = course;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
