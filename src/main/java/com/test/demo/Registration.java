package com.test.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Registration {
	
	private String stateName;
	private int disNum;
	private String alpha;
	private int num;
	
	public Registration()
	{
		System.out.println("In no argument constructor of Registration class...");
	}
	
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getDisNum() {
		return disNum;
	}
	public void setDisNum(int disNum) {
		this.disNum = disNum;
	}
	public String getAlpha() {
		return alpha;
	}
	public void setAlpha(String alpha) {
		this.alpha = alpha;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public Registration(String stateName, int disNum, String alpha, int num) {
		super();
		this.stateName = stateName;
		this.disNum = disNum;
		this.alpha = alpha;
		this.num = num;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alpha == null) ? 0 : alpha.hashCode());
		result = prime * result + disNum;
		result = prime * result + num;
		result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		if (alpha == null) {
			if (other.alpha != null)
				return false;
		} else if (!alpha.equals(other.alpha))
			return false;
		if (disNum != other.disNum)
			return false;
		if (num != other.num)
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Registration [stateName=" + stateName + ", disNum=" + disNum + ", alpha=" + alpha + ", num=" + num
				+ "]";
	}
	
	

}
