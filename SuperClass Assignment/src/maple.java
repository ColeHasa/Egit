
public class maple extends Tree{ //subclass

	String location; //initializing variable
	
		public maple(){        
			super("Orange");
		}								  // get set methods
		public String getLeafcolor() {
			return leafcolor;
		}
		
		@Override
		public void setLeafcolor(String color) {	//override super statement 
			leafcolor = color;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
}
