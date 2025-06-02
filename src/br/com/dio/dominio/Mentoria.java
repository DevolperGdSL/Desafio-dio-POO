package br.com.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, LocalDate data) {
        this.setTitulo(titulo);
        this.setDescricao("Sem descrição");
        this.data = data;
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data + '\'' +
                ", XP=" + calcularXP() +
                '}';
    }
}
