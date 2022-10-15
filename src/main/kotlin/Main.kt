import java.time.LocalDateTime
import java.util.*

data class Time(val time: LocalDateTime)
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
}
