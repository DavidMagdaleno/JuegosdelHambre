class Medicina {

    private var nombre:String?=""
    private var vida:Int?=0

    constructor(n:String?, v:Int?){
        this.nombre = n
        this.vida = v
    }


    class Builder(var nombre:String? = null, var vida:Int? = null){
        fun nombre(nombre:String):Builder{
            this.nombre = nombre
            return this
        }
        fun vida(vida:Int):Builder{
            this.vida = vida
            return this
        }
        fun build():Medicina{
            return Medicina(nombre, vida)
        }
    }
}