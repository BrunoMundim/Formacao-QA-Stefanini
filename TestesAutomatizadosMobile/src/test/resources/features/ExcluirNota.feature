#language: pt
#encoding: UTF-8

@excluirNota
Funcionalidade: excluir nota 

	Contexto:
		Dado que eu aciono o get started
	
	Cenario: excluir uma nota
		Quando eu criar uma nota com titulo "Nota" e nota "Nota exemplo"
		E tocar e segurar a nota "Nota"
		E acionar os tres pontos na direita em cima
		E acionar a opcao delete
		Entao eu apago a nota "Nota"
		
	Cenario: excluir nota antiga
		Quando tocar e segurar a nota "Nota Antiga"
		E acionar os tres pontos na direita em cima
		E acionar a opcao delete
		Entao eu apago a nota "Nota Antiga"
		