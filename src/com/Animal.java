package com;

public enum Animal {
	
	Dog, Fox, Lion{
		
		public void info(){
			System.out.println("inside info method");
		}
		
	},Wolf;
	
	public void info() {
		System.out.println("inside outer enum");
	}
	
	public static void main(String[] args) {
		
		Animal a = Animal.Lion;
		Animal[] values = Animal.values();
		
		for(Animal value : values) {
			System.out.println(value);
			value.info();
		}
		
		
	}
	

}
