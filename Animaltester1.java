import java.util.Scanner;
public class Animaltester1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���̖��O����́F");
        String inuna=sc.nextLine();
        System.out.println("����F");
        String inusyu=sc.nextLine();

        System.out.println("�L�̖��O�����");
        String nekona=sc.nextLine();
        System.out.println("�N��F");
        int nekotosi=sc.nextInt();

        Dog myDog= new Dog(inuna,inusyu);
        Cat myCat= new Cat(nekona,nekotosi);
        myDog.introduce();
        myDog.bark();
        myCat.introduce();
        myCat.bark();



        

    }
}