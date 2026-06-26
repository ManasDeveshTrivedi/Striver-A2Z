class digitCount{
    public static void main(String[] args) {
        int count=0;
        int num=9989;
        while(num>0){
            int d=num%10; //last digit nikal deta hai
            count++;
            num=num/10;//last digit remove ho gayi
        }
        System.out.println(count);
    }
}
/*
| Iteration | num  | count |
| --------- | ---- | ----- |
| Start     | 9989 | 0     |
| 1         | 998  | 1     |
| 2         | 99   | 2     |
| 3         | 9    | 3     |
| 4         | 0    | 4     |
*/