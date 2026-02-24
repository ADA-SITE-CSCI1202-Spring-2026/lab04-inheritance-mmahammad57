package week06;

public class MathDemo {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15};
        
        System.out.println("Min: " + MathDemo.min(10, 20));
        System.out.println("Max: " + MathDemo.max(10, 20));
        System.out.println("Sum: " + MathDemo.sum(numbers));
    }
}