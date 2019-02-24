public class Main {

    public static void main(String[] args) {
        System.out.println(iterativeFactorial(5));
        System.out.println(recursiveFactorial2(5));
    }

    public static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num){
        int factorial = 1;
        while(num > 1){
            factorial*=num;
            recursiveFactorial(--num);
        }
        return factorial;
    }

    public static int recursiveFactorial2(int num){
        if(num == 0){
            return 1;
        }
        return num*recursiveFactorial2(--num);
    }
}
