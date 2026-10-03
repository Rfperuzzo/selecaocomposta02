
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double num , metade , dobro;

        IO.println("numero");
        num = scanner.nextDouble();
        
        if (num > 10){
            metade = num / 2;
            System.out.println("a metade é :" +metade);
        }else{
            dobro = num * 2;
            System.out.println("o doble é :"+ dobro);
        }
        
        
        
    }
}
