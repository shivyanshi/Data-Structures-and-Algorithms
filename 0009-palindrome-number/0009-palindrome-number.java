class Solution {
    public static boolean isPalindrome(int x) {
         int temp=x;
        int reverse=0;
        while(x>0){
            int d= x%10;
            reverse= reverse*10+d;
            x=x/10;
        }
        if(reverse==temp){
            return true;
        }
        return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}