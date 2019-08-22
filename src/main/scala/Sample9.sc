val newSet:Set[Int]=Set(12,23,34,56,67,34)
newSet.size
newSet.+(67)
newSet + 89


val newMap:Map[String,String] = Map(("1" -> "Ben"),("2" -> "Jeff"),("3" -> "Ryan"))

def retrieveName(number:Int):String={
 newMap(number.toString)

}
retrieveName(1)



def retrieveName1(number:Int):String={
  newMap.get(number.toString)
  newMap.getOrElse(number.toString,"default")

}

retrieveName1(7)

def retrieveId(map:Map[String,String]):List[String]={
  map.keys.toList

}
retrieveId(newMap)

def retrieveName(map:Map[String,String]):List[String]={

  map.values.toList

}
retrieveName(newMap)
def find(name:String):String={
  val x= newMap.find(ss=>ss._2==name)
    if(x.isDefined) x.get._1.toString else "notfound"
}

def find1(name:String):String={
   newMap.filter(ss=>ss._2==name).headOption.toString
}
val s=find1("Ben")
