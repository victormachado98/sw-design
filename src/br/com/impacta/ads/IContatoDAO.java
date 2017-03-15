package br.com.impacta.ads;

import java.util.List;

public interface IContatoDAO {
	List<Contato> buscar(String nome);
	void inserir(Contato c);
	boolean existe(Contato c);
}
