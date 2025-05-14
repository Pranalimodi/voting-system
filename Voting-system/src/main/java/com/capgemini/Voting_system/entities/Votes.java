package com.capgemini.Voting_system.entities;

import jakarta.persistence.Entity;



import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Votes")
public class Votes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voteId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "user_Id" ,insertable = false,updatable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false,referencedColumnName = "candidate_Id" ,insertable = false,updatable = false)
    private Candidates candidate;

    @ManyToOne
    @JoinColumn(name = "election_id", nullable = false, referencedColumnName = "candidate_Id" ,insertable = false,updatable = false)
    private Elections election;

    @Column(nullable = false)
    private LocalDateTime timeStamp;

    // Getters and Setters

    public int getVoteId() {
        return voteId;
    }

    public void setVoteId(int voteId) {
        this.voteId = voteId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Candidates getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidates candidate) {
        this.candidate = candidate;
    }

    public Elections getElection() {
        return election;
    }

    public void setElection(Elections election) {
        this.election = election;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimestamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

	@Override
	public String toString() {
		return "Votes [voteId=" + voteId + ", user=" + user + ", timestamp=" + timestamp + "]";
	}
    
    
}

