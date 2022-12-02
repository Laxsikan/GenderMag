
public class test {

// Used for index in heap
	static int x = -1;

// Predefining the heap array
	static String[] heap = new String[1000];

// Defining formation of the heap
	static void heapForm(String k) {
		x++;

		heap[x] = k;

		int child = x;

		String tmp;

		int index = x / 2;

		// Iterative heapiFy
		while (index >= 0) {

			// Just swapping if the element
			// is smaller than already
			// stored element
			if (heap[index].compareTo(heap[child]) > 0) {

				// Swapping the current index
				// with its child
				tmp = heap[index];
				heap[index] = heap[child];
				heap[child] = tmp;
				child = index;

				// Moving upward in the
				// heap
				index = index / 2;
			} else {
				break;
			}
		}
	}

// Defining heap sort
	static void heapSort() {
		int left1, right1;

		while (x >= 0) {
			String k;
			k = heap[0];

			// Taking output of
			// the minimum element
			System.out.print(k + " ");

			// Set first element
			// as a last one
			heap[0] = heap[x];

			// Decrement of the
			// size of the string
			x = x - 1;

			String tmp;

			int index = 0;

			int length = x;

			// Initializing the left
			// and right index
			left1 = 1;

			right1 = left1 + 1;

			while (left1 <= length) {

				// Process of heap sort
				// If root element is
				// minimum than its both
				// of the child then break
				if (heap[index].compareTo(heap[left1]) <= 0 && heap[index].compareTo(heap[right1]) <= 0) {
					break;
				}

				// Otherwise checking that
				// the child which one is
				// smaller, swap them with
				// parent element
				else {

					// Swapping
					if (heap[left1].compareTo(heap[right1]) < 0) {
						tmp = heap[index];
						heap[index] = heap[left1];
						heap[left1] = tmp;
						index = left1;
					}

					else {
						tmp = heap[index];
						heap[index] = heap[right1];
						heap[right1] = tmp;
						index = right1;
					}
				}

				// Changing the left index
				// and right index
				left1 = 2 * left1;
				right1 = left1 + 1;
			}
		}
	}

// Utility function
	static void sort(String k[], int n) {

		// To heapiFy
		for (int i = 0; i < n; i++) {
			heapForm(k[i]);
		}

		// Calling heap sort function
		heapSort();
	}

// Driver Code
	public static void main(String[] args) {
		String arr[] = { "1. The Godfather\r\n" + "2. The Shawshank Redemption\r\n" + "3. The Dark Knight\r\n"
				+ "4. Schindler's List\r\n" + "5. Pulp Fiction\r\n" + "6. Star Wars\r\n"
				+ "7. The Lord of the Rings\r\n" + "8. Forrest Gump\r\n" + "9. The Silence of the Lambs\r\n"
				+ "10. Inception\r\n" + "11. Jurassic Park\r\n" + "12. Goodfellas\r\n" + "13. The Matrix\r\n"
				+ "14. Fight Club\r\n" + "15. Terminator 2\r\n" + "16. The Lion King\r\n"
				+ "17. Raiders of the Lost Ark\r\n" + "18. Saving Private Ryan\r\n" + "19. Back to the Future\r\n"
				+ "20. Jaws\r\n" + "21. Toy Story\r\n" + "22. Titanic\r\n" + "23. Gladiator\r\n" + "24. Casablanca\r\n"
				+ "25. E.T.\r\n" + "26. Star Trek\r\n" + "27. The Sixth Sense\r\n" + "28. The Usual Suspects\r\n"
				+ "29. Alien\r\n" + "30. Spirited Away\r\n" + "31. Psycho\r\n" + "32. 2001: A Space Odyssey\r\n"
				+ "33. Seven Samurai\r\n" + "34. The Shining\r\n" + "35. It's a Wonderful Life\r\n" + "36. Die Hard\r\n"
				+ "37. The Big Lebowski\r\n" + "38. City of God\r\n" + "39. Crouching Tiger, Hidden Dragon\r\n"
				+ "40. Apocalypse Now\r\n" + "41. The Green Mile\r\n" + "42. The Departed\r\n" + "43. The Pianist\r\n"
				+ "44. Amélie\r\n" + "45. The Wizard of Oz\r\n" + "46. Memento\r\n" + "47. Requiem for a Dream\r\n"
				+ "48. Monty Python and the Holy Grail\r\n" + "49. Fargo\r\n" + "50. The Good, the Bad and the Ugly\r\n"
				+ "51. La La Land\r\n" + "52. Pan's Labyrinth\r\n" + "53. 12 Angry Men\r\n"
				+ "54. The Grand Budapest Hotel\r\n" + "55. Heat\r\n" + "56. The Sting\r\n" + "57. Braveheart\r\n"
				+ "58. Singin' in the Rain\r\n" + "59. The Bridge on the River Kwai\r\n" + "60. The Seventh Seal\r\n"
				+ "61. The Intouchables\r\n" + "62. Blade Runner\r\n" + "63. The Grapes of Wrath\r\n"
				+ "64. The Lives of Others\r\n" + "65. Amadeus\r\n" + "66. The Wild Bunch\r\n" + "67. Gravity\r\n"
				+ "68. Reservoir Dogs\r\n" + "69. Lawrence of Arabia\r\n" + "70. The General\r\n"
				+ "71. The Lion in Winter\r\n" + "72. The Deer Hunter\r\n" + "73. The Social Network\r\n"
				+ "74. On the Waterfront\r\n" + "75. The Princess Bride\r\n" + "76. Raging Bull\r\n"
				+ "77. Some Like It Hot\r\n" + "78. Network\r\n" + "79. The Big Sleep\r\n" + "80. The Truman Show\r\n"
				+ "81. Akira\r\n" + "82. Vertigo\r\n" + "83. Beauty and the Beast\r\n" + "84. The African Queen\r\n"
				+ "85. The Shawshank Redemption\r\n" + "86. The Thing\r\n" + "87. The Godfather Part II\r\n"
				+ "88. L.A. Confidential\r\n" + "89. The Breakfast Club\r\n" + "90. Groundhog Day\r\n"
				+ "91. The King's Speech\r\n" + "92. Dr. Strangelove\r\n" + "93. The Night of the Hunter\r\n"
				+ "94. Once Upon a Time in the West\r\n" + "95. Alien\r\n" + "96. Seven\r\n"
				+ "97. The Magnificent Seven\r\n" + "98. The Apartment\r\n" + "99. The Good, The Bad, The Weird\r\n"
				+ "100. The 400 Blows" };

		// System.out.println(Arrays.toString(arr));

		int n = arr.length;

		sort(arr, n);
	}
}