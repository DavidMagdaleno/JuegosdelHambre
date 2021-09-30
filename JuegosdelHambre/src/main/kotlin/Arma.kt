class Arma {

    private var nombre:String?=""
    private var fuerza:Int?=0

    constructor(n:String?, f:Int?){
        this.nombre = n
        this.fuerza = f
    }


    class Builder(var nombre:String? = null, var fuerza:Int? = null){
        fun nombre(nombre:String):Builder{
            this.nombre = nombre
            return this
        }
        fun fuerza(fuerza:Int):Builder{
            this.fuerza = fuerza
            return this
        }
        fun build():Arma{
            return Arma(nombre, fuerza)
        }
    }
}