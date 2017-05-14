import java.util.Scanner;

/**
 * Created by 임승현 on 2017-05-14.
 */
public class Project01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("점수를 입력하세요.");
        int number = sc.nextInt();

        if (number >= 90 && number <= 100) {
            System.out.println("A");
        }
        else if (number >= 80 && number < 90) {
            System.out.println("B");
        }
        else if (number >= 70 && number < 80) {
            System.out.println("C");
        }
        else
            System.out.println("F");
    }
}
