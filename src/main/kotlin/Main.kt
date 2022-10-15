import java.time.LocalDateTime
import java.util.*

data class Time(val time: LocalDateTime)

fun executeCalc(num1: Int, num2: Int, function: CalcJava) {
    println(function.calc(num1, num2))
}

fun main() {
    // インスタンスを生成して使用する感覚で Java のコードを呼び出せる
    val hello = HelloByJava()
    hello.printHello()

    // Java のライブラリを呼び出すことも問題なくできる
    val uuid: UUID = UUID.randomUUID()
    println(uuid.toString())

    // Java の標準ライブラリのクラスを型として使用することもできる
    val now = Time(LocalDateTime.now())
    println(now)

    val dog = DogKotlin()
    dog.cry()

    val greeter = GreeterImplKotlin()
    greeter.hello()

    // Java 側でプロパティを private にしてアクセサメソッドを定義しているクラスでも、
    // Kotlin では直接アクセスしているかのように書ける（内部的には getter、setter を呼んでいる）
    val user = UserJava()
    user.id = 100
    user.name = "Taro"
    println(user.id)
    println(user.name)

    // SAM 変換
    // Java の関数型インタフェースにラムダ式を渡すことで、SAM インタフェースに変換する
    val function = CalcJava { num1, num2 -> num1 + num2 }
    println(function.calc(1, 3))

    executeCalc(1, 3, function)
}
