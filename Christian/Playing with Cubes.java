/*
Create a public class called Cube without a constructor which gets one single private Integer variable Side, a getter GetSide() and a setter SetSide(int num) method for this property. Actually, getter and setter methods are not the common way to write this code in C#. In the next kata of this series, we gonna refactor the code and make it a bit more professional... Note: There's no need to check for negative values!

https://www.codewars.com/kata/55c0a79e20be94c91400014b/train/java

*/
public class Cube{
  private int side;
  //Getter
  public int getSide(){
    return side;
  }
  //Setter
  public void setSide(int num){
    this.side = num;
  }

}
