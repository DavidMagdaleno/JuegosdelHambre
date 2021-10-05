class Arma (n:String, f:Int, Desc:String):Item(Desc) {

    private var nombre:String=n
    private var fuerza:Int=f
    private var Descrip:String=Desc


    fun getNombre(): String {
        return nombre
    }

    fun getFuerza(): Int {
        return fuerza
    }

    fun getDescrip(): String {
        return Descrip
    }



    class Builder(var nombre:String = "", var fuerza:Int = 0, var Descrip:String=""){
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

    override  fun toString(): String{
        return "A"
    }
}