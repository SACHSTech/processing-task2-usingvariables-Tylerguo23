import processing.core.PApplet;

/*
This program draws a simple house
@author: T. Guo
*/

public class Sketch extends PApplet {

  public void settings() {
    //set screen size
    size(800, 600);
  }

  public void setup() {
    //set background to light blue
    background(102, 217, 255);
  }

  public void draw() {
    //house base
    fill(255,255,204);
    rect(width / 4, height / 2, width / 2, height / 2);
    triangle(width / 4, height / 2, width / 2, height / 3, width / 4 * 3, height / 2);
    
    //grass
    fill(51, 204, 51);
    rect(0, height * 58 / 60, width, height / 30);
    
    //door
    fill(255, 204, 102);
    rect(width * 36 / 80, height * 45 / 60, width / 10, height * 13 / 60);

    //windows
    fill (51, 204, 255);
    rect(width * 25 / 80, height * 35 / 60, width / 16, height / 12);
    rect(width * 5 / 8, height * 35 / 60, width / 16, height / 12);
    
    //yellow (sun and doorknob)
    fill(255, 255, 0);
    ellipse(width / 8, height / 6, width / 8, height / 6);
    ellipse(width * 42 / 80, height * 52 / 60, width / 80, height / 60);
    
    //window lines
    line(width * 275 / 800, height * 35 / 60, width * 275 / 800, height * 2 / 3);
    line(width * 25 / 80, height * 375 / 600, width * 3 / 8, height * 375 / 600);
    line(width * 525 / 800, height * 35 / 60, width * 525 / 800, height * 2 / 3);
    line(width * 5 / 8, height * 375 / 600, width * 55 / 80, height * 375 / 600);

    //flower stems
    stroke(51, 153, 51);
    strokeWeight(width / 200);
    line(width * 25 / 80, height * 58 / 60, width * 25 / 80, height * 52 / 60);
    line(width * 325 / 800, height * 58 / 60, width * 325 / 800, height * 52 / 60);
    line(width * 475 / 800, height * 58 / 60, width * 475 / 800, height * 52 / 60);
    line(width * 55 / 80, height * 58 / 60, width * 55 / 80, height * 52 / 60);
    
     //flowers
    stroke(0);
    strokeWeight(0);

    fill(255, 153, 0);
    ellipse(width * 25 / 80, height * 52 / 60, width / 16, height / 30);
    ellipse(width * 25 / 80, height * 52 / 60, width / 40, height / 12);
    
    ellipse(width * 55 / 80, height * 52 / 60, width / 16, height / 30);
    ellipse(width * 55 / 80, height * 52 / 60, width / 40, height / 12);

    fill(255, 102, 255);
    ellipse(width * 325 / 800, height * 52 / 60, width / 16, height / 30);
    ellipse(width * 325 / 800, height * 52 / 60, width / 40, height / 12);

    ellipse(width * 475 / 800, height * 52 / 60, width / 16, height / 30);
    ellipse(width * 475 / 800, height * 52 / 60, width / 40, height / 12);


    //flower centers
    strokeWeight(1);
    fill(255, 255, 0);
    ellipse(width * 25 / 80, height * 52 / 60, width / 40, height / 30);
    ellipse(width * 325 / 800, height * 52 / 60, width / 40, height / 30);
    ellipse(width * 475 / 800, height * 52 / 60, width / 40, height / 30);
    ellipse(width * 55 / 80, height * 52 / 60, width / 40, height / 30);

  }
  
}