package com.owngame.entity;

/**
 * Created by Administrator on 2016-7-25.
 * 单场比赛的数据统计类
 * 可以是一个队伍的 也可以是一名球员的
 */
public class GameStats {
    private long id;
    private long gameid;
    private char ismot;
    private int fga;
    private int fgm;
    private int fg;
    private int _3pa;
    private int _3pm;
    private float _3fg;
    private int _2pa;
    private int _2pm;
    private float _2fg;
    private int _1pa;
    private int _1pm;
    private float _1fg;
    private int rebs;
    private int orebs;
    private int blks;
    private int fouls;
    private int ofouls;
    private int stls;
    private int asts;
    private int tos;
    private int _1stScore;
    private int _2ndScore;
    private int _3rdScore;
    private int _4thScore;
    private int otScore;
    private int totalScore;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGameid() {
        return gameid;
    }

    public void setGameid(long gameid) {
        this.gameid = gameid;
    }

    public char getIsmot() {
        return ismot;
    }

    public void setIsmot(char ismot) {
        this.ismot = ismot;
    }

    public int getFga() {
        return fga;
    }

    public void setFga(int fga) {
        this.fga = fga;
    }

    public int getFgm() {
        return fgm;
    }

    public void setFgm(int fgm) {
        this.fgm = fgm;
    }

    public int getFg() {
        return fg;
    }

    public void setFg(int fg) {
        this.fg = fg;
    }

    public int get_3pa() {
        return _3pa;
    }

    public void set_3pa(int _3pa) {
        this._3pa = _3pa;
    }

    public int get_3pm() {
        return _3pm;
    }

    public void set_3pm(int _3pm) {
        this._3pm = _3pm;
    }

    public float get_3fg() {
        return _3fg;
    }

    public void set_3fg(float _3fg) {
        this._3fg = _3fg;
    }

    public int get_2pa() {
        return _2pa;
    }

    public void set_2pa(int _2pa) {
        this._2pa = _2pa;
    }

    public int get_2pm() {
        return _2pm;
    }

    public void set_2pm(int _2pm) {
        this._2pm = _2pm;
    }

    public float get_2fg() {
        return _2fg;
    }

    public void set_2fg(float _2fg) {
        this._2fg = _2fg;
    }

    public int get_1pa() {
        return _1pa;
    }

    public void set_1pa(int _1pa) {
        this._1pa = _1pa;
    }

    public int get_1pm() {
        return _1pm;
    }

    public void set_1pm(int _1pm) {
        this._1pm = _1pm;
    }

    public float get_1fg() {
        return _1fg;
    }

    public void set_1fg(float _1fg) {
        this._1fg = _1fg;
    }

    public int getRebs() {
        return rebs;
    }

    public void setRebs(int rebs) {
        this.rebs = rebs;
    }

    public int getOrebs() {
        return orebs;
    }

    public void setOrebs(int orebs) {
        this.orebs = orebs;
    }

    public int getBlks() {
        return blks;
    }

    public void setBlks(int blks) {
        this.blks = blks;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public int getOfouls() {
        return ofouls;
    }

    public void setOfouls(int ofouls) {
        this.ofouls = ofouls;
    }

    public int getStls() {
        return stls;
    }

    public void setStls(int stls) {
        this.stls = stls;
    }

    public int getAsts() {
        return asts;
    }

    public void setAsts(int asts) {
        this.asts = asts;
    }

    public int getTos() {
        return tos;
    }

    public void setTos(int tos) {
        this.tos = tos;
    }

    public int get_1stScore() {
        return _1stScore;
    }

    public void set_1stScore(int _1stScore) {
        this._1stScore = _1stScore;
    }

    public int get_2ndScore() {
        return _2ndScore;
    }

    public void set_2ndScore(int _2ndScore) {
        this._2ndScore = _2ndScore;
    }

    public int get_3rdScore() {
        return _3rdScore;
    }

    public void set_3rdScore(int _3rdScore) {
        this._3rdScore = _3rdScore;
    }

    public int get_4thScore() {
        return _4thScore;
    }

    public void set_4thScore(int _4thScore) {
        this._4thScore = _4thScore;
    }

    public int getOtScore() {
        return otScore;
    }

    public void setOtScore(int otScore) {
        this.otScore = otScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}
