import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws InterruptedException {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        if (args.length == 0) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Por favor, informe qual é a agência: ");
            agencia = scan.nextLine();
            System.out.print("Por favor, digite o numero da agência: ");
            numero = scan.nextInt();
            System.out.print("Por favor, informe o nome do cliente: ");
            nomeCliente = scan.next();
            System.out.print("Por favor, informe o saldo: ");
            saldo = scan.nextDouble();
            scan.close();
        }else{
            numero = Integer.parseInt(args[1]);
            agencia = args[0];
            nomeCliente = args[2];
            saldo = Double.parseDouble(args[3]);
        }

        System.out.print("\n[CRIANDO CONTA]");

        for(int i = 0; i < 10; i++) {
            System.out.print('.');

            Thread.sleep(300);
        }

        String mensagem = "\n\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque.";

        System.out.printf((mensagem) + "%n", nomeCliente, agencia, numero, saldo);
    }

}
