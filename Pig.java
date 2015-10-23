class Pig implements Animal {
	private String mySound;
	private String myType;
	public Pig(String type, String sound){
		mySound=sound;
		myType=type;
	}
	public Pig(){
		mySound="unknown";
		myType="unknown";
	}
	public String getSound(){
		return mySound;
	}
	public String getType(){
		return myType;
	}
}