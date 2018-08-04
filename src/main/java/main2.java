public class main2 {


    public static void main(String[] args) {
        for(int i=1; i < 101; i++){
            System.out.print("\n");
            if(i%3==0){
                System.out.print("Fizz");
                continue;
            }
            if(i%5==0){
                System.out.print("Buzz");
                continue;
            }
            System.out.print(i);
        }
    }
}
