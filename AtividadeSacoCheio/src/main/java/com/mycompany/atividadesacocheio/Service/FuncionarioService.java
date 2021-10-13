
package com.mycompany.atividadesacocheio.Service;

import com.mycompany.atividadesacocheio.DAO.*;
import com.mycompany.atividadesacocheio.Pojo.*;
import java.util.*;


public class FuncionarioService {
    
     private Scanner sc;
    
    private FuncionarioDAO dao;
    
    public FuncionarioService(){
        this.sc = new Scanner(System.in);
        this.dao = new FuncionarioDAO();
    }
    
    public void exibirMenu(){
        boolean sair = false;
        do{
            int op = this.printMenu();
            switch(op){
                case 1:
                    this.printMenuAdicionar();
                    break;
                case 2:
                    this.printMenuListar();
                    break;
                case 3:
                    this.printMenuDetalhar();
                    break;
                case 4:
                    this.printMenuAlterar();
                    break;
                case 5:
                    this.printMenuExcluir();
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção não disponível. Tente novamente.");
            }
        }
        while(sair != true);
    }

    private int printMenu(){
        System.out.print("---- Menu Funcionario -CRUD --¬\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - ADICIONAR         |\n");
        System.out.print("| Opção 2 - BUSCAR TODOS      |\n");
        System.out.print("| Opção 3 - BUSCAR POR ID     |\n");
        System.out.print("| Opção 4 - ALTERAR           |\n");
        System.out.print("| Opção 5 - EXCLUIR           |\n");
        System.out.print("| Opção 6 - SAIR              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: \n");
        return this.sc.nextInt();
    }
    
    private void printMenuAdicionar(){
        System.out.print("**--Menu Funcionario - INSERIR--**\n\n");
        System.out.print("| Digite o ID do Funcionario: \n");
        int id = this.sc.nextInt();
        System.out.println("| Digite o Nome do Funcionario: ");
        String nome = this.sc.next();
        System.out.println("| Digite o SobreNome do Funcionario: ");
        String sobreNome = this.sc.next();
        System.out.println("| Digite o Email do Funcionario: ");
        String email = this.sc.next();
        System.out.println("| Digite o Sexo do Funcionario: ");
        char sexo = this.sc.next().charAt(0);
        
        FuncionarioPojo pojo = new FuncionarioPojo();
        pojo.setFuncionarioID(id);
        pojo.setNome(nome);
        pojo.setSobreNome(sobreNome);
        pojo.setEmail(email);
        pojo.setSexo(sexo);
        this.dao.create(pojo);
        
        if (this.dao.read(id) != null){
            System.out.println("| Funcionario adicionado.");
            System.out.print("|*****************************\n");
        }
        else{
            System.out.println("| Erro ao adicionar Funcionario.");
            System.out.print("|*****************************\n");
        }
    }

    private void printMenuListar(){
        System.out.print("**--Menu Funcionario - LISTAR--**\n\n");
        for (FuncionarioPojo fun : this.dao.readAll()) {
            System.out.printf("| Funcionario ID: %d \n", fun.getFuncionarioID());
            System.out.printf("| Nome     : %s \n", fun.getNome());
            System.out.printf("| SobreNome: %s \n", fun.getSobreNome());
            System.out.printf("| Sexo     : %s \n", fun.getSexo());
            System.out.print("|*****************************\n");
        }
    }

    private void printMenuDetalhar(){
        System.out.print("**--Menu Funcionario - DETALHAR--**\n\n");
        System.out.print("| Digite qual Funcionario ID: \n");
        int op = this.sc.nextInt();
        FuncionarioPojo fun = this.dao.read(op);
        if (fun == null){
            System.out.println("Funcionario não existe.");
        }
        else{
            System.out.printf("| Funcionario ID : %d \n", fun.getFuncionarioID());
            System.out.printf("| Chave ID       : %d \n", fun.getChaveID());
            System.out.printf("| Nome           : %s \n", fun.getNome());
            System.out.printf("| SobreNome      : %s \n", fun.getSobreNome());
            System.out.printf("| Sexo           : %c \n", fun.getSexo());
            System.out.printf("| Email          : %s \n", fun.getEmail());
            System.out.printf("| Pais ID        : %d \n", fun.getPaisID());
            System.out.printf("| CTPS           : %s \n", fun.getCTPS());
            System.out.printf("| CTPSNum        : %d \n", fun.getCTPSNum());
            System.out.printf("| CTPSSerie      : %d \n", fun.getCTPSSerie());
            System.out.print("|*****************************\n");
        }
    }
    
    private void printMenuAlterar(){
        System.out.print("**--Menu Funcionario - ALTERAR--**\n\n");
        System.out.print("| Digite qual Funcionario: \n");
        int op = this.sc.nextInt();
        FuncionarioPojo fun = this.dao.read(op);
        if (fun == null){
            System.out.println("Funcionario não existe.");
        }
        else{
            System.out.printf("| Funcionario ID: %d \n", fun.getFuncionarioID());
            System.out.println("| Digite o novo nome do Funcionario: ");
            String nome = this.sc.next();
            fun.setNome(nome);
            System.out.println("| Digite o novo sobrenome do Funcionario: ");
            String sobreNome = this.sc.next();
            fun.setSobreNome(sobreNome);
            System.out.println("| Digite o novo email do Funcionario: ");
            String email = this.sc.next();
            fun.setEmail(email);
            System.out.println("Funcionario alterado com sucesso.");
            System.out.print("|*****************************\n");
        }
    }
    
    private void printMenuExcluir(){
        System.out.print("**--Menu Funcionario - EXCLUIR--**\n\n");
        System.out.print("| Digite qual Funcionario ID: \n");
        int op = this.sc.nextInt();
        FuncionarioPojo fun = this.dao.read(op);
        if (fun == null){
            System.out.println("Funcionario não existe.");
        }
        else{
            System.out.printf("| Funcionario ID: %d \n", fun.getFuncionarioID());
            
            this.dao.delete(fun.getFuncionarioID());
            FuncionarioPojo funDeletado = this.dao.read(op);
            if (funDeletado == null){
                System.out.println("Funcionario excluído com sucesso.");
            }
            System.out.print("|*****************************\n");
        }        
    }
}
