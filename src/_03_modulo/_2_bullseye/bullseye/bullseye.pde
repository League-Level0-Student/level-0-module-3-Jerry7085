
void setup() {
 
  // set the size of your sketch
  size(600,600);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i = 300; i > 6; i-=50) {
      if(i % 100 == 0){
        fill(#F70202);
    
      }
      else{
     fill(1);
      }
      ellipse(300,300,i,i);
      
      
    }
    
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
