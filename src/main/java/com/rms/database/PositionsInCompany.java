package com.rms.database;

public enum PositionsInCompany {
	
	TRAINEE("Trainee"),
	TRAINER("Trainer"),
	CONSULTANT("Consultant"),
	HR("HR"),
	RECRUITER("Recruiter"),
	ADMIN("Admin"),
	BOSSMAN("Bossman");
	
	private String positionInCompany;

	private PositionsInCompany(String positionInCompany) {
		this.positionInCompany = positionInCompany;
	}

	public String getPositionInCompany() {
		return positionInCompany;
	}
	
	
	
}
