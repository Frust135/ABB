class ABB{
	NodoABB raiz;

	ABB(){
		raiz=null;
	}

	public void insertar(int x){ //NodoABB insertar(int x, NodoABB raiz)
		if(raiz==null){
			raiz=new NodoABB(x);
		}else{
			if(x<raiz.dato){
				raiz.hIzq=insertar(x,raiz.hIzq);
			}else{
				raiz.hDer=insertar(x,raiz.hDer);
			}
		}

	}
	private NodoABB insertar(int x, NodoABB raiz){
		if(raiz==null){
			raiz=new NodoABB(x);
		}else{
			if(x<raiz.dato){
				raiz.hIzq=insertar(x,raiz.hIzq);
			}else{
				raiz.hDer=insertar(x,raiz.hDer);
			}
		}
		return raiz;
	}
	public void preorden(){
		if(raiz!=null){
			System.out.println(raiz.dato);
			preorden(raiz.hIzq);
			preorden(raiz.hDer);
		}
	}
	private void preorden(NodoABB raiz){
		if(raiz!=null){
			System.out.println(raiz.dato);
			preorden(raiz.hIzq);
			preorden(raiz.hDer);
		}
	}
}