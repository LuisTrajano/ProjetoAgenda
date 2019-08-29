/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Br.Ulbra.Model;


public class Pessoa {
    private int codigo;
    private String nome;
    private String celular;
    private String email;
    
    public Pessoa () {
        this.codigo = 0;
        this.nome = "Ricardo da Silva";
        this.celular = "????";
        this.email = "????";
    }

    public Pessoa(int codigo, String nome, String celular, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo
                + ", nome=" + nome + ", celular=" 
                + celular + ", email=" + email + '}';
    }
    
}
