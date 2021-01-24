package DayEighteen;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, numbers.length - 1));
        System.out.print(count7("717771237"));
    }
    public static int recursionSum(int[] numbers, int n){
        if(n==0){
            return numbers[n];
        }
        else {
            return numbers[n] + recursionSum(numbers, n-1);
        }
    }
    public static int count7 (String s) {
        if (s.length() == 0) {
            return 0;
        } else {
            int counter = count7(s.substring(1));
            if (s.charAt(0) == '7') {
                return 1 + counter;
            } else
                return counter;
        }
    }
}
