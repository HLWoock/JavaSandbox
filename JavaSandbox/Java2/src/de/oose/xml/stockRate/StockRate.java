package de.oose.xml.stockRate;

public class StockRate {
	private String name;
	private String last;
	private String close;
	private String high;
	private String low;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getClose() {
		return close;
	}
	public void setClose(String close) {
		this.close = close;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	@Override
	public String toString() {
		return "StockRate [name=" + name + ", last=" + last + ", close="
				+ close + ", high=" + high + ", low=" + low + "]";
	}
	
	
}
