package com.ealves.business;

import java.util.List;

import com.ealves.model.CurrentAccount;
import com.ealves.repositories.IAccountRepository;

public class MoneyTransfer implements IAccountRepository {

	private List<CurrentAccount> accountBanks;

	boolean sucess = false;

	public MoneyTransfer(List<CurrentAccount> accountBanks) {
		this.accountBanks = accountBanks;
	}

	public CurrentAccount searchAccount(Integer idAccount) {

		for (CurrentAccount currentAccount : accountBanks) {
			if (currentAccount.getId() == idAccount)
				return currentAccount;
		}
		return null;

	}

	public boolean transferValue(int origemAccountId, double value, int destinyAccountId) {
		boolean success = false;

		CurrentAccount origemAccount = searchAccount(origemAccountId);
		CurrentAccount destinyAccount = searchAccount(destinyAccountId);

		if (origemAccount.getBalance() >= value) {
			destinyAccount.setBalance(destinyAccount.getBalance() + value);
			origemAccount.setBalance(origemAccount.getBalance() - value);
			success = true;
		}

		return success;
	}

}
