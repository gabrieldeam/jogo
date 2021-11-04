import java.util.Scanner;

public class guerreiro {

    public String nomeGuerreiro;

    // nome guerreiro
    public void setNome(String nomeG) {
        nomeGuerreiro = nomeG;
    }

    // retorna nome guerreiro
    public String getNome() {
        return nomeGuerreiro;
    }

    public String vidaExtra() {
        Scanner misericordia = new Scanner(System.in);
        return misericordia.nextLine();
    }

}