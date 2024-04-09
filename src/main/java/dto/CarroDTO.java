package dto;

import java.time.LocalDateTime;

public class CarroDTO {

    private Long id;
    private LocalDateTime timestampCadastro;
    private Long modeloId;
    private int ano;
    private String combustivel;
    private int numPortas;
    private String cor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimestampCadastro() {
        return timestampCadastro;
    }

    public void setTimestampCadastro(LocalDateTime timestampCadastro) {
        this.timestampCadastro = timestampCadastro;
    }

    public Long getModeloId() {
        return modeloId;
    }

    public void setModeloId(Long modeloId) {
        this.modeloId = modeloId;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}