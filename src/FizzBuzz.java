public class FizzBuzz {
    public static void fizzBuss(){

        for(int i=1; i<=100; i++){
            if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0 ){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
