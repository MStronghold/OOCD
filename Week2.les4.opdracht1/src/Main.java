import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            System.out.println("Input eerste cijfer");
            Scanner scan = new Scanner(System.in);
            int num1 = scan.nextInt();
            System.out.println("next one");
            int num2 = scan.nextInt();
            int num3 = num1 + num2;
            System.out.println("Antwoord: " + num3);

            //        public String checkType(){
            //            String s;
            //
            //            if (o instanceof String) {
            //                s = "Dit is een String.";
            //            }
            //            if (o instanceof Integer){
            //                s = "Dit is een int.";
            //            }
            //            if (o instanceof Double){
            //                s = "Dit is een double.";
            //            }
            //
            //
            //            return s;
            //        }


        }
    }
