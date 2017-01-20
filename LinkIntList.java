


public class LinkIntList {
	private ListNode front;
	
	public LinkIntList(){
		front = null;
	}
	
	public int size(){
		int count = 0;
		ListNode current = front;
		while (current.next != null){
			current = current.next;
				count++;
			}
		return count;
	}
	
	public int get(int index){
		ListNode current1 = front;
		for(int i = 0; i < index; i++){
			current1 = current1.next;
			
		}
		return current1.data;
		
	}
	
	public String toString(){
		ListNode current2 = front;
		if(front == null){
			return "[]";
		}else{
			while (current2.next != null){
				current2 = current2.next;
				return "[" + "current2.data" + "";
			}
			return "]";
		}
		
	}
	
	
	
}
