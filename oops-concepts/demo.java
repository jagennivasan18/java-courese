// class Calcularor {
//     int a;

//     public int add(int n1, int n2) {
//         int r = n1 + n2;
//         return r;
//     }
// }

// public class demo {
//     public static void main(String[] args) {
//         int num1 = 89;
//         int num2 = 8342;

//         Calcularor calc = new Calcularor();

//         int result = calc.add(num1, num2);
//         System.out.println(result);

//     }
// }
class Shop {

    public void playmusic() {
        System.out.println("play");
    }

    public String getMeMilk(int cost) {

        if (cost >= 10) {
            return "milk";

        } else {

            return "nothing";

        }
    }

}

public class demo {

    public static void main(String[] args) {

        Shop buy = new Shop();
        buy.playmusic();
        String hello = buy.getMeMilk(2);

        System.out.println(hello);

    }
}