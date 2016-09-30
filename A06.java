import java.io.*;
import java.util.*;
public class A06 {
    public static void main(String[] args) throws IOException{
        Scanner str = new Scanner(System.in);
	System.out.print("이름 : ");
	String name = str.next();
	
	int kor = subject(1);
	int eng = subject(2);
	int mat = subject(3);
	
	int sum = kor + eng + mat;
	
	double avg = sum / 3.0;
	System.out.println("[" + name + "]님은");
	System.out.printf("평균은 %.1f이고\n", avg);
	result(avg);
    }

    public static void result(double avg){
    	if(avg > 100 || avg < 0)System.out.println("점수 값 오류");
	else if(avg >= 95) System.out.println("학점은 A+ 입니다.");
	else if(avg >= 90) System.out.println("학점은 A 입니다.");
	else if(avg >= 85) System.out.println("학점은 B+ 입니다.");
	else if(avg >= 80) System.out.println("학점은 B 입니다.");
	else if(avg >= 75) System.out.println("학점은 C+ 입니다.");
	else if(avg >= 70) System.out.println("학점은 C 입니다.");
	else if(avg >= 65) System.out.println("학점은 D+ 입니다.");
	else if(avg >= 60) System.out.println("학점은 D 입니다.");
	else if(avg >= 0) System.out.println("학점은 F 입니다.");
    }

    public static String name(){
    	Scanner str = new Scanner(System.in);
	System.out.print("이름 : ");
	String name = str.next();
	return name;
    }

    public static int subject(int i){
    	int a = 0;
	switch(i){
	    case 1 : System.out.printf("국어 점수를 입력 : ");
	            a = input();
		    break;
            case 2 : System.out.printf("영어 점수를 입력 : ");
	            a = input();
		    break;
	    case 3 : System.out.printf("수학 점수를 입력 : ");
	            a = input();
		    break;
	}
	return a;
    }

    public static int input(){
    	Scanner input = new Scanner(System.in);
	return input.nextInt();
    }
}						
