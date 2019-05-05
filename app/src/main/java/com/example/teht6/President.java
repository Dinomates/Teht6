package com.example.teht6;

public class President {

    private String name;
    private int electionYear;
    private int deElectionYear;
    private String intel;

    public President(String name, int electionYear, int deElectionYear, String intel) {
        this.name = name;
        this.electionYear = electionYear;
        this.deElectionYear = deElectionYear;
        this.intel = intel;
    }

    public String getName() {
        return this.name;
    }

    public int getElectionYear() {
        return this.electionYear;
    }

    public int getDeElectionYear() {
        return this.deElectionYear;
    }

    public String getIntel() {
        return this.intel;
    }
}
