public class arraywithudm {

  public static void main(String[] args) {
    double[] myList = {9.54, 3.234, 854.2, 32.1}; // Declare the whole array; assign values into the arrangement. // First Double.

    // You will have to call the dispArray udm to display the array contents to screen.
    dispArray(myList);

    // This is the Formula for the sum and averaging.
    double sum = sumArray(myList); // Second Double.
    double average = sum / myList.length; // Third Double.
    System.out.println();
    System.out.println("Total is " + sum);
    System.out.println("Average is " + average);

    // This is the finding of the Largest Element Formula.
    double max = findMax(myList); // Fourth Double.
    System.out.println("Max is " + max);

    // This is the finding of the Smallest Element Formula.
    double min = findMin(myList); // Fifth Double
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
    for (int i = 0; i < myList.length; i++) { // first for loop.
      sum += myList[i];
    }
    return sum;
  }

  // UDM for the maximum value.
  public static double findMax(double[] myList) {
    double max = myList[0];
    for (int i = 1; i < myList.length; i++) { // second for loop.
      if (myList[i] > max) max = myList[i];
    }
    return max;
  }

  // UDM for the minimum value.
  public static double findMin(double[] myList) {
    double min = myList[0];
    for (int i = 1; i < myList.length; i++) { // third for loop.
      if (myList[i] < min) min = myList[i];
    }
    return min;
  }
}