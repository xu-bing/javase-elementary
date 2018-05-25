package com.domain;

public class Candidate {
    private String name;
    private Integer age;

    public Candidate() {
    }

    public Candidate(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
       /* if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candidate candidate = (Candidate) o;

        if (name != null ? !name.equals(candidate.name) : candidate.name != null) return false;
        return age != null ? age.equals(candidate.age) : candidate.age == null;*/

       Candidate candidate = (Candidate) o;

       if (name.equals(((Candidate) o).getName()) && age.equals(candidate.getAge())){
           return true;
       } else {
           return false;
       }

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
