import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    /**
     * 15.递归求 N 的阶乘
     */
    public static int func15(int n){
        if(n==1){
            return 1;
        }
        return n*func15(n-1);
    }
    public static void main(String[] args) {
//        System.out.println(func15(5));
        int[] arr2={1,23,4};
        int[] arr1=arr2;
        arr1[0]=0;
        System.out.println(Arrays.toString(arr2));
    }

    /**
     * 14.递归求和
     * 递归求 1 + 2 + 3 + ... + 10
     */
    public static int func14(int n){
        if (n==1){
            return 1;
        }
        return n+func14(n-1);
    }

    public static void main14(String[] args) {
        System.out.println(func14(10));
    }


    /**
     * 13.递归打印数字的每一位
     * 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
     */
    public static void print(int n){
        if(n > 9) {
            print(n/10);
        }
        System.out.print(n%10+"  ");
    }

    public static void main13(String[] args) {
        print(1791);
    }

    /**
     * 12.返回的数字之和
     * 写一个递归方法，输入一个非负整数，返回组成它的数字之和
     */
    public static int func12(int n){
        if(n>9){
            return func12(n/10)+n%10;
        }
        return n;
    }
    public static void main12(String[] args) {
        System.out.println(func12(1791));
    }

    /**
     * 11.递归求斐波那契数列的第 N 项
     */
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
    //1 1 2 3 5 8 13 21 34 55
    public static void main11(String[] args) {
        System.out.println(fib(9));
    }
    /**
     * 10.递归求解汉诺塔问题
     */
    //从site1移到site2
    public static void move(char site1,char site2){
        System.out.print(site1+" ->"+site2+" ");
    }

    //site1 起始位置
    //site2 中途位置
    //site3 目标位置
    public static void hanoi(int n,char site1,char site2,char site3){

        if(1==n){
            move(site1,site3);
        }else{
            hanoi(n-1,site1,site3,site2);
            move(site1,site3);
            hanoi(n-1,site2,site1,site3);
        }
    }
    public static void main10(String[] args) {
        hanoi(1,'A','B','C'); //有一个盘子，
        System.out.println();
        hanoi(2,'A','B','C'); //有两个盘子
        System.out.println();
        hanoi(3,'A','B','C'); //有三个盘子
    }


    /**
     * 9.青蛙跳台阶问题
     */
    public static int jump(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return jump(n - 1) + jump(n - 2);
    }
    public static void main9(String[] args) {
        System.out.println(jump(4));
    }

    /**
     * 8.求和的重载
     * 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
     */
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }
    public static void main8(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10.5, 10.4, 10.1));
    }

    /**
     * 7.求最大值方法的重载
     * 在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
     * 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
     */
    public static int max(int a,int b){
        return (a>b)?a:b;
    }
    public static double max(double a,double b){
        return (a>b)?a:b;
    }
    public static double max(double a,double b,int c){
        return ((a>b)?a:b)>b?((a>b)?a:b):c;
    }
    public static void main7(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(max(15.5, 18.9));
        System.out.println(max(3.14, 2.15, 3));
    }

    /**
     * 6.求最大值
     * 创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
     * ​要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
     */
    public static int max2(int a,int b){
        return (a>b)?a:b;
    }
    public static int max3(int a,int b,int c){
        return (max2(a,b)>c)?max2(a,b):c;
    }
    public static void main6(String[] args) {
        Scanner sr =new Scanner(System.in);
        int a=sr.nextInt();
        int b=sr.nextInt();
        int c=sr.nextInt();
        System.out.println(max3(a, b, c));
    }


    /**
     * 5.奇数位于偶数之前
     * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
     */
    public static int[] func5(int[] a){
        int left=0;
        int right=a.length-1;
        while (left<right){
            while(left<right&&a[left]%2!=0){
                left++;
            }
            while(right>left&&a[right]%2==0){
                right--;
            }
            if(left<right){
                int tmp=a[left];
                a[left]=a[right];
                a[right]=tmp;
            }
        }
        return a;
    }
    public static void main5(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(func5(arr)));
    }
    /**
     * 4.求 N 的阶乘 。
     */
    public static int func4(int n){
        int ret=1;
        for (int i = 1; i<=n ; i++) {
            ret*=i;
        }
        return ret;
    }
    public static void main4(String[] args) {
        Scanner sr =new Scanner(System.in);
        int n=sr.nextInt();
        System.out.println(func4(n));
    }
    /**
     * 3.求阶乘和
     * 求1！+2！+3！+4！+........+n!的和
     * 1  2  6   24   120
     */
    public static int func3(int n){
        int sum=0;
        int ret=1;
        for (int i = 1; i<=n ; i++) {
            ret*=i;
            sum+=ret;
        }
        return sum;
    }
    public static void main3(String[] args) {
        Scanner sr =new Scanner(System.in);
        int n=sr.nextInt();
        System.out.println(func3(n));
    }

    /**
     * 2.求斐波那契数列的第n项。(迭代实现)
     */
    //1 1 2 3 5 8 13 21 34 55
    public static int func2(int n){
        int a=1;
        int b=1;
        int c=1;
        n-=2;
        while(n>0){
            c=a+b;
            a=b;
            b=c;
            n--;
        }
        return c;
    }
    public static void main2(String[] args) {
        Scanner sr =new Scanner(System.in);
        int n=sr.nextInt();
        System.out.println(func3(n));
    }

    /**
     *1.找出出现一次的数字
     * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
     *
     */
    public static void main1(String[] args) {
        int[] arr={1,1,2,3,2,4,4,5,5};
        int tmp=0;
        for (int i = 0; i <arr.length ; i++) {
                tmp=tmp^arr[i];
        }
        System.out.println(tmp);
    }

}
