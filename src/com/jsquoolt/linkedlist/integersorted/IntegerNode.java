package com.jsquoolt.linkedlist.integersorted;

public class IntegerNode {

    private Integer value;
    private IntegerNode next;
    private IntegerNode previous;

    public IntegerNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public IntegerNode getPrevious() {
        return previous;
    }

    public void setPrevious(IntegerNode previous) {
        this.previous = previous;
    }

    public String toString() {
        return value.toString();
    }

}
