
package com.mycompany.atividadesacocheio.DAO;

import com.mycompany.atividadesacocheio.FakeDB.*;
import com.mycompany.atividadesacocheio.Pojo.*;
import java.util.*;

public class FuncionarioDAO {
    
    

    
    public FuncionarioDAO(){
        EstoqueFakeDB.getFuncionarios();
    }
    
    public void create(FuncionarioPojo pojo){
        EstoqueFakeDB.getFuncionarios().add(pojo);
    }
    
    public FuncionarioPojo read(int funcionarioID){
        return this.search(funcionarioID);
    }
    
    public ArrayList<FuncionarioPojo> readAll(){
        return EstoqueFakeDB.getFuncionarios();
    }
    
    public void update(FuncionarioPojo pojo){
        FuncionarioPojo procura = this.search(pojo.getFuncionarioID());
        EstoqueFakeDB.getFuncionarios().remove(procura);
        EstoqueFakeDB.getFuncionarios().add(pojo);
     
    }
    
    public void delete(int funcionarioID){
        FuncionarioPojo procura = this.search(funcionarioID);
        EstoqueFakeDB.getFuncionarios().remove(procura);
    }
    
    public FuncionarioPojo search(int id){
        return EstoqueFakeDB.getFuncionarios().stream()
                .filter(f -> f.getFuncionarioID() == id)
                .findFirst()
                .orElse(null);
    }
    
    
    
}


