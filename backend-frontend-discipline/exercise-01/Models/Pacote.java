package Models;

import java.util.List;
import java.math.BigDecimal;

public class Pacote {
    private String descricao;
    private Localidade localidade;
    private List<ItemPacote> itens;
    
    public Pacote(String descricao) {
        this.descricao = descricao;
    }

    public Pacote(String descricao, Localidade localidade) {
        this.descricao = descricao;
        this.localidade = localidade;
    }

    public Pacote(String descricao, List<ItemPacote> itens) {
        this.descricao = descricao;
        this.itens = itens;
    }
    
    public Pacote(String descricao, Localidade localidade, List<ItemPacote> itens) {
        this.descricao = descricao;
        this.localidade = localidade;
        this.itens = itens;
    }

    public BigDecimal consolidate() {
        BigDecimal valor = new BigDecimal(0);

        if (this.itens != null)
            for (ItemPacote i : this.itens) {
                valor = valor.add(i.getPreco());
            }

        return valor;
    }
}
