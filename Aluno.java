
import java.util.ArrayList;

public class Aluno {
  
  private String nome;
  private String sobrenome;
private int codigo;
private ArrayList< Notas > notas = new ArrayList();

public Aluno(String nome, int codigo){
    
    this.nome = nome;
    this.codigo = codigo;

}

    public String getNome() {
    
        return nome;
    
    }

    public String getSobrenome() {
     
        return sobrenome;
   
    }

    public int getCodigo() {
      
        return codigo;
    
    }

    public ArrayList getNotas() {
      
        return notas;
   
    }


}
    

