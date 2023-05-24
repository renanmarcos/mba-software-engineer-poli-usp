package Models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private List<Contratacao> contratacoes;
    private String nome;
    private Date dataNascimento;

    public Cliente(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contratacoes = new ArrayList<Contratacao>();
    }

    public void contratar(Date dataContratacao, Pacote pacote) {
        Contratacao contratacao = new Contratacao(dataContratacao, pacote);
        contratacoes.add(contratacao);
    }
}
