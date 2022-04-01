public abstract class Animal{
    String Name;
    String a ;
    public Animal(String v_Name){
        this.Name=v_Name;
    }
    
    public String getName(){
        return this.Name;
    }
    public abstract void bark();
    public abstract String toString();
    
    public void introduce(){
        System.out.print(toString()+"‚¾");

    }
}