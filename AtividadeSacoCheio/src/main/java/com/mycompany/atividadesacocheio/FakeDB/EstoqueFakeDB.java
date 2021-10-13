
package com.mycompany.atividadesacocheio.FakeDB;

import com.mycompany.atividadesacocheio.Pojo.*;

import java.util.*;
import java.time.*;

public final class EstoqueFakeDB {
    
    private static ArrayList<PaisPojo> paises;
    
    private static ArrayList<DepartamentosPojo> departamentos;
    
    private static ArrayList<FuncionarioPojo> funcionarios;
    
    public static ArrayList<PaisPojo> getPaises(){
        
        if(paises == null){
            paises  = new ArrayList();
            inicializarPaisPojo();
        }
        return paises;
    }
    
    public static ArrayList<DepartamentosPojo> getDepartamento(){
        
        if(departamentos == null){
            departamentos = new ArrayList();
            inicializarDepartamento();
        }
        
        return departamentos;
    }
    
    public static ArrayList<FuncionarioPojo> getFuncionarios(){
        
        if(funcionarios == null){
            funcionarios = new ArrayList();
            inicializarFuncionario();
        }
        
        return funcionarios;
    }
    
    private static void inicializarPaisPojo(){
        Date dataInsert = new Date(System.currentTimeMillis());
    adicionarPais( 1  ,"Canada                            ","CA", dataInsert);
    adicionarPais( 2  ,"United States                     ","US", dataInsert);
    adicionarPais( 3  ,"United Kingdom                    ","GB", dataInsert);
    adicionarPais( 4  ,"Andorra                           ","AD", dataInsert);
    adicionarPais( 5  ,"Anguilla                          ","AI", dataInsert);
    adicionarPais( 6  ,"Argentina                         ","AR", dataInsert);
    adicionarPais( 7  ,"Aruba                             ","AW", dataInsert);
    adicionarPais( 8  ,"Australia                         ","AU", dataInsert);
    adicionarPais( 9  ,"Austria                           ","AT", dataInsert);
    adicionarPais(10 , "Bahamas                           ","BS", dataInsert);
        
    }
    
    private static void inicializarDepartamento(){
        Date dataInsert = new Date(System.currentTimeMillis());
        adicionarDepartamento( 1  ,"Costumer Service", dataInsert);
        adicionarDepartamento( 2  ,"Development", dataInsert);
        adicionarDepartamento( 3  ,"Finance", dataInsert);
        adicionarDepartamento( 4  ,"Human Resources", dataInsert);
        adicionarDepartamento( 5  ,"Marketing", dataInsert);
        adicionarDepartamento( 6  ,"Production", dataInsert);
        adicionarDepartamento( 7  ,"Quality Management", dataInsert);
        adicionarDepartamento( 8  ,"Research", dataInsert);
        adicionarDepartamento( 9  ,"Sales", dataInsert);
    }
    
    private static void inicializarFuncionario(){
        Date dataInsert = new Date(System.currentTimeMillis());
        Date dataNascimento = new Date(System.currentTimeMillis());
        Date dataAdmissao = new Date(System.currentTimeMillis());
        adicionarFuncionario(10002 , 20100150002L ," Bezalel	", "Simmel	",'F'	,       "simmel.bezalel@acme.com	",1	 	,"38050201548/584	",38050201548L	,584, dataInsert);
        adicionarFuncionario(10004 , 20100150004L ," Chirstian	", "Koblick	",'M'	, 	"koblick.chirstian@acme.com	",1	 	,"93993062385/891	",93993062385L	,891, dataInsert);
        adicionarFuncionario(10006 , 20100150006L ," Anneke	", "Preusig	",'F'	, 	"preusig.anneke@acme.com	",1	 	,"32097781440/565	",32097781440L	,565, dataInsert);
        adicionarFuncionario(10007 , 20100150007L ," Tzvetan	", "Zielinski	",'F'	, 	"zielinski.tzvetan@acme.com	",1	 	,"45521773009/130	",45521773009L	,130, dataInsert);
        adicionarFuncionario(10009 , 20100150009L ," Sumant	", "Peac	",'F'   , 	"peac.sumant@acme.com          ",1	 	,"97392551134/059	",97392551134L	,59 , dataInsert);
        adicionarFuncionario(10591 , 2010015059L  ,"Hidde	","Hettesheimer	",'F'	, 	"hettesheimer.hidde@acme.com	",2	 	,"19358243623/877	",19358243623L	,877, dataInsert);
        adicionarFuncionario(10594 , 2010015059L  ,"Kiyokazu	","Whitcomb	",'M'	, 	"whitcomb.kiyokazu@acme.com	",2	 	,"78302507326/187	",78302507326L	,187, dataInsert);
        adicionarFuncionario(10595 , 2010015059L  ,"Giri         ","Undy         ",'M'	, 	"undy.giri@acme.com            ",2	 	,"25403575873/883	",25403575873L	,883, dataInsert);
        adicionarFuncionario(10596 , 2010015059L  ,"Sanjit	","Coors        ",'M'	, 	"coors.sanjit@acme.com         ",2	 	,"43204185845/052	",43204185845L	,52 , dataInsert);
        adicionarFuncionario(10597 , 2010015059L  ,"Lucien	","Schaad       ",'F'	, 	"schaad.lucien@acme.com        ",2	 	,"62649087498/405	",62649087498L	,405, dataInsert);
        adicionarFuncionario(10598 , 2010015059L  ,"Margo	","Gronowski	",'M'	, 	"gronowski.margo@acme.com	",2	 	,"22297517772/239	",22297517772L	,239, dataInsert);
        adicionarFuncionario(10599 , 2010015059L  ,"Seshu	","Crelier      ",'F'	, 	"crelier.seshu@acme.com        ",2	 	,"80465523855/435	",80465523855L	,435, dataInsert);
        
    }
    
    private static void adicionarFuncionario(int id, long chave, String nome, String sobreNome, char sexo, String email, int paisID,String ctps, long ctpsNum, int ctpsSerie, Date dataInsert){
        FuncionarioPojo f = new FuncionarioPojo();
        f.setFuncionarioID(id);
        f.setChaveID(chave);
        f.setNome(nome);
        f.setSobreNome(sobreNome);
        f.setSexo(sexo);
        f.setEmail(email);
        f.setPaisID(paisID);
        f.setCTPS(ctps);
        f.setCTPSNum(ctpsNum);
        f.setCTPSSerie(ctpsSerie);
        f.setDataInsert(dataInsert);
        funcionarios.add(f);
    }
    
    private static void adicionarDepartamento(int id, String descricao, Date dataInsert){
        DepartamentosPojo d = new DepartamentosPojo();
        d.setDepartamentoID(id);
        d.setDescricao(descricao);
        d.setDataInsert(dataInsert);
        departamentos.add(d);
    }
    
    private static void adicionarPais(int id, String descricao, String abreviacao, Date dataInsert){
        PaisPojo p = new PaisPojo();
        p.setPaisID(id);
        p.setDescricao(descricao);
        p.setAbreviacao(abreviacao);
        p.setDataInsert(dataInsert);
        paises.add(p);
    }
}
