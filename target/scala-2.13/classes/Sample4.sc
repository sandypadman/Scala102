def returnCapital(city:String)={
  city.toLowerCase match {
    case "london" => city.capitalize
    case _ => "isn't UK's capital"
  }
}

val cityName="London"
println(s"$cityName ${returnCapital(cityName)}")


abstract class Animal

case class Dog(name:String, Age:Int) extends Animal
val dog1=Dog("Fido",3)
case class Cat(name:String, Age:Int) extends Animal
val cat1=Cat("Sam",14)


def checkAnimal(typeOfAnimal:Animal): String ={
  typeOfAnimal match {
    case _:Dog => "Dog"
    case cat:Cat =>"Kitty"
    case _ => "Other"
  }
}

checkAnimal(cat1)

def checkIfSam(animal: Animal) ={
  animal match {
    case Dog("Sam",age) => age
    case Dog(name,_) => println(s"$name is not Sam")
    case Cat("Sam",age)  => age
    case Cat(name,_) => println(s"$name is not Sam")
    case _ =>  ""
  }
}

checkIfSam(dog1)

def checkIfOlder(animal: Animal)={
  animal match{
    case Dog(name,age) if(age>10)=>(name,age)
    case Cat(name,age) if (age>10)=> (name,age)
    case Dog(name,_) => (name,"")
    case Cat(name,_) => name
  }
}
val result =checkIfOlder(cat1)
if(result.isInstanceOf[(String,Int)]){
  println(s"$_.result}is older than 10")
} else (result.asInstanceOf[String])
