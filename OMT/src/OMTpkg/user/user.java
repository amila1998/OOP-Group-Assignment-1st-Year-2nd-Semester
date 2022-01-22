/**
 * 
 */
package OMTpkg.user;



/**
 * 
 *
 */
public class user {
	protected int id;
    protected String name;
    protected String email;
    protected String phone;
    protected String NIC_PassportNO;
    protected String sex;
    protected String password;
    protected String membershiptype;
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phone
	 * @param nIC_PassportNO
	 * @param sex
	 * @param password
	 * @param membershiptype
	 */
	public user(int id, String name, String email, String phone, String nIC_PassportNO, String sex, String password,
			String membershiptype) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.NIC_PassportNO = nIC_PassportNO;
		this.sex = sex;
		this.password = password;
		this.membershiptype = membershiptype;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @return the nIC_PassportNO
	 */
	public String getNIC_PassportNO() {
		return NIC_PassportNO;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return the membershiptype
	 */
	public String getMembershiptype() {
		return membershiptype;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @param nIC_PassportNO the nIC_PassportNO to set
	 */
	public void setNIC_PassportNO(String nIC_PassportNO) {
		NIC_PassportNO = nIC_PassportNO;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param membershiptype the membershiptype to set
	 */
	public void setMembershiptype(String membershiptype) {
		this.membershiptype = membershiptype;
	}
	
	

}
