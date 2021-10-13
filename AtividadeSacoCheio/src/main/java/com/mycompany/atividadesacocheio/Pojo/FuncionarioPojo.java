
package com.mycompany.atividadesacocheio.Pojo;

import java.util.*;


public class FuncionarioPojo extends CamposDeData{
    
    private int paisID;
    
    private int departamentoID;
    
    private int FuncionarioID;
    
    private long chaveID;
    
    private String nome;
    
    private String sobreNome;
    
    private Date dataAdmissao;
    
    private char sexo;
    
    private Date dataNascimento;
    
    private String email;
    
    private String CTPS;
    
    private long CTPSNum;
    
    private int CTPSSerie;

    public int getPaisID() {
        return paisID;
    }

    public void setPaisID(int paisID) {
        this.paisID = paisID;
    }

    public int getDepartamentoID() {
        return departamentoID;
    }

    public void setDepartamentoID(int departamentoID) {
        this.departamentoID = departamentoID;
    }

    public int getFuncionarioID() {
        return FuncionarioID;
    }

    public void setFuncionarioID(int FuncionarioID) {
        this.FuncionarioID = FuncionarioID;
    }

    public long getChaveID() {
        return chaveID;
    }

    public void setChaveID(long chaveID) {
        this.chaveID = chaveID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public long getCTPSNum() {
        return CTPSNum;
    }

    public void setCTPSNum(long CTPSNum) {
        this.CTPSNum = CTPSNum;
    }

    public int getCTPSSerie() {
        return CTPSSerie;
    }

    public void setCTPSSerie(int CTPSSerie) {
        this.CTPSSerie = CTPSSerie;
    }
    
    
    
}
