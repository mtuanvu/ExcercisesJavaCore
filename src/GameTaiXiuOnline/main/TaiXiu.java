package GameTaiXiuOnline.main;

import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản, Người choi có quyền đặt cược số tiền lớn hơn hoằc ít hơn hoặc bằng
 * số tiền đang có
 * Luật chơi như sau:
 * có 3 viên xúc sắc, mỗi viên xúc xắc có 6 mặt có giá trị từ 1-6,
 * mỗi lần lắc sẽ ra 1 kết quả:
 *kết quả = giá trị xúc sắc 1 + 2 + 3
 * 1. Nếu tổng = 3 hoặc 18 => cái ăn hết, người chơi thua
 * 2. Nếu tổng = (4-10) <=> xỉu => nếu người chơi đặt xỉu thì người chơi thắng ngươc lại thua
 * 3. nếu tổng = (11-17) <=> tài => nếu người chơi đặt tài thì người chơi thắng ngược lại thua
 * */
public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000;

        Scanner sc = new Scanner(System.in);

        int luaChon = 1;
        do {
            System.out.println("----------Mời bạn lựa chọn----------");
            System.out.println("Chọn (1) để tiếp tục chơi");
            System.out.println("Chọn phím bất kì để thoát");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.println("****** BẮT ĐẦU CHƠI *********");

                //Đặt cược
                System.out.print("********* TÀI KHOẢN CỦA BẠN: " + taiKhoanNguoiChoi + ", bạn muốn cược bao nhiêu?");
                double datCuoc = 0;
                do {
                    System.out.println("******* Đặt cược (0 < số tiền cược <= " + taiKhoanNguoiChoi + ":");
                    datCuoc = sc.nextDouble();

                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

                //Chọn tài xỉu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("******* Chọn 1 <=> Tài hoặc 2 <=> Xỉu **********");
                    luaChonTaiXiu = sc.nextInt();

                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);


                //Tung xúc xắc
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();

                int giaTri1 = xucXac1.nextInt(5) + 1;
                int giaTri2 = xucXac2.nextInt(5) + 1;
                int giaTri3 = xucXac3.nextInt(5) + 1;
                int tong = giaTri1 + giaTri2 + giaTri3;

                //Tính toán kết quả
                System.out.println("Kết quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
                if (tong == 3 || tong == 18) {
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("**** Tổng là : " + tong + " => Nhà cái ăn hết, bạn đã thua");
                    System.out.println("**** Tài khoản của bạn là: " + taiKhoanNguoiChoi);
                } else if (tong >= 4 && tong <= 10) {
                    System.out.println("**** Tổng là : " + tong + " Xỉu");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("Bạn đã thắng cược");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("**** Tài khoản của bạn là: " + taiKhoanNguoiChoi);
                    }else {
                        System.out.println("Bạn đã thua cược");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("**** Tài khoản của bạn là: " + taiKhoanNguoiChoi);
                    }

                }else {
                    System.out.println("**** Tổng là : " + tong + " Tài");
                    if (luaChonTaiXiu == 1) {
                        System.out.println("Bạn đã thắng cược");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("**** Tài khoản của bạn là: " + taiKhoanNguoiChoi);
                    }else {
                        System.out.println("Bạn đã thua cược");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("**** Tài khoản của bạn là: " + taiKhoanNguoiChoi);
                    }

                }
            }
        } while (luaChon != 1);
    }

}
