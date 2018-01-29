PImage tail;
PImage donkey;
void setup(){
size(625, 742);
donkey = loadImage("donkey.jpg");
tail = loadImage("tail.png");
image(donkey, 0,0);
}
void draw(){
rect(0, 0, 30, 30);
if(mouseX<625&&mouseX>31&&mouseY>31&&mouseY<742){
  background(255, 255, 255, 255);
}else{
  image(donkey, 0,0);
}
if(mousePressed){
image(tail, mouseX-135, mouseY-35);
  }
}