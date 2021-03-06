/**
 * 
 */
package OMTpkg.videos;

/**
 *
 *
 */
public class video {
	protected int videoID;
	protected String title;
	protected String description;
	protected String ageRestriction;
	protected String category;
	protected String UID;
	
	public video(int videoID, String title, String description, String ageRestriction,String category,String UID) {
		
		this.videoID = videoID;
		this.title = title;
		this.description = description;
		this.ageRestriction = ageRestriction;
		this.category = category;
		this.UID=UID;
	}

	/**
	 * @return the videoID
	 */
	public int getVideoID() {
		return videoID;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the ageRestriction
	 */
	public String getAgeRestriction() {
		return ageRestriction;
	}
	
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param videoID the videoID to set
	 */
	public void setVideoID(int videoID) {
		this.videoID = videoID;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param ageRestriction the ageRestriction to set
	 */
	public void setAgeRestriction(String ageRestriction) {
		this.ageRestriction = ageRestriction;
		
		
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the uID
	 */
	public String getUID() {
		return UID;
	}

	/**
	 * @param uID the uID to set
	 */
	public void setUID(String uID) {
		UID = uID;
	}
	
	
	
	
		

	
	



}
