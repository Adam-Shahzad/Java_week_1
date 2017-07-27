import java.util.ArrayList;

public class quick_sort { // not my code
	int partition(int list[], int small, int big)
	{
	      int i = small, j = big;
	      int tmp;
	      int pivot = list[(small + big) / 2];
	     
	      while (i <= j) {
	            while (list[i] < pivot)
	                  i++;
	            while (list[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = list[i];
	                  list[i] = list[j];
	                  list[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	void Sort(int list[], int small, int large) {
	      int index = partition(list, small, large);
	      if (small < index - 1)
	            Sort(list, small, index - 1);
	      if (index < large)
	           Sort(list, index, large);
	}
}