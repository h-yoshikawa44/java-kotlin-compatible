public class JavaMain {
    public static void main(String[] args) {
        // インスタンスを生成して使用する感覚で Kotlin のコードを呼び出せる
        HelloByKotlin helloByKotlin = new HelloByKotlin();
        helloByKotlin.printHello();

        // Kotlin 側で @JvmStatic をつけているので Companion を介さずアクセスできる
        System.out.println(CompanyConstants.getMaxEmployeeCount());
    }
}
