/**
 * 
 */
package OMTpkg.advertiser;


import OMTpkg.user.user;


/**
 *
 *
 */
public class advertiser extends user {
	public int advertiserID;
	public String companyName;
	public String companyAddress;
	

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phone
	 * @param nIC_PassportNO
	 * @param sex
	 * @param password
	 * @param membershiptype
	 * @param advertiserID
	 * @param companyName
	 * @param companyAddress
	 */
	public advertiser(int id, String name, String email, String phone, String nIC_PassportNO, String sex,
			String password, String membershiptype, int advertiserID, String companyName, String companyAddress) {
		super(id, name, email, phone, nIC_PassportNO, sex, password, membershiptype);
		this.advertiserID = advertiserID;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}


	/**
	 * @return the advertiserID
	 */
	public int getAdvertiserID() {
		return advertiserID;
	}


	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}


	/**
	 * @return the companyAddress
	 */
	public String getCompanyAddress() {
		return companyAddress;
	}


	/**
	 * @param advertiserID the advertiserID to set
	 */
	public void setAdvertiserID(int advertiserID) {
		this.advertiserID = advertiserID;
	}


	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	/**
	 * @param companyAddress the companyAddress to set
	 */
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}





	

}
