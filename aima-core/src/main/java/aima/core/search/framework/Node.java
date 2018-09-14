package aima.core.search.framework;

import java.util.LinkedList;
import java.util.List;


public class Node<S, A> {


    private S state;


    private Node<S, A> parent;


    private A action;


    private double pathCost;


    public Node(S state) {
        this.state = state;
        pathCost = 0.0;
    }


    public Node(S state, Node<S, A> parent, A action, double pathCost) {
        this(state);
        this.parent = parent;
        this.action = action;
        this.pathCost = pathCost;
    }


    public S getState() {
        return state;
    }


    public Node<S, A> getParent() {
        return parent;
    }


    public A getAction() {
        return action;
    }


    public double getPathCost() {
        return pathCost;
    }


    public boolean isRootNode() {
        return parent == null;
    }

    @Override
    public String toString() {
        return "[parent=" + parent + ", action=" + action + ", state=" + getState() + ", pathCost=" + pathCost + "]";
    }
}