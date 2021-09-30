open class Tributo {
    private var nombre:String?=""
    private var vida:Int?=0
    private var fuerza:Int?=0
    private var Distrito:String?=""

    constructor(n:String?, v:Int?,f:Int?,d:String?){
        this.nombre = n
        this.vida = v
        this.fuerza = f
        this.Distrito = d
    }
    class Builder(var nombre:String? = null, var vida:Int? = null, var fuerza:Int? = null,var Distrito:String? = null){
        fun nombre(nombre:String):Builder{
            this.nombre = nombre
            return this
        }
        fun vida(vida:Int):Builder{
            this.vida = vida
            return this
        }
        fun fuerza(fuerza:Int):Builder{
            this.fuerza = fuerza
            return this
        }
        fun Distrito(Distrito:String):Builder{
            this.Distrito = Distrito
            return this
        }
        fun build():Tributo{
            return Tributo(nombre, vida,fuerza, Distrito)
        }
    }
}