import scala.util.Random
val r=new Random()

def leftorRight={
  if (r.nextInt(100)<25) None else Some("big")
}
leftorRight.map(i=>i+"number")


def returnUpper(macbook:String)={
 val toUpper:String= macbook.map(char1 => char1.toUpper)
  s"$toUpper Are the best"
}

val returnList= List("72","43","34")
val x=returnList.map(i=>i.toInt).map(_*2).sum


def multiplyBy12(number:Option[Int]):Int={
    number match {
      case None=> 12
      case Some(x)=> x*12
  }
}
multiplyBy12(None)

def multiplyBy121(number:Option[Int]):Int= {
  number.map(_*12).getOrElse(12)
  number.getOrElse((1))*12
}




val scores:Seq[Option[String]] = Seq(None, Some("A"), Some("B"), Some("C"), None, Some("F"))
scores.flatten
scores.filter(_.isDefined)



def returnResult(number:Seq[Option[String]]): Seq[String]= {
  number.map{
    case Some(i) => i
    case None =>"F"
  }
  number.map(_.getOrElse("F"))
  number.map(_.fold("F":String){present=>present})


}
returnResult(scores)