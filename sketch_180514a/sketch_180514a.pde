void setup(){
size(400, 400);
background(100, 100, 100);
float x = 0;
float y = 100;
float speed = 1;
}
String s = "YOu lost";
int frogx = 200;
int frogy = 375;
Car car1 = new Car(30, 200, 100, 50, 10);
Car car2 = new Car(300, 80, 100, 50, 10);
Car car3 = new Car(100, 100, 100, 50, 10);
Car car4 = new Car(70, 160, 100, 50, 10);
void draw(){
  background(100);
  fill(20, 900, 100);
car1.display();
car2.display();
car3.display();
car4.display();
car1.moveLeft();
car2.moveLeft();
car3.moveLeft();
car4.moveLeft();
intersects(car1);
intersects(car2);
intersects(car3);
intersects(car4);

Boolean check = canvasCheck(frogx, frogy);
ellipse(frogx, frogy, 30, 30);
if(check==false){
frogx = 200;
frogy = 375;
}
if(frogy == 20){
text( "You won", 200 , 200 ); 
  textSize(100); 
}

}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
     frogy-=15; //Frog Y position goes up
      }
      else if(keyCode == DOWN)
      {
        frogy+=15;//Frog Y position goes down 
      }
      else if(keyCode == RIGHT)
      {
      frogx+=15; //Frog X position goes right
      }
      else if(keyCode == LEFT)
      {
      frogx-=15;  //Frog X position goes left
      }
   }
}
Boolean canvasCheck(int frogx, int frogy){
if (frogx < 0){
return false;
}
else if(frogy < 0){
return false;
}
else if(frogx > 400){
return false;
}
else if(frogy > 400){
return false;
}
else{
return true;
}}
public class Car{
int carX;
int carY;
int carW;
int carH;
int carS;

public Car(int carX , int carY, int carW, int carH, int carS){
this.carX = carX;
this.carY = carY;
this.carW = carW;
this.carH = carH;
this.carS = carS;
}
public int getX(){
return(carX);
}
public int getY(){
return(carY);
}
public int getSize(){
return(carS);
}
public void moveLeft(){
carX+=-5;
if(carX+50<0){
carX=400;
}
}
void display() 
  {
    fill(0,255,0);
    rect(carX, carY, 30, 50);
  }
}
boolean intersects(Car car) {
if ((frogy > car.getY() && frogy < car.getY()+50) && (frogx > car.getX() && frogx < car.getX()+car.getSize())){
         frogx = 200;
         frogy = 375;
  return true;
   
}
    else   
        
      return false;
      } 
