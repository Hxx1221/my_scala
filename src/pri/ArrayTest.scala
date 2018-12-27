package pri

import scala.collection.mutable._

object ArrayTest {


  def main(args: Array[String]): Unit = {

    val arr = new Array[Int](8)
    println(arr)
    arr(7) = 9

    val intss = Array(9, 8, 7)
    val ab = ArrayBuffer[Int]()
    ab += 1
    ab += 2
    ab += (3, 4, 5, 6)
    ab ++= Array(7, 8)
    ab.insert(0, -1, 0)
    ab.remove(0, 2)
    println(ab)


    var ints = List(1, 2, 3)
    //插到头部
    ints = 0 :: ints
    ints = ints.::(-1)
    ints = (-2) +: ints
    ints = ints.+:(-3)
    println(ints)
    //插到尾部
    ints = ints :+ 4
    println(ints)

    val intsss = 9 :: 5 :: 2 :: Nil
    println(intsss)


  }
}
