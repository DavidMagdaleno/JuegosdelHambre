abstract class Item {
    private var Descripcion:String=""

    constructor(Desc:String){
        this.Descripcion = Desc
    }

    abstract fun Descripcion():String
}