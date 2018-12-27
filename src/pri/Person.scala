package pri

class Person {
  private var name: String = _
  private var age = 0

  println("person")
  def this(name: String) {
    this()
    this.name = name
  }

  def this(name :String,age: Int) {
    this(name)
//    this.name=name
    this.age = age
  }

}
