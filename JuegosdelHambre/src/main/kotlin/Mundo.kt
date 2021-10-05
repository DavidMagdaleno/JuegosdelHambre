import kotlin.random.Random

class Mundo{

    private var Arena: ArrayList<Any>? = null
    private var Matriz:ArrayList<ArrayList<Any>> = ArrayList()
    private var fila1:ArrayList<Any> = ArrayList(4)
    private var fila2:ArrayList<Any> = ArrayList(4)
    private var fila3:ArrayList<Any> = ArrayList(4)
    private var fila4:ArrayList<Any> = ArrayList(4)
    private var fila5:ArrayList<Any> = ArrayList(4)
    private var tMuertos:ArrayList<Tributo> = ArrayList(0)

    fun getMatriz(): ArrayList<ArrayList<Any>> {
        return Matriz
    }
    fun gettMuertos(): ArrayList<Tributo> {
        return tMuertos
    }



    constructor(m:ArrayList<Any>?){
        this.Arena = m
    }
    class Builder(var Arena:ArrayList<Any>? = null) {
        fun Arena(Arena: ArrayList<Any>?): Builder {
            this.Arena = Arena
            return this
        }
        fun build(): Mundo {
            return Mundo(Arena)
        }
    }
    fun crearArena(){
        for(i in 0..4){
            fila1.add(0)
            fila2.add(0)
            fila3.add(0)
            fila4.add(0)
            fila5.add(0)
        }
        Matriz.add(fila1)
        Matriz.add(fila2)
        Matriz.add(fila3)
        Matriz.add(fila4)
        Matriz.add(fila5)
    }

    fun alea ():Int{
        var alea= Random.nextInt(0,5)
        return alea
    }

    fun rellenarArena(m:ArrayList<ArrayList<Any>>){
        var cont = 0
        for(fila in m){
            var aux2:ArrayList<Any> = Arena?.get(cont) as ArrayList<Any>
            cont++
            for(j in 0..aux2.size-1){
                var valido=false
                while(!valido){
                    var at=alea()
                    if(fila[at].equals(0)){
                        fila[at] = aux2[j]
                        valido=true
                    }else{
                        valido=false
                    }
                }
            }
        }
        m.shuffle()
    }

    fun mostrar(m:ArrayList<ArrayList<Any>>){
        for(fila in m){
            for(i in 0..fila.size-1){
                print(" ")
                print(fila[i])
                print(" ")
            }
            println()
        }
    }

    fun Desplazar(){
        for(i in 0..Matriz.size-1){
            for(j in 0..Matriz.size-1){
                if(Matriz[i][j]!=0){
                    if(Matriz[i][j] is Tributo){
                        var aux4:Tributo = Matriz[i][j] as Tributo
                        var aux=alea()
                        var aux2=alea()
                        if(Matriz[aux][aux2]!=0){
                            if(Matriz[aux][aux2] is Tributo){
                                var aux3:Tributo = Matriz[aux][aux2] as Tributo
                                if(aux3.getFuerza() > aux4.getFuerza()){
                                    //println("El tributo "+aux4.getNombre()+" con una fuerza de "+aux4.getFuerza()+" ha caido a muerto a manos de "+aux3.getNombre()+" con una fuerza de "+aux3.getFuerza())
                                    tMuertos.add(aux4)
                                    Matriz[i][j]=0
                                }
                                if(aux3.getFuerza() < aux4.getFuerza()){
                                    //println("El tributo "+aux3.getNombre()+" con una fuerza de "+aux3.getFuerza()+" ha caido a muerto a manos de "+aux4.getNombre()+" con una fuerza de "+aux4.getFuerza())
                                    tMuertos.add(aux3)
                                    Matriz[aux][aux2]=0
                                    Matriz[aux][aux2]=Matriz[i][j]
                                    Matriz[i][j]=0
                                }
                                if(aux3.getFuerza() == aux4.getFuerza()){
                                    if(aux3.getVida()>aux4.getVida()){
                                        tMuertos.add(aux4)
                                        Matriz[i][j]=0
                                        //println("El tributo "+aux4.getNombre()+" con una vida de "+aux4.getVida()+" ha caido a muerto a manos de "+aux3.getNombre()+" con una vida de "+aux3.getVida())
                                    }
                                    if(aux3.getVida()<aux4.getVida()){
                                        tMuertos.add(aux3)
                                        Matriz[aux][aux2]=0
                                        //println("El tributo "+aux3.getNombre()+" con una vida de "+aux3.getVida()+" ha caido a muerto a manos de "+aux4.getNombre()+" con una vida de "+aux4.getVida())
                                        Matriz[aux][aux2]=Matriz[i][j]
                                        Matriz[i][j]=0
                                    }
                                    if(aux3.getVida()==aux4.getVida()){
                                        var Azar:Int = Random.nextInt(0,1)
                                        if(Azar==0){
                                            tMuertos.add(aux4)
                                            Matriz[i][j]=0
                                            //println("El tributo "+aux4.getNombre()+" con mala suerte ha caido a muerto a manos de "+aux3.getNombre())
                                        }else{
                                            tMuertos.add(aux3)
                                            Matriz[aux][aux2]=0
                                            //println("El tributo "+aux3.getNombre()+" con mala suerte ha caido a muerto a manos de "+aux3.getNombre())
                                            Matriz[aux][aux2]=Matriz[i][j]
                                            Matriz[i][j]=0
                                        }
                                    }
                                }
                            }
                            if(Matriz[aux][aux2] is Trampa){
                                tMuertos.add(aux4)
                                Matriz[i][j]=0
                                //println("El tributo "+Matriz[i][j]+" ha caido en una trampa y ha muerto")

                            }
                            if(Matriz[aux][aux2] is Medicina){
                                var auxMedicina:Medicina = Matriz[aux][aux2] as Medicina
                                aux4.setVida(aux4.getVida()+auxMedicina.getVida())
                                Matriz[aux][aux2]=0
                                Matriz[aux][aux2]=Matriz[i][j]
                                //println("El tributo "+Matriz[i][j]+" se ha puesto vida")
                                Matriz[i][j]=0
                            }
                            if(Matriz[aux][aux2] is Arma){
                                var auxArma:Arma = Matriz[aux][aux2] as Arma
                                aux4.setFuerza(aux4.getFuerza()+auxArma.getFuerza())
                                Matriz[aux][aux2]=0
                                Matriz[aux][aux2]=Matriz[i][j]
                                //println("El tributo "+Matriz[i][j]+" ha cogido un arma")
                                Matriz[i][j]=0
                            }
                        }else{
                            Matriz[aux][aux2]=Matriz[i][j]
                            Matriz[i][j]=0
                        }
                    }
                }
            }
        }
    }


}