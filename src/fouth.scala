


object fouth {
  
 def Total(copies:Int):Double = copies > 50 match{
   case true => 24.95*60/100 + 3*50 + 3.75*(copies-50)
   case false => 24.95*60/100 + 3*copies
   
 }
 
 
 def main(args:Array[String]):Unit ={
   print(Total(60));
 }
}