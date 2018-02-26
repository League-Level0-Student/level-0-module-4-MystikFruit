int X=mouseX;
int Y=mouseY;
int X2=mouseX;
int Y2=mouseY;
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
fill(0, 0, 0);
ellipse(X+240, Y, 50, 50);
if(mouseX<471){
X2=471;
}
else if(mouseX>570){
X2=570;
}
else{
X2=mouseX;
}
if(mouseY<149){
Y2=149;
}
else if(mouseY>249){
Y2=249;
}
else{
Y2=mouseY;
}
}