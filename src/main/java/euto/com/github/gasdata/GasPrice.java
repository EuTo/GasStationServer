package euto.com.github.gasdata;

import java.time.LocalDateTime;

public class GasPrice {
	private final String id;
	private final float price;
	private final LocalDateTime timeStamp;

	public GasPrice(final String id, final float price, final int date, final int time)
	{
		this.id = id;
		this.price = price;
		this.timeStamp = LocalDateTime.of(date / 10000, (date / 100) % 100, date % 100,time /  100, time % 100);

	}
	
	public String getId()
	{
		return id;
	}
	
	public float getPrice()
	{
		return price;
	}

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
}
