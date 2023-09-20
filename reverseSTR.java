import java.util.Scanner;

class reverseSTR {
    public static void main(String args[]){
        System.out.println("Enter the string 1");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Enter the string");
        String str2 = sc.nextLine();     
      //  String st ="";
      str1 = str1+str2;
       int a = str1.length();
       //int b = str2.length();
       // System.out.println(a);
       // System.out.println(str.charAt(3));
        for(int i=0; i<str1.length(); i++){
           char revchar = str1.charAt(a-i-1);
          String revstr1 = revchar+ "";
            System.out.print(revstr1);
        }
    
        
        }
        
    
    }
