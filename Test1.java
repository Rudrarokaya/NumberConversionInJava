import java.util.*;
import java.util.Scanner;

public class Test1{

    public static void main(String[] args){
        Test1 t = new Test1();
        t.binaryToDecimal();
        t.decimalTOBinary();
        t.octalToDecimal();
        t.decimalToOctal();
        t.hexadecimalToDecimal();
        t.decimalToHexaDecimal();
        t.binaryToOctal();
        t.binaryToHexaDecimalNumber();
    }
    public void binaryToDecimal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number to convert to decimal: ");
        int num = sc.nextInt();
        int binaryNum = num;
        int count = 0;
        int deciNum = 0;

        while (binaryNum != 0) {
            int rem = binaryNum % 10;
            deciNum += rem * Math.pow(2,count);
            count++;
            binaryNum /= 10;
        }
        System.out.println("The binary number '"+num+ "' when converted to decimal is: "+deciNum);
        System.out.println("************************************************");
        System.out.println();
    }
    public void decimalTOBinary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number to convert to binary: ");
        int num = sc.nextInt();
        int deciNum = num;
        int binaryNum = 0;
        int i = 1;
        while( deciNum != 0){
            binaryNum += (deciNum % 2) * i;
            i *= 10;
            deciNum /= 2;
        }
        System.out.println("The decimal number '" + num + "' when converted to decimal is: " + binaryNum);
        System.out.println("************************************************");
        System.out.println();
    }
    public void octalToDecimal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the octal number to convert to decimal: ");
        int num = sc.nextInt();
        int octNum = num;
        int count = 0;
        int deciNum = 0;
        while(octNum != 0){
            int rem = octNum % 10;
            deciNum += rem * Math.pow(8, count++);
            octNum /= 10;
        }
        System.out.println("The octal number '" + num + "' when converted to decimal is: "+deciNum);
        System.out.println("************************************************");
        System.out.println();
    }
    public void decimalToOctal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number to convert to octal number: ");
        int num = sc.nextInt();
        int deciNum = num;
        int i = 1;
        int octalNum = 0;
        while(deciNum != 0){
            octalNum += (deciNum % 8) * i;
            i *= 10;
            deciNum /= 8;
        }
        System.out.println("The decimal number '" + num + "' when converted to octal is: "+octalNum);
        System.out.println("************************************************");
        System.out.println();
    }
    public void hexadecimalToDecimal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hexa-Decimal number to convert to Decimal number:");
        String hexnum1 = sc.nextLine();
        String hexnum = hexnum1;
        String hexstring = "0123456789ABCDEF";
        int deciNum = 0;
        for(int i=0; i<hexnum.length(); i++){
            char ch = hexnum.charAt(i);
            int n = hexstring.indexOf(ch);
            deciNum = 16 * deciNum + n;
        }
        System.out.println("The  hexadecimal number '" + hexnum1 + "' when converted to decimal is: " + deciNum);
        System.out.println("************************************************");
        System.out.println();
    }
    public void decimalToHexaDecimal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number to convert to hexadecimal number: ");
        int num = sc.nextInt();
        int deciNum = num;
        char hexChar[] = {'0','1','2','3','4', '5','6','7','8','9','A','B','C','D','E','F'};
        String hexNum = "";
        try{
            while(deciNum != 0){
                int rem = deciNum % 16;
                hexNum = hexChar[rem] + hexNum;
                deciNum /= 16;
            }
        }
        catch(Exception e){
            System.out.println("Enter only Positive Numbers.");
        }
        System.out.println("The decimal number '"+num+ "' when converted to hexadecimal number is: "+hexNum);
        System.out.println("************************************************");
        System.out.println();
    }
    void binaryToOctal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number to convert to Octal number: ");
        int num = sc.nextInt();
        int bNum= num;
        int deciNum = 0;
        int count = 0;
        while(bNum != 0){
            int rem = bNum % 10;
            deciNum += rem * Math.pow(2, count++);
            bNum /= 10;
        }
        int octalNum = 0;
        int i = 1;
        while( deciNum != 0){
            octalNum += (deciNum % 8) * i;
            i *= 10;
            deciNum /= 8;
        }
        System.out.println("The binary number '" + num + "' when converted to octal number is: " +octalNum);
        System.out.println("************************************************");
        System.out.println();
    }
    void binaryToHexaDecimalNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number to convert to hexa-decimal number: ");
        int num = sc.nextInt();
        int binaryNum = num;
        int deciNum = 0;
        int count = 0;
        while(binaryNum != 0){
            int rem = binaryNum % 10;
            deciNum += rem * Math.pow(2, count++);
            binaryNum /= 10;
        }

        char[] Charhexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexNum = "";
        while(deciNum != 0){
            int rem = deciNum % 16;
            hexNum = Charhexa[rem] + hexNum;
            deciNum /= 16;
        }
        System.out.println("The binary value '" + num + "' when converted to hexadecimal number is: " + hexNum);
        System.out.println("************************************************");
        System.out.println();
    }
}
