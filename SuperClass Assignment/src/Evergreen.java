
public class Evergreen extends Tree{
	
	String location;
	
		public Evergreen(){
			
			super("green");
		}
		
		public String getLeafcolor() {
			return leafcolor;
		}
		
		@Override
		public void setLeafcolor(String color) {
			leafcolor = color;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
}
