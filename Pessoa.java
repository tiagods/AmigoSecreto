/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prolink
 */
public class Pessoa {
    private int id;
    private String nome;
    private Pessoa sorteado;
    
    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return getId()+"-"+getNome(); 
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sorteado
     */
    public Pessoa getSorteado() {
        return sorteado;
    }

    /**
     * @param sorteado the sorteado to set
     */
    public void setSorteado(Pessoa sorteado) {
        this.sorteado = sorteado;
    }
    
}
