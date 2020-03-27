package pl.n0taku;

import java.util.*;

public class PrimeDecomp {


    public static String factors(int n) {
        String output = "";
        if (n<2)
            return output;
        Map<Integer,Integer> dict_factors = new TreeMap<>();

        if(!isPrime(n)){
            for(int i=2;i<=n;i=nextPrime(++i)){
                while (n%i==0){
                    n=n/i;
                    if(dict_factors.get(i)==null){
                        dict_factors.put(i,1);
                    }else{
                        dict_factors.put(i,dict_factors.get(i)+1);
                    }
                }
                if(isPrime(n)){
                    dict_factors.put(n,1);
                    break;
                }
            }
        }
        else
            dict_factors.put(n,1);
        for (int i: dict_factors.keySet()) {
            if(dict_factors.get(i)<2)
                output+="("+i+")";
            else
                output+="("+i+"**"+dict_factors.get(i)+")";
        }
        return output;
    }

    static int nextPrime(int M) {
        if(!isPrime(M)) M = nextPrime(++M);
        return M;
    }
    static boolean isPrime(int M) {
        if(M<2)
            return false;
        for(int i = 2; i <= Math.sqrt(M); i++)
            if(M % i == 0) return false;
        return true;
    }
}