package poo;

public class Retangulo {

    private int altura;
    private int largura;


    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo(){
        altura = 4;
        largura = 4;
    }

    public void AlteraAltura(int a){
        this.altura = a;

    }

    public void AlteraLargura(int l){

        this.largura = l;
    }

    public void setLargura(int l){
        if(largura >=2){
            this.largura = l;
        }else this.largura = 2;

    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura>=2) {
            this.altura = altura;
        }else this.altura = 2;
    }

    public int getLargura() {
        return largura;
    }

    public String desenharRetangulo(String formato){
        String retL="";
        String CaracLarg = "";
        String CaracAltura = "";
        String PontaEsqSup= "";
        String PontaDirSup = "";
        String PontaEsqInf = "";
        String PontaDirInf = "";



        if(formato == "ASCII"){

            CaracLarg = "-";
            CaracAltura = "|";
            PontaEsqInf = "+";
            PontaDirInf = "+";
            PontaDirSup = "+";
            PontaEsqSup = "+";
            retL = PontaEsqSup;
        }
        if(formato == "UTF8"){

            CaracLarg = "\u2500";
            CaracAltura = "\u2502";
            PontaEsqInf = "\u2514";
            PontaDirInf = "\u2518";
            PontaDirSup = "\u2510";
            PontaEsqSup = "\u250c";
            retL = PontaEsqSup;

        }

        //Desenha

        int x,y;

        for(x=0;x<largura-2;x++){
            retL = retL + CaracLarg;
        }

        retL = retL+PontaDirSup+"\n";

        for(y=0;y<altura-2;y++){
            for(int k=0;k<largura;k++){
                if(k==largura-1||k==0){
                    retL = retL+CaracAltura;
                   // System.out.println("bla");
                }else{
                    retL = retL + " ";
                }
            }
            retL = retL+"\n";
        }
        retL = retL+PontaEsqInf;

        for(x=0;x<largura-2;x++){
            retL = retL +CaracLarg;
        }
        retL = retL+PontaDirInf;
        return retL;


    }

    public String desenharASCII(){
        return desenharRetangulo("ASCII");

    }

    public String desenharUTF8(){
        return desenharRetangulo("UTF8");
    }






}
