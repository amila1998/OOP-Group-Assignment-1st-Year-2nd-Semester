package OMTpkg.payment;

public class Payment {

	protected int id;
	protected String cardname;
	protected String cardnumber;
	protected String amount;
	protected String year;
	protected String month;
	protected String cvc;
	
	
	
	public Payment(String cardname, String cardnumber, String amount, String year, String month, String cvc) {
		super();
		this.cardname = cardname;
		this.cardnumber = cardnumber;
		this.amount = amount;
		this.year = year;
		this.month = month;
		this.cvc = cvc;
	}



	public Payment(int id, String cardname, String cardnumber, String amount, String year, String month, String cvc) {
		super();
		this.id = id;
		this.cardname = cardname;
		this.cardnumber = cardnumber;
		this.amount = amount;
		this.year = year;
		this.month = month;
		this.cvc = cvc;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCardname() {
		return cardname;
	}



	public void setCardname(String cardname) {
		this.cardname = cardname;
	}



	public String getCardnumber() {
		return cardnumber;
	}



	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public String getMonth() {
		return month;
	}



	public void setMonth(String month) {
		this.month = month;
	}



	public String getCvc() {
		return cvc;
	}



	public void setCvc(String cvc) {
		this.cvc = cvc;
	}
	
	
	
	
	
	
}
