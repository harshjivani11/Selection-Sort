
public class Linearsearch
{
	   public static int linearSearch(int[] a, int element) 
	   {
		      for (int i = 0; i < a.length; i++) 
		      {
		         if (a[i] == element) 
		         {
		            return i;
		         }
		      }
		      return -1;
	}
		   public static void main(String a[]) 
		   {
		      int[] array = { 10, 20, 30, 50, 70, 90 };
		      int element = 50;
		      int index = linearSearch(array, element);
		      if (index != -1) 
		      {
		         System.out.println(element + " present at index: " +index);
		      }
		      
		      else
		      
		      {
		         System.out.println(element + " is not present.");
		      }
	       }
}

