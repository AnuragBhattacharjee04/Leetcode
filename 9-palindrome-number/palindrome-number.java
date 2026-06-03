class Solution {
    public boolean isPalindrome(int x) {
        int reversedinteger = 0;
        int lastdigit = 0;

        int original = x;
        while(x>0){
            lastdigit = x%10;
            reversedinteger = (reversedinteger*10)+lastdigit;
            x = x/10;
            
        }
        if(original == reversedinteger){
            return true;
        }
        else{
            return false;
        }
        
    }
}