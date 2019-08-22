def flavour(flavour:String )={
  flavour match {
    case "Caramel"=> "caramel chew chew"
    case "chocolate"=>"chocolate yes yes"
  }
}

flavour("Caramel")

def pizzaCost(size:Int,crust:String)={
  (size,crust) match {
    case(7,"classic")=> 5.99
    case(9,other) if ((other=="classic")|( other=="italian"))=>10.0
      case(9,"classic"|"italian")=>10.99
      case(9,_)=>19.999
      case(11,"stuffed")=>15.98
      case(11,_) => 12.99
      case(14,"stuffed")=>17.98
      case(14,_)=>14.99
      case(_,_)=>12.00
  }
}

pizzaCost(9,"classic")