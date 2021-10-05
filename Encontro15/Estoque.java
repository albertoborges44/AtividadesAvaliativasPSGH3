package com.mycompany.atividadeencontro15;

import java.util.Date;

public class Estoque {

    //Modelo Simples.
    public void Testar(){
        Date dataDeInsercao = new Date(System.currentTimeMillis());
        
        Categoria cat = new Categoria();
        cat.setCategoriaID(1);
        cat.setDescricao("Categoria Teste");
        cat.setDataInsert(dataDeInsercao);
        
        SubCategoria subcat = new SubCategoria(cat);
        subcat.setSubCategoriaID(1);
        subcat.setDescricao("SubCategoria Outro Teste");
        subcat.setDataInsert(dataDeInsercao);
        
        Produto pro = new Produto(subcat);
        pro.setProdutoID(1);
        pro.setDescricao("Produto Novo");
        pro.setDataInsert(dataDeInsercao);

        Pais pais = new Pais();
        pais.setPaisID(1);
        pais.setAbreviacao("EUA");

        Funcionario fun = new Funcionario(pais);
        fun.setFuncionarioID(1);
        fun.setChave(123456798);
        
    }
    
    //Modelo Intermediário.
    public void TestarComVetores(){
        Date dataDeInsercao = new Date(System.currentTimeMillis());        
        Categoria categorias[] = new Categoria[3]; 
        categorias[0] = this.criarCategoria(1, "Teste 1", dataDeInsercao);
        categorias[1] = this.criarCategoria(2, "Teste 2", dataDeInsercao);
        categorias[2] = this.criarCategoria(3, "Teste 3", dataDeInsercao);
    }
    
    private Categoria criarCategoria(int id, String descricao, Date dataDeInsert){
        Categoria cat = new Categoria();
        cat.setCategoriaID(id);
        cat.setDescricao(descricao);
        cat.setDataInsert(dataDeInsert);
        for (int i = 0; i < 3; i++) {
            int j = i + 1;
            SubCategoria s = this.criarSubCategoria(cat, j, "Teste SubCategoria " + j, dataDeInsert);
            cat.AdicionarSubCategoria(s);
        }
        return cat;
    }
    
    private SubCategoria criarSubCategoria(Categoria cat, int id, String descricao, Date dataDeInsert){
        SubCategoria sub = new SubCategoria(cat);
        sub.setSubCategoriaID(id);
        sub.setDescricao(descricao);
        sub.setDataInsert(dataDeInsert);
        for (int i = 0; i < 3; i++) {
            int j = i + 1;
            Produto p = this.criarProduto(sub, j, "Teste Produto " + j, dataDeInsert);
            sub.AdicionarProduto(p);
        }
        return sub;
    }
    
    private Produto criarProduto(SubCategoria sub, int id, String descricao, Date dataDeInsert){
        Produto pro = new Produto(sub);
        pro.setProdutoID(id);
        pro.setDescricao(descricao);
        pro.setDataInsert(dataDeInsert);
        return pro;
    }
}
