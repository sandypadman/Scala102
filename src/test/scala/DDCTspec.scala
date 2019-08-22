import org.scalatest.FlatSpec

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

class DDCTspec extends FlatSpec{
  "calculatePrice" should "return the total" in{
    val testObject= new DDCT
    val testList =List(items.cola, items.coffee)
    assert(testObject.calculatePrice(testList)._1 === "£1.50")
  }

  "calculatePriceWithoutDrink" should "return the total" in{
    val testObject= new DDCT
    val testList =List(items.cola, items.coffee,items.cheeseSandwich,items.steakSandwich)
    assert(testObject.calculatePriceWithoutDrinks(testList)._1 === "£8.00")
  }

}
