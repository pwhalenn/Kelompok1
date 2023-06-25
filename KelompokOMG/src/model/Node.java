package model;

abstract class Node<T> {

    abstract T getNext();
    abstract void setNext(T data);
}