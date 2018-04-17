void setup(){
size(500, 500);
background(20, 0, 30);
}
int ybird = 250;
int xbird = 250;
int rectx = 300;

void draw(){
  
background(0, 40, 500);
ybird+=3;
double gravity = 0.5;
double birdYVelocity = 0;
fill(100, 0, 0);
ellipse(xbird, ybird, 50, 50); 
if(mousePressed == true){
ybird-=15;
}
rectx-=3;
fill(0, 20, 0);
rect(rectx, 300, 50, 200);
rect(rectx, 0, 50, height);
if(rectx == 0){
rectx = 600;
rectx-=30;
float height = random(200);
rect(rectx, 0, 50, height);
}
rect(rectx, 0, 50, height);
intersects(xbird, ybird, rectx, rectx, rectx );
}
boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
System.out.println("minus 1");
return false;
}