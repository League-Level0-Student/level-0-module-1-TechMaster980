void setup(){
  size(666, 666);
PImage lonk = loadImage("lonk.png");
image(lonk, 0, 0);  
  
}
void draw(){
  fill(mouseX+mouseY, mouseY, mouseX); 
ellipse(300, 250, 100, 100);
ellipse(520, 250, 100, 100); 

fill(0, 0, 0);
ellipse(300, 250, 20, 20);
 ellipse(520, 250, 20, 20);
}