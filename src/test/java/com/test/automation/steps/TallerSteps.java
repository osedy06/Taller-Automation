package com.test.automation.steps;

import com.test.automation.pages.TallerPageObject;

import net.thucydides.core.annotations.Step;

public class TallerSteps {
	
	TallerPageObject tallerPageObject ;
	
	@Step
	public void startPage() {
		tallerPageObject.open();
	}
	
	public void enterTheUserAndPassword(String user, String password) {
		tallerPageObject.insertUser(user);
	}
	
	public void pressTheLoginButton() {
		
	}
	
	public void validateTheSuccesfulLogin() {
		
	}

	
}
