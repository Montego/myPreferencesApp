package service;

import entity.Friends;

import java.util.List;

public interface IFriendsService {
    Friends getFriend(String nickname);

    List<Friends> getAllFriends();

    Friends addFriend(Friends friend);

    void deleteFriend(String nickname);

}
