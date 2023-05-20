package Models;

import java.math.BigDecimal;

public class Hospedagem extends ItemPacote {
    private String nomeHotel;
    private String endereco;

    public Hospedagem(BigDecimal preco, String nomeHotel, String endereco) {
        super(preco);
        this.nomeHotel = nomeHotel;
        this.endereco = endereco;
    }
}
