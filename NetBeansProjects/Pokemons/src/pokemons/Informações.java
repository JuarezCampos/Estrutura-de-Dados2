/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;

/**
 *
 * @author Juarez
 */
public class Informações {
    private String nome, sexo, habilidade, tipo, descricao;
    private int altura, peso, idade, numIdEvolucao = -1, evolucao = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumIdEvolucao() {
        return numIdEvolucao;
    }

    public void setNumIdEvolucao(int numIdEvolucao) {
        this.numIdEvolucao = numIdEvolucao;
    }

    public int getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(int evolucao) {
        this.evolucao = evolucao;
    }

    public Informações(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Informações(String nome, String sexo, String habilidade, String tipo, String descricao, int altura, int peso, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.habilidade = habilidade;
        this.tipo = tipo;
        this.descricao = descricao;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }

    public Informações() {
    }
    
    
    
    
}
