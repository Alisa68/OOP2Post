package ru.netology.maganer;

import ru.netology.domain.WritingOnTheWall;

public class PostManager {
    private int privateID;
    private String domain;
    private String query;
    private boolean ownersOnly;
    private byte count;
    private int offset;
    private int postId;

    WritingOnTheWall[] writingOnTheWalls;


    public WritingOnTheWall[] getWritingOnTheWallsToArray() {
        // to do;
        return null;
    }


    public WritingOnTheWall[] search(int ownerId, int id) {
        // to do;
        return null;
    }


    public void delete(int ownerId, int id) {
        //to find the post in Array and delete it
    }

}
