package com.orxanibrahim.tsldasboard.data;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchInput {
    private String id;
    private String date;
    private String year;
    private String week;
    private String homeTeam;
    private String visitorTeam;
    private String full_time_result_score;
    private String home_team_goal;
    private String visitor_team_goal;
    private String division;
    private String tier;
    private String totalgoal;
    private String goaldiff;
    private String match_winner;
    private String half_time_result;
    private String hgoal_half;
    private String vgoal_half;
    private String half_totgoal;
    private String half_goaldiff;
    private String result_half;
    private String fans;
    private String neutral;
    private String home_red_card;
    private String visitor_red_card;
}


