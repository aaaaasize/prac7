fun main(args: Array<String>){
    val mit: eyyy= eyyy( " ЖКХ", 15.0,  50.0)

    println("Название: "+ mit.naz)
    println("Число ораторов: "+ mit.n1)
    println("Число участников: "+ mit.n2)
    println("Q= ${mit.n1/mit.n2}")
    val cl: cl = cl (3.0, 0.0)
    println("Qp=${cl.qp(3.0,0.0)}")

}