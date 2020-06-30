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

	public boolean buscar(int x){
		if(raiz==null){
			return false;
		}else{
			if(x==raiz.dato){
				return true;
			}else{
				if(x<raiz.dato){
					return buscar(x,raiz.hIzq);
				}
				else
					return buscar(x,raiz.hDer);
			}
		}
	}
	private boolean buscar(int x, NodoABB raiz){
		if(raiz==null){
			return false;
		}else{
			if(x==raiz.dato){
				return true;
			}else{
				if(x<raiz.dato){
					return buscar(x,raiz.hIzq);
				}
				else
					return buscar(x,raiz.hDer);
			}
		}
	}
	public int buscaMayorMenores(){
		if (raiz==null) return -1;
		else return buscaMayorMenores(raiz);
	}
	private int buscaMayorMenores(NodoABB raiz){
		NodoABB temp=raiz;
		if (raiz==null) return -1;
		else{
		temp=temp.hIzq;
			while (temp.hDer!=null) temp=temp.hDer;
		}
		return temp.dato;
	}
	public void eliminar(int x){

	}
}