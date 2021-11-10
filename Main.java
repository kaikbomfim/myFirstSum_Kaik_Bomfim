import java.util.Scanner;

class Main{
  public static void main(String[] args){
    
    int number1, number2, sum;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Informe o primeiro número da soma: ");
    number1 = keyboard.nextInt();

    System.out.print("Informe o segundo número da soma: ");
    number2 = keyboard.nextInt();

    sum = number1 + number2;
    
    System.out.println("O resultado da soma entre o primeiro e segundo número é: " + sum);



     

  }

}

