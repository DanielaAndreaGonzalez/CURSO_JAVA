package TallerCiclosYArreglosSinCadenas;

public class ComrpadeProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcularCompra());
	}
	
	public static String calcularCompra(){
		String cadena="";
		
		double descuento=0;
		double suma=0;
		double compra=0;
		double compraDesc=0;
		String artefactos[]={"plancha","licuadora","lavadora","cocina"};
		double precio[] = {500,500,100,200};
		for(int i=0;i<artefactos.length;i++){
			System.out.println(artefactos[i]+" "+precio[i]);
			suma=suma+precio[i];
			
		}
		compra=suma;
		if(compra>1200){
			descuento =(compra*0.17);
			compraDesc=compra-descuento;
		}else{
			descuento=0;
			compraDesc=compra;
		}
		cadena=cadena+"Monto: "+compra+"La compra total es de:"+compraDesc+" descuento: "+descuento;
		return cadena;
	}

}
