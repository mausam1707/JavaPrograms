import java.util.Scanner;

public class swwpract {
    // Switch case practice
    public static void main(String args[]){
        System.out.println(" Enter the value of Radius :");
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        System.out.println("Enter the value of B");
        int B = sc.nextInt();
        System.out.println("Enter your choice :");
        int c = sc.nextInt();
        switch (c) {
            case 1:
            Number A = (3.14*R*R);
                System.out.println(A);
                break;
            case 2:
            Number D =R*B;
            System.out.println(D);
                break;
        
            default:
                System.out.println("Please enter choice either 1 or 2");;
        }
    }
}
