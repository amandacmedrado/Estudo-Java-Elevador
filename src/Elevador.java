public class Elevador {
    private int andarAtual;
    private int qtdPessoas;

    private int capacidadeTotal;

    private int totalDeAndares;

    private int erro;



    public Elevador(int capacidadeTotal, int totalDeAndares) {
        this.capacidadeTotal = capacidadeTotal;
        this.totalDeAndares = totalDeAndares;
        this.andarAtual = 0;
        this.qtdPessoas = 0;
        this.erro = 0;
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "andarAtual=" + andarAtual +
                ", qtdPessoas=" + qtdPessoas +
                ", capacidadeTotal=" + capacidadeTotal +
                ", totalDeAndares=" + totalDeAndares +
                ", erro=" + erro +
                '}';
    }

    public int getErro() {
        return erro;
    }
    public int getAndarAtual() {
        return andarAtual;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void entrar (){
        if (qtdPessoas <= capacidadeTotal-1){
        qtdPessoas++;
        }
        else {
            System.out.println("Limite máximo.");
            erro ++;
        }
    }

    public void sair() {
        if (qtdPessoas > 0) {
            qtdPessoas--;
        }
        else {
            System.out.println("Não existem pessoas no elevador.");
            erro ++;
        }
    }
    public void subir() {
        if (andarAtual <= totalDeAndares-1){
            andarAtual++;
        }
        else {
            System.out.println("Chegamos no último andar.");
            erro++;
        }
    }
    public void descer(){
        if (andarAtual > 0) {
            andarAtual--;
        }
        else {
            System.out.println("Você chegou no térreo.");
            erro++;
        }
    }

}
