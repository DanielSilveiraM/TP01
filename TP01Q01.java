class TP01Q01{
   
    //Verificar se a string esta vazia para determinar o fim.
    public static boolean isFim(String s){

        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'){
            return true;
        }

        return false;
    }


    public static boolean isPalindromo(String s){
       
        String sInvert = "";

        //Pego o tamanho da string dada e vou diminuindo em 1 para cada loop
        for(int i=s.length() -1 ; i>=0 ; i--){

            //A nova string irá copiar a string dada porem ao contrário
            sInvert += s.charAt(i);
        }

        //Compara se cada letra da string é igual a outra, e caso não seja ela retorna falsa e acaba
        for(int i=0 ; i < s.length() ; i++){
            if(sInvert.charAt(i) != s.charAt(i)){
                return false;
            }
        }
        //Caso ela tenha passado no teste da string, ela retorna true
        return true;
    }

    
    public static void main(String[] Args){

        String palindromo = ""; 


        //Imprime SIM para caso seja true e NÃO para caso seja false
        while(isFim(palindromo) == false){
            
            palindromo = MyIO.readLine();

            if(isFim(palindromo) == true){
                break;
            }

            if(isPalindromo(palindromo) == true){
                MyIO.println("SIM");
            }
            else{
                MyIO.println("NAO");
            }
        }     
    }
}