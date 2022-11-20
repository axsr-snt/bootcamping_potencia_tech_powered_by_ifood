package intermediario.poo.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String titulo;
    private String descricao;
    private final LocalDate INICIO = LocalDate.now();
    private final LocalDate TERMINO = INICIO.plusDays(45);
    private Set<Dev> participante = new HashSet<>();
    private Set<Conteudo> conteudo = new HashSet<>();

    public String getNome() {
        return titulo;
    }

    public void setTitulo(String nome) {
        this.titulo = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getINICIO() {
        return INICIO;
    }

    public LocalDate getTERMINO() {
        return TERMINO;
    }

    public Set<Dev> getParticipante() {
        return participante;
    }

    public void setParticipante(Set<Dev> participante) {
        this.participante = participante;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(titulo, bootcamp.titulo) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(INICIO, bootcamp.INICIO) && Objects.equals(TERMINO, bootcamp.TERMINO) && Objects.equals(participante, bootcamp.participante) && Objects.equals(conteudo, bootcamp.conteudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, INICIO, TERMINO, participante, conteudo);
    }
}
