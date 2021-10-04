/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB05
 */
import java.util.*;
public class Funcionario extends Pais {
    
    private int funcionarioID;
    private long chaveID;
    private String nome;
    private String sobreNome;
    private Date dataAdmissao;
    private char sexo;
    private Date dataNascimento;
    private String email;
    private String ctps ;
    private long ctpsNum;
    private String ctpsSerie;
    private int paisID;
    
    private Pais pais;
    

    public int getFuncionarioID() {
        return funcionarioID;
    }
    
    public void setFuncionarioID(int FuncionarioID) {
        this.funcionarioID = funcionarioID;
    }
    
    public long getChaveID() {
        return chaveID;
    }
    
    public void setChaveID(long ChaveID) {
        this.chaveID = chaveID;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String Nome) {
        this.nome = nome;
    }
    

    public String getSobreNome() {
        return sobreNome;
    }
    
    public void setSobreNome(String SobreNome) {
        this.sobreNome = sobreNome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    
    public void setDataAdmissao(Date DataAdmissao) {
        this.dataAdmissao = DataAdmissao;
    }

    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char Sexo) {
        this.sexo = Sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getCTPS() {
        return ctps;
    }

    public long getCTPSNum() {
        return ctpsNum;
    }

    public String getCTPSSERIE() {
        return ctpsSerie;
    }

    public int getPaisID() {
        return paisID;
    }

    public Pais getPais() {
        return pais;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.dataNascimento = DataNascimento;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public void setCTPS(String CTPS) {
        this.ctps = CTPS;
    }

    public void setCTPSNum(long CTPSNum) {
        this.ctpsNum = CTPSNum;
    }

    public void setCTPSSERIE(String CTPSSERIE) {
        this.ctpsSerie = CTPSSERIE;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
     

   public Funcionario(Pais pais){
        this.pais = pais;
        this.paisID = this.pais.getPaisID();
    }
    
}
