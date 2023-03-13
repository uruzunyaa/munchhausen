import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.math.BigInteger;

public class Munchhausen {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("0の0乗は0か？1か？決めろ");
        int zeroPowZero = scan.nextInt();
        System.out.println("いくつまでチェックするか。決めろ");
        int checkEndNum = scan.nextInt();
        scan.close();
        for(int i = 0;i <= checkEndNum;i++){
            
            if(check(i,zeroPowZero) == true){
                System.out.println(i);
            }
            
        }        
    }
    //調べる値、0の0乗の値を受け取り、ミュンヒハウゼン数かを返すメソッド
    public static Boolean check(int checkNum,int zeroPowZero){
        String numString = String.valueOf(checkNum);
        char eachDigit [] = numString.toCharArray();
        int sum = 0;
        for(int i =0; i<eachDigit.length;i++){
            
            if(eachDigit [i] == '0'){
                //0の時の処理
                sum += zeroPowZero;
            }else{
                //1以上の処理
                sum += Math.pow(eachDigit [i]-'0', eachDigit [i]-'0');

            }
        }
        if(checkNum == sum){
            return true;
        }else{
            return false;
        }
    }
}
