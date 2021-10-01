class Mundo (m:Array<Distrito?>){

    //var mapa:Array<Distrito> = Array<Distrito>(5){null}
    private var Arena= arrayOfNulls<Distrito>(5)

    class Builder(var Arena:Array<Distrito?>) {
        fun Arena(Arena: Array<Distrito?>): Builder {
            this.Arena = Arena
            return this
        }
        fun build(): Mundo {
            return Mundo(Arena)
        }
    }
}