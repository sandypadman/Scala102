case class ChocolateBar(filling:Option[String])


def returnFilling(choc:ChocolateBar):String={
  choc.filling.getOrElse("no filling")
}

val notBounty= ChocolateBar



case class Dog(name:String, colourOfSpots:Option[String], noOfSpots:Option[Int])
val dogFido = Dog("Fido",Some("Brown"),Some(4))
val rolf=Dog("rolf",None,None)

def returnColourOfSpots(dogie:Dog):String = {
  dogie match {
    case Dog(name,Some(colour),Some(spots))=>colour
    case Dog(name,None,None)=>"No spots"
    case _=>""
  }
//  dogie match {
//    case _ if dogie.colourOfSpots.isDefined => dogie.colourOfSpots
//  }
  dogie.colourOfSpots.getOrElse("No spots")
}

val result= returnColourOfSpots(dogFido)
println(s"$result")

def doubleContent(number:Option[Int]) ={
  number.map(no=>no*2).getOrElse("None")
}

val numbernew=None
doubleContent(numbernew)


def dou(number:Option[Int]):Option[Int]={
  number.fold[Option[Int]](None)(x=>Some(x*2))
}

def double(number:Option[Int]):Option[Int]={
  number.map{
    _*2
  }
}