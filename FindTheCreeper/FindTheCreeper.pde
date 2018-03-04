int CX=700;
int CY=206;
PImage creeper;
PImage tree;
void setup(){
size(970, 545);
tree = loadImage("tree cheese.jpg");
background(tree);
creeper = loadImage("seal.jpg");
creeper.resize(8,8);
}

void draw(){
background(tree);
image(creeper, CX, CY);
if(mousePressed){
if(mouseX<709&&mouseX>699&&mouseY<219&&mouseY>206){
fill(42, 198, 22);
ellipse(mouseX, mouseY, 50, 50);
fill(229, 0, 0);
textSize(20);
text("You have found the creeper! Yay!", 285, 226);
}else{
fill(229, 0, 0);
ellipse(mouseX, mouseY, 50, 50);
}
}
println("X: " + mouseX + " Y: " + mouseY);
}