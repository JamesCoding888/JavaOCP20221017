package entity.composite_pk;

import java.io.Serializable;
import java.util.Objects;
/*
	Composite Primary key:
	
		1) 類別必須 public 且 實作 Serilization
		2) 必須有不帶參數建構子
		3) 須移除 setter() 以確保物件生成後，無法更改 (immutable)，已滿足 PK 欄位的特性
		4) Priamry Key 欄位值於 DB 不可重複，需 Override equals() and hashCode()
 
*/
public class AccountId implements Serializable {

	private String accountNumber;
	
	private String accountType;
	
	public AccountId() {
		
	}
	
	
	public AccountId(String accountNumber, String accountType) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}
	
	// No setters to guarantee immutable
	/*
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
	*/
	

	// Primary key is unable to duplicate, therefore, we shall override equals() and hashCode() methods
	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, accountType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountId other = (AccountId) obj;
		return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(accountType, other.accountType);
	}
}
