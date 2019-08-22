val priceIncludingVat:BigDecimal=>BigDecimal=(price)=>{ price* BigDecimal(1.2)}
priceIncludingVat(BigDecimal(100))

def  priceIn(price:BigDecimal):BigDecimal={
  price* BigDecimal(1.2)
}

def calculate(func:(Int,Int)=>Double,val1:Int,val2:Int)=
{

}

val radii=List(2,3,5,6,7)
val pi:Double=3.14
val radius:Int=5

def areaOfCircle(radius:Int):Double={
  pi*radius*radius
}

def circumOfCirle(radius:Int):Double={
  pi*radius
}

def hof(fun:(Int)=>Double,radii:List[Int]):List[Double]={

  radii.map(fun(_))
}

hof(areaOfCircle,radii)
hof(circumOfCirle,radii)