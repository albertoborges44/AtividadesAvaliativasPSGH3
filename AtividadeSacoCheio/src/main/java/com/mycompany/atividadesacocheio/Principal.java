
package com.mycompany.atividadesacocheio;
import com.mycompany.atividadesacocheio.Service.*;
public class Principal {
    
    public static void main(String[] args) {
        
        FuncionarioService servico = new FuncionarioService();
        servico.exibirMenu();
        
    }
    
}
