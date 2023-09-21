import java.util.Scanner;

public class delaltchr {
    // Deleting alternate character
    public static void main(String args[]){
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String p = "";
        for( int i =0; i<=n; i++){
            if(i%2 == 0){
                p = p+ str.charAt(i);            
            }
        }
        System.out.println(p); 
    }
}
// This code is working properly