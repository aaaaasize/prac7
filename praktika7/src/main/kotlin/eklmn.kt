fun main(args: Array<String>){
    val programmist: ziz= ziz( "Tsyrevnikova", 10.0,  4.0)

    println("Фамилия: "+ programmist.fam)
    println("Число программ: "+ programmist.chpr)
    println("Число языков: "+ programmist.chya)
    println("Q= ${programmist.chpr*programmist.chya}")
    val mi: mi = mi (5.0, 0.0)
    println("Qp=${mi.qp(5.0,0.0)}")

}