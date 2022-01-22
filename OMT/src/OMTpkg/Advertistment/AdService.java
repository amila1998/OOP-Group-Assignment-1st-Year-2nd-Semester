package OMTpkg.Advertistment;

import java.util.List;



public interface AdService {

	public boolean addAd(AdModel ad);
	public List<AdModel>allAds();
	public boolean deleteAd(int id);
	public boolean updateAd(AdModel ad);
	public AdModel getAdById(int id);
}
