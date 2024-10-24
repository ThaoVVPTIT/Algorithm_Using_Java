package day5.ads.java;

import day4.ads.java.SLNode;

public class NodePoolMgr {
	SLNode[] nodes;
	boolean[] isFree;
	
	public NodePoolMgr(int poolSize) {
		nodes = new SLNode[poolSize];
		isFree = new boolean[poolSize];
		
		for (int i = 0; i < poolSize; ++i) {
			nodes[i] = new SLNode();
			isFree[i] = true;
		}
	}
	
	public SLNode createNode() {
		for (int i = 0; i < isFree.length; ++i) {
			if (isFree[i]) {
				isFree[i] = false;
				System.out.println("Create returning ref at index " + i);
				return nodes[i];
			}
		}
		return null; // TODO: Throw Exception.
	}
	
	public void deleteNode(SLNode node) {
		for (int i = 0; i < nodes.length; ++i) {
			if (nodes[i] == node) {
				isFree[i] = true;
				System.out.println("Delete got ref at index " + i);
				return;
			}
		}
	}
}
