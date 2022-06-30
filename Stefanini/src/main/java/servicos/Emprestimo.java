package servicos;

import java.util.Date;

import entidades.Conta;
import utils.DataUtils;

public class Emprestimo {
	
	public void realizaEmprestimo (Conta conta, Double valor, int parcelas) throws Exception {
		if(conta == null) {
			throw new Exception("Usuario vazio");
		}
	}
	
	public int aprovaPagamento (DataUtils dataUtils,int parcelas) {
		return dataUtils.prazoPagamento(parcelas);	
	}
	
}
