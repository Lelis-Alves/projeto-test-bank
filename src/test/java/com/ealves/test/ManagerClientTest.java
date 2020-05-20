package com.ealves.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ealves.business.ManagerClient;
import com.ealves.model.Client;
import com.ealves.model.CurrentAccount;

/**
 * Teste básico para pesquisa e verificar se o cliente está ativo a partir do
 * seu ID.
 * 
 * @author Elias Alves
 * @date 20 05 2020
 */
public class ManagerClientTest {

	private ManagerClient getClients;

	private int idClienteOne = 1;
	private int idCLienteTwo = 2;

	@Before
	public void setUp() {

		/* ========== Iniciando Cenário de Testes ========== */

		// criando contas
		CurrentAccount contOne = new CurrentAccount(idClienteOne, 0, true);
		CurrentAccount contTwo = new CurrentAccount(idCLienteTwo, 0, true);

		// - Criando alguns clientes
		Client clientOne = new Client(idClienteOne, "Jose Aldo", 25, "jose-aldo@mail.com", true, contOne);
		Client clientTwo = new Client(idCLienteTwo, "João da Silva", 34, "joao-silva@gmail.com", true, contTwo);

		// inserindo os clientes criados na lista de clientes do banco
		List<Client> clientBanks = new ArrayList<Client>();
		clientBanks.add(clientOne);
		clientBanks.add(clientTwo);

		getClients = new ManagerClient(clientBanks);

	}

	@After
	public void tearDown() {
		getClients.clean();
		// - Apaga clientes.
	}

	
	@Test
	public void testSearchClient() {

		/* ========== Execução ========== */
		Client client = getClients.searchClient(idClienteOne);

		/* ========== Verificações ========== */
		assertNotNull(client);
	}

	@Test
	public void testActiveClient() {

		/* ========== Execução ========== */
		Client client = getClients.searchClient(idCLienteTwo);

		/* ========== Verificações ========== */
		assertThat(client.getId(), is(idCLienteTwo));
	}

}
