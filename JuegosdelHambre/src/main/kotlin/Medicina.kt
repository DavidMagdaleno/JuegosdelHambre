class Medicina (n:String, v:Int, Desc:String):Item(Desc){

    private var nombre:String=n
    private var vida:Int=v
    private var Descrip:String=Desc

    fun getNombre(): String {
        return nombre
    }
    fun getVida(): Int {
        return vida
    }
    fun getDescrip(): String {
        return Descrip
    }

    class Builder(var nombre:String = "", var vida:Int = 0,var Descrip:String=""){
        fun nombre(nombre:String):Builder{
            this.nombre = nombre
            return this
        }
        fun vida(vida:Int):Builder{
            this.vida = vida
            return this
        }
        fun Descrip(Descrip:String):Builder{
            this.Descrip = Descrip
            return this
        }
        fun build():Medicina{
            return Medicina(nombre, vida,Descrip)
        }
    }
    override  fun toString(): String{
        return "M"
    }
}