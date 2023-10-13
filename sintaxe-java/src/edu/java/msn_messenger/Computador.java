package edu.java.msn_messenger;
import java.util.Scanner;
import edu.java.msn_messenger.validarInternet.*;

public class Computador{
    public static void main(String[] args){
        // | Estudando os 4 pilares da POO 
        // | Encapsulamento | Herança | Abstração | Polimorfismo | Interface |

        //Não sabe qual app será escolhido, mas deve enviar e receber as mensageNs
        ServicoMensagem sm = null;
        Scanner scanner = new Scanner(System.in);
        int appEscolhido = 0;

        System.out.println("Qual APP você deseja utilizar?\n | 1.MSN | 2.Facebook | 3.Telegram |");
        appEscolhido = scanner.nextInt();

        //Com SWITCH CASE
        switch(appEscolhido) {
            case 1:
                sm = new Msn();
            break;

            case 2:
                sm = new Facebook();
            break;

            case 3:
                sm = new Telegram();
            break;
            default: System.out.println("Opção inválida!");
        }

        //Com IF Else
        /*if(appEscolhido.equals("MSN")){
            sm = new Msn();
        } else if (appEscolhido.equals("Facebook")){
            sm = new Facebook();
        } else if (appEscolhido.equals("Telegram")){
            sm = new Telegram();
        }*/

        sm.enviarMensagem();
        sm.receberMensagem();
        scanner.close();
    }
}