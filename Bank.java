import java.util.Scanner;
public class Bank  {
    public static void main(String[] args){

        Kouza myKouza =new Kouza();
        myKouza.setMoney(10000);
        Scanner sc = new Scanner(System.in);

        for(;;){
            System.out.print("口座取引メニュー\n1..預入,2..引き落とし,3..残高照会,9..取引終了：");
            int a=sc.nextInt();

            if(a==1){
                System.out.print("お金を入れてください\n預金金額：");
                int kaneire=sc.nextInt();
                myKouza.azukeire(kaneire);
                myKouza.syoukai(); 
            }else if(a==2){
                System.out.print("いくらひきおとしますか？\n引き落とし金額：");
                int kaneorosi=sc.nextInt();
                myKouza.hikiotosi(kaneorosi);
                myKouza.syoukai(); 
            }else if(a==3){
                System.out.println("残高照会");
                myKouza.syoukai(); 
                
            }else if(a==9){
                System.out.println("終了します");
                break;
                
            }else{
                System.out.println("えらー！！1,2,3,9のいずれかを入力して！");
                
            }


        }


       
    }
}