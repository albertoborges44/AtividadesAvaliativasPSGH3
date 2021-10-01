/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB05
 */
import java.util.*;

public abstract class CamposComuns extends CamposDeData {
    
    protected String Descricao;
    
    String getDescricao(){
        return Descricao;
    }
    
    void setDescricao(String Descricao){
        this.Descricao = Descricao;
    }
}
