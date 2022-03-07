package com.orxanibrahim.tsldasboard.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Match {
    private int id;
    private LocalDate date;
    private LocalDate year;
    private LocalDate week;
    private String homeTeam;
    private String visitorTeam;
    private int fullTimeResult;
    private String homeTeamGoal;
    private String visitorTeamGoal;
    private String halfTimeResult;
    private String homeRedCard;
    private String visitorRedCard;
}
