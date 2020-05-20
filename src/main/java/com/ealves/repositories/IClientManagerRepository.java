package com.ealves.repositories;

import com.ealves.model.Client;

public abstract interface IClientManagerRepository {

	public Client searchClient(int idCliente);

}
