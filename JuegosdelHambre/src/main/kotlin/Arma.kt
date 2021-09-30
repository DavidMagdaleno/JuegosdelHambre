class Arma (n:String?, f:Int?, Desc:String):Item(Desc) {

    private var nombre:String?=""
    private var fuerza:Int?=0
    private var Descrip:String=""

    /*constructor(n:String?, f:Int?):Item(Desc) {
        this.nombre = n
        this.fuerza = f
        this.Descript = Desc
    }*/

    override fun Descripcion(): String {
        return "Ha cogido un Super-Arma"
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