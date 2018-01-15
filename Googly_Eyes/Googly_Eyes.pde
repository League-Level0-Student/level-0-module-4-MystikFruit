int X=mouseX;
int Y=mouseY;
void setup(){
size(800, 500);
}

void draw(){
background(215, 215, 215);
fill(255, 255, 255);
ellipse(280, 200, 150, 150);
ellipse(520, 200, 150, 150);
fill(0, 0, 0);
ellipse(X, Y, 50, 50);
//ellipse(mouseX+240, mouseY, 50, 50);
println("X: " + mouseX + " Y: " + mouseY);
if(mouseX<230){
X=230;
}
else if(mouseX>329){
X=329; 
}
else{
X=mouseX;
}
if(mouseY<149){
Y=149;
}
else if(mouseY>249){
Y=249;
}
else{
Y=mouseY;
}
}