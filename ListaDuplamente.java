package DuplamenteEncadeada;

public class ListaDuplamente  {
	
//  Lista duplamente encadeada
//  Adicionar no inicio, adicionar no fim, 
//	  remover no inicio,remover no fim, listar
	public static void main(String[] args) {
		
		DuplamenteEncadeada<Integer> lista = new DuplamenteEncadeada();
	for (int i = 0; i < 5; i++) {
		lista.adicionarInicio(i);	
	}
	System.out.println("Adicionado no Inicio:");
	System.out.println(lista);
	for (int i = 0; i < 3; i++) {
		lista.removerInicio();	
	}
	System.out.println("Removendo no Inicio:");
	System.out.println(lista);
System.out.println("\n");
for (int i = 0; i < 5; i++) {
	lista.adicionarInicio(i);	
}
System.out.println("Adicionado no Inicio:");
System.out.println(lista);
for (int i = 0; i < 2; i++) {
	lista.removerInicio();	
}
System.out.println("removendo 2 no Inicio:");
System.out.println(lista);

lista.removerFim();
System.out.println("removendo no 1 no fim:");
System.out.println(lista);
}
}
