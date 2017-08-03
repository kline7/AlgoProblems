# AlgoProblems
Just some random problems 

public class Problem1 {
    public static void main(String[] args) {
        //find all natural numbers under 1000 that are multiples of 3 or 5
        int sum=0;
        for(int i=1;i<1000;i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
        }
    }
