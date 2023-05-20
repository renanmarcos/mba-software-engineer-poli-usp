import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Models.Cliente;
import Models.Hospedagem;
import Models.ItemPacote;
import Models.Pacote;

public class Main {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Roberto", new Date(1995, 02, 10));

        Pacote pacote = new Pacote("Combo 1");
        cliente.contratar(new Date(), new BigDecimal(23.1), pacote);

        List<ItemPacote> itens = new ArrayList<ItemPacote>();
        ItemPacote item1 = new Hospedagem(new BigDecimal(11), "Resort 4 estrelas", "rua X");
        itens.add(item1);

        Pacote segundoPacote = new Pacote("Combo 2", itens);
        cliente.contratar(new Date(), new BigDecimal(23.1), segundoPacote);
    }
}