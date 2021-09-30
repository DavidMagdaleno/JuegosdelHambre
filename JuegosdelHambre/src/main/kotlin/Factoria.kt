import kotlin.random.Random

object Factoria {

    fun generarTributoS1():TributoS1 {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "WonderWoman"
            2 -> "David"
            3 -> "Sara"
            else -> "Sin Nombre"
        }
        var vida:Int = Random.nextInt(0,100)
        var fuerza:Int = Random.nextInt(1,20)
        var Distrito:String ="D1"
        var t:TributoS1 = TributoS1.Builder().nombre(nombre).vida(vida).fuerza(fuerza).Distrito(Distrito).build()
        return t
    }
    fun generarTributoS2():TributoS2 {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "Superman"
            2 -> "Mario"
            3 -> "Katrina"
            else -> "Sin Nombre"
        }
        var vida:Int = Random.nextInt(0,100)
        var fuerza:Int = Random.nextInt(1,20)
        var Distrito:String ="D2"
        var t:TributoS2 = TributoS2.Builder().nombre(nombre).vida(vida).fuerza(fuerza).Distrito(Distrito).build()
        return t
    }
    fun generarTributoS3():TributoS3 {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "Daniela"
            2 -> "Kevin"
            3 -> "UltraPollas"
            else -> "Sin Nombre"
        }
        var vida:Int = Random.nextInt(0,100)
        var fuerza:Int = Random.nextInt(1,20)
        var Distrito:String ="D3"
        var t:TributoS3 = TributoS3.Builder().nombre(nombre).vida(vida).fuerza(fuerza).Distrito(Distrito).build()
        return t
    }
    fun generarTributoS4():TributoS4 {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "PartePiernas"
            2 -> "Degollaosos"
            3 -> "Sutileza"
            else -> "Sin Nombre"
        }
        var vida:Int = Random.nextInt(0,100)
        var fuerza:Int = Random.nextInt(1,20)
        var Distrito:String ="D4"
        var t:TributoS4 = TributoS4.Builder().nombre(nombre).vida(vida).fuerza(fuerza).Distrito(Distrito).build()
        return t
    }
    fun generarTributoS5():TributoS5 {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "AplastaCraneos"
            2 -> "Batman"
            3 -> "CabezaCuerno"
            else -> "Sin Nombre"
        }
        var vida:Int = Random.nextInt(0,100)
        var fuerza:Int = Random.nextInt(1,20)
        var Distrito:String ="D5"
        var t:TributoS5 = TributoS5.Builder().nombre(nombre).vida(vida).fuerza(fuerza).Distrito(Distrito).build()
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