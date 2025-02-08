
class Calculate {

int num = 4;

    public int add(int n1 , int n2){
        System.out.println(num);
        return n1 + n2;
        
    }
}


public class demo {
public static void main(String[] args) {
   
    Calculate obj = new Calculate();
    Calculate obj1 = new Calculate();

    int ri = obj.add(22, 22);

obj.num = 22;
System.out.println(obj.num);   
   
   
    System.out.println(ri);
}
}
