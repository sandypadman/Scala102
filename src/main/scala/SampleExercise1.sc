val myMap = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Mirrchigan")

val mapValues = myMap.values
mapValues.size
mapValues.head

val lastElement = mapValues.last
lastElement

myMap.getOrElse("TX", "missing data")

val foodItem = "porridge"

def goldilocks(expr: Any) = expr match {
  case (`foodItem`, _) ⇒ "eating"
  case ("chair", "Mama") ⇒ "sitting"
  case ("bed", "Baby") ⇒ "sleeping"
  case _ ⇒ "what?"
}

goldilocks(("porridge", "Papa"))
goldilocks(("chair", "Mama"))
goldilocks(("porridge", "Cousin"))
goldilocks(("beer", "Cousin"))

val secondElement = List(1, 2, 3) match {
  case x :: xs ⇒ xs.head
  case _ ⇒ 0
}

secondElement
