class NamedCow extends Cow{
	private String myName;
	public NamedCow(String type, String name, String sound){
		myName=name;
		mySound=sound;
		myType=type;
	}
	public String getName(){
		return myName;
	}
}