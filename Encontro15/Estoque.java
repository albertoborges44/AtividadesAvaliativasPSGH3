/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encontro15;
import java.util.*;
/**
 *
 * @author LAB05
 */
public class Estoque {
    
    public void TesteComVetores(){
        Date dataDeInsercao = new Date(System.currentTimeMillis());
        
        Categoria categorias[] = new Categoria[3];
        
        categorias[0] = this.CriarCategoria(1, "Teste 1", dataDeInsercao);
        categorias[1] = this.CriarCategoria(2, "Teste 2", dataDeInsercao);
        categorias[2] = this.CriarCategoria(3, "Teste 3", dataDeInsercao);
        
        
    }
    
    private Categoria CriarCategoria(int ID, String descricao, Date dataDeInsert){
        Categoria cat = new Categoria();
        cat.setCategoriaID(ID);
        cat.setDescricao(descricao);
        cat.setDataInsert(dataDeInsert);
        return cat;
    }
    
    private SubCategoria CriarSubCategoria(Categoria cat, int id, String descricao, Date dataDeInsert){
        SubCategoria sub = new SubCategoria(cat);
        sub.setSubCategoriaID(id);
        sub.setDescricao(descricao);
        sub.setDateInsert(dataDeInsert);
        
        for(int i = 0; i < 3; i++){
            int j = i + 1;
            SubCategoria s = this.criarSubCategoria(cat, j , "Teste SubCategoria " + j, dataDeInsert);
            cat.AdicionarSubCategoria();
        }
        
        return sub;
    }
    
    private Produto CriarProduto(SubCategoria sub, int id, String descricao, Date dataDeInsert){
        Produto pro = new Produto(sub);
        pro.setProdutoID(id);
        pro.setDescricao(descricao);
        pro.setDateInsert(dataDeInsert);
        return pro;
        
    }
}
