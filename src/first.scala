

object first {
  
  def AreaOfDisk(radious:Double):Double = {
    
    var pi = 3.14;
    pi * radious * radious;
       
  }
  
  def main(args:Array[String]):Unit = {
     print(AreaOfDisk(5));
  }
}