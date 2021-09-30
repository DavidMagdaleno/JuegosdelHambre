class Trampa {

    private var nombre:String?=""


    constructor(n:String?){
        this.nombre = n
    }


    class Builder(var nombre:String? = null){
        fun nombre(nombre:String):Builder{
            this.nombre = nombre
            return this
        }

        fun build():Trampa{
            return Trampa(nombre)
        }
    }
}