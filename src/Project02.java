import java.util.Scanner;

/**
 * Created by 임승현 on 2017-05-14.
 */
public class Project02 {
    double a;
    double b;

    public Project02(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double sum() {
        return a + b;
    }
    public double sub() {
        return a - b;
    }
    public double multply() {
        return a * b;
    }
    public double divsion() {
        return a / b;
    }
}

/* 클래스 상속 연습
class SubProject02 extends Project02 {
    public SubProject02(double a, double b) {
        super(a, b);
    }
    @Override
    public double sum(){
        return a + b + 100;
    }
    public double multply() {
        return a * b;
    }
    public double div() {
        return a / b;
    }
}
*/

