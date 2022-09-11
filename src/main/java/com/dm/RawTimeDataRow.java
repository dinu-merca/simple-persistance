package com.dm;

public class RawTimeDataRow
{
	private String id;
	private int stepNum;
	private String correlationId1;
	private String correlationId2;
	private String correlationId3;
	private long timestamp;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getStepNum() {
		return stepNum;
	}

	public void setStepNum(int stepNum) {
		this.stepNum = stepNum;
	}

	public String getCorrelationId1() {
		return correlationId1;
	}

	public void setCorrelationId1(String correlationId1) {
		this.correlationId1 = correlationId1;
	}

	public String getCorrelationId2() {
		return correlationId2;
	}

	public void setCorrelationId2(String correlationId2) {
		this.correlationId2 = correlationId2;
	}

	public String getCorrelationId3() {
		return correlationId3;
	}

	public void setCorrelationId3(String correlationId3) {
		this.correlationId3 = correlationId3;
	}

	public long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String toSeparatedString(String separator) {
		StringBuffer sb = new StringBuffer();
		sb.append(id).append("||");
		sb.append(stepNum).append("||");
		sb.append(correlationId1).append("||");
		sb.append(correlationId2).append("||");
		sb.append(correlationId3).append("||");
		sb.append(timestamp);
		
		return sb.toString();
	}
}
