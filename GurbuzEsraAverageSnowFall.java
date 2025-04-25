import javax.swing.JOptionPane;

	public class GurbuzEsraAverageSnowFall{
		public static void main(String[] args){

		String Snowfalln = JOptionPane.showInputDialog("Snowfall for November: ");
		double November = Double.parseDouble(Snowfalln);
		String Snowfalld = JOptionPane.showInputDialog("Snowfall for December: ");
		double December = Double.parseDouble(Snowfalld);
		String Snowfallj = JOptionPane.showInputDialog("Snowfall for January: ");
		double January = Double.parseDouble(Snowfallj);
		String Snowfallf = JOptionPane.showInputDialog("Snowfall for February: ");
		double Febuary = Double.parseDouble(Snowfallf);
		String Snowfallm = JOptionPane.showInputDialog("Snowfall for March: ");
		double March = Double.parseDouble(Snowfallm);

		JOptionPane.showMessageDialog(null, (November + December + January + Febuary + March) / 5);

		}
}




