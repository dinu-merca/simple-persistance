package com.dm;

import java.util.ArrayList;

public class SimplePersistence {
	
	private ArrayList<RawTimeDataRow> rawTimeData;
	
	public SimplePersistence() {
		rawTimeData = new ArrayList<RawTimeDataRow>();
	}
	
	public void addRawTimeDataRow(RawTimeDataRow rawTimeDataRow) {
		rawTimeData.add(rawTimeDataRow);
	}

}
