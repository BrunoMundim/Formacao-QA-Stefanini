#language: pt
#encoding: UTF-8

Funcionalidade: Google Keep

Contexto: 
	Dado que eu aciono o get started

	Cenario: Criar nova nota
		Quando eu criar uma nova nota
		E informar no campo Title "Nota1"
		E informar no campo Note "Nota exemplo"
		E clicar no botao voltar
		Entao o aplicativo cadastra a nota com o titulo "Nota1"
		