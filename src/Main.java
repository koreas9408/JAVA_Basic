import java.util.Scanner;

/**
 * Created by 임승현 on 2017-05-09.
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello");

        // Operators
        // Operators operators = new Operators();
        //operators.calculate();

        // Data Types
        //DataTypes dataTypes = new DataTypes();
        //dataTypes.explainInteger();
        //dataTypes.explainDouble();
        //dataTypes.castNumber();
        //dataTypes.explainString();
        //dataTypes.parseData();
        //CollectionFrameworks collectionFrameworks = new CollectionFrameworks();
        //collectionFrameworks.explainArray();
        //collectionFrameworks.explainArrayList();
        //collectionFrameworks.explainHashSet();
        //collectionFrameworks.explainHashMap();

        Project02 project02 = new Project02(4,5);
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요.");
        project02.a=sc.nextDouble();
        System.out.println("두번째 수를 입력하세요.");
        project02.b=sc.nextDouble();

        System.out.println(project02.sum());
        System.out.println(project02.sub());
        System.out.println(project02.multply());
        System.out.println(project02.divsion());

    }
}