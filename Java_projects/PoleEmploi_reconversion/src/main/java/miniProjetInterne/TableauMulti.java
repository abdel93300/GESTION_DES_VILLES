package miniProjetInterne;
import java.util.Scanner;

public class TableauMulti {

	public static void main(String[] args) {

		int[][] tab = { { 1, 4, 6, 33, 88 }, { 5, 0, 33, 7, 222, 99 }, { 6, 7 } };
		for (int i = 0; i != tab.length; ++i) {
			for (int k = 0; k != tab[i].length; k++) {
				System.out.println("El�ment ligne : " + i + " col. :" + k + "=" + tab[i][k]);
			}
			System.out.println();
		}
	}

}
