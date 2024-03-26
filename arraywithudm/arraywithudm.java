public class arraywithudm {

  public static void main(String[] args) {
    double[] myList = {1.2, 9.3, 1.6, 2.5}; // Declare the array; assign values into array

    // Call the dispArray user-defined method to display the array contents to screen.
    dispArray(myList);

    // Summing and averaging all elements
    double sum = sumArray(myList);
    double average = sum / myList.length;
    System.out.println();
    System.out.println("Total is " + sum);
    System.out.println("Average is " + average);

    // Finding the largest element
    double max = findMax(myList);
    System.out.println("Max is " + max);

    // Finding the smallest element
    double min = findMin(myList);
    System.out.println("Min is " + min);
  }

  // User-defined method to display the array contents
  public static void dispArray(double[] myList) {
    // Print all the array elements
    System.out.println("These are the elements in the array:");
    System.out.print("|");
    for (int i = 0; i < myList.length; i++) {
      System.out.print(myList[i] + "|");
    }
    System.out.println();
  }

  // User-defined method to sum all elements in the array
  public static double sumArray(double[] myList) {
    double sum = 0;
    for (int i = 0; i < myList.length; i++) {
      sum += myList[i];
    }
    return sum;
  }

  // User-defined method to find the largest element in the array
  public static double findMax(double[] myList) {
    double max = myList[0];
    for (int i = 1; i < myList.length; i++) {
      if (myList[i] > max) max = myList[i];
    }
    return max;
  }

  // User-defined method to find the smallest element in the array
  public static double findMin(double[] myList) {
    double min = myList[0];
    for (int i = 1; i < myList.length; i++) {
      if (myList[i] < min) min = myList[i];
    }
    return min;
  }
}