package tests;

/*
 * 1. Программа должна быть гибкой в разработке
 * 2. Программа должна быть быстрой
 * 3. Программа должна весить как можно меньше
 * Все приблуды JAVA служат этим пунктам
 * */
public class Codewars1 {
    public static int divide(int[] array) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < array.length-1; i++) {
            leftSum = getSumLeft(array, i);
            rightSum = getSumRight(array, i);
            if(leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static int getSumLeft(int[] array, int i) {
        int l = 0;
        for (int j = 0; j < i; j++) {
            l = l + array[j];
        }
        return l;
    }

    public static int getSumRight(int[] array, int i) {
        int r = 0;
        for (int j = i+1; j < array.length; j++) {
            r = r + array[j];
        }
        return r;
    }
    public static void main(String[] args) {
       int[] q1 = {1,2,3,4,3,2,1};
       int[] q2 = {1,100,50,-51,1,1};
       int[] q3 = {1,2,3,4,5,6};
       int[] q4 = {20,10,30,10,10,15,35};
       int[] q5 = {-8505, -5130, 1926, -9026};
       int[] q6 = {2824, 1774, -1490, -9084, -9696, 23094};
       int[] q7 = {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};

        System.out.println(divide(q1));
        System.out.println(divide(q2));
        System.out.println(divide(q3));
        System.out.println(divide(q4));
        System.out.println(divide(q5));
        System.out.println(divide(q6));
        System.out.println(divide(q7));
    }
}