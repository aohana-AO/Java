import java.util.Scanner;
public class Bank  {
    public static void main(String[] args){

        Kouza myKouza =new Kouza();
        myKouza.setMoney(10000);
        Scanner sc = new Scanner(System.in);

        for(;;){
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