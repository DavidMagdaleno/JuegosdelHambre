import kotlin.random.Random

object Factoria {

    fun generarTributo(nDis:Int):Tributo {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "WonderWoman"
            2 -> "David"
            3 -> "Sara"
            else -> "Sin Nombre"
        }
        var vida:Int = Random.nextInt(0,100)
        var fuerza:Int = Random.nextInt(1,20)
        var Distrito:String ="D"+nDis.toString()
        var t:Tributo = Tributo.Builder().nombre(nombre).vida(vida).fuerza(fuerza).Distrito(Distrito).build()
        return t
    }
    /*fun generarDistrito(nDis:Int):Distrito {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "WonderWoman"
            2 -> "David"
            3 -> "Sara"
            else -> "Sin Nombre"
        }
        var vida:Int = Random.nextInt(0,100)
        var fuerza:Int = Random.nextInt(1,20)
        var Distrito:String ="D"+nDis.toString()
        var t:Tributo = Tributo.Builder().nombre(nombre).vida(vida).fuerza(fuerza).Distrito(Distrito).build()
        return t
    }*/



    fun generarArma():Arma {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "Espada"
            2 -> "Arco"
            3 -> "Pelusa"
            else -> "Piedra del campo"
        }
        var fuerza:Int = Random.nextInt(1,20)
        var a:Arma = Arma.Builder().nombre(nombre).fuerza(fuerza).build()
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
        var vida = Random.nextInt(0,50)
        var m:Medicina = Medicina.Builder().nombre(nombre).vida(vida).build()
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
        var t:Trampa = Trampa.Builder().nombre(nombre).build()
        return t
    }
}