package Models;

import java.math.BigDecimal;
import java.util.Date;

public class Contratacao {
    private Pacote pacote;
    private BigDecimal valor;
    private Date dataContratacao;

    protected Contratacao(Date dataContratacao, BigDecimal valor, Pacote pacote) {
        this.dataContratacao = dataContratacao;
        this.valor = valor;
        this.pacote = pacote;
    }
}
