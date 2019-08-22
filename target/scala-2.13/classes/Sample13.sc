object Nintendo extends Enumeration{
  val Mario = Value(1)
  val Bowser = Value(2)
  val Waluigi = Value(3)
  val Princess = Value(4)
}

Nintendo.values.foreach(println(_))

Nintendo.Mario

sealed trait Nino

case object Mario extends Nino
case object Bowser extends Nino

val chars:List[Nino]= List(Mario,Bowser)
println(chars)



object TypeOfAnimalEnu extends Enumeration{
  val Reptile= Value("REPTILE")
  val Bird=Value("BIRD")
  val Mammal=Value("MAMMAL")
}


object CanFly extends Enumeration{
  val Yes=Value("Yes")
  val No=Value("No")
}

sealed trait TypeOfAnimals
case object Reptile extends TypeOfAnimals
case object Bird extends TypeOfAnimals
case object Mammal extends TypeOfAnimals



case class animals(name:String,enum1:TypeOfAnimalEnu.Value,enum2:CanFly.Value)
case class animals1(name:String,enum1:TypeOfAnimals,enum2:CanFly.Value)

val crocodile= animals("crock",TypeOfAnimalEnu.Reptile.,CanFly.No)
val Elephant=animals("Ele",TypeOfAnimalEnu.Mammal,CanFly.No)
val Parrot=animals1("parrot",Bird,CanFly.Yes)



crocodile match
  {
  case a: animals if(a.enum1==TypeOfAnimalEnu.Reptile)=>"I am a Reptile"
  case _ => "No match"
}
