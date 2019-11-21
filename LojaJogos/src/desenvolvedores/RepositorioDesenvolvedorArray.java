package desenvolvedores;

public class RepositorioDesenvolvedorArray implements RepositorioDesenvolvedores 
{
	
	private Desenvolvedor[] desenvolvedores;
	private int index;
	
	public RepositorioDesenvolvedorArray(int maxIndex)
	{
		desenvolvedores= new Desenvolvedor[maxIndex];
		index=0;
	}
	public void inserir(Desenvolvedor desenvolvedor) 
	{
		desenvolvedores[index] = desenvolvedor;
		index++;
		
	}

	public void remover(String cnpj) 
	{
		int i=this.getIndex(cnpj);
		if(i<index)
		{
			this.index--;
			this.desenvolvedores[i]=this.desenvolvedores[index];
			this.desenvolvedores[this.index]=null;
		}
	}

	public boolean existe(String cnpj) 
	{
		boolean resposta=false;
		int i=this.getIndex(cnpj);
		if(i!=index)
			resposta=true;
		return resposta;
	}

	
	public Desenvolvedor procurar(String cnpj) 
	{
		Desenvolvedor resposta=null;
		int i=this.getIndex(cnpj);
		if(i<index)
			resposta=desenvolvedores[i];
		return resposta;
	}

	
	public void atualiza(Desenvolvedor desenvolvedor)
	{
		int i=this.getIndex(desenvolvedor.getCnpj());
		if(i<index)
			desenvolvedores[i]=desenvolvedor;
	}
	
	private int getIndex(String cnpj)
	{
		int i =0;
		while(i<this.index&&!desenvolvedores[i].getCnpj().equals(cnpj))
			i++;
		
		return i;
	}
}
