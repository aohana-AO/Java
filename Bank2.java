import java.util.Scanner;

public class Bank2 {
    public static void main(String[] args) {

        Kouza2 myKouza = new Kouza2(1122, 3344, "�΍菫��", 300,300);
        
        Kouza2 myKouza2= new Kouza2(5566, 7788, "�|���S��", 400000,400000);


        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("�����ԍ�����́F");
            int Kouza = sc.nextInt();
            System.out.print("�Ïؔԍ�����́F");
            int annsyou = sc.nextInt();
            boolean a1 = myKouza.ninsyou(Kouza, annsyou);
            boolean a2 = myKouza2.ninsyou(Kouza, annsyou);

            if (a1 == true) {
                
                break;
            } else if (a2 == true) {
                myKouza = myKouza2;
                break;
            } else {
                System.out.print("����[�I�I�I�����ԍ��܂��͈Ïؔԍ����Ⴂ�܂�");

            }
        }
        for(;;){

            myKouza.getName();
            
            System.out.print("����������j���[\n1..�a��,2..�������Ƃ�,3..�c���Ɖ�,9..����I���F");
            int a=sc.nextInt();

            if(a==1){
                System.out.print("���������Ă�������\n�a�����z�F");
                int kaneire=sc.nextInt();
                myKouza.azukeire(kaneire);
                myKouza.syoukai(); 
            }else if(a==2){
                System.out.print("������Ђ����Ƃ��܂����H\n�������Ƃ����z�F");
                int kaneorosi=sc.nextInt();
                myKouza.hikiotosi(kaneorosi);
                myKouza.syoukai(); 
            }else if(a==3){
                System.out.println("�c���Ɖ�");
                myKouza.syoukai(); 
                
            }else if(a==9){
                System.out.println("�I�����܂�");
                break;
                
            }else{
                System.out.println("����[�I�I1,2,3,9�̂����ꂩ����͂��āI");
                
            }
            
        


        }

    }
}