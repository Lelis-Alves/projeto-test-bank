package com.ealves.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ealves.business.MoneyTransfer;
import com.ealves.model.CurrentAccount;

/**
 * Teste básico da transferência de um valor da conta de um cliente para outro,
 * estando ambos os clientes ativos e havendo saldo suficiente para tal
 * transferência ocorrer com sucesso.
 * 
 * @author Elias Alves
 * @date 20 05 2020
 */
public class ManagerAccountTest {

	public static MoneyTransfer getAccount;

	@Test
	public void testTransfereValor() {

		// criando alguns clientes
		int idClienteOne = 1;
		int idClienteTwo = 2;

		/* ========== Iniciando Cenário de Testes Para as contas ========== */

		// criando contas
		CurrentAccount contOne = new CurrentAccount(idClienteOne, 200, true);
		CurrentAccount contTwo = new CurrentAccount(idClienteTwo, 0, true);

		// inserindo os clientes criados na lista de clientes do banco
		List<CurrentAccount> accountBank = new ArrayList<CurrentAccount>();
		accountBank.add(contOne);
		accountBank.add(contTwo);

		getAccount = new MoneyTransfer(accountBank);

		/* ========== Execução ========== */
		boolean sucess = getAccount.transferValue(idClienteOne, 100, idClienteTwo);

		/* ========== Verificações ========== */
		assertTrue(sucess);
		assertThat(contTwo.getBalance(), is(100.0));
		assertThat(contOne.getBalance(), is(100.0));

	}

}
