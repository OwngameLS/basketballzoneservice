package com.owngame.entity;

import java.sql.Date;

/**
 * Created by Administrator on 2016/7/23.
 */
public class PlayerInfos {
    private long id;
    private long curTeamid;
    private String historyTeams;
    private int age;
    private Date birthday;
    private String resume;
    private String name;
    private char sex;
    private String jersyno;
    private float height;
    private float weight;
    private float armspan;
    private String position;
    private int games;
    private int mvp;
    private String prides;
    private long statid;
    private String iconimg;
    private String grade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCurTeamid() {
        return curTeamid;
    }

    public void setCurTeamid(long curTeamid) {
        this.curTeamid = curTeamid;
    }

    public String getHistoryTeams() {
        return historyTeams;
    }

    public void setHistoryTeams(String historyTeams) {
        this.historyTeams = historyTeams;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getJersyno() {
        return jersyno;
    }

    public void setJersyno(String jersyno) {
        this.jersyno = jersyno;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getArmspan() {
        return armspan;
    }

    public void setArmspan(float armspan) {
        this.armspan = armspan;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getMvp() {
        return mvp;
    }

    public void setMvp(int mvp) {
        this.mvp = mvp;
    }

    public String getPrides() {
        return prides;
    }

    public void setPrides(String prides) {
        this.prides = prides;
    }

    public long getStatid() {
        return statid;
    }

    public void setStatid(long statid) {
        this.statid = statid;
    }

    public String getIconimg() {
        return iconimg;
    }

    public void setIconimg(String iconimg) {
        this.iconimg = iconimg;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "PlayerInfos{" +
                "id=" + id +
                ", curTeamid=" + curTeamid +
                ", historyTeams='" + historyTeams + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", resume='" + resume + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", jersyno='" + jersyno + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", armspan=" + armspan +
                ", position='" + position + '\'' +
                ", games=" + games +
                ", mvp=" + mvp +
                ", prides='" + prides + '\'' +
                ", statid=" + statid +
                ", iconimg='" + iconimg + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
