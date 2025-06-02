package br.com.dio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso( String titulo, int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        this.setTitulo(titulo);
        this.setDescricao("Sem descrição");
    }
    public Curso(String titulo, String descricao,int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
        this.setTitulo(titulo);
        this.setDescricao(descricao);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXP(){
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria + '\'' +
                ", XP=" + calcularXP() +
                '}';
    }
}
