class Tributo {
    private var nombre:String=""
    private var vida:Int=0
    private var fuerza:Int=0
    private var Distrito:String=""

    fun getNombre(): String {
        return nombre
    }
    fun getDistrito(): String {
        return Distrito
    }
    fun getVida(): Int {
        return vida
    }
    fun setVida(v: Int) {
        vida = v
    }
    fun getFuerza(): Int {
        return fuerza
    }
    fun setFuerza(f: Int) {
        fuerza = f
    }

    constructor(n:String, v:Int,f:Int,d:String){
        this.nombre = n
        this.vida = v
        this.fuerza = f
        this.Distrito = d
    }
    class Builder(var nombre:String = "", var vida:Int = 0, var fuerza:Int = 0,var Distrito:String = ""){
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
    override  fun toString(): String{
        return ""+this.Distrito
    }
}