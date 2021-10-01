class Medicina (n:String?, v:Int?, Desc:String?):Item(Desc){

    private var nombre:String?=n
    private var vida:Int?=v
    private var Descrip:String?=Desc

    /*override fun Descripcion(): String {
        return "Ha cogido un Super-Arma"
    }*/

    class Builder(var nombre:String? = null, var vida:Int? = null,var Descrip:String?=null){
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
}