/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 * The user profile for the OnlineSongs system. The user has a userID
 * and a favourite type of songs that must be one of the choices in the
 * songsType array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author sheetal, 2019
 */
public class UserProfile 
{
    
    private String userID;//the userID
    private String songType;// the user's preferred song Type
    private String[] songsType = {"Pop", "Latin", "Jazz", "HipHop"};//available types of songs
    
    /**
     * A constructor that takes in the userID and the favourite songType
     * @param givenID the ID to assign to this user
     * @param givenSong the users favourite Songs type
     */
    public UserProfile(String givenID, String givenSong)
    {
        userID = givenID;
        songType= givenSong;
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getsongType() {
        return songType;
    }

    /**
     * @param genre the genre to set
     */
    public void setsongType(String songType) {
        this.songType = songType;
    }
    
    
    
    
    
}//end class
