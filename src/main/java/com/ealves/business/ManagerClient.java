package com.ealves.business;

import java.util.List;

import com.ealves.model.Client;
import com.ealves.repositories.IClientManagerRepository;

/**
 * Retorna uma lista com todos os clientes do banco.
 * @return lista com todos os clientes do banco
 */
public class ManagerClient implements IClientManagerRepository {

	private List<Client> clientBank;

	public ManagerClient(List<Client> clientBank) {
		this.clientBank = clientBank;
	}

	public List<Client> getClientBank() {
		return clientBank;
	}

	public Client searchClient(int idCliente) {
		for (Client client : clientBank) {
			if (client.getId() == idCliente)
				return client;
		}
		return null;
	}

	public void clean() {
		this.clientBank.clear();
	}

}
