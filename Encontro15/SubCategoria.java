/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB05
 */
import java.util.*;
public class SubCategoria extends CamposComuns {
    
    private int subCategoriaID;
    private int categoriaID;
    private Categoria categoria;
    private Produto produtos[];
    private SubCategoria subcategorias[];
    
    public SubCategoria(Categoria categoria) {
        this.categoria = categoria;
        this.categoriaID = this.categoria.getCategoriaID();
    }
    
    public SubCategoria[] getSubCategorias(){
        return this.subcategorias;
    }
    
    public Categoria getCategoria(){
        this.categoria = categoria;
        return categoria;
    }
    
    
    public int getsubCategoriaID(int subCategoria){
        return subCategoriaID;
    }
    
    public void setsubcategoriaID(int subCategoria){
        this.subCategoriaID = subCategoriaID;
    }
    
    public boolean AdicionarProduto(Produto produto){
        for(int i = 0; i < 3; i++){
            if(this.produtos[i] == null){
                this.produtos[i] = produto;
                return true;
            }
        }
        return false;
    }
    
    
}
