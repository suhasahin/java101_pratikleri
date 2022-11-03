package Return_metotlar;

public class Main {

    static int sum(int a, int b){
        int result = a+b;
        return a+b;
    }
    public static void main(String[] args) {
        int result = sum(5,2);
        System.out.println(result);
    }
}
