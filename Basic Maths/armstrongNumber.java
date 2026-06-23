public class armstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int original=num;
        int c=0;
        double prod=0;
        while(num>0){
            int d=num%10;
            c++;
            num=num/10;
        }
        num=original;
        while (num>0) {
            int d=num%10;
            prod=prod+Math.pow(d,c);
            num=num/10;
        }
        if(prod==original){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
