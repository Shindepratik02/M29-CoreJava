package org.tnsif.hierarchical;

public class Tiramisu extends Android {
	private int versionName;
	private String modelName;
	public int getVersionName() {
		return versionName;
	}
	public void setVersionName(int versionName) {
		this.versionName = versionName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Tiramisu() {
		System.out.println("Default constructor for child class 2");
		// TODO Auto-generated constructor stub
	}
	public Tiramisu(int versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "Tiramisu [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
	
	
	
	
}
