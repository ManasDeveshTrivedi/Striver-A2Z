public class checkPalindrome {
    public static void main(String[] args) {
        int num=998899;
        int n=num;
        int pal=0;
        while (num>0) {
            int d=num%10;
            pal=pal*10+d;
            num=num/10;
        }
        if(pal==n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not");
        }
    }
}



/*
Shorter Approach
int num = 998899;
int original = num; 
int rev = 0;
while (num > 0) {
    rev = rev * 10 + num % 10;
    num /= 10;
}
System.out.println(rev == original ? "Palindrome" : "Not Palindrome");
*/