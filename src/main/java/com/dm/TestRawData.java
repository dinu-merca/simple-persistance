package com.dm;

import java.util.Date;

public class TestRawData {
	
	public static void main(String[] args) {
		TestRawData app = new TestRawData();
		app.runSaveTest();
	}
	
	private void runSaveTest() {
		SimplePersistence simplePersistence = new SimplePersistence();
		
		for (int i = 0; i < 10; i++) {
			simplePersistence.addRawTimeDataRow(createRandomRawTimeDataRow());
		}
		
		simplePersistence.printRawData();
	}
	
	private RawTimeDataRow createRandomRawTimeDataRow() {
		RawTimeDataRow rawTimeDataRow = new RawTimeDataRow();
		rawTimeDataRow.setId(java.util.UUID.randomUUID().toString());
		rawTimeDataRow.setStepNum((int) (5 * Math.random()));
		rawTimeDataRow.setCorrelationId1(java.util.UUID.randomUUID().toString());
		rawTimeDataRow.setCorrelationId2(" ");
		rawTimeDataRow.setCorrelationId3(" ");
		rawTimeDataRow.setTimestamp((new Date()).getTime());
		
		return rawTimeDataRow;
	}

}
