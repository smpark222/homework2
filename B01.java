import java.util.*;
class B01 {
    public static void main(String[] args){
        int age = age();
	result(age);
    }

    public static int age(){
        System.out.printf("태어난 연도를 입력하세요. ");
        int birth_year = input();
        int age = 2014 - birth_year + 1;
        return age;
    }

    public static void result(int age){
        if(age >= 20) System.out.println("미성년자가 아닙니다.");
        else System.out.println("미성년자입니다.");
    }

    public static int input(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
