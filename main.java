package learning-java;

public class main {
    public static void main(String[] args) {
        System.out.println("The numbers from 1 0 100");
        for(int i=0;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Fizzbuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else
            System.err.println(i);
        }
    }
}
    
}
