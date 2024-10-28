public class Main {
    public static void main(String[] args) {
//        Task 1
        System.out.println("\nЗадание 1\n");
        for ( int i=1; i <= 10; i++ ){
            System.out.print(i + " ");
        }
//        Task 2
        System.out.println("\n\nЗадание 2\n");
        for ( int i=10; i > 0; i-- ){
            System.out.print(i + " ");
        }
//        Task 3
        System.out.println("\n\nЗадание 3\n");
        for ( int i = 0; i < 17;  i += 2 ){
            System.out.print(i + " ");
        }
//        Task 4
        System.out.println("\n\nЗадание 4\n");
        for (int i = 10; i >= -10; i--){
            System.out.print(i + " ");
        }
//        Task 5
        System.out.println("\n\nЗадание 5\n");
        for ( int i = 1904; i <= 2096; i += 4){
            System.out.printf("%d год является високосным\n", i);
        }
//        Task 6
        System.out.println("\nЗадание 6\n");
        for ( int i = 7; i < 100; i += 7){
            System.out.print(i + " ");
        }

//        Task 7
        System.out.println("\n\nЗадание 7\n");
        for ( int i = 1; i < 1000; i *= 2){
            System.out.print(i + " ");
        }
//        Task 8
        System.out.println("\n\nЗадание 8\n");

        int amountSavings = 0;
        for ( int i = 1; i <= 12; i++){
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, amountSavings+=29000);
        }
//        Task 9
        System.out.println("\nЗадание 9\n");
        int deposit = 29000;
        int bill = 0;
        for ( int i = 1; i <= 12; i++){
            bill = bill + deposit;
            bill = bill + bill / 100;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, bill );
        }
//        Task 10
        System.out.println("\nЗадание 10\n");
        for ( int i = 1; i <= 10; i++){
            System.out.printf("2*%d=%d\n", i, i*2);
        }
    }
}