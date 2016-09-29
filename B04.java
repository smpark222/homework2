import java.io.*;
import java.util.*;
public class B04 {
    public static void main(String[] args) throws IOException {
	int kor = subject(1);
	int eng = subject(2);
	int mat = subject(3);
	
	int sum = kor + eng + mat;
	
	double avg = sum / 3.0;
	
	System.out.printf("총점 : %d\n평균 : %.1f\n", sum, avg);

	if(kor > 90) System.out.println("국어점수가 우수합니다");
	if(eng > 90) System.out.println("영어점수가 우수합니다");
	if(mat > 90) System.out.println("수학점수가 우수합니다");
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
