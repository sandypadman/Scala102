def userExists(username:String, password:String): Boolean = {
  (username,password) match {
    case("Boris","123")=>true
    case("Donald","345")=> true
    case _=>false
  }
}
case class notFound(message:String)
//case class pass(override val message:String) extends notFound(message="password is wrong")
def userExists1(username:String,password:String): Either[notFound,Boolean] ={

 if(userExists(username,password)) {
   Right(true)
 }
  else
 {
   Left(notFound(s"$username and $password is wrong"))
   }
}

userExists1("Boris","123")