public class AddBinary {

    class Solution {
        public String addBinary(String a, String b) {
            // Initialize result string builder and carry 
            StringBuilder result = new StringBuilder();
            int carry = 0;
    
            //pointers
            int i = a.length() - 1;
            int j = b.length() - 1;
    
            while( i >= 0 || j>= 0 || carry > 0){
                int digitA;
                if(i >= 0){
                    digitA = a.charAt(i) - '0';
                }else{
                    digitA = 0;
                }
    
                int digitB;
                if(j >= 0){
                    digitB = b.charAt(j) - '0';
                }else{
                    digitB = 0;
                }
    
                int sum = digitA + digitB + carry;
                result.append(sum % 2);
                carry = sum / 2;
                i--;
                j--;
            }
            return result.reverse().toString();
        }
    }
    
}
