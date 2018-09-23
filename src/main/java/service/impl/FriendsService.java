package service.impl;

import entity.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.FriendsRepository;
import service.IFriendsService;

import java.util.List;
@Service
public class FriendsService implements IFriendsService {

    private FriendsRepository friendsRepository;
    @Autowired
    public FriendsService(FriendsRepository friendsRepository){
        this.friendsRepository = friendsRepository;
    }

    @Override
    public Friends getFriend(String nickname) {
        return null;
    }

    @Override
    public List<Friends> getAllFriends() {
        return null;
    }

    @Override
    public Friends addFriend(String nickname) {
        return null;
    }

    @Override
    public void deleteFriend(String nickname) {

    }
}
