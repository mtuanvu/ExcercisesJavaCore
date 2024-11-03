package studentListManagement.main;

import studentListManagement.ListStudent;
import studentListManagement.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListStudent lst = new ListStudent();
        int choice = 0;

        do {
            System.out.println("---------- MENU ------------");
            System.out.println("Vui lòng chọn chức năng");
            System.out.println("1. Thêm danh sách sinh viên");
            System.out.println("2. In danh sách ra màn hình");
            System.out.println("3. Kiểm tra danh sách có rỗng hay không");
            System.out.println("4. Lấy số lượng sinh viên trong danh sách");
            System.out.println("5. Làm rỗng danh sách sinh viên");
            System.out.println("6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên");
            System.out.println("7. Xóa một sinh viên ra khỏi danh sách dựa theo mã sinh viên");
            System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím");
            System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp");
            System.out.println("0. Thoát chương trình");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                        sc.nextLine();
                        System.out.print("Nhập mã sinh viên: ");
                        String studentId = sc.nextLine();

                        System.out.print("Họ và tên: ");
                        String studentName = sc.nextLine();

                        System.out.print("Nhập năm sinh: ");
                        int yearOfBirth = sc.nextInt();

                        System.out.print("Điểm trung bình: ");
                        float averageScore = sc.nextFloat();

                        Student student = new Student(studentId, studentName, yearOfBirth, averageScore);
                        lst.addStudent(student);

                    break;
                case 2:
                    lst.listStudent();
                    break;
                case 3:
                    System.out.println(lst.checkList());
                    break;
                case 4:
                    System.out.println(lst.sizeOfListStudent());
                    break;
                case 5:
                    lst.removeListStudent();
                    System.out.println("Đã làm rỗng danh sách sinh viên");
                    break;
                case 6:
                    System.out.print("Vui lòng nhập mã sinh viên: ");
                    String stId = sc.nextLine();
                    sc.nextLine();
                    Student st = new Student(stId);
                    System.out.println("Kiểm tra sinh viên có trong danh sách: " + lst.checkStudentWithId(st));
                    break;
                case 7:
                    System.out.print("Vui lòng nhập mã sinh viên: ");
                    String stId1 = sc.nextLine();
                    sc.nextLine();
                    Student st1 = new Student(stId1);
                    System.out.println("Xóa sinh viên có trong danh sách: " + lst.deleteStudentWithId(st1));
                    break;
                case 8:
                    System.out.print("Nhập tên sinh viên muốn tìm kiếm: ");
                    String fullName = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Kết quả tìm kiếm: " );
                    lst.findStudent(fullName);
                    break;
                case 9:
                    lst.sortStudentByScore();
                    lst.listStudent();
                    break;
                case 0:
                default:
                    System.out.println("Bạn đã thoát chương trình");

            }
        } while (choice != 0);
    }
}
