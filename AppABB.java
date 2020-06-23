class AppABB{
	public static void main(String[] args) {
		ABB a = new ABB();
		a.insertar(5);
		a.insertar(2);
		a.insertar(8);
		System.out.println("raiz "+a.raiz.dato);
		System.out.println("hijo izquierdo "+a.raiz.hIzq.dato);
		System.out.println("hijo derecho "+a.raiz.hDer.dato);



	}

}