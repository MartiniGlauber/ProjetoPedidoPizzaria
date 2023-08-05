/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetopedidopizzaria;

import java.util.ArrayList;


public class Pedido {
    private String cliente;
    private String telefone;
    private String endereco;
    private String cidade;
    private ArrayList<Item> listaItens = new ArrayList<>();
    
    public void addItem (Item item){
        listaItens.add(item);
        
    }

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }
    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        String cliente = String.format("Dados do cliente:\nNome: %s\nTelefone: %s\nEndereço: %s - %s\n\n", this.cliente,telefone,endereco,cidade);
        String pedido = "Itens do pedido:\n";
        for(Item it : listaItens){
            pedido +=String.format("%s - %s - %s - %s - %s - %s - %d - %.2f\n", it.getSabor(),it.getTamanho(),it.getMassaIntegral(),it.getBordaChedar(),it.getBordaChocolate(),it.getOutro(),
            it.getQuantidade(),it.getValor());
        }
        return cliente + pedido;
    }
    

    
  

}
