public class Flowers {
private String color;
int height;
private int numberOfPedals;

public Flowers(String flowerColor){
color = flowerColor; //variables that every class that ectends this one should default to
height = 3;
numberOfPedals = 12;


}
//getters and setters
public String getColor() {
return color;
}

public void setColor(String color) {
this.color = color;
}

public int getHeight() {
return height;
}

public void setHeight(int newHeight) {
height = newHeight;
}

public int getNumberOfPedals() {
return numberOfPedals;
}

public void setNumberOfPedals(int numberOfPedals) {
this.numberOfPedals = numberOfPedals;
}


}