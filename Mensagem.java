
public class Mensagem {

    public String gerarMensagem(Mae mae, Presente presente, String texto) {

        return "\n FELIZ DIA DAS MÃES \n"
                + "\nMãe: " + mae.getNome()
                + "\nPresente: " + presente.getNome()
                + "\n\nMensagem:"
                + "\n" + texto;
    }
}