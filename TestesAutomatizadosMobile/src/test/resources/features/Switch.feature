#language: pt
#encoding: UTF-8

@switch
Funcionalidade: Switch

Contexto: 
	Dado que eu aciono o get started
		
	Cenario: Interagir com o switch das configuracoes
		Quando eu acionar o menu
		E eu acionar a aba settings
		E eu tocar no switch
		Entao o switch fica desabilitado
		