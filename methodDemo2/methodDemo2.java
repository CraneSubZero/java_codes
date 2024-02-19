public class methodDemo2 {

    public static void main(String[] args) {

        int a, b;

        a = 9;
        b = 6;

        System.out.println("Maximum Value is: " + maxFunc(a, b));

    }

    public static int maxFunc(int a, int b) {

        int max;

        if (a > b)
            max = a;
        else
            max = b;

        return max;
    }
}