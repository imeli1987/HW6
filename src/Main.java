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
    }
}