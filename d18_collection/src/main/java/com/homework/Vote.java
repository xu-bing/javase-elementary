package com.homework;

/**
 * 用来表示选票
 * 1张选票只能有选1个候选人
 *
 */
public class Vote {
    /**
     * 存储候选人的姓名
     */
    private String name;

    public Vote() {
    }

    public Vote(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vote vote = (Vote) o;

        return name != null ? name.equals(vote.name) : vote.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public static void main(String[] args) {
        Vote vote = new Vote("tom");
        Vote vote1 = new Vote();

        System.out.println(vote.equals(vote1));
    }
}
