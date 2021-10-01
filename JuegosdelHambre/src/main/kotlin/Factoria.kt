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
    fun generarDistrito(nDis:Int):Distrito {
        //var aux:Array<Tributo> = Array<Tributo>(2)
        var aux= arrayOfNulls<Tributo?>(2)
        //Distrito d =new Distrito(Array<Tributo>)
        //var d:Distrito = Distrito(Array<Tributo>?)
        var T1= generarTributo(nDis)
        var T2= generarTributo(nDis)
            aux[0]=T1
            aux[1]=T2
        var t:Distrito = Distrito.Builder(aux).build()
        return t
    }

    fun generarMapa(nDis:Int):Mundo {
        var aux= arrayOfNulls<Distrito?>(5)
        for(i in 1..5){
            aux[i]= generarDistrito(i)
        }
        var t:Mundo = Mundo.Builder(aux).build()
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