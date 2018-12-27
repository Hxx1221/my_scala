package pri

object Test extends App {
  val a: Int = 0
  print(a)

  var b=(x:Int) =>{
    x
  }
val  dd:(Int)=>Int=(x)=>{
  x*10
}

  val add:(String,String)=>String=(a,b)=>{
    a+b
  }

  val add1=(f:(String,String)=>String,x:String,y:String)=>{
    f(x,y)
  }
  println(dd(11))

  println(add1(add,"qw","uuu"))





}
