import java.util.Scanner;

public class SwitchExam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("수식 입력(수와 연산자 사이는 공백을 둘것) : ");

        int a = scan.nextInt();
        String b= scan.next();
        int c = scan.nextInt();
        int d=0;

        switch (b){
            case "+" : d=a+c; System.out.println(a+" "+b+" "+c+" = "+d); break;
            case "-" : d=a-c; System.out.println(a+" "+b+" "+c+" = "+d);break;
            case "*" : d=a*c; System.out.println(a+" "+b+" "+c+" = "+d);break;
            case "/" : d=a/c; System.out.println(a+" "+b+" "+c+" = "+d);break;
            default : System.out.println(a+" "+b+" "+c+" = 사칙 연산자가 아닙니다.");
        }
    }
}