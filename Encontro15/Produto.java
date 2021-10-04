/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB05
 */
public class  Produto extends CamposComuns{
    
    private int produtoID;
    private int categoriaID;
    private int subCategoriaID;
    private Produto produtos[];
    
    private SubCategoria subCategoria;
    
    public Produto (SubCategoria subCategoria){
        
        this.subCategoria = subCategoria;
        this.categoriaID = this.subCategoria.getCategoria().getCategoriaID;
    }
    
    public Produto[] getProdutos(){
        return this.produtos;
    } 
    
    public int getProdutoID(int ProdutoID){
        return produtoID;
    }
    
    public void setProdutoID(){
        this.produtoID = produtoID;
    }
    
    
    
}
