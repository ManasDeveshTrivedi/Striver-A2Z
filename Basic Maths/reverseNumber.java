public class reverseNumber {
    public static void main(String[] args) {
        int num=998877;
        int rev=0;
        while(num>0){
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        System.out.println(rev);
    }
}
/*
| Iteration | d | rev    | num    |
| --------- | - | ------ | ------ |
| Start     | - | 0      | 998877 |
| 1         | 7 | 7      | 99887  |
| 2         | 7 | 77     | 9988   |
| 3         | 8 | 778    | 998    |
| 4         | 8 | 7788   | 99     |
| 5         | 9 | 77889  | 9      |
| 6         | 9 | 778899 | 0      |

*/