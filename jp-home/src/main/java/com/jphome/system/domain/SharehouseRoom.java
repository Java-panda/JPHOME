package com.jphome.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 部屋管理对象 jh_sharehouse_room
 * 
 * @author Jpanda
 * @date 2022-11-17
 */
public class SharehouseRoom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 寮ID */
    private Long sharehouseId;

    /** 部屋ID */
    private Long sharehouseRoomId;

    /** 部屋名称 */
    @Excel(name = "部屋名称")
    private String sharehouseRoomName;

    /** 部屋写真 */
    @Excel(name = "部屋写真")
    private String sharehouseRoomImage;

    /** 成功報酬 */
    @Excel(name = "成功報酬")
    private Long successReward;

    /** 広さ */
    @Excel(name = "広さ")
    private Long roomArea;

    /** 入居人数 */
    @Excel(name = "入居人数")
    private Integer numPeoples;

    /** 水道料金 */
    @Excel(name = "水道料金")
    private Integer hasWaterFee;

    /** ガス料金 */
    @Excel(name = "ガス料金")
    private Integer hasGasFee;

    /** 電気料金 */
    @Excel(name = "電気料金")
    private Integer hasElectFee;

    /** WIFI料金 */
    @Excel(name = "WIFI料金")
    private Integer hasWifiFee;

    /** 鍵 */
    @Excel(name = "鍵")
    private Integer hasRoomKey;

    /** 床 */
    @Excel(name = "床")
    private Integer hasBed;

    /** 机 */
    @Excel(name = "机")
    private Integer hasDesk;

    /** 椅子 */
    @Excel(name = "椅子")
    private Integer hasChair;

    /** 収納 */
    @Excel(name = "収納")
    private Integer hasStorage;

    /** エアコン */
    @Excel(name = "エアコン")
    private Integer hasAirCon;

    /** 冷蔵庫 */
    @Excel(name = "冷蔵庫")
    private Integer hasRefrigerator;

    /** テレビ */
    @Excel(name = "テレビ")
    private Integer hasTv;

    /** 角部屋 */
    @Excel(name = "角部屋")
    private Integer cornerRoom;

    /** 日当り */
    @Excel(name = "日当り")
    private Integer sunnyRoom;

    /** 其の他の条件 */
    @Excel(name = "其の他の条件")
    private String otherTerms;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setSharehouseId(Long sharehouseId) 
    {
        this.sharehouseId = sharehouseId;
    }

    public Long getSharehouseId() 
    {
        return sharehouseId;
    }
    public void setSharehouseRoomId(Long sharehouseRoomId) 
    {
        this.sharehouseRoomId = sharehouseRoomId;
    }

    public Long getSharehouseRoomId() 
    {
        return sharehouseRoomId;
    }
    public void setSharehouseRoomName(String sharehouseRoomName) 
    {
        this.sharehouseRoomName = sharehouseRoomName;
    }

    public String getSharehouseRoomName() 
    {
        return sharehouseRoomName;
    }
    public void setSharehouseRoomImage(String sharehouseRoomImage) 
    {
        this.sharehouseRoomImage = sharehouseRoomImage;
    }

    public String getSharehouseRoomImage() 
    {
        return sharehouseRoomImage;
    }
    public void setSuccessReward(Long successReward) 
    {
        this.successReward = successReward;
    }

    public Long getSuccessReward() 
    {
        return successReward;
    }
    public void setRoomArea(Long roomArea) 
    {
        this.roomArea = roomArea;
    }

    public Long getRoomArea() 
    {
        return roomArea;
    }
    public void setNumPeoples(Integer numPeoples) 
    {
        this.numPeoples = numPeoples;
    }

    public Integer getNumPeoples() 
    {
        return numPeoples;
    }
    public void setHasWaterFee(Integer hasWaterFee) 
    {
        this.hasWaterFee = hasWaterFee;
    }

    public Integer getHasWaterFee() 
    {
        return hasWaterFee;
    }
    public void setHasGasFee(Integer hasGasFee) 
    {
        this.hasGasFee = hasGasFee;
    }

    public Integer getHasGasFee() 
    {
        return hasGasFee;
    }
    public void setHasElectFee(Integer hasElectFee) 
    {
        this.hasElectFee = hasElectFee;
    }

    public Integer getHasElectFee() 
    {
        return hasElectFee;
    }
    public void setHasWifiFee(Integer hasWifiFee) 
    {
        this.hasWifiFee = hasWifiFee;
    }

    public Integer getHasWifiFee() 
    {
        return hasWifiFee;
    }
    public void setHasRoomKey(Integer hasRoomKey) 
    {
        this.hasRoomKey = hasRoomKey;
    }

    public Integer getHasRoomKey() 
    {
        return hasRoomKey;
    }
    public void setHasBed(Integer hasBed) 
    {
        this.hasBed = hasBed;
    }

    public Integer getHasBed() 
    {
        return hasBed;
    }
    public void setHasDesk(Integer hasDesk) 
    {
        this.hasDesk = hasDesk;
    }

    public Integer getHasDesk() 
    {
        return hasDesk;
    }
    public void setHasChair(Integer hasChair) 
    {
        this.hasChair = hasChair;
    }

    public Integer getHasChair() 
    {
        return hasChair;
    }
    public void setHasStorage(Integer hasStorage) 
    {
        this.hasStorage = hasStorage;
    }

    public Integer getHasStorage() 
    {
        return hasStorage;
    }
    public void setHasAirCon(Integer hasAirCon) 
    {
        this.hasAirCon = hasAirCon;
    }

    public Integer getHasAirCon() 
    {
        return hasAirCon;
    }
    public void setHasRefrigerator(Integer hasRefrigerator) 
    {
        this.hasRefrigerator = hasRefrigerator;
    }

    public Integer getHasRefrigerator() 
    {
        return hasRefrigerator;
    }
    public void setHasTv(Integer hasTv) 
    {
        this.hasTv = hasTv;
    }

    public Integer getHasTv() 
    {
        return hasTv;
    }
    public void setCornerRoom(Integer cornerRoom) 
    {
        this.cornerRoom = cornerRoom;
    }

    public Integer getCornerRoom() 
    {
        return cornerRoom;
    }
    public void setSunnyRoom(Integer sunnyRoom) 
    {
        this.sunnyRoom = sunnyRoom;
    }

    public Integer getSunnyRoom() 
    {
        return sunnyRoom;
    }
    public void setOtherTerms(String otherTerms) 
    {
        this.otherTerms = otherTerms;
    }

    public String getOtherTerms() 
    {
        return otherTerms;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sharehouseId", getSharehouseId())
            .append("sharehouseRoomId", getSharehouseRoomId())
            .append("sharehouseRoomName", getSharehouseRoomName())
            .append("sharehouseRoomImage", getSharehouseRoomImage())
            .append("successReward", getSuccessReward())
            .append("roomArea", getRoomArea())
            .append("numPeoples", getNumPeoples())
            .append("hasWaterFee", getHasWaterFee())
            .append("hasGasFee", getHasGasFee())
            .append("hasElectFee", getHasElectFee())
            .append("hasWifiFee", getHasWifiFee())
            .append("hasRoomKey", getHasRoomKey())
            .append("hasBed", getHasBed())
            .append("hasDesk", getHasDesk())
            .append("hasChair", getHasChair())
            .append("hasStorage", getHasStorage())
            .append("hasAirCon", getHasAirCon())
            .append("hasRefrigerator", getHasRefrigerator())
            .append("hasTv", getHasTv())
            .append("cornerRoom", getCornerRoom())
            .append("sunnyRoom", getSunnyRoom())
            .append("otherTerms", getOtherTerms())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
