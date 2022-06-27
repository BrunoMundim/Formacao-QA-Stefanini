#language: pt
#encoding: UTF-8

@cadastrarUsuario
Funcionalidade: Cadastrar usuario
	
	@Cadastro
	Cenario: Cadastrar usuario
		Quando eu acionar a aba Admin
		E acionar o botao Add
		E informar no campo employee name "Fiona Grace"
		E informar no campo username "Bruno.Mundim"
		E informar no campo password "BrunoRodrigues127@"
		E informar no campo confirm password "BrunoRodrigues127@"
		E clicar no botao salvar
		Entao o sistema cadastra o usuario "Bruno.Mundim"