package com.ealves.repositories;

import com.ealves.model.CurrentAccount;

public abstract interface IAccountRepository {

	public CurrentAccount searchAccount(Integer id);

	public boolean transferValue(int origemAccountId, double amount, int destinyAccountId);

}
