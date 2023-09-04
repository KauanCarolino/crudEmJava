package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Marta");
		contato.setIdade(22);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		
		//Atualizar o contato 
		Contato c1 = new Contato();
		c1.setNome("Joana Dias");
		c1.setIdade(23);
		c1.setDataCadastro(new Date());
		c1.setId(6);//Número da Chave primária
		
		//contatoDao.update(c1);
		
		//Deletar o contato pelo ID
		//contatoDao.deleteByID(1);
		contatoDao.deleteByID(6);
		
		//Visualização dos registros do banco de dados TODOS os registros
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contatos: "+c.getNome());
		}

	}

}
