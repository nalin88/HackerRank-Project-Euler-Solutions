import java.util.*;

public class test {

    public static long prime(long num){
        long maxprime = -1;
        
        while(num % 2 == 0){
            maxprime = 2;
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) { 
            while (num % i == 0) { 
                maxprime = i; 
                num = num / i; 
            } 
        }

        if (num > 2) 
          maxprime = num;

        return maxprime;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        System.out.println(prime(num));
        s.close();
    }
}
