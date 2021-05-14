package scala

object Q3 extends App{
  def wholeCost(noOfBooks:Int,priceOfBook:Double)={
    if(noOfBooks > 50){
      (noOfBooks-50)*0.75 + 3 + (priceOfBook*60/100)*noOfBooks
    }else{
      3 + (priceOfBook*60/100)*noOfBooks
    }
  }
  println(wholeCost(60,24.95))
}
