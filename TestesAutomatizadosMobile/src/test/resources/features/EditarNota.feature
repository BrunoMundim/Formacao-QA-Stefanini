#language: pt
#encoding: UTF-8

@editarNota
Funcionalidade: editar nota

	Contexto:
		Dado que eu aciono o get started
	
	Cenario: 
		Quando eu criar uma nota com titulo "Nota" e nota "Nota exemplo"
		E acionar a nota antiga "Nota"
		E editar o titulo da nota para "Novo titulo"
		E clicar na seta
		Entao o titulo da nota muda para "Novo titulo"