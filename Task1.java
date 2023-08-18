package TaskAtomGrin;

public class Task1 {
        public static void main(String[] args) {
            int x = 3;
            int y = 5;
            String a = "Питер";
            String b = "Москва";
            ExchangeStr(b, a); // первый способ

            x = x + y;  // второй способ
            y = x - y;
            x = x - y;
            System.out.printf("\nx = %s", x);
            System.out.printf("\ny = %s", y);


        }
        static void ExchangeStr(String a, String b){
            System.out.printf("a = %s", a);
            System.out.printf("\nb = %s", b);
        }
}

