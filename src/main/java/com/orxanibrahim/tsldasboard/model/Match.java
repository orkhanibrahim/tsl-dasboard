package com.orxanibrahim.tsldasboard.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Match {
    @Id
    private long id;
    private LocalDate date;
    private String year;
    private String week;
    private String homeTeam;
    private String visitorTeam;
    private String fullTimeResultScore;
    private String matchWinner;
    private String homeTeamGoal;
    private String visitorTeamGoal;
    private String halfTimeResult;
    private String homeRedCard;
    private String visitorRedCard;
}
