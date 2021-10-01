class Arma (n:String?, f:Int?, Desc:String?):Item(Desc) {

    private var nombre:String?=n
    private var fuerza:Int?=f
    private var Descrip:String?=Desc

    /*override fun Descripcion(): String {
        return "Ha cogido un Super-Arma"
    }*/
    class Builder(var nombre:String? = null, var fuerza:Int? = null, var Descrip:String?=null){
        fun nombre(nombre:String):Builder{
            this.nombre = nombre
            return this
        }
        fun fuerza(fuerza:Int):Builder{
            this.fuerza = fuerza
            return this
        }
        fun Descrip(Descrip:String):Builder{
            this.Descrip = Descrip
            return this
        }
        fun build():Arma{
            return Arma(nombre, fuerza,Descrip)
        }
    }
}