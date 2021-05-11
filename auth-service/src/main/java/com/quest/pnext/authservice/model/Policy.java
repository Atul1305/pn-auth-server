package com.quest.pnext.authservice.model;

import java.util.List;

public class Policy {
	
	private String version;
	private List<Statement> statements;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public List<Statement> getStatements() {
		return statements;
	}
	public void setStatements(List<Statement> statements) {
		this.statements = statements;
	}

}
