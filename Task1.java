package TaskAtomGrin;

public class Task1 {
        public static void main(String[] args) {
            int a = 3;
            int b = 5;
            ExchangeStr(b, a); // первый способ

            a = a + b;  // второй способ
            b = a - b;
            a = a - b;
            System.out.printf("\na = %s", a);
            System.out.printf("\nb = %s", b);


        }
        static void ExchangeStr(int a, int b){
            System.out.printf("a = %s", a);
            System.out.printf("\nb = %s", b);
        }
}

