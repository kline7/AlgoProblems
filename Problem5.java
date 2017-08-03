public class Problem5 {
    public static void main(String[] args) {
        boolean found =false;
        int smallestNumber =1;
        while(found == false){
            for(int i=1;i<21;i++) {
              // System.out.println(smallestNumber%i);
                if (smallestNumber%i != 0){
                    break;
                }else if(i==20){
                  // System.out.println("in");
                    found = true;
                }
            }

            smallestNumber++;
        }
        System.out.println(smallestNumber-1);
    }


}
