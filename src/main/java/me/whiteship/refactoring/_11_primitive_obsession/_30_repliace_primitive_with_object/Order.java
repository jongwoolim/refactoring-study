package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {

    private String priorityValue;
    private Priority priority;

    public Order(Priority priority) {
        this.priority = priority;
    }

    public Order(String priorityValue) {
//        this.priorityValue = priorityValue;
        this(new Priority(priorityValue));
    }

    public String getPriorityValue() {
        return priorityValue;
    }

    public Priority getPriority() {
        return priority;
    }
}
