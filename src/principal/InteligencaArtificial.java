/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author aluno
 */
import agente.AgenteLabirinto;
import ambiente.Labirinto;
import geral.PosicaoXY;

public class InteligencaArtificial {
    public static void main(String[] args) throws InterruptedException	 {
		
		Labirinto labirinto = new Labirinto(4);	
		labirinto.exibirLabirinto();
		
		AgenteLabirinto agente = new AgenteLabirinto(labirinto);
		agente.setPosicao(new PosicaoXY(0,0));

		while(agente.isAindaLimpando()) {
			agente.zerarPilha();
			agente.movimentar(); 
			labirinto.exibirLabirinto();
			Thread.sleep(1500);
		}
		return;
	}

}
