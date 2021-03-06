/**
 * 
 */
package OMTpkg.advertistments;

/**
 *
 *
 */
public class advertistment {
	protected int ad_id;
	protected int UID;
	protected String ad_name;
	protected String category;
	protected String period;
	protected String filename;
	protected String thumbnail;
	/**
	 * @param ad_id
	 * @param uID
	 * @param ad_name
	 * @param category
	 * @param period
	 * @param filename
	 * @param thumbnail
	 */
	public advertistment(int ad_id, int uID, String ad_name, String category, String period, String filename,
			String thumbnail) {
		super();
		this.ad_id = ad_id;
		this.UID = uID;
		this.ad_name = ad_name;
		this.category = category;
		this.period = period;
		this.filename = filename;
		this.thumbnail = thumbnail;
	}
	/**
	 * @return the ad_id
	 */
	public int getAd_id() {
		return ad_id;
	}
	/**
	 * @return the uID
	 */
	public int getUID() {
		return UID;
	}
	/**
	 * @return the ad_name
	 */
	public String getAd_name() {
		return ad_name;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @return the period
	 */
	public String getPeriod() {
		return period;
	}
	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}
	/**
	 * @return the thumbnail
	 */
	public String getThumbnail() {
		return thumbnail;
	}
	/**
	 * @param ad_id the ad_id to set
	 */
	public void setAd_id(int ad_id) {
		this.ad_id = ad_id;
	}
	/**
	 * @param uID the uID to set
	 */
	public void setUID(int uID) {
		UID = uID;
	}
	/**
	 * @param ad_name the ad_name to set
	 */
	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @param period the period to set
	 */
	public void setPeriod(String period) {
		this.period = period;
	}
	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/**
	 * @param thumbnail the thumbnail to set
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	

}
