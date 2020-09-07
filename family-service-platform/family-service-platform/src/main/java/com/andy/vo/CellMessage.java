package com.andy.vo;

/**
 * @author andy-liu
 * @date 2020/9/7 - 12:39 PM
 */
public class CellMessage {

    private String unitCode;
    private Integer startFloor;
    private Integer endFloor;
    private Integer startCellId;
    private Integer endCellId;

    public CellMessage() {
    }

    public CellMessage(String unitCode, Integer startFloor, Integer endFloor, Integer startCellId, Integer endCellId) {
        this.unitCode = unitCode;
        this.startFloor = startFloor;
        this.endFloor = endFloor;
        this.startCellId = startCellId;
        this.endCellId = endCellId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Integer getStartFloor() {
        return startFloor;
    }

    public void setStartFloor(Integer startFloor) {
        this.startFloor = startFloor;
    }

    public Integer getEndFloor() {
        return endFloor;
    }

    public void setEndFloor(Integer endFloor) {
        this.endFloor = endFloor;
    }

    public Integer getStartCellId() {
        return startCellId;
    }

    public void setStartCellId(Integer startCellId) {
        this.startCellId = startCellId;
    }

    public Integer getEndCellId() {
        return endCellId;
    }

    public void setEndCellId(Integer endCellId) {
        this.endCellId = endCellId;
    }

    @Override
    public String toString() {
        return "CellMessage{" +
                "unitCode='" + unitCode + '\'' +
                ", startFloor=" + startFloor +
                ", endFloor=" + endFloor +
                ", startCellId=" + startCellId +
                ", endCellId=" + endCellId +
                '}';
    }
}
