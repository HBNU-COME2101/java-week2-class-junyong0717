package week2class;

import java.util.Scanner;
public class chapter1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("생일 입력 하세요 >> ");
        int birthday = scanner.nextInt();
        
        int year = birthday / 10000;
        int month = (birthday % 10000) / 100;
        int day = birthday % 100;
        
        System.out.println(year + "년 " + month + "월 " + day + "일");
        scanner.close();
	}

}
