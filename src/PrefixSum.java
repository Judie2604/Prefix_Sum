import java.util.*;
public class PrefixSum{
    static int[] prefixsum(int arr[]){
        int len = arr.length;
        int prefix[] = new int[len];
        prefix[0] = arr[0];
        for(int i = 1 ; i < len ; i++){
            prefix[i] = prefix[i - 1] + arr[i] ;
        }
        return prefix;
    }
    public static int sumOfElements(int prefix[] , int start , int end){
       
        int sum = 0;
        sum = prefix[end] - (start > 0 ? prefix[start - 1] : 0);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int prefix[] = prefixsum(arr);
        System.out.println("Enter the Start index and end Index:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("The Array is :"+Arrays.toString(arr));
        int result = sumOfElements(prefix , start , end);
        System.out.println("The sum : "+result);
        sc.close();
    }
}