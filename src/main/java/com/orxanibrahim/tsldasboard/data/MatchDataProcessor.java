package com.orxanibrahim.tsldasboard.data;

import com.orxanibrahim.tsldasboard.model.Match;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

    private static Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);
        @Override
        public Match process(final MatchInput matchInput) throws Exception {
           Match match = new Match();
           match.setId(Integer.parseInt(matchInput.getId()));
           match.setDate(LocalDate.parse(matchInput.getDate()));
           match.setYear(LocalDate.parse(matchInput.getYear()));
           match.setWeek(LocalDate.parse(matchInput.getWeek()));
           match.setHomeTeam(matchInput.getHomeTeam());
           match.setVisitorTeam(matchInput.getVisitorTeam());
           match.setFullTimeResult(Integer.parseInt(matchInput.getResult()));
           match.setHomeTeamGoal(matchInput.getHome_team_goal());
           match.setVisitorTeamGoal(matchInput.getVisitor_team_goal());
           match.setHalfTimeResult(matchInput.getHalf_time_result());
           match.setVisitorRedCard(matchInput.getVisitor_red_card());
           match.setHomeRedCard(matchInput.getHome_red_card());

           return match;
        }

    }

