import java.io.*;
import java.util.*;
public class B03 {
    public static void main(String[] args) throws IOException {
        System.out.printf("날 수를 입력하시오 : ");
	int days = input();
	int seconds = days * 24 * 60 * 60;
	int m_count = seconds / 1000000;
	System.out.printf("날짜에 해당되는 기간은 모두 %d 초입니다.\n 100만 초가 모두 %d 번 포함되었습니다.", seconds, m_count);
    }
    public static int input(){
    	Scanner input = new Scanner(System.in);
	return input.nextInt();
    }
}						
