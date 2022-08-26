package br.ed.eteczl.ProjetoMaven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTime
{
	private String  data;
	
	private String hora;
	
	public DayTime()
	{
		Date dataHoraAtual = new Date();
		
		this.SetData(new SimpleDateFormat("dd/mm/yyyy").format(dataHoraAtual));
		
		this.SetHora(new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual));
	}
	
	public String getData()
	{
		return data;
	}
	
	public void SetData(String data)
	{
		this.data = data;
	}
	
	public String getHora()
	{
		return hora;
	}
	
	public void SetHora(String data)
	{
		this.data = hora;
	}
}
