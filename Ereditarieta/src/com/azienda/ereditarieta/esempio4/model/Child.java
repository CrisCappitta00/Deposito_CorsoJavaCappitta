package com.azienda.ereditarieta.esempio4.model;

public class Child extends Parent {
     private String stringa3;
     private String stringa4;
     //override
     @Override
	 public String getStringa3() {
		 return stringa3;
	 }
     @Override //si usa solo nei metodi da sovrascrivere che ereditiamo dal padre
	 public void setStringa3(String stringa3) {
		 this.stringa3 = stringa3;
	 }
     
	 public String getStringa4() {
		 return stringa4;
	 }
	 public void setStringa4(String stringa4) {
		 this.stringa4 = stringa4;
	 }
     public String getParentStringa3() {
    	 return super.getStringa3();
     }
     public void setParentStringa3(String stringa) {
    	 super.setStringa3(stringa);
     }
}
