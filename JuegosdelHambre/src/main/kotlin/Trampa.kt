class Trampa (n:String?, Desc:String?):Item(Desc){

    private var nombre:String?=n
    private var Descrip:String?=Desc

    /*override fun Descripcion(): String {
        return "Ha cogido un Super-Arma"
    }*/

    class Builder(var nombre:String? = null,var Descrip:String?=null){
        fun nombre(nombre:String):Builder{
            this.nombre = nombre
            return this
        }
        fun Descrip(Descrip:String):Builder{
            this.Descrip = Descrip
            return this
        }
        fun build():Trampa{
            return Trampa(nombre, Descrip)
        }
    }
}