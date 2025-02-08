
// class hello {
//     public static void main(String a[]) {

//         // primitive data type
//         int num = 1;
//         byte by = 125;
//         short sh = 555;
//         long l = 354345;
//         float f = 5.55646f;
//         double du = 3.3;
//         char ch = 'j';
//         boolean bool = true;

//         System.out.println(bool);

//     }
// }

// type conversion in java

// class hello {
//     public static void main(String a[]) {
//         // float b = 27.99f ;
//         // int ah = (int)b; //costing

//         int b = 257;
//         byte c = (byte)b;

//         System.out.println(c);
//     }

// }

//relationla operators
// class hello {
//     public static void main(String[] args) {

//         int x = 2;
//         int y = 2;

//         boolean result = x == y;
//         System.out.println(result);
//     }

// }

//logical operators

// public class hello {
//     public static void main(String[] args) {
//         int a = 2;
//         int b = 3;
//         double c = 3.3;
//         double d = 3.5;

//         boolean result = a <= b || c >= d;

//         System.out.println(result);
//     }

// }

//if else statement

// class hello {
//     public static void main(String[] args) {
//         int x = 10;
//         if (x > 5) {
//             System.out.println("welcome");
//         } else {
//             System.out.println("hi");
//         }

//         int a = 20;
//         int b = 33;
//         int c = 435;

//         if (a > b && a < c) {
//             System.out.println(b);
//         } else if (b > c) {
//             System.out.println(b);
//         }
//         else{
//             System.out.println(c);
//         }

//     }

// }

// switch statement
// class hello {
//     public static void main(String[] args) {
//         int a = 5;

//         switch (a) {
//             case 1:
//                 System.out.println("sunday");
//                 break;
//             case 2:
//                 System.out.println("monday");
//                 break;
//             case 3:
//                 System.out.println("tuesday");
//                 break;
//             case 4: 
//                 System.out.println("wenrsday");
//                 break;
//             case 5:
//                 System.out.println("thursday");
//                 break;
//             case 6:
//                 System.out.println("friday");
//                 break;
//             case 7:
//                 System.out.println("saterday");
//                 break;

//             default:
//                 System.out.println("please enter valid number");
//                 break;
//         }
//     }
// }

// switch statement new java
// class hello {

//     // public static void main(String[] args) {
//     //     String day = "wed";

//     //     String result = "";
//     //     result = switch (day) {
//     //         case "wed", "sun" -> "6am";  //arrow function
//     //         case  "mon"-> "8am";
//     //         default -> "7am";
//     //     };
//     //     System.out.println(result);
//     // }

//     public static void main(String[] args) {
//         String day = "hello";

//         String result = "";
//         result = switch (day) {
//             case "wed", "sun" :yield "6am";  //yield key word java 12
//             case  "mon":yield "8am";
//             default :yield "7am";
//         };
//         System.out.println(result);
//     }
// }

// loops in java

//while loop

// class hello {
//     public static void main(String[] args) {
//         int i = 1;
//         while (i <= 5) {
//             System.out.println("hello" + i);
//             int j=1;
//             while (j<= 4) {
//                     System.out.println("hi" + j);
//            j++;
//                 }

//             i++;

//         }
//         System.out.println(i);
//     }
// }

//do while

//  class hello {
// public static void main(String[] args) {
//    int i= 1;
//     do {
//         System.out.println("hello " + i);
//         i ++;
//     } while (i<= 6);

// }

// }

//For loop
class hello {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        for (int i = 1; i <= 4; i++ ) {
            System.out.println(i);
        }

    }

}