void setup(){
size(500,500);
background(51);
}
int y= 250;
int x= 300;
int xballspeed = 5;
int yballspeed = 5;
int recty= 400;
int rectx = 300;
int rectwidth = 80;
int rectheight = 20;
void draw(){
  background(51);
 ellipse(x, y, 20, 20);
fill(00, 200, 200);
x+=xballspeed;
y+=yballspeed;
if(x >= width){
xballspeed = -xballspeed;
} 
else if(x <= 0){
xballspeed = -xballspeed;
}
if (y >= height){
yballspeed = -yballspeed;
}
else if(y <= 0){
yballspeed = -yballspeed;
}
rect(mouseX, recty, rectwidth, rectheight);
intersects(x, y, mouseX, recty, rectwidth);
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength && ballY>paddleY - 0.5rectheight)
return true;
else 
return false;
}