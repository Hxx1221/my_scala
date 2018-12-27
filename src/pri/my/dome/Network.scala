package pri.my.dome

import scala.collection.mutable.ArrayBuffer

class Network {

  class Member(val name: String) {
    val members = new ArrayBuffer[Network#Member]()

  }

  private val members = new ArrayBuffer[Network#Member]()

  def join(name: String) = {
    val name1 = new Member(name)
    members += name1
    name1
  }
}
