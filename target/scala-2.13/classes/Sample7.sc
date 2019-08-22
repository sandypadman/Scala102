val spongeCharacters:List[String]= List("SpongeBob","Krabs")


def selectQuotes(name:Option[String]):List[String]= {
  name match {
    case Some(name1) =>  spongeCharacters.filter(a => a==name1)
   //   spongeCharacters.contains(name1)
    case _ => List.empty
  }

}

def sponge(string: Option[String]): Unit ={

  string match {
    case Some("SpongeBob") => "Run Mr. Krabs! Run like you’re not in a coma!"
    case Some("Plankton") => "Holographic Meatloaf? My favorite!"
    case _ => "default"
  }
}

val spongee:Option[String]=>String = ss => {
  ss match {
    case Some("SpongeBob") => "Run Mr. Krabs! Run like you’re not in a coma!"
    case Some("Plankton") => "Holographic Meatloaf? My favorite!"
    case _ => "default"
  }
}


def quote(sentence:Option[String]):String ={

  import scala.util.Random
  val rand = new Random
  val list: List[String] = List("The unexamined life is not worth living",
    "Whereof one cannot speak, thereof one must be silent",
    "Entities should not be multiplied unnecessarily")
  sentence match
  {
    case Some(sentence1)=>sentence1
    //case _=> "He who thinks great thoughts, often makes great errors"
    case _=> list(rand.nextInt(list.length))
  }
}

quote(Some("Gary, what are you doing here? YOU’RE CAUSING A SCENE!!!"))
quote(None)

def hof(func:(Option[String])=>String,name:Option[String])= {
  func(name)
}
hof(quote,Some("gjgjg"))
hof(spongee,Some("SpongeBob"))
selectQuotes(Some("SpongeBob"))