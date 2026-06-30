package Recursion;

public class nToOne {
    void linearlyTravel(int i,int n){
        if(i>n)
            return ;
        System.out.println(n);
        linearlyTravel(i, n-1);
    }
    public static void main(String[] args) {
        int n=5;
        nToOne ob=new nToOne();
        ob.linearlyTravel(1, n);
    }
}
