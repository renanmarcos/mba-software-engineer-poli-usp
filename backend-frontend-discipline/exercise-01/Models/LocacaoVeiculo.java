package Models;

import java.math.BigDecimal;

public class LocacaoVeiculo extends ItemPacote {
    private String marca;
    private String modelo;

    public LocacaoVeiculo(BigDecimal preco, String marca, String modelo) {
        super(preco);
        this.marca = marca;
        this.modelo = modelo;
    }
}
