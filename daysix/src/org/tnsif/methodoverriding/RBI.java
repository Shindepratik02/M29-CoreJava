package org.tnsif.methodoverriding;

public class RBI {
	public float interestrate() {
		return 8.5f;
	}
	
	class HDFC extends RBI{
		
		public float interestrate() {
			System.out.println(super.interestrate());
			
			return 11.2f;
		}
		
	}

}
