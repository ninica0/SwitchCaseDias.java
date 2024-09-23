import javax.swing.JOptionPane;

public class SwitchCaseDias {

	public static void main(String[] args) {
		String DiaSemana;
		int iDiaSemana;
		
		DiaSemana = JOptionPane.showInputDialog("Digite a opção\n"+"1 - Domingo\n"+"2 - Segunda\n"+"3 - Terça\n"+"4 - Quarta\n"+"5 - Quinta\n"+"6 - Sexta\n"+"7 - Sábado\n" );
		iDiaSemana= Integer.parseInt(DiaSemana);
		
		switch (iDiaSemana) {
		case 1:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Domingo, Fim de Semana " + iDiaSemana);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Segunda-feira, Dia Útil " + iDiaSemana);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Terça-feira, Dia Útil " + iDiaSemana);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Quarta-feira, Dia Útil " + iDiaSemana);
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Quinta-feira, Dia Útil " + iDiaSemana);
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Sexta-feira, Dia Útil " + iDiaSemana);
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Sábado, Fim de Semana " + iDiaSemana);
			break;
		}

	}

}
