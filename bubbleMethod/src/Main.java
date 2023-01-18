import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int[] a1;
        int n;
        int aux;
        System.out.println("Number of elements: ");
        n=e.nextInt();
        a1 = new int[n];
        for(int i=0;i<a1.length;i++){
            System.out.print("Type number " + (i+1) + " : ");
            a1[i] = e.nextInt();
        }

        //Bubble_Method
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(a1[j]>a1[j+1]){
                    aux = a1[j];
                    a1[j]= a1[j+1];
                    a1[j+1] = aux;
                }
            }
        }
        System.out.println("Ordered increasingly: ");
        for(int k:a1) System.out.print(k + " ");
        System.out.println("\nOrdered decreasingly: ");
        for(int k=a1.length-1;k>=0;k--){
            System.out.print(a1[k] + " ");
        }
    }
}