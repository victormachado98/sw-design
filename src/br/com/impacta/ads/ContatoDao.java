package br.com.impacta.ads;

import java.util.ArrayList;
import java.util.List;

public class ContatoDao implements IContatoDAO {

	private List<Contato> contatos = new ArrayList<>();
	
	@Override
	public List<Contato> buscar(String nome){
		List<Contato> res = new ArrayList<>();
		for (Contato c: contatos){
			if(nome.equals(c.getNome())) {
				res.add(c);
			}
		}
		return res;
	}
	
	@Override
	public void inserir(Contato c){
		contatos.add(c);
	}
	
	@Override
	public boolean existe(Contato c){
		return contatos.contains(c);
	}
}
