import java.util.Scanner;

public class Absolute_Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int b=0;
        System.out.print("정수 입력 : ");
        int a = scan.nextInt();

        if(a<=0){
            b = a*-1;
        }
        else{
            b=a;
        }
        System.out.println(a+"의 절대값은 "+b+"입니다.");
    }
}
