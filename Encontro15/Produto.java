package com.mycompany.atividadeencontro15;

public class Produto extends CamposComuns {

    private int produtoID;
    
    private int categoriaID;
    
    private int subCategoriaID;
    
    private SubCategoria subCategoria;    
    
    public int getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(int produtoID) {
        this.produtoID = produtoID;
    }

    public int getCategoriaID() {
        return categoriaID;
    }

    public int getSubCategoriaID() {
        return subCategoriaID;
    }

    public SubCategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(SubCategoria subCategoria) {
        this.subCategoria = subCategoria;
    }

    public Produto(SubCategoria novaSubCategoria){
        this.subCategoria = novaSubCategoria;
        this.subCategoriaID = this.subCategoria.getSubCategoriaID();
        this.categoriaID = this.subCategoria.getCategoria().getCategoriaID();
    }
}
