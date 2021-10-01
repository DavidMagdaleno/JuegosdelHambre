class Distrito (d:Array<Tributo?>) {

    //private var dtributo:Array<Tributo>? = Array<Tributo>(2){null}
    //private var dtributo= arrayOfNulls<Tributo>(2)
    private var dtributo= d

    /*constructor(d:Array<Tributo?>){
        this.dtributo = d
    }*/

    class Builder(var dtributo:Array<Tributo?>) {
        fun dtributo(dtributo: Array<Tributo?>): Builder {
            this.dtributo = dtributo
            return this
        }
        fun build(): Distrito {
            return Distrito(dtributo)
        }
    }
}