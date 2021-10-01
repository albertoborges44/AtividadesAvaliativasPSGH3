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
    
    public SubCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public int getsubCategoriaID(int subCategoria){
        return subCategoriaID;
    }
    
    public void setsubcategoriaID(int subCategoria){
        this.subCategoriaID = subCategoriaID;
    }
    
    
}
