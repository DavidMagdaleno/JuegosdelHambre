class TributoS5 (n: String?, v: Int?, f: Int?, d: String?) : Tributo(n, v, f, d) {


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
        fun build():TributoS5{
            return TributoS5(nombre, vida,fuerza, Distrito)
        }
    }
}