import java.io.*;
import java.util.*;
class B02{
    public static void main(String[] args)throws IOException{
        double degree = degree_input();
	char kind = kind_input();
	result(degree, kind);
    }

    public static double degree_input(){
        System.out.printf("온도를 입력하세요 ");
        double degree = input_int();
	return degree;
    }
    public static char kind_input()throws IOException{
        System.out.printf("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요. ");
        char kind = input_char();
        return kind;
    }

    public static void result(double degree, char kind){
	    double output_degree = 0;
	if(kind == 'F') output_degree = (degree -32) / 1.8;
        else if(kind == 'C') output_degree = degree *1.8 + 32;
	System.out.printf("변환된 온도는 %.1f 입니다.", output_degree);
    }
    public static double input_int(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
    
    public static char input_char() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
	return (char)input.read();
    }
}
