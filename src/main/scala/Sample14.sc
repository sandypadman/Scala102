import java.time.LocalTime
import java.time.LocalDateTime

val a:Double = 0.00000001
val b: BigDecimal = BigDecimal("-9.0456E340")
 val c:LocalTime= LocalTime.of(23,44,12,99)
val dateNow: LocalDateTime=LocalDateTime.now()


val d:Double= -500.0034234
val e:BigDecimal= BigDecimal("-50E307")
val f:BigDecimal=BigDecimal("500000000000000000000000.00")
val g:LocalTime=LocalTime.parse("00:34")
val h:LocalDateTime=LocalDateTime.parse("2008-12-03T18:33:12.219")

val i=LocalDateTime.now().minusWeeks(33)
val j= LocalDateTime.now().minusYears(3).minusWeeks(22)