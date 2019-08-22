val fortniteSkins:BigDecimal= 20000.50:BigDecimal
val canOfBeans:BigDecimal=4.05:BigDecimal

import scala.math.BigDecimal.RoundingMode
import java.text.NumberFormat._
import java.util.Locale

fortniteSkins.setScale(2,RoundingMode.HALF_EVEN)
canOfBeans.setScale(2)

val currencyInstance = getCurrencyInstance(Locale.UK)

currencyInstance.setMinimumFractionDigits(2)
currencyInstance.setMaximumFractionDigits(1)

println(currencyInstance.format((fortniteSkins)))
println(currencyInstance.format((canOfBeans)))


def currencyOutput(number:List[BigDecimal], local:Locale, rounding:RoundingMode.Value)={

  number.map(x=>x.setScale(2,rounding)).foreach(y=> println(y))
  val y= number.map(x=>x.setScale(2,rounding)).sum
  println(y)
  val currInstance = getCurrencyInstance(local)
  (currInstance.format((y.setScale(2,rounding))))

}
val newList:List[BigDecimal]= List(1.555,0.455,10.001)
val germanList:List[BigDecimal]= List(1.0,0.005,1000.355)

println(currencyOutput(newList,Locale.UK,RoundingMode.HALF_EVEN))

println(currencyOutput(newList,Locale.US,RoundingMode.HALF_DOWN))

println(currencyOutput(germanList,Locale.GERMANY,RoundingMode.HALF_EVEN))