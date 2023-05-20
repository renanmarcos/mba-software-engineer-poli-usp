package Models;

import java.math.BigDecimal;

public class TransladoAereo extends ItemPacote {
    private String companiaAerea;
    private int numeroVoo;

    public TransladoAereo(BigDecimal preco, String companiaAerea, int numeroVoo) {
        super(preco);
        this.companiaAerea = companiaAerea;
        this.numeroVoo = numeroVoo;
    }
}
