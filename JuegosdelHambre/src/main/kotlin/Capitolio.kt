import kotlin.random.Random

class Capitolio {

    private var mundo=Factoria.generarMundo()
    private var repositorio:ArrayList<Item> = ArrayList(100)
    private var Muertos: ArrayList<Tributo> = ArrayList(10)

    fun getmundo():Mundo {
        return mundo
    }

    fun recogerMuertos(){
        Muertos.addAll(mundo.gettMuertos())
    }

    constructor(){
    }

    fun alea ():Int{
        var alea= Random.nextInt(1,4)
        return alea
    }
    fun alea2 ():Int{
        var alea= Random.nextInt(0,5)
        return alea
    }
    fun rellenarRepositorio(){
        for(i in 0..100){
            when(alea()){
                1->repositorio.add(Factoria.generarArma())
                2->repositorio.add(Factoria.generarMedicina())
                3->repositorio.add(Factoria.generarTrampa())
            }
        }
    }

    fun iniciarJuegos(){
        mundo.crearArena()
        mundo.rellenarArena(mundo.getMatriz())
        ponerIteminiciales()
        mundo.mostrar(mundo.getMatriz())
        println("La Arena de Batalla esta lista")
    }

    fun ponerIteminiciales(){
        for(h in 0..10){
            var valido=false
            while(!valido){
                var aux=alea2()
                var aux2=alea2()
                if(mundo.getMatriz()[aux][aux2]==0){
                    mundo.getMatriz()[aux][aux2]=repositorio[h] as Any
                    repositorio.removeAt(h)
                    valido=true
                }
            }
        }
    }
    fun enviarItem(){
        for(h in 0..3){
            var valido=false
            while(!valido){
                var aux=alea2()
                var aux2=alea2()
                if(mundo.getMatriz()[aux][aux2]==0){
                    mundo.getMatriz()[aux][aux2]=repositorio[h] as Any
                    repositorio.removeAt(h)
                    valido=true
                }
            }
        }
    }
    fun ganador(): Boolean {
        var hayGanador =true
        var cont=0;
        var tGanador:Tributo?=null
        for (i in 0..mundo.getMatriz().size - 1) {
            for (j in 0..mundo.getMatriz().size - 1) {
                if(mundo.getMatriz()[i][j] is Tributo){
                    tGanador= mundo.getMatriz()[i][j] as Tributo
                    cont++
                }
            }
        }
        if(cont==1){
            recogerMuertos()
            println("Ha Ganado el tributo "+tGanador?.getNombre()+" con una fuerza de "+tGanador?.getFuerza()+" una vida de "+tGanador?.getVida()+" perteneciente al Distrito "+tGanador?.getDistrito())
            mundo.mostrar(mundo.getMatriz())
            for(tr in Muertos){
                println("Ha muerto "+tr.getNombre()+" con una fuerza de "+tr.getFuerza()+" una vida de "+tr.getVida()+" del distrito "+tr.getDistrito())
            }
            hayGanador=false
        }
        return hayGanador
    }

}