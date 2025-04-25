import javax.swing.JOptionPane;

	public class GurbuzEsraDistanceTravelled{
		public static void main(String[] args){

		String second = JOptionPane.showInputDialog(" How many second did the brick fall take? ");
		Double scd = Double.parseDouble(second);

		double scdsqr = Math.pow(scd, 2);
		double distance = 0.5 * 32.174 * scdsqr;

		JOptionPane.showMessageDialog(null, "The distance the brick fall is: " + distance + " feet.");
	}
}