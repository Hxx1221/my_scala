package pri

import SetTest.network1

import scala.collection.immutable._
import scala.reflect.internal.util.StringOps


object SetTest extends App {


  val set1 = new HashSet[Int]()
  //将元素和 set1 合并生成一个新的 set，原有 set 不变
  val set2 = set1 + 4
  //set 中元素不能重复
  val set3 = set2 ++ Set(4, 5, 6, 7)
  println(set3)
  val set0 = Set(1, 3, 4) ++ set1
  println(set0.getClass)


  private val stringToInt: Map[String, Int] = Map("a" -> 9)


  println(stringToInt)

  println(99.44.toInt)
  println(9.09.toChar)

  var ab: String = _
  var a = 4
  a = 9
  private val value: Int = if (a > 5) 1 else 2

  def aaaa(s: String): String = {
    s
  }

  private val counter = new Counter


  private val person = new Person
  println(person)

  private val hhxx = new Cat("hhxx", 18)
  hhxx name = "99"
  println(hhxx.name)


  private val network = new Network
  private val network1 = new Network
  private val fred = network.join("Fred")
  private val wilma = network.join("Wilma")
  fred.members += wilma

    private val barney: network1.Member = network1.join("Barney")
  fred.members+=barney





}
