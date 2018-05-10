import ddf.minim.*;
Minim minim;
AudioPlayer sound;
void setup() {
  minim = new Minim(this);
  sound = minim.loadFile("Beep.mp3");
size(1000,1000);
fill(#FAD723);
ellipse(500,500,500,500);
fill(#FF0000);
ellipse(500,500,450,450);
fill(#FFFB81);
ellipse(500,500,400,400);
}
void draw() {
  PImage curly = loadImage("curly.gif");
  curly.resize(50,50);
  if(mousePressed) {
    //sound.play();
    image(curly, mouseX, mouseY);
  }
}