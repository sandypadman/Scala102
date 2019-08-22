import java.util.Locale
import org.scalatest._
import scala.math.BigDecimal.RoundingMode

class TestSpec extends FlatSpec with Matchers {
  "function " should "return result in local currency" in {
   val objectToTest = new Test
   val testList:List[BigDecimal]= List(1.555,0.455,10.001)
   val outcome = objectToTest.function(testList,Locale.UK,RoundingMode.HALF_EVEN)
   assert( outcome === "£12.01")
   outcome shouldBe "£12.01"

  }
}