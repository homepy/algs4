package edu.princeton.cs.algs4.c4graphs.s1undirected;

/**
 * 路径API
 * @author hongpai
 *
 */
public abstract class Paths {
	public Paths(Graph G, int s) {
       // do nothing
    }
	
	/**
	 * 是否存在从s到v的路径
	 * @param v
	 * @return
	 */
	public abstract boolean hasPathTo(int v);
	
	/**
	 * s到v的路径，不存在则返回null
	 * @param v
	 * @return
	 */
	public abstract Iterable<Integer> pathTo(int v) ;

}
