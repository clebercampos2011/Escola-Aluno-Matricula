package entitieis;

import java.util.Scanner;

public class Filial {

	public String cnpj;
	public String razaoSocial;
	public String cep;
	public String logradouro;
	public Integer numero;
	public String complemento;
	public String cidade;
	public String estado;
	public String telefone;

	public void Cnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void RazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void Cep(String cep) {
		this.cep = cep;
	}

	public void Logradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void Numero(Integer numero) {
		this.numero = numero;
	}

	public void Complemento(String complemento) {
		this.complemento = complemento;
	}

	public void Cidade(String cidade) {
		this.cidade = cidade;
	}

	public void Estado(String estado) {
		this.estado = estado;
	}

	public void Telefone(String telefone) {
		this.telefone = telefone;
	}

	public void CadastroFilial() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("OPÇÃO |FILIAL| ");
		System.out.println("--------------------------------------- ");

		System.out.print("Digite O CNPJ da empresa........: ");
		Cnpj(scanner.nextLine());

		System.out.print("Digite O Razão Social da empresa: ");
		RazaoSocial(scanner.nextLine());

		System.out.print("Digite O CEP da empresa.........: ");
		Cep(scanner.nextLine());

		System.out.print("Digite O Logradouro - Endereço..: ");
		Logradouro(scanner.nextLine());

		System.out.print("                        Numero..: ");
		Numero(Integer.parseInt(scanner.nextLine()));

		System.out.print("                   Complemento..: ");
		Complemento(scanner.nextLine());

		System.out.print("                        Cidade..: ");
		Cidade(scanner.nextLine());

		System.out.print("                              UF: ");
		Estado(scanner.nextLine());

		System.out.print("Digite O Telefone da empresa....: ");
		Telefone(scanner.nextLine());

	}

}
