package battleships_test;

import battleships.board;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testymctest {
	boolean[][] co_ordinates = new boolean[3][3];
	board b1 = new board(co_ordinates);

	@Before
	public void b4() {
		co_ordinates = new boolean[3][3];
		b1 = new board(co_ordinates);
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				co_ordinates[x][y] = false;
			}
		}
	}

	@Test
	public void valid_place() {
		assertEquals(b1.valid_place(0, 0), true);

	}

	@Test
	public void valid_direction() {
		assertEquals(b1.valid_direction("e", 0, 0), true);
	}

	@Test
	public void hit() {
		b1.valid_place(1, 1);
		assertEquals(b1.hit(1, 1), true);

	}
	
	@Test
	public void empty(){
		b1.valid_place(1, 1);
		b1.hit(1, 1);
		assertEquals(b1.isempty(), true);
	}

}
