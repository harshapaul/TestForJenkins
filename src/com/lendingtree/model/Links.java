package com.lendingtree.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @purpose : model class for links in OfferContainer and ReviewContainer
 * @author : ankit
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Links")
public class Links implements Parcelable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty(value = "Rel")
	private String Rel;
	
	@JsonProperty(value = "Href")
	private String Href;

	public String getRel() {
		return Rel;
	}

	public void setRel(String rel) {
		Rel = rel;
	}

	public String getHref() {
		return Href;
	}

	public void setHref(String href) {
		Href = href;
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
