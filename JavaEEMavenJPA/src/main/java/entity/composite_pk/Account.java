package entity.composite_pk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(AccountId.class)
@Table(name = "Composite_ACCOUNT")
public class Account {
	
	@Id
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;
	
	@Id
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name = "ACCOUNT_NAME")
	private String accountName;
	
	public Account() {
		
	}
	
	public Account(String accountNumber, String accountType) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	
	
}
