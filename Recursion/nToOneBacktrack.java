package Recursion;

public class nToOneBacktrack {
    void traverse(int n){
        if(n==0)
            return ;
        System.out.println(n);
        traverse(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        nToOneBacktrack ob=new nToOneBacktrack();
        ob.traverse(n);
    }
}

/*
traverse(5)
  print 5
  traverse(4)
    print 4
    traverse(3)
      print 3
      traverse(2)
        print 2
        traverse(1)
          print 1
          traverse(0)
          ↑ return
        ↑ return
      ↑ return
    ↑ return
  ↑ return
↑ return
*/