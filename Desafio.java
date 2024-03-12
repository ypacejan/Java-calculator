import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com o primeiro número:");

    double n1;
    try{
      n1 = Double.parseDouble(sc.next());
    } catch (NumberFormatException e){
      System.out.println("Digite um número valido");
      return;
    }
    
    System.out.println("Entre com o segundo número:");
    double n2;

    try{
      n2 = Double.parseDouble(sc.next());
    }catch (NumberFormatException e){
      System.out.println("Digite um número");
      return;
    }
    
    System.out.println("Digite 1 para somar, 2 para subtrair, 3 para multiplicar e 4 para dividir:");
    int operacao;

    try{
      operacao = Integer.parseInt(sc.next());
    } catch (NumberFormatException e){
      System.out.println("Digite uma operação valida");
      return;
    }

    switch (operacao) {
      case 1:
        System.out.println(n1 + n2);
        break;
      case 2:
        System.out.println(n1 - n2);
        break;
      case 3:
        System.out.println(n1 * n2);
        break;
      case 4:
        System.out.println(n1 / n2);
        break;
      default:
        System.out.println("Informe uma operacão válida");
    }
  }
}
