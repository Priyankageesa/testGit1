/* Write a Java program to sort a numeric array and a String array. */
import java.util.Arrays;
public class SortArray
{
    public static void main(String[] args)
    {
      int [] arr1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
      System.out.println("Original Array : " + Arrays.toString(arr1));
      Arrays.sort(arr1);
      System.out.println("Sorted Array : " + Arrays.toString(arr1));
      String [] arr2 = { "Java", "Python", "PHP", "C#", "C Programming", "C++"};
      System.out.println("Original Array : " + Arrays.toString(arr2));
      Arrays.sort(arr2);
      System.out.println("Sorted Array : " + Arrays.toString(arr2));
    }

}