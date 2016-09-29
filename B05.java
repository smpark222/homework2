import java.util.*;
class B05 {
    public static void main(String[] args){
        int age = age();
	result(age);
    }

    public static int age(){
        System.out.printf("태어난 연도를 입력하세요. ");
        int birth_year = input();
        int age = 2012 - birth_year + 1;
        return age;
    }

    public static void result(int age){
        if(age < 7) System.out.println("유아입니다.");
        else if(age < 13) System.out.println("어린이입니다.");
	else if(age < 20) System.out.println("청소년입니다.");
	else if(age < 30) System.out.println("청년입니다.");
	else if(age < 60) System.out.println("중년입니다.");
	else System.out.println("노년입니다.");
    }

    public static int input(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
