class Distrito {


    private var dtributo:ArrayList<Tributo>?

    constructor(d:ArrayList<Tributo>?){
        this.dtributo = d
    }

    class Builder(var d:ArrayList<Tributo>? = null) {
        fun dtributo(dtributo: ArrayList<Tributo>?): Builder {
            this.d = dtributo
            return this
        }
        fun build(): ArrayList<Tributo> {
            return ArrayList<Tributo>(d)
        }
    }
}