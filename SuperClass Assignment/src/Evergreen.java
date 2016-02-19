
public class Evergreen extends Tree{ //subclass
	
	String location; //initializing variable
	
		public Evergreen(){
			
			super("green"); //telling the lass what the super gets
		}
		    //get set methods
		public String getLeafcolor() {
			return leafcolor;
		}
		
		@Override
		public void setLeafcolor(String color) {	//override statement for super
			leafcolor = color;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
}
