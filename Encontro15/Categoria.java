package com.mycompany.atividadeencontro15;

public class Categoria extends CamposComuns {
    
    private int categoriaID;
    
    private SubCategoria subCategorias[];

    public SubCategoria[] getSubCategorias(){
        return this.subCategorias;
    }
    
    public int getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }
    
    public Categoria(){
        this.subCategorias = new SubCategoria[3];
    }
    
    public boolean AdicionarSubCategoria(SubCategoria subcat){
        for (int i = 0; i < 3; i++) {
            if (this.subCategorias[i] == null ){
                this.subCategorias[i] = subcat;
                return true;
            }
        }
        return false;
    }    
}
