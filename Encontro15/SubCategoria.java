package com.mycompany.atividadeencontro15;

public class SubCategoria extends CamposComuns {

    private int subCategoriaID;
    
    private int categoriaID;
    
    private Categoria categoria;
    
    private Produto produtos[];
    
    public Produto[] getProdutos(){
        return this.produtos;
    }
    
    public int getSubCategoriaID() {
        return subCategoriaID;
    }

    public void setSubCategoriaID(int subCategoriaID) {
        this.subCategoriaID = subCategoriaID;
    }

    public int getCategoriaID() {
        return categoriaID;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public SubCategoria(Categoria novaCategoria){
        this.categoria = novaCategoria;
        this.categoriaID = categoria.getCategoriaID();
        this.produtos = new Produto[3];
    }
    
    public boolean AdicionarProduto(Produto produto){
        for (int i = 0; i < 3; i++) {
            if (this.produtos[i] == null ){
                this.produtos[i] = produto;
                return true;
            }
        }
        return false;
    }
}
