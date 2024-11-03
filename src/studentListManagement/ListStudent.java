package studentListManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent {
    private ArrayList<Student> studentList;

    public ListStudent() {
        this.studentList = new ArrayList();
    }

    public ListStudent(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }


    //Thêm sinh viên
    public void addStudent(Student st){
        this.studentList.add(st);
    }

    //List sinh viên
    public void listStudent(){
        for(Student st : studentList){
            System.out.println(st);
        }
    }

    //Check list có rỗng hay không
    public String checkList(){
        if (this.studentList.isEmpty() == true){
            return "Danh sách sinh viên rỗng";
        }else {
            return "Danh sách có chứa sinh viên";
        }
    }

    //Lấy số lượng sinh viên trong danh sách
    public String sizeOfListStudent(){
        return "Có " + this.studentList.size() + " sinh viên trong danh sách";
    }

    //Làm rỗng danh sách sinh viên
    public void removeListStudent(){
        this.studentList.clear();
    }

    //Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên
    public boolean checkStudentWithId(Student student){
            return this.studentList.contains(student);
    }

    //Xóa sinh viên dựa trên mã sinh viên
    public boolean deleteStudentWithId(Student student){
        return this.studentList.remove(student);
    }

    //Tìm tất cả sinh viên dựa trên Tên được nhập từ bàn phím
    public void findStudent(String name){
        for (Student student : studentList) {
            if(student.getFullName().indexOf(name) >= 0){
                System.out.println(student);
            }
            
        }
    }

    //Xuất ra sinh viên có điểm từ cap đến thấp
    public void  sortStudentByScore(){
        Collections.sort(this.studentList, new Comparator<Student>() {

            @Override
            public int compare(Student st1, Student st2) {
                if (st1.getAverageScore() < st2.getAverageScore()){
                    return 1;
                }else if (st1.getAverageScore() > st2.getAverageScore()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
}
