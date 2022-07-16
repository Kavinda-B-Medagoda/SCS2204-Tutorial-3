package second

object second {
  
  def tempConvert(Cel:Int):Double = {
    return Cel *1.8 +32;
  }
  def main(args:Array[String]):Unit = {
    print(tempConvert(35) + " Fahrenheit");
  }
}