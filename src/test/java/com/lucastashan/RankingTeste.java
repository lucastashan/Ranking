package com.lucastashan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RankingTeste {
  private Ranking ranking = null;

   @BeforeEach
   void setUp() {
      ranking = new Ranking();
   }

   @Test
   public void testAddEmpty() {
      Assertions.assertTrue(ranking.add(new Record("lucas", 100)));
   }

   @Test
   public void testAddTrue() {
      ranking.add(new Record("lucas", 100));
      ranking.add(new Record("joao", 20));
      ranking.add(new Record("ana", 90));
      ranking.add(new Record("gustavo", 1));
      ranking.add(new Record("daniela", 3));
      ranking.add(new Record("vitor", 34));
      ranking.add(new Record("julia", 91));
      ranking.add(new Record("luiza", 22));
      ranking.add(new Record("maria", 9));
      ranking.add(new Record("pedro", 55));
      Assertions.assertTrue(ranking.add(new Record("gabriela", 99)));
   }

   @Test
   public void testAddFalse() {
      ranking.add(new Record("lucas", 100));
      ranking.add(new Record("joao", 20));
      ranking.add(new Record("ana", 90));
      ranking.add(new Record("gustavo", 1));
      ranking.add(new Record("daniela", 3));
      ranking.add(new Record("vitor", 34));
      ranking.add(new Record("julia", 91));
      ranking.add(new Record("luiza", 22));
      ranking.add(new Record("maria", 9));
      ranking.add(new Record("pedro", 55));
      Assertions.assertFalse(ranking.add(new Record("isadora", 0)));
   }

   @Test
   public void testNumRecords() {
      ranking.add(new Record("lucas", 100));
      ranking.add(new Record("joao", 20));
      ranking.add(new Record("ana", 90));
      ranking.add(new Record("gustavo", 1));
      ranking.add(new Record("daniela", 3));
      ranking.add(new Record("vitor", 34));
      ranking.add(new Record("julia", 91));
      ranking.add(new Record("luiza", 22));
      ranking.add(new Record("maria", 9));
      Assertions.assertEquals(9, ranking.numRecords());
   }

   @Test
   public void testGetScore() {
      ranking.add(new Record("lucas", 100));
      ranking.add(new Record("joao", 20));
      ranking.add(new Record("ana", 90));
      ranking.add(new Record("gustavo", 1));
      ranking.add(new Record("daniela", 3));
      ranking.add(new Record("vitor", 34));
      ranking.add(new Record("julia", 91));
      ranking.add(new Record("luiza", 22));
      ranking.add(new Record("maria", 9));
      ranking.add(new Record("pedro", 55));
      Assertions.assertEquals(100, ranking.getScore(0).getScore());
   }


   @Test
   public void testGetScoreNull() {
      ranking.add(new Record("lucas", 100));
      ranking.add(new Record("joao", 20));
      ranking.add(new Record("ana", 90));
      ranking.add(new Record("gustavo", 1));
      ranking.add(new Record("daniela", 3));
      ranking.add(new Record("vitor", 34));
      ranking.add(new Record("julia", 91));
      ranking.add(new Record("luiza", 22));
      ranking.add(new Record("maria", 9));
      ranking.add(new Record("pedro", 55));
      Assertions.assertNull(ranking.getScore(11));
   }

   @Test
   public void testWorstScore() {
      ranking.add(new Record("lucas", 100));
      ranking.add(new Record("joao", 20));
      ranking.add(new Record("ana", 90));
      ranking.add(new Record("gustavo", 1));
      ranking.add(new Record("daniela", 3));
      ranking.add(new Record("vitor", 34));
      ranking.add(new Record("julia", 91));
      ranking.add(new Record("luiza", 22));
      ranking.add(new Record("maria", 9));
      ranking.add(new Record("pedro", 55));
      Assertions.assertEquals(1, ranking.worstScore().getScore());
   }

   @Test
   public void testWorstScoreNull() {
      Assertions.assertNull(ranking.worstScore());
   }

   @Test
   public void testBestScore() {
      ranking.add(new Record("lucas", 100));
      ranking.add(new Record("joao", 20));
      ranking.add(new Record("ana", 90));
      ranking.add(new Record("gustavo", 1));
      ranking.add(new Record("daniela", 3));
      ranking.add(new Record("vitor", 34));
      ranking.add(new Record("julia", 91));
      ranking.add(new Record("luiza", 22));
      ranking.add(new Record("maria", 9));
      ranking.add(new Record("pedro", 55));
      Assertions.assertEquals(100, ranking.bestScore().getScore());
   }

   @Test
   public void testBestScoreNull() {
      Assertions.assertNull(ranking.bestScore());
   }
}
