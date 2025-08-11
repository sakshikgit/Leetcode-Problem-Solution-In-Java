// package BitManupilation;

//leetcode 191 Number of 1 bits


public class Numberof1Bits {
    public static void main(String[] args) {
        hammingWeight(11);
        
        
    }


   
    public static int hammingWeight(int n) {
         StringBuilder sb = new StringBuilder();
    
        while(n >0){
            int rem = n%2;
            sb.append(rem);
            n = n/2;

        }
        sb = sb.reverse();
        
        int setBit = 0;
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '1'){
                setBit++;
            }
        }
        // System.out.println(setBit);
        return setBit;
    }
        
    



    
}
