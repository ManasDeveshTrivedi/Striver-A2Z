public class hcf {
    public static void main(String[] args) {
        int n1=50;
        int n2=12;
        int gcd=1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=Math.max(i,gcd);
            }
        }
        System.out.print(gcd);
    }
}