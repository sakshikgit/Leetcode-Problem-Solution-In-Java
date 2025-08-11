//leetcode 190 Reverse Bits

public class ReverseBits {
    public static void main(String[] args) {
        reverseBits(43261596);
        
    }

    public static int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
       for(int i=0; i<32; i++){
        int bit = n&1;
        sb.append(bit);
        n >>>= 1;
       }

       return (int) Long.parseLong(sb.toString(), 2);
      
    }
    
}
