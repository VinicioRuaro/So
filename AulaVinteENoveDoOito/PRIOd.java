/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaVinteENoveDoOito;

/**
 *
 * @author vinic
 */
public class PRIOd {
    public static void main(String[] args) {
        int[] processos = new int[10];
        int[] processosPrioridade = new int[10];
        int[] processosTempo = new int[10];
        int[] processosFeito = new int[10];
        int[] processosPrioridadeInicial = new int[10];
        
        processos[0]= 1;
        processosPrioridade[0]=3;
        processosTempo[0]=300;
        processos[1]= 2;
        processosPrioridade[1]=2;
        processosTempo[1]=250;
        processos[2]= 3;
        processosPrioridade[2]=5;
        processosTempo[2]=100;
        processos[3]= 4;
        processosPrioridade[3]=8;
        processosTempo[3]=200;
        processos[4]= 5;
        processosPrioridade[4]=3;
        processosTempo[4]=250;
        processos[5]= 6;
        processosPrioridade[5]=1;
        processosTempo[5]=150;
        processos[6]= 7;
        processosPrioridade[6]=1;
        processosTempo[6]=100;
        processos[7]= 8;
        processosPrioridade[7]=4;
        processosTempo[7]=200;
        processos[8]= 9;
        processosPrioridade[8]=6;
        processosTempo[8]=300;
        processos[9]= 10;
        processosPrioridade[9]=1;
        processosTempo[9]=200;
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
        processosPrioridadeInicial[0]=processosPrioridade[0];
        processosPrioridadeInicial[1]=processosPrioridade[1];
        processosPrioridadeInicial[2]=processosPrioridade[2];
        processosPrioridadeInicial[3]=processosPrioridade[3];
        processosPrioridadeInicial[4]=processosPrioridade[4];
        processosPrioridadeInicial[5]=processosPrioridade[5];
        processosPrioridadeInicial[6]=processosPrioridade[6];
        processosPrioridadeInicial[7]=processosPrioridade[7];
        processosPrioridadeInicial[8]=processosPrioridade[8];
        processosPrioridadeInicial[9]=processosPrioridade[9];
        
        int atual = 0;
        int a =0;
        
        for(;processosTempo[0]==0&&processosTempo[1]==0&&processosTempo[2]==0&&processosTempo[3]==0&&processosTempo[4]==0&&processosTempo[5]==0&&processosTempo[6]==0&&processosTempo[7]==0&&processosTempo[8]==0&&processosTempo[9]==0;){
            
            atual = 0;
            
            for(int b=0;b<10;b++){   
                if(processosPrioridade[atual]<processosPrioridade[b]){
                    atual=b;
                }
            }
            
            processosTempo[atual]=0;
            processosPrioridade[atual]=processosPrioridadeInicial[atual];
            processosFeito[atual]=1;
            

            
            for(int b=0;b<10;b++){
                if(processosFeito[b]!=1){
                    processosPrioridade[b]++;
                }
            }
        }
    }
}


