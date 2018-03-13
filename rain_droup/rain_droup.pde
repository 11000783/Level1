import ddf.minim.*;         
Minim minim;        
  AudioSample sound;

void setup(){
  minim = new Minim (this);    
  sound = minim.loadSample("ding.wav", 128);

size(500, 500);
background(51);
}
int y = 0;
int x = 0;
int score = 0;
void draw(){
 background(51);
  y+=5;
ellipse(x, y, 20, 20);  
fill( 00, 200, 200);      
stroke( 220, 6, 300);
if (y == 500){
 sound.trigger();
  y = 0;
x= (int) random(500);
}
rect(mouseX, 440, 60, 60);
checkCatch(x);
}

void checkCatch(int x){
if (x > mouseX && x < mouseX+60 && y == 440){
      score++;
println("Your score is now: " + score);
} 
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
}