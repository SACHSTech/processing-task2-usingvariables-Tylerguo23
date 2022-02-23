import processing.core.PApplet;

/*
This program draws a simple house
@author: T. Guo
*/

public class Sketch extends PApplet {
  	//declare width and height variables (800 width 600 height)
  int intWidth = 800;
  int intHeight = 600;

  public void settings() {
    //set screen size
    size(intWidth, intHeight);
  }

  public void setup() {
    //set background to light blue
    background(102, 217, 255);
  }

  public void draw() {
    //house base
    fill(255,255,204);
    rect(intWidth/4, intHeight/2, intWidth/2, intHeight/2);
    triangle(intWidth/4, intHeight/2, intWidth/2, intHeight/3, intWidth/4*3, intHeight/2);
    
    //grass
    fill(51, 204, 51);
    rect(0, intHeight*58/60, intWidth, intHeight/30);
    
    //door
    fill(255, 204, 102);
    rect(intWidth*36/80, intHeight*45/60, intWidth/10, intHeight*13/60);

    //windows
    fill (51, 204, 255);
    rect(intWidth*25/80, intHeight*35/60, intWidth/16, intHeight/12);
    rect(intWidth*5/8, intHeight*35/60, intWidth/16, intHeight/12);
    
    //yellow (sun and doorknob)
    fill(255, 255, 0);
    ellipse(intWidth/8, intHeight/6, intWidth/8, intHeight/6);
    ellipse(intWidth*42/80, intHeight*52/60, intWidth/80, intHeight/60);
    
    //window lines
    line(intWidth*275/800, intHeight*35/60, intWidth*275/800, intHeight*2/3);
    line(intWidth*25/80, intHeight*375/600, intWidth*3/8, intHeight*375/600);
    line(intWidth*525/800, intHeight*35/60, intWidth*525/800, intHeight*2/3);
    line(intWidth*5/8, intHeight*375/600, intWidth*55/80, intHeight*375/600);

    //flower stems
    stroke(51, 153, 51);
    strokeWeight(intWidth/200);
    line(intWidth*25/80, intHeight*58/60, intWidth*25/80, intHeight*52/60);
    line(intWidth*325/800, intHeight*58/60, intWidth*325/800, intHeight*52/60);
    line(intWidth*475/800, intHeight*58/60, intWidth*475/800, intHeight*52/60);
    line(intWidth*55/80, intHeight*58/60, intWidth*55/80, intHeight*52/60);
    
    //flowers
    stroke(0);
    strokeWeight(0);

    fill(255, 153, 0);
    ellipse(intWidth*25/80, intHeight*52/60, intWidth/16, intHeight/30);
    ellipse(intWidth*25/80, intHeight*52/60, intWidth/40, intHeight/12);
    
    ellipse(intWidth*55/80, intHeight*52/60, intWidth/16, intHeight/30);
    ellipse(intWidth*55/80, intHeight*52/60, intWidth/40, intHeight/12);

    fill(255, 102, 255);
    ellipse(intWidth*325/800, intHeight*52/60, intWidth/16, intHeight/30);
    ellipse(intWidth*325/800, intHeight*52/60, intWidth/40, intHeight/12);

    ellipse(intWidth*475/800, intHeight*52/60, intWidth/16, intHeight/30);
    ellipse(intWidth*475/800, intHeight*52/60, intWidth/40, intHeight/12);


    //flower centers
    strokeWeight(1);
    fill(255, 255, 0);
    ellipse(intWidth*25/80, intHeight*52/60, intWidth/40, intHeight/30);
    ellipse(intWidth*325/800, intHeight*52/60, intWidth/40, intHeight/30);
    ellipse(intWidth*475/800, intHeight*52/60, intWidth/40, intHeight/30);
    ellipse(intWidth*55/80, intHeight*52/60, intWidth/40, intHeight/30);

  }
  
}