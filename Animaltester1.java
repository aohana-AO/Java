import java.util.Scanner;
public class Animaltester1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("犬の名前を入力：");
        String inuna=sc.nextLine();
        System.out.println("犬種：");
        String inusyu=sc.nextLine();

        System.out.println("猫の名前を入力");
        String nekona=sc.nextLine();
        System.out.println("年齢：");
        int nekotosi=sc.nextInt();

        Dog myDog= new Dog(inuna,inusyu);
        Cat myCat= new Cat(nekona,nekotosi);
        myDog.introduce();
        myDog.bark();
        myCat.introduce();
        myCat.bark();



        

    }
}