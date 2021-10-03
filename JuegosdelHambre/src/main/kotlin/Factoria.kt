import jdk.nashorn.internal.runtime.arrays.ArrayIndex
import kotlin.random.Random

object Factoria {

    fun generarTributo(nDis:Int):Tributo {
        var nomAzar:Int = Random.nextInt(1,7)
        var nombre:String = when(nomAzar){
            1 -> "WonderWoman"
            2 -> "Superman"
            3 -> "Batman"
            4 -> "Obi-one"
            5 -> "Lara Croft"
            6 -> "Van Helsing"
            else -> "Sin Nombre"
        }
        var vida:Int = Random.nextInt(0,100)
        var fuerza:Int = Random.nextInt(1,20)
        var Distrito:String ="D"+nDis.toString()
        var t:Tributo = Tributo.Builder().nombre(nombre).vida(vida).fuerza(fuerza).Distrito(Distrito).build()
        return t
    }
    fun generarDistrito(nDis:Int):ArrayList<Tributo> {
        var aux= ArrayList<Tributo>()
        var T1= generarTributo(nDis)
        var T2= generarTributo(nDis)
            aux.add(T1)
            aux.add(T2)
        var t: ArrayList<Tributo> = Distrito.Builder().dtributo(aux).build()
        return t
    }

    fun generarMundo():Mundo {
        var aux= ArrayList<Any>()
        for(i in 1..5){
            aux.add(generarDistrito(i))
        }
        var t:Mundo = Mundo.Builder().Arena(aux).build()
        return t
    }

    fun generarArma():Arma {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "Espada"
            2 -> "Arco"
            3 -> "Pelusa"
            else -> "Piedra del campo"
        }
        var fuerza:Int = Random.nextInt(50,100)
        var Desc:String="Arma de Atrezo"
        var a:Arma = Arma.Builder().nombre(nombre).fuerza(fuerza).Descrip(Desc).build()
        return a
    }
    fun generarMedicina():Medicina {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "Sopa"
            2 -> "Tirita"
            3 -> "Spray primeros auxilios"
            else -> "Abrazo"
        }
        var vida = Random.nextInt(50,100)
        var Desc:String="Pseudomedicina"
        var m:Medicina = Medicina.Builder().nombre(nombre).vida(vida).Descrip(Desc).build()
        return m
    }
    fun generarTrampa():Trampa {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "Lanzallamas"
            2 -> "T-Rex"
            3 -> "Tribu Canibal"
            else -> "Black Hole"
        }
        var Desc:String="Trampa Mortal"
        var t:Trampa = Trampa.Builder().nombre(nombre).Descrip(Desc).build()
        return t
    }
}