 #include<stdio.h>


 int search(int low, int high,int key, int array[]) {
	
	int mid;

	while(low <= high) {

		mid = (low + high)/2;

		if( key == array[mid] ) {
			
			return mid;
		} else if( key < array[mid] ) {

			high = mid - 1;
		} else {

			low = mid + 1;
		}
	}

	return  -1;
 }

 

 int main() {


	int array[] = { 1,2,3,4,5,6,7,8,9,10,11,20,23};

	int result =  search(0,12,40,array);
	
	printf("%d\n",result);
	
	

 } 
