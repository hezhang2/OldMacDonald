class Chick implements Animal {
	private String mySound, mySoundB;
	private String myType;
	private boolean two;
	public Chick(String type, String sound){
		mySound=sound;
		myType=type;
		two=false;
	}
	public Chick(String type, String soundA, String soundB){
		mySound=soundA;
		mySoundB=soundB;
		myType=type;
		two=true;
	}
	public Chick(){
		mySound="unknown";
		myType="unknown";
	}
	public String getSound(){
		if(two==true && (int)(Math.random()*2)==1){
			return mySoundB;
		}
		return mySound;
	}
	public String getType(){
		return myType;
	}
}