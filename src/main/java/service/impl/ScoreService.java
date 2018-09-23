package service.impl;

import entity.Item;
import entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ScoreRepository;
import service.IScoreService;
@Service
public class ScoreService implements IScoreService {

    private ScoreRepository scoreRepository;
    @Autowired
    public ScoreService(ScoreRepository scoreRepository){
        this.scoreRepository = scoreRepository;
    }

    @Override
    public Score addScore(int value, Item item) {
        return null;
    }

    @Override
    public void clearScore(Item item) {

    }

    @Override
    public Score getScore(Item item) {
        return null;
    }
}
