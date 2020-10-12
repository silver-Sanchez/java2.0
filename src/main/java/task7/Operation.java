package task7;



public class Operation {
    double result;

    public Operation() {

    }

    public void setOper(char sum) {
        switch (sum) {
            case '+':
            case '/':
            case '-':
            case '*':
                break;

            default:
                System.out.println("вы ввели не верный символ, введите только + - *");

        }

    }

    public double setResult(double one, double two, char operaciya) {
        switch (operaciya) {
            case '+':
                result = one + two;
                System.out.printf("Cумма: %.4f %n", result);
                break;
            case '-':
                result = one - two;
                System.out.printf("вычетание: %.4f %n", result);
                break;
            case '*':
                result = one * two;
                System.out.printf("Умножение: %.4f %n", result);
                break;
            case '/':
                result = one / two;
                System.out.printf("деление: %.4f %n", result);
                break;


        }

        return result;
    }

}