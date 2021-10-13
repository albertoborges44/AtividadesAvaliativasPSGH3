
package com.mycompany.atividadesacocheio.DAO;

import com.mycompany.atividadesacocheio.FakeDB.*;
import com.mycompany.atividadesacocheio.Pojo.*;
import java.util.*;

public class PaisDAO {
    
    public PaisDAO(){
        EstoqueFakeDB.getPaises();
    }
    
    public void create(PaisPojo pojo){
        EstoqueFakeDB.getPaises().add(pojo);
    }
    
    public PaisPojo read(int paisID){
        return this.search(paisID);
    }
    
    public ArrayList<PaisPojo> readAll(){
        return EstoqueFakeDB.getPaises();
    }
    
    public void update(PaisPojo pojo){
        PaisPojo procura = this.search(pojo.getPaisID());
        EstoqueFakeDB.getPaises().remove(procura);
        EstoqueFakeDB.getPaises().add(pojo);
     
    }
    
    public void delete(int paisID){
        PaisPojo procura = this.search(paisID);
        EstoqueFakeDB.getPaises().remove(paisID);
    }
    
    public PaisPojo search(int id){
        return EstoqueFakeDB.getPaises().stream()
                .filter(p -> p.getPaisID() == id)
                .findFirst()
                .orElse(null);
    }
    
    
    
}
