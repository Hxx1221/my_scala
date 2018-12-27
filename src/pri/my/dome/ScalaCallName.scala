package pri.my.dome

object ScalaCallName extends App {

  def currentTime(): Long = {

    println("打印系统时间，单位为秒")
    System.nanoTime()
  }

  def delayed(f: => Long): Unit = {
    println("delayed ===========")
    println("time=" + f)
  }

  def delayed1(f: => Long): Unit = {
    println("delayed ===========")
    println("time=" + f)
  }

  delayed(currentTime())
  delayed1(currentTime())

  def methodManyParams(a: String*) = {

    for (i <- 0 until a.size) {
      println(a(i))
    }
  }

  methodManyParams("hxx", "hxx1")


  def add(a: Int = 1, b: Int = 7) = {
    a + b
  }

  println(add(9))
  println(add(b = 9))
  println(add(b = 9, a = 111))


  //高阶函数

  def apply(f: Int => String, v: Int) = f(v)

  def layout(x: Int) = "[" + x.toString + "]"

  def layout(x: Int, y: Int) = "[" + x.toString + "]"

  println(apply(layout, 10))

  //柯里化
  //就是将多个参数的函数变成接受一个参数的函数的过程
  def save(x: Int, y: Int) = x + y

  def save2(x: Int)(y: Int) = x + y

  def save3(x: Int) = (y: Int) => x + y

  def partial: PartialFunction[String, Int] = {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def partial1(a: String): Int = a match {

    case "one" => 1
    case _ => -1
  }

  val arr = Array[Int](2, 3, 5, 3, 5, 12)

  private val ints: Array[Int] = arr map ((x: Int) => x + 9)
  private val ints1: Array[Int] = arr map (_ * 2)
  println(ints.toList)
  println(ints1.toList)

  val words = Array("hello m tom o hello m jim o hello  jerry", "hello  Hatano")

  private val stringses: Array[Array[String]] = words.map(_.split(" "))
  private val flatten: Array[String] = stringses.flatten
  for (i<-0 until stringses.size; j <- 0 until stringses(i).size){
  //  println("stringses"+stringses(i)(j))

  }

  for (i<- stringses; j <- i){
    println("stringses="+j)

  }

  println(flatten.toList)


  val result : Array[String] = words .flatMap(wd => wd.split(" "))
  // 遍历数组, 打印每个元素
  result .foreach( println )


}
