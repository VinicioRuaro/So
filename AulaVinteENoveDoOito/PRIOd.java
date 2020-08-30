
package AulaVinteENoveDoOito;
    public static void main(String[] args) {
        
        int[] processos = new int[10];
        int[] processosPrioridade = new int[10];
        int[] processosTempo = new int[10];
        int[] processosFeito = new int[10];
        
        processos[0]= 1;
        processosPrioridade[0]=3;
        processosPrioridade[0]=300;
        processos[1]= 2;
        processosPrioridade[1]=2;
        processosPrioridade[1]=250;
        processos[2]= 3;
        processosPrioridade[2]=5;
        processosPrioridade[2]=100;
        processos[3]= 4;
        processosPrioridade[3]=8;
        processosPrioridade[3]=200;
        processos[4]= 5;
        processosPrioridade[4]=3;
        processosPrioridade[4]=250;
        processos[5]= 6;
        processosPrioridade[5]=1;
        processosPrioridade[5]=150;
        processos[6]= 7;
        processosPrioridade[6]=1;
        processosPrioridade[6]=100;
        processos[7]= 8;
        processosPrioridade[7]=4;
        processosPrioridade[7]=200;
        processos[8]= 9;
        processosPrioridade[8]=6;
        processosPrioridade[8]=300;
        processos[9]= 10;
        processosPrioridade[9]=1;
        processosPrioridade[9]=200;
        processosFeito[0]=0;
        processosFeito[1]=0;
        processosFeito[2]=0;
        processosFeito[3]=0;
        processosFeito[4]=0;
        processosFeito[5]=0;
        processosFeito[6]=0;
        processosFeito[7]=0;
        processosFeito[8]=0;
        processosFeito[9]=0;
        
        int atual = 0;
        int a =0;
        
        for(;processosTempo[0]==0&&processosTempo[1]==0&&processosTempo[2]==0&&processosTempo[3]==0&&processosTempo[4]==0&&processosTempo[5]==0&&processosTempo[6]==0&&processosTempo[7]==0&&processosTempo[8]==0&&processosTempo[9]==0;){
            for(;a<200||processosTempo[atual]==0;a++){
                processosTempo[atual]--;
                if(processosTempo[atual]==0){
                    System.out.println("A tarefa"+ processos[atual] +"Terminou.\n" );
                    break;
                }
                
            }
            a=0;
            atual++;
            }
         }
public class PRIOd {
    
}
