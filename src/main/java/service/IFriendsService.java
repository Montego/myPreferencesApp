package service;

import entity.Friends;

import java.util.List;

public interface IFriendsService {
    Friends getFriend(String nickname);

    List<Friends> getAllFriends();

    Friends addFriend(String nickname);

    void deleteFriend(String nickname);

}
