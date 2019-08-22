import java.awt.Menu
import java.text.NumberFormat.getCurrencyInstance
import java.util.Locale

import scala.math.BigDecimal.RoundingMode

/*
 * Copyright 2019 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

sealed trait FoodState
case object Hot extends FoodState
case object Cold extends FoodState

sealed trait FoodOrDrink
case object Food extends FoodOrDrink
case object Drink extends FoodOrDrink
case object Premium extends FoodOrDrink

case class MenuItem(val name:String, val state:FoodState, val cost:BigDecimal, val foodOrDrink: FoodOrDrink)

object items {
  val cola = MenuItem("Cola", Hot, BigDecimal(0.50),Drink)
  val coffee = MenuItem("Coffee", Cold, 1.00,Drink)
  val cheeseSandwich = MenuItem("Cheese Sandwich",Cold, 2.00,Food)
  val steakSandwich = MenuItem("Steak Sandwich", Hot,4.50,Food)
  val lobster=MenuItem("Lobster",Hot,25.00,Premium)

}

class DDCT {

    def getLocalCurrency(cost:BigDecimal):String={
      val currencyInstance = getCurrencyInstance(Locale.UK)
      currencyInstance.format(cost)
    }

    def calculatePrice(items:List[MenuItem]):(String,String)={
    val totalCost=items.map(x=>x.cost).sum
    val serviceTax= (totalCost/100)
    val scale =totalCost.setScale(2,RoundingMode.HALF_EVEN)
    val service = serviceTax.setScale(2,RoundingMode.HALF_EVEN)
    val total = (totalCost+ serviceTax).setScale(2,RoundingMode.HALF_EVEN)
    println(s" Cost of Food ordered  = ${getLocalCurrency(scale)} \n Service Tax(1%)  = ${getLocalCurrency(service)} \n Total Bill = ${getLocalCurrency(total)}")
      ( getLocalCurrency(scale),getLocalCurrency(service))
    }

    def calculatePriceWithoutDrinks(items:List[MenuItem]):(String,String)={

    val costOfDrinks = items.filter(_.foodOrDrink==Drink).map(_.cost).sum
      println(s"cost Of Drinks = $costOfDrinks")
    val costOfFood = items.filter(_.foodOrDrink==Food).map(_.cost).sum
      println(s"cost Of Food = $costOfFood")
    val totalCost = costOfDrinks+costOfFood


   val serviceTax:BigDecimal =

      calculatePriceforHotFood( items) match
      {
        case true => if(totalCost*20/100 >= 20) 20 else (totalCost*20/100)
        case false =>  (calculatePriceAllDrinks(items)) match
        {
          case true =>  0.0
          case false => (totalCost*10/100)
        }
      }

    val scale =totalCost.setScale(2,RoundingMode.HALF_EVEN)
    val service = serviceTax.setScale(2,RoundingMode.HALF_EVEN)
    val total = (totalCost+ serviceTax).setScale(2,RoundingMode.HALF_EVEN)
    println(s" Cost of Food ordered  = ${getLocalCurrency(scale)} \n Service Tax(1% on Food)  = ${getLocalCurrency(service)} \n Total Bill = ${getLocalCurrency(total)}")
      ( getLocalCurrency(scale),getLocalCurrency(service))
    }

    def calculatePriceAllDrinks(items:List[MenuItem]):Boolean={
      items.forall(_.foodOrDrink== Drink)
    }

    def calculatePriceforHotFood(items:List[MenuItem]):Boolean={
      items.forall(x=>(x.foodOrDrink==Drink && x.state==Hot) )
    }

   def calculateServiceTax(items:List[MenuItem]):BigDecimal={

   val onlyDrinks = items.filterNot(x=>x.foodOrDrink==Drink).nonEmpty
   val hotFood = items.filter(x=>(x.state==Hot && x.foodOrDrink==Food)).nonEmpty

     if( items.forall(_.foodOrDrink== Drink)) {
       1.0
     } else if( items.forall(x=>(x.foodOrDrink==Food && x.state==Hot))) {
       1.2
     } else if ( items.forall(x=>(x.foodOrDrink==Food && x.state==Cold)) ){
       1.1
     } else if(items.forall(x=>(x.foodOrDrink==Premium))
       {
         1.25
       }
   }

}
