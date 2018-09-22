
public class Selection
{
	  public static void selectionSort(int[] a)
	  {  
	        for (int i = 0; i < a.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < a.length; j++){  
	                if (a[j] < a[index]){  
	                    index = j; 
	                }  
	            }  
	            int temp = a[index];   
	            a[index] = a[i];  
	            a[i] = temp;  
	        }  
	    }  
	       
	    public static void main(String a[]){  
	        int[] a1 = {11,10,15,16,18,54};  
	        System.out.println("Befor Sort");  
	        for(int i:a1){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println();  
	          
	        selectionSort(a1);  
	         
	        System.out.println("Sorted list");  
	        for(int i:a1){  
	            System.out.print(i+" ");  
	        }  
	    }  
	}

