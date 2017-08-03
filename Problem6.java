public class Problem6 {
    public static void main(String[] args) {
        int sumTot =0, squareTot=0;
        for(int i=0;i<=100;i++){
            sumTot += (i*i);
            squareTot +=i;
        }
        squareTot *= squareTot;
        int total = squareTot - sumTot;
        System.out.println(total);
    }
}
