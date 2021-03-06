package com.example.space.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Song {

    @SerializedName("idSong")
    @Expose
    private String idSong;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("idArtist")
    @Expose
    private String idArtist;
    @SerializedName("idTheme")
    @Expose
    private String idTheme;
    @SerializedName("idGenre")
    @Expose
    private String idGenre;
    @SerializedName("idBanner")
    @Expose
    private String idBanner;
    @SerializedName("titleSong")
    @Expose
    private String titleSong;
    @SerializedName("linkImageS")
    @Expose
    private String linkImageS;
    @SerializedName("linkMp3")
    @Expose
    private String linkMp3;

    public String getIdSong() {
        return idSong;
    }

    public void setIdSong(String idSong) {
        this.idSong = idSong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(String idArtist) {
        this.idArtist = idArtist;
    }

    public String getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(String idTheme) {
        this.idTheme = idTheme;
    }

    public String getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(String idGenre) {
        this.idGenre = idGenre;
    }

    public String getIdBanner() {
        return idBanner;
    }

    public void setIdBanner(String idBanner) {
        this.idBanner = idBanner;
    }

    public String getTitleSong() {
        return titleSong;
    }

    public void setTitleSong(String titleSong) {
        this.titleSong = titleSong;
    }

    public String getLinkImageS() {
        return linkImageS;
    }

    public void setLinkImageS(String linkImageS) {
        this.linkImageS = linkImageS;
    }

    public String getLinkMp3() {
        return linkMp3;
    }

    public void setLinkMp3(String linkMp3) {
        this.linkMp3 = linkMp3;
    }

}