import java.util.Random;
import java.util.Scanner;

public class oraculo {

    public static guerreiro g;

    public String nomeOraculo;

    // nome oraculo
    public void setNome(String nomeO) {
        nomeOraculo = nomeO;
    }

    // retorna nome oraculo
    public String getNome() {
        return nomeOraculo;
    }

    // retorna o primeiro prologo
    public String prologoIntroducao() {
        String txt = " vamos jogar dois jogas para vc ter um premio e vc tera ";
        return txt;
    }

    // vidas do guerreio
    public int setVidas() {
        Random vidas = new Random();
        return vidas.nextInt(4) + 9;
    }

    // primeiro game
    public void setlevel1(int palpite, int numero, int vidasGPerda) {

        if (palpite > numero) {
            System.out.println("Seu palpite é maior que o número sorteado.");
        } else {
            if (palpite < numero) {
                System.out.println("Seu palpite é menor que o número sorteado.");
            } else {
                System.out.println("Parabéns, você acertou! O número era " + numero);
                System.out.println("Você tentou " + vidasGPerda + " vezes antes de acertar!");
            }
        }

    }

    // vida Extra para o guerreiro
    public boolean setDecidirVidaExtra(String misericordia) {
        g = new guerreiro();
        misericordia = g.vidaExtra();

        if (misericordia.length() > 5) {
            prologoVencedor();
        } else {
            prologoPerdedor();
        }
        return false;
    }

    // ultima conversa
    public String prologoVencedor() {

        String txt = "vc ganhou" + g.getNome();
        return txt;
    }

    public String prologoPerdedor() {

        String txt = "vc perdeu" + g.getNome();
        return txt;
    }

}
