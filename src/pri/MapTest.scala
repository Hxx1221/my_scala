package pri

/**
  * 集合的常用操作
  */
object MapTest extends App {
  //////////////////////map/////////////////////////////
  //遍历集合中的每一个元素并对每一个元素调用函数
  private val seq: Seq[Int] = Seq(1, 8, 6, 34, 232)
  seq.map(x => x)


  ////////////////////flatten///////////////////////////
  // 把嵌套的集合展开，进行压平
  val abcd = Seq('a', 'b', 'c', 'd')
  val efgj = Seq('e', 'f', 'g', 'h')
  val ijkl = Seq('i', 'j', 'k', 'l')
  val mnop = Seq('m', 'n', 'o', 'p')
  val qrst = Seq('q', 'r', 's', 't')
  val uvwx = Seq('u', 'v', 'w', 'x')
  val yz = Seq('y', 'z')
  val alphabet = Seq(abcd, efgj, ijkl, mnop, qrst, uvwx, yz)

  println(alphabet)
  private val flatten: Seq[Char] = alphabet.flatten
  println(flatten)

  /////////////////////flatmap////////////////////////
  //flatmap 是map和flatten的结合，接受一个可以处理嵌套列表的函数，然后将结果连接起来
  private val chars: Seq[Char] = alphabet.flatMap(x => x.map(y => y))
  println(chars)
  val ae = alphabet.map(x => x.map(y => y))
  println(ae)
  /////////////////////foreach//forall////////////////////////////
  private val strings: Seq[String] = Seq("a", "b", "g")
  private val bool: Boolean = strings.forall(x => x.equals("a") || x.equals("b") || x.equals("c") || x.equals("d"))
  println(bool)

  ////////////////////////////////filter//////////////////////////////
  //过滤出集合中符合特定条件的子集
  val numbers = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  private val ints: Seq[Int] = numbers.filter(n => n % 2 == 0)
  println(intersect)
  private val jj: Seq[AnyVal] = numbers.map(x => if (x % 2 == 0) {
    x
  })
  println(jj)
  /////////////////////////partition//////////////////////
  private val tuple: (Seq[Int], Seq[Int]) = numbers.partition(n => n % 2 == 0)
  println(tuple)


  /////////////////////fold//////////////////////////////////
  val num = Seq(1, 2, 3, 4, 5)

  private val functionToInt: ((Int, Int) => Int) => Int = num.fold(12)

  private val i: Int = functionToInt((x, y) => x + y)
  println(iii)


  private val ii: Int = num.foldLeft(5)(_ - _)
  println(ii)
  /**
    * (x:5,y:0)
    * (x:4,y:5)
    * (x:3,y:-1)
    * (x:2,y:4)
    * (x:1,y:-2)
    *
    */
  private val iii: Int = num.foldRight(0)((x, y) => {
    println("x:" + x, "y:" + y)
    x - y
  })
  println(iii)
  //////////////////////reduce////////////////////////////
  val a = List(1, 2, 3, 5, 6)
  private val reduceValue: Int = a.reduce(_ + _)
  println(reduceValue)
  private val reduce: Int = a.reduceRight(_ - _)
  println(reduce)

  ////////////////zip////////////////////////////
  private val aa: List[Int] = List(9, 76, 7, 8, 2)
  private val bb: List[Int] = List(9, 76, 7, 8, 2)
  private val tuples: List[(Int, Int)] = aa.zip(bb)
  println(tuples)

  println(tuples.zipWithIndex)

  ///////////////交集 并集 差集////////////////////////
  val num1 = Seq(1, 2, 3, 4, 5, 6, 6)
  val num2 = Seq(4, 5, 6, 6, 7, 8, 9)
  private val diff: Seq[Int] = num1.diff(num2)
  private val intersect: Seq[Int] = num1.intersect(num2)
  private val union: Seq[Int] = num1.union(num2)
  println(diff)
  println(intersect)
  println(union)
  println(union.distinct)


  //////////////////////////////wordCount///////////////////////////////////////////////////////////
  val words = Array("hello tom hello hxx", "hello hello hxx tow one tom")
  private val stringss: Array[String] = words.flatMap(x => x.split(" "))
  println(stringss.toList)
  private val tup: Array[(String, Int)] = stringss.map(x => (x, 1))
  println(tup.toList)
  private val stringToTuples: Map[String, Array[(String, Int)]] = tup.groupBy(x => x._1)
  println(stringToTuples("tom").toList)
  private val stringToInt: Map[String, Int] = stringToTuples.mapValues(_.length)
  println(stringToInt)

 private val stringToStrings: Map[String, Array[String]] = stringss.groupBy(x=> x )
  println(stringToStrings("tom").toList)
  private val stringToInts: Map[String, Int] = stringToStrings.mapValues(_.length)
  println(stringToInts)
  private val list: List[(String, Int)] = stringToInts.toList.sortBy(-_._2)
  println(list)






}


