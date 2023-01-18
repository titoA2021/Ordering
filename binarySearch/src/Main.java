import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a1={1,5,4,3,7,6,8,4};
        int x, high, low, mid=0;
        boolean flag = false;

        Scanner e = new Scanner(System.in);
        System.out.print("type a number: ");
        x = e.nextInt();
        int i = 0;
        low = i;
        high = a1.length-1;
        while(i<a1.length && !flag){
            mid = (high+low)/2;
            if(a1[mid] == x){
                flag = true;
            } else if (a1[mid] > x) {
                high = mid - 1;
            } else low = mid + 1;
            i++;
        }
        if(!flag){
            System.out.println("The element is not found");
        }else System.out.println("The element is in the " + (mid+1) + " position");
    }
}