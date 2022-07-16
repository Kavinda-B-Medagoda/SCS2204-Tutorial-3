package third

object third {
  
  def VouleOfSphere(radious:Int):Double = {
    
    var pi = 3.14;
    return 4/3 * pi * radious * radious * radious;
  }
  
  def main(args:Array[String]):Unit = {
    print(VouleOfSphere(5));
  }
}