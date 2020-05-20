package com.ealves.controllers;

import java.util.ArrayList;
import java.util.List;

import com.ealves.business.ManagerClient;
import com.ealves.business.MoneyTransfer;
import com.ealves.model.Client;
import com.ealves.model.CurrentAccount;

public class MainClass {

	public static ManagerClient getClients;

	public static MoneyTransfer getAccount;

	public static void main(String[] args) {
		
		int idClienteOne = 1;
		int idClienteTwo = 2;

		// - Criando lista vazia de contas e clientes
		List<CurrentAccount> accountBanks = new ArrayList<CurrentAccount>();
		List<Client> clientBanks = new ArrayList<Client>();

		// criando e inserindo duas contas na lista de contas correntes do banco
		CurrentAccount contOne = new CurrentAccount(idClienteOne, 100, true);
		CurrentAccount contTwo = new CurrentAccount(idClienteTwo, 0, true);

		accountBanks.add(contOne);
		accountBanks.add(contTwo);

		// criando dois clientes e associando as contas criadas acima a eles
		Client clientOne = new Client(idClienteOne, "Jose Aldo", 25, "jose-aldo@mail.com", true, contOne);
		Client clientTwo = new Client(idClienteTwo, "João da Silva", 34, "joao-silva@gmail.com", true, contTwo);

		// inserindo os clientes criados na lista de clientes do banco
		clientBanks.add(clientOne);
		clientBanks.add(clientTwo);
		
		
		getClients = new ManagerClient(clientBanks);
		getAccount = new MoneyTransfer(accountBanks);
		
		boolean success = getAccount.transferValue(idClienteOne, 100, idClienteTwo);
		
		System.out.println("Tranferencia efetuada com sucesso!!" + success);
		
		System.out.println("---------------------------------------------");

		System.out.println(clientOne);
		System.out.println(clientTwo);

	}
	
}
