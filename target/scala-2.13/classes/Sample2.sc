val name1= "Jeff"
val name2= "Ben"

println(s"$name1 is older than $name2")
val jeffAge: Double = 50.05
val bensAge: Double = 26.0660
val differnce=jeffAge-bensAge

println(s"$name1 is ${jeffAge-bensAge} older than $name2")
println(f"$name1 is ${jeffAge-bensAge}%.2f older than $name2")

println("""$$ My friends name is \n\n\n\n $name1 \n\n\n""")

case class Person(name:String, age:Double, university:String, nationality:String, courseName:String, favRegex:String)
val Student1= Person("Sophie",24.500,"Cambridge","British","Accountancy","^[\\]{5,10}$")
val Student2= Person("Sophie",24.500,"Cambridge","British","Accountancy","""sss""")
println(s"Students name is ${Student1.name} and her nationality is ${Student1.nationality}")
println(f"Students age is ${Student1.age}%.2f and her favourite regex is : \n\n ${Student1.favRegex}")
println("""print them as it is ${Student1.age}""")
println(raw"print them as it is \n\n$$ ${Student2.favRegex}")




