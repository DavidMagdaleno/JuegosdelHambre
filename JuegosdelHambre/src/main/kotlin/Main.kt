import kotlin.concurrent.thread

fun main(args: Array<String>) {
    var capi=Capitolio()
    capi.rellenarRepositorio()
    capi.iniciarJuegos()
    var tiempo=0
    while(tiempo<=100 && capi.ganador()){
        if(tiempo%2==0){
            capi.getmundo().Desplazar()
        }
        if(tiempo%5==0){
            capi.enviarItem()
            println("el capitolio envia item")
            capi.getmundo().mostrar(capi.getmundo().getMatriz())
        }
        Thread.sleep(1000)
        tiempo++
    }


}


