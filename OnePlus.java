public class OnePlus {
    public int[] plusOne(int[] digits){
        // 1, 2, 3
        //      2 ,3 ,4
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        digits = newArr;
        return digits;

    }

    public static void main(String[] args) {
        // this is a solution for leetcode problem OnePlus
        OnePlus obj = new OnePlus();
        int[] digits = {9, 9, 9};
        int[] result = obj.plusOne(digits);

        for(int num : result){
            System.out.print(num + " ");
        }

    }
}