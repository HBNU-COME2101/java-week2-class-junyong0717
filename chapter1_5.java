package week2class;

import java.util.Scanner;
public class chapter1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("나이를 입력하세요>> ");
        int age = scanner.nextInt();
        
        if (age <= 0) {
            System.out.println("나이는 양수로만 입력하세요.");
        } else {
            int red = age / 10;
            int blue = (age % 10) / 5;
            int yellow = age % 5;
            
            System.out.println("빨간 초 " + red + "개, 파란 초 " + blue + "개, 노란 초 " + yellow + "개. 총 " + (red + blue + yellow) + "개가 필요합니다.");
        }
        
        scanner.close();
        
	}
}