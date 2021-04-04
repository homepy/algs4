package edu.princeton.cs.algs4.c4graphs.s1undirected;

/**
 * 无向图处理算法API
 * @author hongpai
 *
 */
public abstract class Search {
	/**
	 * 找到和起点s连通的所有顶点
	 * @param g 无向图g
	 * @param s 无向图g的顶点s
	 */
	public Search(Graph g, int s) {
	}
	/**
	 * v和s是否连通
	 */
	public abstract boolean marked(int v);
	
	/**
	 * 
	 * @return 与s连通的顶点总数
	 */
	public abstract int count();

}
