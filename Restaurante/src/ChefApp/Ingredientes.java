package ChefApp;

import Estructuras_Basicas.Lista;



public class Ingredientes {
	Lista <Ingrediente> frutas,vegetales,granos,lacteos,carnes;
	Lista<Ingrediente>todos;
	
	
	public Ingredientes(Lista<Ingrediente> frutas, Lista<Ingrediente> vegetales, Lista<Ingrediente> granos,
			Lista<Ingrediente> lacteos, Lista<Ingrediente> carnes) {
		super();
		this.frutas = frutas;
		this.vegetales = vegetales;
		this.granos = granos;
		this.lacteos = lacteos;
		this.carnes = carnes;
	}
	public Ingredientes(Lista<Ingrediente>todos){
		this.todos=todos;
		
	}

	public Lista<Ingrediente> getFrutas() {
		return frutas;
	}

	public void setFrutas(Lista<Ingrediente> frutas) {
		this.frutas = frutas;
	}

	public Lista<Ingrediente> getVegetales() {
		return vegetales;
	}

	public void setVegetales(Lista<Ingrediente> vegetales) {
		this.vegetales = vegetales;
	}

	public Lista<Ingrediente> getGranos() {
		return granos;
	}

	public void setGranos(Lista<Ingrediente> granos) {
		this.granos = granos;
	}

	public Lista<Ingrediente> getLacteos() {
		return lacteos;
	}

	public void setLacteos(Lista<Ingrediente> lacteos) {
		this.lacteos = lacteos;
	}

	public Lista<Ingrediente> getCarnes() {
		return carnes;
	}

	public void setCarnes(Lista<Ingrediente> carnes) {
		this.carnes = carnes;
	}

	public Ingredientes(){
		frutas=new Lista<>();
		granos=new Lista<>();
		vegetales=new Lista<>();
		lacteos=new Lista<>();
		carnes=new Lista<>();
	}
	
	public void Registrar(String ingrediente, String categoria){
		Ingrediente c= new Ingrediente(categoria,ingrediente);
		todos.insertarPrimero(c);
		
	}
	
	public void acomodar_listas(){
		for (int i=0; i<todos.cuantosElementos(); i++){
			
			if(todos.devolverDato(i).getTipo()=="frutas"){
				frutas.insertarPrimero(todos.devolverDato(i));
			}
			if(todos.devolverDato(i).getTipo()=="vegetales"){
				vegetales.insertarPrimero(todos.devolverDato(i));
			}
			if(todos.devolverDato(i).getTipo()=="lacteos"){
				lacteos.insertarPrimero(todos.devolverDato(i));
			}
			if(todos.devolverDato(i).getTipo()=="granos"){
				granos.insertarPrimero(todos.devolverDato(i));
			}
			if(todos.devolverDato(i).getTipo()=="carnes"){
				carnes.insertarPrimero(todos.devolverDato(i));
			}
		}
	}
	
	public void ordenar(){
		Sort.quick(frutas);
		
		Sort.shell(vegetales);
		Sort.bubble(lacteos);
		Sort.insertion(carnes);
	}
}
