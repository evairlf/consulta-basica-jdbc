package part4Exercicios;
/**
 * Curso
 */
public class Curso {

    private int id;
    private String nome;
    private int duracaoHoras;

    public Curso() {
    }

    

    public Curso(int id, String nome, int duracaoHoras) {
        this.setId(id);
        this.setNome(nome);
        this.setDuracaoHoras(duracaoHoras);
    }

    public Curso(String nome, int duracaoHoras) {
        this.setNome(nome);
        this.setDuracaoHoras(duracaoHoras);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
       sb.append(", Duração Curso='").append(duracaoHoras);
        return sb.toString();
    }
    
}