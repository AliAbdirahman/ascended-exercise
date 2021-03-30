public class PrimeNumbers {
    public static void main(String[] args) {

        for (int num = 1; num<=500; num++){
            if (prime(num))
                System.out.print(num + " is prime"+"\n");
        }
    }

    private static boolean prime(int num){
        boolean flag = false;
        if (num>1){
            for (int i=2; i<num; i++){
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
        }else{
            return false;
        } 

        return !flag;
    }

  
    }
