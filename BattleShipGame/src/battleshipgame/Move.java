/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipgame;

/**
 *
 * @author Ahmed
 */
public class Move {
      private int xCoord;
  private int yCoord;
  private boolean hit;
  private boolean shipDestroy;
  private String shipType;
  
  public Move(int x, int y, boolean missORhit, boolean sD, String ship){
    xCoord=x;
    yCoord=y;
    hit=missORhit;
    shipDestroy=sD;
    shipType=ship;
  }
  
  public boolean getHit(){
    return hit;
  }
  
  public boolean getshipDestroy(){
    return shipDestroy;
  }
  
  public int getX(){
    return xCoord;
  }
  
  public int getY(){
    return yCoord;
  }
  
  public String getShip(){
    return shipType;
  }
}
