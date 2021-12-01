package T10.NL1;

public class ExpressionTest {
    public static void main(String[] args) {
        Numeral a = new Numeral(10);
        Numeral b = new Numeral(-3);
        Numeral c = new Numeral(4);
        Numeral d = new Numeral(3);

        Square s1 = new Square(a);
        Addition a1 = new Addition(s1, b);
        Multiplication m1 = new Multiplication(c, d);
        Addition a2 = new Addition(a1, m1);
        Square s2 = new Square(a2);
        Addition a3 = new Addition(b, d);
        Division d1 = new Division(a, a3);

        System.out.println(s2.toString() + " = " + s2.evaluate());
        try {
            System.out.println(d1.toString() + " = " + d1.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0");
        }
    }
}
