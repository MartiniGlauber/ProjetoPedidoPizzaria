/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetopedidopizzaria;

/**
 *
 * @author 182220008
 */
public class Item {
    private String sabor;
    private String tamanho;
    private String massaIntegral = "";
    private String bordaChedar = "";
    private String bordaChocolate = "";
    private String outro = "";
    private int quantidade;
    private float valor;
    private float precoTamanho;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
        //if(rbtPeq.is)
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMassaIntegral() {
        return massaIntegral;
    }

    public void setMassaIntegral(String massaIntegral) {
        this.massaIntegral = massaIntegral;
    }

    public String getBordaChedar() {
        return bordaChedar;
    }

    public void setBordaChedar(String bordaChedar) {
        this.bordaChedar = bordaChedar;
    }

    public String getBordaChocolate() {
        return bordaChocolate;
    }

    public void setBordaChocolate(String bordaChocolate) {
        this.bordaChocolate = bordaChocolate;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


 

}
