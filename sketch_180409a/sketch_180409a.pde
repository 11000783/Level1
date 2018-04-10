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
rect(rectx, 20, 50, 600);
if(rectx == 0){
rectx = 600;
rectx-=30;
}

}