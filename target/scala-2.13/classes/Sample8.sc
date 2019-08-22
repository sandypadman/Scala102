val exampleList:List[Int]= List(34,45,56,59,65)
val list:List[String]=List("Scully","Jacob","Wayne")

def nextPerson(list:List[String]):Unit ={
  println(list.headOption.getOrElse("Nobody left"))
  if(list.nonEmpty) nextPerson(list.tail)
}

nextPerson(list)

list.appended("dkfd")
val list2=List()
//list2.head
//list2.headOption
exampleList.tail
exampleList.take(6)
exampleList.last

import scala.collection.immutable.Queue
val queue:Queue[String]= Queue("aaa","bbb","ccc")

queue.front
queue.enqueue("Morgan")
queue.tail
queue.enqueueAll((List("kkk","rrrr")))