package Recursion;

public class nameFiveTimes {
    void printName(int c,int n){
        if(c>n)
            return ;

        System.out.println("Dev");
        printName(c+1, n);
    }
    public static void main(String[] args) {
        int n=5;
        nameFiveTimes ob=new nameFiveTimes();
        ob.printName(1,n);
    }
}
