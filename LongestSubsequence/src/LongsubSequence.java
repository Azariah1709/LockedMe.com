import java.util.Scanner;

class LongsubSequence
{
    
    public static int LIS(int[] arr, int i, int n, int prev)
    {
   
        if (i == n) {
            return 0;
        }
 
        
        int excl = LIS(arr, i + 1, n, prev);
 
        int incl = 0;
        if (arr[i] > prev) {
            incl = 1 + LIS(arr, i + 1, n, arr[i]);
        }
 
        return Integer.max(incl, excl);
    }
   
    public static void main(String args[])
    {
    	int[] arr = new int[100];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        n=input.nextInt();
        System.out.println("Enter the array elements :");
        for(int i=0;i<n;i++){
        	arr[i]=input.nextInt();
        	
        }
        
        
        
        System.out.print("The length of the LIS is "
                + LIS(arr, 0,n, Integer.MIN_VALUE));
        input.close();
        
    }

}
