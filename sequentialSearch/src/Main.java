import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a1={4,1,5,2,3};
        int number;
        boolean flag= false;

        Scanner e = new Scanner(System.in);
        System.out.println("Type a number: ");
        number =  e.nextInt();

        //Sequential Search
        int i =0 ;
        while(i<a1.length && !flag){
            if(a1[i] == number) flag=true;
            i++;
        }
        if(!flag){
            System.out.println("The number is not found in the array");
        } else System.out.println("The number is in the " + (i+1) + " position in the array");
    }
}