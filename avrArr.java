import java.util.Scanner;

public class avrArr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of Mouse");
        int M = sc.nextInt();
        System.out.println("Enter the price of Monitor");
        int L = sc.nextInt();
        System.out.println("Enter the price of Keyboard");
        int K = sc.nextInt();
        System.out.println("Enter the price of CPU");
        int C = sc.nextInt();
        System.out.println("Enter the price of PenDrive");
        int P = sc.nextInt();
        
        int A[] = {M,L,K,C,P};
        int n = A.length;
        System.out.println(n);
        int sum = 0;
          for(int i=0; i<n; i++){ 
            sum = sum + A[i];
        }
         System.out.println(sum);
          double avr = (double)sum/n;
          System.out.println("Average Price of the items is : " + avr);

    }
}

