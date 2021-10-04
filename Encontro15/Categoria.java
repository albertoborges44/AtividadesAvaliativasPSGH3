/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB05
 */
import java.util.*;
public class Categoria extends CamposComuns {
    
    private int categoriaID;
    private SubCategoria subCategorias[];
    int getCategoriaID;
    
    public int getCategoriaID(){
        return categoriaID;
    }
    
    public void setCategoriaID(){
        this.categoriaID = categoriaID;
    }
    
    public Categoria(){
        this.subCategorias = new SubCategoria[3];
    }
    
    public boolean AdicionarSubCategoria(SubCategoria subcat){
        
    for(int i = 0; i < 3; i++){
        if(this.subCategorias[i] == null){
           this.subCategorias[i] = subcat;
        return true;
        }
    }
    
    return false;
    }
}
