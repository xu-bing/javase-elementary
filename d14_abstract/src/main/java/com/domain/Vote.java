package com.domain;

import java.util.HashSet;
import java.util.Set;

public class Vote {
    private Integer no;
    private Set<Candidate>  candidates;

    public Vote() {
    }

    public Vote(Integer no, Set<Candidate> candidates) {
        this.no = no;
        this.candidates = candidates;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Set<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(Set<Candidate> candidates) {
        this.candidates = candidates;
    }

    public static void main(String[] args) {
        Vote vote = new Vote();

        Set<Candidate> candidates = new HashSet<Candidate>();
        candidates.add(new Candidate("tom", 25));
        candidates.add(new Candidate("tom",26));
        candidates.add(new Candidate("tom",25));
        System.out.println(candidates.size());


        vote.setCandidates(candidates);

        for (Candidate c: candidates) {
            System.out.println(c.getName() + ":::" + c.getAge());
        }


    }// main
}
