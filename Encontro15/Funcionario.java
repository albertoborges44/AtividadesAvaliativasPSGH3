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
    
    private int FuncionarioID;
    private long ChaveID;
    private String Nome;
    private String SobreNome;
    private Date DataAdmissao;
    private char Sexo;
    private Date DataNascimento;
    private String Email;
    private String CTPS ;
    private long CTPSNum;
    private String CTPSSERIE;
    private int PaisID;
    
    private Pais pais;
    
    public Funcionario(Pais pais){
        this.pais = pais;
    }

    public int getFuncionarioID() {
        return FuncionarioID;
    }

    public long getChaveID() {
        return ChaveID;
    }

    public String getNome() {
        return Nome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public Date getDataAdmissao() {
        return DataAdmissao;
    }

    public char getSexo() {
        return Sexo;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public String getEmail() {
        return Email;
    }

    public String getCTPS() {
        return CTPS;
    }

    public long getCTPSNum() {
        return CTPSNum;
    }

    public String getCTPSSERIE() {
        return CTPSSERIE;
    }

    public int getPaisID() {
        return PaisID;
    }

    public Pais getPais() {
        return pais;
    }

    public void setFuncionarioID(int FuncionarioID) {
        this.FuncionarioID = FuncionarioID;
    }

    public void setChaveID(long ChaveID) {
        this.ChaveID = ChaveID;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setSobreNome(String SobreNome) {
        this.SobreNome = SobreNome;
    }

    public void setDataAdmissao(Date DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public void setCTPSNum(long CTPSNum) {
        this.CTPSNum = CTPSNum;
    }

    public void setCTPSSERIE(String CTPSSERIE) {
        this.CTPSSERIE = CTPSSERIE;
    }

    public void setPaisID(int PaisID) {
        this.PaisID = PaisID;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

   
    
}
