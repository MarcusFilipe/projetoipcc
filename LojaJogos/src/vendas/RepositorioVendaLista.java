package vendas;

public class RepositorioVendaLista implements RepositorioVenda {
	private RepositorioVendaLista next;
	private Venda node;
	public RepositorioVendaLista() {
		this.next=null;
		this.node=null;
		
	}
	public void inserir(Venda venda) {
		if (this.node==null) {
			this.node=venda;
			this.next=new RepositorioVendaLista();
		}else {
			this.next.inserir(venda);
		}
	}
	public void remover(String id) {
		if(this.node!=null) {
			if (this.node.getId().contentEquals(id)) {
				this.node=this.next.node;
				this.next=this.next.next;
			}else {
				this.next.remover(id);
			}
		}
	}
	public void atualizar(Venda venda) {
		boolean kapa = existe(venda.getId());
		if (kapa) {
			if (this.node.getId().equals(venda.getId())) {
				this.node=venda;
			}else
				this.next.atualizar(venda);
		}
	}
	public Venda procurar(String id) {
		if (this.node!=null) {
			if (this.node.getId().contentEquals(id)) {
				return this.node;
			}else {
				if (this.next!=null)
					return this.next.procurar(id);
				else
					return null;
			}
		}else 
			return null;
	}
	public boolean existe(String id) {
		if(this.node!=null) {
			if (this.node.getId().contentEquals(id))
				return true;
			else {
				if (this.next!=null)
					return this.next.existe(id);
				else
					return false;
			}
		}else
			return false;
	}
	
}
