package com.megala.bankapp.factory;

import org.springframework.stereotype.Component;

import com.megala.bankapp.dao.AccountDAO;
import com.megala.bankapp.dao.BeneficiaryDAO;
import com.megala.bankapp.dao.BranchDAO;
import com.megala.bankapp.dao.CreditCardDAO;
import com.megala.bankapp.dao.CreditCardTransactionDAO;
import com.megala.bankapp.dao.CustomerDAO;
import com.megala.bankapp.dao.LoanDAO;
import com.megala.bankapp.dao.TransactionDAO;
import com.megala.bankapp.dao.impl.AccountDAOImpl;
import com.megala.bankapp.dao.impl.BeneficiaryDAOImpl;
import com.megala.bankapp.dao.impl.BranchDAOImpl;
import com.megala.bankapp.dao.impl.CreditCardDAOImpl;
import com.megala.bankapp.dao.impl.CreditCardTransactionDAOImpl;
import com.megala.bankapp.dao.impl.CustomerDAOImpl;
import com.megala.bankapp.dao.impl.LoanDAOImpl;
import com.megala.bankapp.dao.impl.TransactionDAOImpl;

@Component
public class DAOFactory {
	// private DAOFactory() {
	// throw new IllegalStateException("Utility class");
	// }
	//
	public static BranchDAO getBranchDAO() {

		return new BranchDAOImpl();
	}

	public static CustomerDAO getCustomerDAO() {

		return new CustomerDAOImpl();
	}

	public static AccountDAO getAccountDAO() {
		return new AccountDAOImpl();
	}

	public static LoanDAO getLoanDAO() {
		return new LoanDAOImpl();

	}

	public static CreditCardDAO getCreditCardDAO() {
		return new CreditCardDAOImpl();

	}

	public static BeneficiaryDAO getBeneficiaryDAO() {
		return new BeneficiaryDAOImpl();

	}

	public static TransactionDAO getTransactionDAO() {
		return new TransactionDAOImpl();

	}

	public static CreditCardTransactionDAO getCreditCardTransactionDAO() {

		return new CreditCardTransactionDAOImpl();

	}
}
