public class Add {
    int a;
    int b;

    void getValues(String[] args) {
        /*めも int型「プリミティブ型」、Integer型は「クラス型」.
        Integer型などの「クラス型」は「メソッド」=便利な関数を持っている↓
        ”10″とかのString型変数をint型に変更したい場合には、Integer型のparseIntメソッドを使って、
        int 変数名 = Integer.parseInt(文字列);*/
        this.a = Integer.parseInt(args[0]);
        this.b = Integer.parseInt(args[1]);
    }

    void calcAdd(String[] args) {

        getValues(args);
        System.out.println(this.a + " + " + this.b + " = " + (this.a + this.b));
    }
}