/**
 * Created by 임승현 on 2017-05-09.
 */

/*
 - 참과 거짓 데이터타입.
    * boolean

 - 숫자를 나타내는 데이터타입.
    * byte
    * short
    * int (Integer) 정수
    * long
    * float 소수
    * double (Double)

 - 문자를 나타내는 데이터타입.
    * string (String) 문자열
    * char
 */

public class DataTypes {
    public void explainInteger() {
        int number1 = 3;
        int number2 = 4;
        number1 = 5;
        // number1 = 3.5;
        System.out.println(number1);

    }
    public void explainDouble() {
        double number1 = 7.0;
        double number2 = 2.0;
        System.out.println(number1 / number2);
    }
    public void castNumber() {
        double number1 = 3.5;
        int number2 = (int) number1;
        System.out.println(number2);
    }
    public void explainString() {
        String text1 = "Hello";
        String text2 = "임승현";
        System.out.println(text1 + text2);
    }
    // 3  != "3" 숫자와 문자는 다르다.
    public void parseData() {
        String numberText = "1";
        int number = 2;
        //System.out.println(numberText * number);
        System.out.println(Integer.valueOf(numberText) + number);
        System.out.println(number + " " + "Hello");
    }
}


