public class Problem4 {
    public static void main(String[] args) {
        double i = 999,k=0;
        k= i*i;

        int sum=0,larg=0;

        for(int j=100;j<1000;j++){
            for(int l=100;l<1000;l++){
               sum = j*l;
            if(isPalindrome(sum) == true){
              // System.out.println(sum);
                if(sum>larg){
                    larg = sum;
                }
            }
            }
        }
        //System.out.println(isPalindrome(242));
    System.out.println(larg);
    }

   static  boolean isPalindrome(int n){
       int r,mum=0,temp;
       //It is the number variable to be checked for palindrome

       temp=n;
       while(n>0){
           r=n%10;  //getting remainder
           mum=(mum*10)+r;
           n=n/10;
       }
       if(temp==mum)
           return true;


        return false;
    }
}
