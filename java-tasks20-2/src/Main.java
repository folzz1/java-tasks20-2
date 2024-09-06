public class Main {
    public static void main(String[] args) {

    }

    //Задача 1
    private static int max(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("a == b");
        }
        return a > b ? a : b;
    }


    //Задача 2
    private static float sh(float a, float b) {
        if (0 == b) {
            throw new ArithmeticException("делитель равен нулю");
        }
        return a/b;
    }


    //Задача 3
    private static int convertString(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Не верный формат");
        }
    }

    //Задача 4
    private static void cheAge(int age){
        if(age < 0 || age > 150)
            throw new IllegalArgumentException("не верный возраст");
    }


    //Задача 5
    private static double sqrt(double x){
        if(x < 0)
            throw new IllegalArgumentException("Не корректное число");

        double ans = 0;
        while (ans * ans <= x) {
            ans++;
        }
        return ans - 1;
    }


    //Задача 6

    private static long f(long x) {
        if (x < 0) {
            throw new IllegalArgumentException("Не корректное число");
        }
        long ans = 1;
        for (int i=1; i<=x; i++) {
            ans *= i;
        }
        return ans;
    }

    //Задача 7
    private static void checkArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                throw new  IllegalArgumentException("Найден 0");
        }
    }


    //Задача 8
    private static int stepen(int x, int step){
        if(step < 0)
            throw new IllegalArgumentException("Не корректное число");
        int ans = 1;
        for(int i=0;i<step;i++)
            ans *=x;
        return ans;
    }


    //Задача 9
    private static String cut(String str, int x) {
        if (x > str.length()) {
            throw new IllegalArgumentException("Не корректное число");
        }
        return str.substring(0, x);
    }

}