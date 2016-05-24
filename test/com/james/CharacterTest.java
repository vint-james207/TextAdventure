package com.james;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jamesyburr on 5/24/16.
 */
public class CharacterTest {
    @Test
    public void battle() throws Exception {
        Player player = new Player();
        player.name = "Test Player";
        Enemy enemy = new Enemy ("Test Enemy", 5, 5);
        player.battle(enemy);
        assertTrue(player.health > 0);
        assertTrue(enemy.health <= 0);
    }

}