package StudentManagement;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Mai Tuan Vu",
                new Date(14, 1, 2005), 8,
                new Class("T2308A", "IT"));

        Student student2 = new Student(2, "Hoang Phan Quan",
                new Date(21, 10, 2000), 5,
                new Class("T2308A", "English"));

        Student student3 = new Student(3, "Luong Tuan Phi",
                new Date(22, 1, 1997), 4,
                new Class("T2308A", "Math"));

        Student student4 = new Student(4, "Ma The Quan",
                new Date(22, 3, 2005), 2,
                new Class("T2308A", "History"));


        System.out.println("The course student 1 is taking is: " + student1.TheCourse());
        System.out.println("The average score of student 1 is: " + student1.AverageScore());
        System.out.println("Date of birth of student 1 and student 2: " + student1.BirthDate(student2) + "\n");


        System.out.println("The course student 2 is taking is: " + student2.TheCourse());
        System.out.println("The average score of student 2 is: " + student2.AverageScore());
        System.out.println("Date of birth of student 2 and student 3: " + student2.BirthDate(student3) + "\n");



        System.out.println("The course student 3 is taking is: " + student3.TheCourse());
        System.out.println("The average score of student 3 is: " + student3.AverageScore());
        System.out.println("Date of birth of student 3 and student 4: " + student3.BirthDate(student4) + "\n");



        System.out.println("The course student 4 is taking is: " + student4.TheCourse());
        System.out.println("The average score of student 4 is: " + student4.AverageScore());
        System.out.println("Date of birth of student 4 and student 1: " + student4.BirthDate(student1) + "\n");




    }
}
