import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int[] a1;
        int n;
        int pos;
        int aux;
        System.out.println("Number of elements: ");
        n=e.nextInt();
        a1 = new int[n];
        for(int i=0;i<a1.length;i++){
            System.out.print("Type number " + (i+1) + " : ");
            a1[i] = e.nextInt();
        }
        //Insertion Method
        for(int i=0;i<n;i++){
            pos = i;
            aux = a1[i];
            while((pos>0) && (a1[pos-1] > aux)){
                a1[pos] = a1[pos-1];
                pos--;
            }
            a1[pos] = aux;
        }

        System.out.println("Ordered increasingly: ");
        for(int k:a1) System.out.print(k + " ");
        System.out.println("\nOrdered decreasingly: ");
        for(int k=a1.length-1;k>=0;k--){
            System.out.print(a1[k] + " ");
        }
    }
}