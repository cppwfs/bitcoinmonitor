package org.bitcoinmonitor;


public class RawData {
	String bid;
	String last;

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
