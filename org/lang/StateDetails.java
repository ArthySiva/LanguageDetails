package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("SOUTH INDIA");

	}
	private void northIndia() {
		System.out.println("NORTH INDIA");
	}
	public static void main(String[] args) {
		StateDetails stDet = new StateDetails();
		LanguageInfo lnInf = new LanguageInfo();
		
		lnInf.tamilLanguage();
		lnInf.englishLanguage();
		lnInf.hindiLanguage();
		stDet.southIndia();
		stDet.northIndia();
	}
}
