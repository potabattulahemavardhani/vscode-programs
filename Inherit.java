public class Inherit {
    int i,j;
    public static void main(String[] args) {
        Child obj = new Child();
        obj.eat();
        String s=obj.name("hema");
        System.out.println(s);
        int num=obj.eat(3);
        System.out.println(num);
        

    }
    
}
 
 class Child extends Inherit {
    public void eat()
    {
        System.out.println("eating");
    }
    String name(String str)
    {
        return str;
    }
    public int eat(int n){
        return n;
    }


    
}


