public class methoddemosample {

     public static void main(String[] args) {

          int a, b;
          
          a = 9;
          b = 6;

          System.out.println("Minimum value is: " + minFunc(a,b));

     }

     public static int minFunc(int a, int b) {

          // This UDM determines the smaller value (min) between two numeric values

          int min;

          if ( a > b )
               min = b;
          else
               min = a;

          return min;

     }


}