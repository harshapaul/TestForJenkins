package com.lendingtree.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @purpose : model class for parsing response of reviews in LoanExpReviewActivity
 * @author : ankit
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Offers")
public class Data implements Parcelable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty(value = "UserNickname")
	private String UserNickname;
	
	@JsonProperty(value = "UserLocation")
	private String UserLocation;
	
	@JsonProperty(value = "ReviewText")
	private String ReviewText;
	
	@JsonProperty(value = "ReviewTitle")
	private String ReviewTitle;
	
	@JsonProperty(value = "CustomerServiceRating")
	private float CustomerServiceRating;

	public String getUserNickname() {
		return UserNickname;
	}

	public void setUserNickname(String userNickname) {
		UserNickname = userNickname;
	}

	public String getUserLocation() {
		return UserLocation;
	}

	public void setUserLocation(String userLocation) {
		UserLocation = userLocation;
	}

	public String getReviewText() {
		return ReviewText;
	}

	public void setReviewText(String reviewText) {
		ReviewText = reviewText;
	}

	public String getReviewTitle() {
		return ReviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		ReviewTitle = reviewTitle;
	}

	public float getCustomerServiceRating() {
		return CustomerServiceRating;
	}

	public void setCustomerServiceRating(float customerServiceRating) {
		CustomerServiceRating = customerServiceRating;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		
	}
	
	
}
