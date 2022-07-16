

object fifth {
  
  
  def RunTime(Easy:Int, Tempo:Int):Int = {
    return 8*Easy + 7*Tempo
  }
  
  def main(args:Array[String]):Unit = {
    print(RunTime(4,3));
  }
}