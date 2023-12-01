public class Main {
    public static void main(String[] args) {
        division(20,0);
    }
    public static void division(double number1,double number2) {
        try {
            double result;
            result = number1 / number2;
            if(number2 == 0) {
                throw new ArithmeticException("Number is divided by 0");
            } else {
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}