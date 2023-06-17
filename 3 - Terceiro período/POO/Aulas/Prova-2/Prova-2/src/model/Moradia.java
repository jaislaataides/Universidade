package model;

/**
 *
 * @author jaiss
 */
public abstract class Moradia {
    //atributos
    protected String tipoMoradia;
    protected int tamanhoMoradia;
    protected int valorMoradia;
    
    private final String[] tipos = {"Casa", "Apto"};
    private final String[] tamanhos = {"pequena, média, grande"};
    private final String[] valores = {"baixo, médio, alto"};
    
    //métodos
    public Moradia(int  tipoMoradia, int tamanhoMoradia, int valorMoradia) {
        this.tipoMoradia = tipos[tipoMoradia];
        this.tamanhoMoradia = tamanhoMoradia;
        this.valorMoradia = valorMoradia;
    }

    public Moradia() {
        this.tipoMoradia = tipos[0];
    }

    public String getTipoMoradia() {
        return tipoMoradia;
    }

    public int getTamanhoMoradia() {
        return tamanhoMoradia;
    }

    public int getValorMoradia() {
        return valorMoradia;
    }

    public String[] getTipos() {
        return tipos;
    }

    public String[] getTamanhos() {
        return tamanhos;
    }

    public String[] getValores() {
        return valores;
    }

    public void setTipoMoradia(String tipoMoradia) {
        this.tipoMoradia = tipoMoradia;
    }

    public void setTamanhoMoradia(int tamanhoMoradia) {
        this.tamanhoMoradia = tamanhoMoradia;
    }

    public void setValorMoradia(int valorMoradia) {
        this.valorMoradia = valorMoradia;
    }

    @Override
    public String toString() {
        return "Moradia{" + "tipoMoradia=" + tipoMoradia + ", tamanhoMoradia=" + tamanhoMoradia + ", valorMoradia=" + valorMoradia + '}';
    }
}