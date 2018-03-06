void setup(){
size(500, 500);
background(51);
}
int y = 0;
int x = 0;
void draw(){
 background(51);
  y+=5;
ellipse(100, y, 20, 20);  
fill( 00, 200, 200);      
stroke( 220, 6, 300);
if (y == 500){
  y = 0;
x= (int) random(500);
}
}