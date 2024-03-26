public class arraywithudm {

  public static void main(String[] args) {
    double[] myList = {1.2, 9.3, 1.6, 2.5}; // Declare the whole array; assign values into the arrangement.

    // You will have to call the dispArray udm to display the array contents to screen.
    dispArray(myList);

    // Formula for sum and averaging
    double sum = sumArray(myList);
    double average = sum / myList.length;
    System.out.println();
    System.out.println("Total is " + sum);
    System.out.println("Average is " + average);

    // Finding the Largest Element Formula
    double max = findMax(myList);
    System.out.println("Max is " + max);

    // Finding the Smallest Element Formula
    double min = findMin(myList);
    System.out.println("Min is " + min);
  }

  // UDM on the first double.
  public static void dispArray(double[] myList) {
    // Print all the array elements
    System.out.println("These are the elements in the array:");
    System.out.print("|"); // You will have to make these lines as much as possible to distinguish the values.
    for (int i = 0; i < myList.length; i++) {
      System.out.print(myList[i] + "|");
    }
    System.out.println();
  }

  // UDM for the sum.
  public static double sumArray(double[] myList) {
    double sum = 0;
    for (int i = 0; i < myList.length; i++) {
      sum += myList[i];
    }
    return sum;
  }

  // UDM for the maximum value.
  public static double findMax(double[] myList) {
    double max = myList[0];
    for (int i = 1; i < myList.length; i++) {
      if (myList[i] > max) max = myList[i];
    }
    return max;
  }

  // UDM for the minimum value.
  public static double findMin(double[] myList) {
    double min = myList[0];
    for (int i = 1; i < myList.length; i++) {
      if (myList[i] < min) min = myList[i];
    }
    return min;
  }
}