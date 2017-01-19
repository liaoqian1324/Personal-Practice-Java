
public class ArrayIntList {
       public int size;
       public int[] elementData;
       
    public int getSize(){
    	return size;
    }
    
    public int[] getElementData(){
    	return elementData;
    	
    }
	
	
	public int indexOf(int value){
		for (int i = 0; i < size; i++){
			if(elementData[i] == value){
				return i;
			}
		}
		return -1;
	}

	public void stutter(){
/*		for(int i = 0; i < size; i++){
			elementData[2 * i + 1] = elementData[i];
			elementData[2 * i] = elementData[i];*/
		for(int i = size -1; i >= 0 ; i--){
			elementData[2 * i + 1] =elementData[i];
			elementData[2 * i] = elementData[i];
			
			}
		
		size *= 2;
		
	}
	
	public void remove(int value){
		for(int i = value; i < size - 1; i++){
			elementData[i] = elementData[i + 1];				
			}
		size--;
			
			

		}
	
	public void add(int index, int value){
		for(int i = index; i < size; i++){
			elementData[i + 1] = elementData[i];
			elementData[i] = value;
		}
		size++;
	}
		
		
	}
	
	
	
	
	




