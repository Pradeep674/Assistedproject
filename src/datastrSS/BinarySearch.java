package datastrSS;

public class BinarySearch {
	    public static  void main(String[] args){


	        int[] arr = {34,67,89,12,50};
	        int key = 89;
	        int arrlength = arr.length;
	        BinarySearch(arr,0,key,arrlength);
	    }

	public static void BinarySearch(int[] arr, int start, int key, int length){

	        int midValue = (start+length)/2;
	        while(start<=length){

	            if(arr[midValue]<key){

	                start = midValue + 1;
	            } else if(arr[midValue]==key){
	                System.out.println("Element is found at index :"+midValue);
	                break;
	            }else {

	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length){

	                System.out.println("Element is not found");
	            }

	}

	}

