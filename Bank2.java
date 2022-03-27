import java.util.Scanner;

public class Bank2 {
    public static void main(String[] args) {

        Kouza2 myKouza = new Kouza2(1122, 3344, "石崎将大", 300,300);
        
        Kouza2 myKouza2= new Kouza2(5566, 7788, "竹中祐樹", 400000,400000);


        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("口座番号を入力：");
            int Kouza = sc.nextInt();
            System.out.print("暗証番号を入力：");
            int annsyou = sc.nextInt();
            boolean a1 = myKouza.ninsyou(Kouza, annsyou);
            boolean a2 = myKouza2.ninsyou(Kouza, annsyou);

            if (a1 == true) {
                
                break;
            } else if (a2 == true) {
                myKouza = myKouza2;
                break;
            } else {
                System.out.print("えらー！！！口座番号または暗証番号が違います");

            }
        }
        for(;;){

            myKouza.getName();
            
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