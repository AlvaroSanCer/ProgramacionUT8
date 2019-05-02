package ejemplo20MVC.modelo;

public class Modelo {
private int sumando1;
private int sumando2;
public Modelo(int sumando1,int sumando2){
this.sumando1=sumando1;
this.sumando2=sumando2;
}
public int sumar(){
return sumando1+sumando2;
}
}