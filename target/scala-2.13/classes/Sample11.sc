val listy= List(13,34,56,78)

listy.map(i=> i*2)

val mappy= Map[Int,Int](1->2,3->4).map{
  case (x,y)=> s"key=$x value=$y"
}

val oppy= Some(1)
oppy.map(i=>i*2)
val oppy1:Option[Int]= None
oppy1.map(i => i+2)




val animals= List("cow","Dragon","Iguana")

val adjective=List("salty","sweaty","smelly")

animals.map(ani=> adjective.map(ad=>s"$ad $ani"))
animals.flatMap(ani=> adjective.map(ad=>s"$ad $ani"))

val eithe:Either[Int,String]= Right("dddd")


eithe.map{
  case true => println("true")
  case false =>  println("2")
}


