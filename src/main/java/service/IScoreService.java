package service;

import entity.Item;
import entity.Score;

public interface IScoreService {
    Score addScore(int value, Item item);
    void clearScore(Item item);
    Score getScore(Item item);
}
