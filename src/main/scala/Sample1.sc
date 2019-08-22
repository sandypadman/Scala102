println("Hello World")
trait Animal

case class Dog (name:String,breed:String,age:Int) extends Animal
val dog1= Dog("Fido","Whippet",4)
val dog2= Dog("Chihuahua","Chihuahua",3)
val dog3= Dog("Lassie","Rough Collie",160)
val dog4= Dog("Krypto","Fake dog",40)

case class Bird(name:String,age:Int)extends Animal
val bird1= Bird("Parrot",3)
val bird2= Bird("Magpie",4)
case class Cat(name:String, age:Int) extends Animal
val cat1 = Cat("BlueEyes",3)
val cat2= Cat("Dazzle",5)

case class Kennels(name:String,dogs:List[Dog])
case class KennelsExtra(kennel:Kennels,cats:List[Cat] = List(), birds:List[Bird] = List())
case class KennelsForEveryType(name:String,animal:List[Animal])


val newKennel1 = Kennels("Telford kennel", List(dog1,dog2,dog3,dog4))

val newKennel2 = newKennel1.copy(name="International House Kennel")

val newKennel3=  KennelsExtra(newKennel1,List(cat1,cat2),List(bird1,bird2))

val newKennel4= KennelsForEveryType("Straford Kennel",List(dog1,bird1,cat1))




