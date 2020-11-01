import java.util.*;
import java.math.BigInteger;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        for(int q1=1;q1<=q;q1++){
        String a=s.next();
        String b=s.next();
        String s1=s.next();
        BigInteger n = new BigInteger(s1);
        List<BigInteger> arr = new ArrayList<BigInteger>();
        BigInteger a1 = BigInteger.valueOf(a.length());
        BigInteger b1 = BigInteger.valueOf(b.length());
        arr.add(a1);
        arr.add(b1);
        int ans = -1;
        do{
            arr.add(a1.add(b1));
            a1 = b1;
            b1 = arr.get(arr.size()-1);;
        }while(b1.compareTo(n)<0);
        int i = arr.size() -3;
        while(i>=0) {
            BigInteger c = arr.get(i);
            if(n.compareTo(c)>0) {
                n = n.subtract(c);
                i--;
            }
            else
            {
                if(i==0)
                    ans = a.charAt(n.intValue() - 1);
                if(i==1) 
                    ans = b.charAt(n.intValue() - 1);
                i = i - 2;
            }
        }
        if(ans == -1)
            ans = b.charAt(n.intValue() - 1);
        System.out.println(ans - 48);
        }
    }
}
