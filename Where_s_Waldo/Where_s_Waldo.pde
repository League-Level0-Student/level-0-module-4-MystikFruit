import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample woohoo;
AudioSample doh;
void setup() {
      PImage waldo = loadImage("waldo.jpg");
      size(960,671);
      image(waldo, 0, 0);
      woohoo = minim.loadSample("homer-woohoo.wav");
      doh = minim.loadSample("homer-doh.wav");
}

void draw() {
      // 6. Use this print statement to find out the coordinates of Waldo
   println("X: " + mouseX + " Y: " + mouseY); 

      // 7. If the mouse is on Waldo, print “Waldo found!”
      if(mousePressed){
     if(mouseX<482&&mouseX>474&&mouseY>129&&mouseY<152){
      playWoohoo();
      }
     if(mouseX<474&&mouseX>482&&mouseY>152&&mouseY<129){
      playDoh();
      }
      }
      // 8. If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}
void playWoohoo() {
    woohoo.stop();
woohoo.trigger();
}

void playDoh() {
    doh.stop();
    doh.trigger();
}