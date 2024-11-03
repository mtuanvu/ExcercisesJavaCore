package studentListManagement;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String studentId;
    private String fullName;
    private int yearOfBirth;
    private float averageScore;

    public Student(String studentId, String fullName, int yearOfBirth, float averageScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.averageScore = averageScore;
    }

    public Student(String studentId) {
    }

    @Override
    public String toString() {
        return "Student: " + "\n" +
                "Mã Sinh Viên: " + studentId +
                ", Họ Và Tên: " + fullName +
                ", Năm Sinh: " + yearOfBirth +
                ", Điểm trung bình: " + averageScore + "\n";
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, fullName, yearOfBirth, averageScore);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
}
