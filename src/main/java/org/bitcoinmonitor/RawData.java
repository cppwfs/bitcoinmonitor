package org.bitcoinmonitor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RawData {
	String bid;
	String last;

	public String getAmount(){
		return bid;
	}
	public void setAmount(String amount){
		bid = amount;
	}
	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	@Override
	public String toString() {
		return "RawData [bid=" + bid + ", last=" + last + "]";
	}


}
