/**
 * 
 */
package OMTpkg.contentCreater;

import OMTpkg.user.*;

/**
 * 
 *
 */
public class contentCreater extends user{
	public int contentCreaterID;
	public String companyName;
	public String companyLocation;
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phone
	 * @param nIC_PassportNO
	 * @param sex
	 * @param password
	 * @param membershiptype
	 * @param contentCreaterID
	 * @param companyName
	 * @param companyLocation
	 */
	public contentCreater(int id, String name, String email, String phone, String nIC_PassportNO, String sex,
			String password, String membershiptype, int contentCreaterID, String companyName, String companyLocation) {
		super(id, name, email, phone, nIC_PassportNO, sex, password, membershiptype);
		this.contentCreaterID = contentCreaterID;
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}
	/**
	 * @return the contentCreaterID
	 */
	public int getContentCreaterID() {
		return contentCreaterID;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @return the companyLocation
	 */
	public String getCompanyLocation() {
		return companyLocation;
	}
	/**
	 * @param contentCreaterID the contentCreaterID to set
	 */
	public void setContentCreaterID(int contentCreaterID) {
		this.contentCreaterID = contentCreaterID;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @param companyLocation the companyLocation to set
	 */
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	
	
	
	
}
