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
            
            if(check(i,zeroPowZero)){
                System.out.println(i);
            }
            
        }        
    }
    //調べる値、0の0乗の値を受け取り、ミュンヒハウゼン数かを返すメソッド
    public static Boolean check(int checkNum,int zeroPowZero){
        String numString = String.valueOf(checkNum);
        char eachDigit [] = numString.toCharArray();
        for(int i =0; i<eachDigit.length;i++){
            if(i == 0){
                //0の時の処理
            }else{
                //それ以外の数字の処理
            }
        }
    }
}
