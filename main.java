import java.util.Random;
import java.util.Scanner;

public class main {
    private static Scanner pedirNome;
    public static guerreiro g;
    public static oraculo o;

    public static void main(String[] args) {

        String nome;
        int palpite = 0;
        int sorteado;
        int tentativas = 0;

        // Introdução
        pedirNome = new Scanner(System.in);
        g = new guerreiro();
        o = new oraculo();

        o.setNome("Mago Drummond");

        System.out.println("Guerreiro meu nome e " + o.getNome());
        System.out.println("\nGuerreiro qual eo seu nome ? ");
        nome = pedirNome.nextLine();
        g.setNome(nome);

        int vidasG = o.setVidas();
        int vidasGPerda = vidasG;

        System.out.println(g.getNome() + o.prologoIntroducao() + vidasGPerda + " vidas");

        // level 1

        Random geradorDeAleatorios = new Random();
        sorteado = geradorDeAleatorios.nextInt(100) + 1;
        System.out.println("Número entre 1 e 100 sorteado!");

        do {

            Scanner entradaPalpite = new Scanner(System.in);
            System.out.printf("\n\n\n\n-----------------\n");

            System.out.println("Número de vidas: " + vidasGPerda + "\n");

            System.out.print("Qual seu palpite: ");
            palpite = entradaPalpite.nextInt();

            vidasGPerda--;

            o.setlevel1(palpite, sorteado, vidasGPerda);

            if (vidasGPerda == 0) {

                System.out.println("Acabou suas vidas");
                System.out.println("Te darei mais uma chance guerreio. Mas vc tera que fazer um pedido");

                System.out.print(o.setDecidirVidaExtra(g.vidaExtra()));
                break;
            }

        } while (palpite != sorteado);

    }
}