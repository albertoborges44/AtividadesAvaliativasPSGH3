package principal;

import java.util.*;

import dominio.Categoria;
import repositorio.CategoriaRepositorio;
import servico.CategoriaServico;

public class Programa {

	

	public static void main(String[] args) {
		
		
		CategoriaServico serv = new CategoriaServico("exemplo-jpa");
		
		serv.inserir(new Categoria(null, "Hello World", new Date()));
		
//		serv.alterar(new Categoria(24, "Akira não está com covid, fez o teste e deu bom mas está com diabetes :(", new Date()));
		
		System.out.println(serv.obter(20));
		
		for (Categoria item : serv.listar()) {
			System.out.println(item);
		}
		
		
	}

}
