void setup(){
size(500,500);
background(0);
}
void draw(){
  //for(int i =0; i<501; i+=10){
fill(255);
//ellipse(i, i, 30, 30);
//}
//float x = random(500);
//float y = random(500);
float x = getWormX(20);
float y = getWormY(20);
ellipse(x, y, 30, 30);
float x2 = getWormX(500);
float y2 = getWormY(500);
fill(255);
ellipse(x2, y2, 30, 30); 
makeMagical();
}
float random(int maxValue) {
float awnser = random(0, maxValue);
return awnser;
}
float frequency = .005;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}