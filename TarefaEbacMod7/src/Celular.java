import br.com.herique.Celular.Chamada;
import br.com.herique.Celular.Contatos;
import br.com.herique.Celular.LigaDesliga;

/**
* @author herique.oliveira
* @version 1.0
*/

public class Celular {
    /**
     *
     * @param args
     */
    public static void main(String args [] ){

        LigaDesliga ligaDesliga = new LigaDesliga();
        ligaDesliga.setLiga("Bem vindo!");
        Chamada chamada = new Chamada();
        chamada.setName("\nTelemarketing tequeroparasempre");
        chamada.setConnect("\nChamada aceita");
        chamada.setDisconect("\nChamada encerrada");
        Contatos contatos = new Contatos();
        contatos.setName("\nPapai");
        contatos.setId(1);
        contatos.setNumber(999049910);
        ligaDesliga.setDesliga("\nDesligando, até logo!");
        System.out.println(ligaDesliga.getLiga() + chamada.getId()+ chamada.getName() + chamada.getConnect() + chamada.getDisconect());
        System.out.println(contatos.getNumber() + contatos.getId() + contatos.getName() + chamada.getConnect() + chamada.getDisconect() + ligaDesliga.getDesliga());
     }
}
