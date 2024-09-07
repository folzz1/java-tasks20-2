import java.io.IOException;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        System.out.println(conv(12));
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


    //Задача 10
    public static int search(int[] arr, int el){
        for(int i=0; i<arr.length;i++){
            if(el == arr[i]){
                return i;
            }
        }
        throw new IllegalArgumentException("Нет такого числа");
    }

    //Задача 11
    public static String conv(int el){
        if(el<0)
            throw new IllegalArgumentException("Не корректное число");
        StringBuilder ans = new StringBuilder();
        do {
            ans.insert(0, el % 2);
            el /= 2;
        } while (el > 0);
        return ans.toString();
    }



    //Задача 12
    private static boolean sh2(int a, int b) {
        if (0 == b) {
            throw new ArithmeticException("делитель равен нулю");
        }
        return a % b == 0;
    }


    //Задача 13
    private static int IndexEl(int[] arr, int index){
        if(arr.length <= index || index<0)
            throw new IndexOutOfBoundsException("нет такого элемента");

        return arr[index];
    }


    //Задача 14
    private static void checkPass(String pas) throws Exception {
        if (pas.length() < 8) {
            throw new WeakPasswordException("Длина пароля меньше 8 символов");
        }

    }

    //Задача 15
    private static boolean checkDate(String date){
        if (!date.matches("([0-2][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.[0-9]{4}")) {
            throw new DateTimeParseException("Некорректная дата", date, 0);
        }
        return true;
    }


    //Задача 16
    private static String m(String a, String b) {
        if(a==null || b==null)
            throw new NullPointerException("Одна строка равна null");
        return a+b;
    }

    //Задача 17
    private static int sh3(int a, int b) {
        if (0 == b) {
            throw new ArithmeticException("делитель равен нулю");
        }
        return a%b;
    }

    //Задача 18
    private static double sqrtKV(double x){
        if (x < 0) {
            throw new IllegalArgumentException("Некорректное число");
        }
        double ans = 0;
        while (ans * ans <= x) {
            ans++;
        }
        return ans - 1;
    }


    //Задача 19
    private static int CvF(int temp){
        if(temp<0)
            throw new IllegalArgumentException("Абсолютный ноль");
        return (temp * 9/5) + 32;
    }

    //Задача 20
    private static void checkString(String str){
        if(str == null || str.isEmpty())
            throw new NullPointerException("Строка равна null или пустая");
    }
}

// класс для задачи 14
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}


