void setup(){
size(400, 400);
background(100, 100, 100);
}
int frogx = 200;
int frogy = 375;
void draw(){
background(100);
  fill(20, 900, 100);
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
