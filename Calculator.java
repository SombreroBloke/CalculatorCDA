package calculator;

public class Calculator {
    
    public static void main(String[] args){
        add(5,6);
        subtract(10,3);
        multiply(2,7);
        divide(8,2);
    }
    public static int add(int x, int y){
        int total = x + y;
        System.out.println(total);
        return total;
    }
    public static int subtract(int x, int y){
        int total = x - y;
        System.out.println(total);
        return total;
    }
    public static int multiply(int x, int y){
        int total = x * y;
        System.out.println(total);
        return total;
    }
    public static int divide(int x, int y){
        int total = x / y;
        System.out.println(total);
        return total;
    }
    
}
