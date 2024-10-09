package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    public void equals_returns_correct_string() {

        assertEquals(true, team.equals(team));

        assertEquals(false, team.equals("string"));

        Team team2 = new Team("test-team");
        assertEquals(true, team.equals(team2));

        Team team3 = new Team("test-team2");
        assertEquals(false, team.equals(team3));

        Team team4 = new Team("test-team4");
        team4.addMember("Christy");
        assertEquals(false, team.equals(team4));

        Team team5 = new Team("test-team");
        team5.addMember("Christy");
        assertEquals(false, team.equals(team5));
    }
    @Test
    public void hashCode_returns_correct_string() {
        // instantiate t as a Team object
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
     
    }
    

}
