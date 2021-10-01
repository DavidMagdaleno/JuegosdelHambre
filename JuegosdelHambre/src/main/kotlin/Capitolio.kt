import kotlin.random.Random

class Capitolio {

    private var repositorio= arrayOfNulls<Item>(100)

    fun alea ():Int{
        var alea= Random.nextInt(1,3)
        return alea
    }
    fun rellenarRepositorio(){
        for(i in 0..100){
            when(alea()){
                1->repositorio[i]=Factoria.generarArma()
                2->repositorio[i]=Factoria.generarMedicina()
                3->repositorio[i]=Factoria.generarTrampa()
            }
        }
    }
}