package Hashmap;
import java.util.LinkedList;
import java.util.Objects;


public class HashMap {
	private LinkedList<Node>[] buckets;
	private int n;//no of nodes
	private int N;//no of buckets
	public HashMap() {
		N = 4;
		buckets = new LinkedList[N];
		for(int i = 0 ; i<buckets.length; i++) {
			buckets[i] = new LinkedList<>();
		}
	}
	
	
	public String getValue(int key) {
		int bi = hashFunction(key);
		int di = getDataIndex(bi, key);
		if(di == -1)return null;
		return buckets[bi].get(di).value;
	}
	
	
	public boolean containsKey(int key) {
		int bi = hashFunction(key);
		int di = getDataIndex(bi, key);
		if(di == -1)return false;
		return true;
	}
	
	
	public void put(int key, String value) {
		int bi = hashFunction(key);//returns the bucket index
		int di = getDataIndex(bi, key);//returns the data index of the node in the list of that particular bucket index
		if(di == -1) {
			buckets[bi].add(new Node(key, value));
			n++;
		}else {
			buckets[bi].get(di).value = value;//update the value
		}
		double lambda = (double)n/N;
		if(lambda> 2.0) {
			rehash();
		}
	}
	
	private void rehash() {
		LinkedList<Node>[] old = buckets;
		buckets = new LinkedList[N*2];
		N = buckets.length;
		for(int  i = 0; i<buckets.length; i++) {
			buckets[i] = new LinkedList<>();
		}
		n = 0;
		for(int  i = 0; i<old.length; i++) {
			LinkedList<Node> list = old[i];
			for(int j = 0; j<list.size(); j++) {
				Node node = list.get(j);
				put(node.key, node.value);
			}
		}
	}
	
	public int getDataIndex(int bi, int key) {
		LinkedList<Node> list = buckets[bi];
		for(int i = 0; i<list.size(); i++) {
			Node node = list.get(i);
			if(key == node.key) {
				return i;
			}
		}
		return -1;
	}
	
	public int size() {
		return n;
	}
	
	//Display the Hash Map
	public void display() {
		for(int i = 0; i<buckets.length; i++) {
			for(int j = 0; j<buckets[i].size(); j++) {
				System.out.println(buckets[i].get(j).key+"->"+buckets[i].get(j).value);
			}
		}
	}
	
	public int hashFunction(int key) {
		return (Math.abs(Objects.hash(key)))%buckets.length;
	}
	
	private class Node{
		int key;
		String value;
		Node(int key, String value){
			this.key = key;
			this.value = value;
		}
	}
}

