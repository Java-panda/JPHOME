package com.jphome.system.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 建物管理对象 jh_sharehouse
 * 
 * @author Jpanda
 * @date 2022-11-17
 */
public class Sharehouse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 寮ID */
    private Long sharehouseId;

    /** ユーザーID */
    @Excel(name = "ユーザーID")
    private Long userId;

    /** 寮名称 */
    @Excel(name = "寮名称")
    private String sharehouseName;

    /** 寮写真 */
    @Excel(name = "寮写真")
    private String sharehouseImage;

    /** 経度 */
    @Excel(name = "経度")
    private Long longitude;

    /** 緯度 */
    @Excel(name = "緯度")
    private Long latitude;

    /** 郵便番号 */
    @Excel(name = "郵便番号")
    private String postalCode;

    /** エリア１ */
    @Excel(name = "エリア１")
    private String address01;

    /** エリア２ */
    @Excel(name = "エリア２")
    private String address02;

    /** エリア３ */
    @Excel(name = "エリア３")
    private String address03;

    /** エリア４ */
    @Excel(name = "エリア４")
    private String address04;

    /** 路線１ */
    @Excel(name = "路線１")
    private String route01;

    /** 駅１ */
    @Excel(name = "駅１")
    private String station01;

    /** 徒歩１ */
    @Excel(name = "徒歩１")
    private Integer walking01;

    /** 路線２ */
    @Excel(name = "路線２")
    private String route02;

    /** 駅２ */
    @Excel(name = "駅２")
    private String station02;

    /** 徒歩２ */
    @Excel(name = "徒歩２")
    private Integer walking02;

    /** 女性限定 */
    @Excel(name = "女性限定")
    private Integer womenOnly;

    /** 外国人可否 */
    @Excel(name = "外国人可否")
    private Integer foreignersAccept;

    /** 英語 */
    @Excel(name = "英語")
    private Integer englishSupport;

    /** 日本語 */
    @Excel(name = "日本語")
    private Integer japaneseSupport;

    /** 中国語 */
    @Excel(name = "中国語")
    private Integer chineseSupport;

    /** ベトナム語 */
    @Excel(name = "ベトナム語")
    private Integer vietnameseSupport;

    /** 韓国語 */
    @Excel(name = "韓国語")
    private Integer koreanSupport;

    /** 他の条件 */
    @Excel(name = "他の条件")
    private String conditions;

    /** ソート順 */
    @Excel(name = "ソート順")
    private Long sortOrder;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 部屋管理信息 */
    private List<SharehouseRoom> sharehouseRoomList;

    public void setSharehouseId(Long sharehouseId) 
    {
        this.sharehouseId = sharehouseId;
    }

    public Long getSharehouseId() 
    {
        return sharehouseId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setSharehouseName(String sharehouseName) 
    {
        this.sharehouseName = sharehouseName;
    }

    public String getSharehouseName() 
    {
        return sharehouseName;
    }
    public void setSharehouseImage(String sharehouseImage) 
    {
        this.sharehouseImage = sharehouseImage;
    }

    public String getSharehouseImage() 
    {
        return sharehouseImage;
    }
    public void setLongitude(Long longitude) 
    {
        this.longitude = longitude;
    }

    public Long getLongitude() 
    {
        return longitude;
    }
    public void setLatitude(Long latitude) 
    {
        this.latitude = latitude;
    }

    public Long getLatitude() 
    {
        return latitude;
    }
    public void setPostalCode(String postalCode) 
    {
        this.postalCode = postalCode;
    }

    public String getPostalCode() 
    {
        return postalCode;
    }
    public void setAddress01(String address01) 
    {
        this.address01 = address01;
    }

    public String getAddress01() 
    {
        return address01;
    }
    public void setAddress02(String address02) 
    {
        this.address02 = address02;
    }

    public String getAddress02() 
    {
        return address02;
    }
    public void setAddress03(String address03) 
    {
        this.address03 = address03;
    }

    public String getAddress03() 
    {
        return address03;
    }
    public void setAddress04(String address04) 
    {
        this.address04 = address04;
    }

    public String getAddress04() 
    {
        return address04;
    }
    public void setRoute01(String route01) 
    {
        this.route01 = route01;
    }

    public String getRoute01() 
    {
        return route01;
    }
    public void setStation01(String station01) 
    {
        this.station01 = station01;
    }

    public String getStation01() 
    {
        return station01;
    }
    public void setWalking01(Integer walking01) 
    {
        this.walking01 = walking01;
    }

    public Integer getWalking01() 
    {
        return walking01;
    }
    public void setRoute02(String route02) 
    {
        this.route02 = route02;
    }

    public String getRoute02() 
    {
        return route02;
    }
    public void setStation02(String station02) 
    {
        this.station02 = station02;
    }

    public String getStation02() 
    {
        return station02;
    }
    public void setWalking02(Integer walking02) 
    {
        this.walking02 = walking02;
    }

    public Integer getWalking02() 
    {
        return walking02;
    }
    public void setWomenOnly(Integer womenOnly) 
    {
        this.womenOnly = womenOnly;
    }

    public Integer getWomenOnly() 
    {
        return womenOnly;
    }
    public void setForeignersAccept(Integer foreignersAccept) 
    {
        this.foreignersAccept = foreignersAccept;
    }

    public Integer getForeignersAccept() 
    {
        return foreignersAccept;
    }
    public void setEnglishSupport(Integer englishSupport) 
    {
        this.englishSupport = englishSupport;
    }

    public Integer getEnglishSupport() 
    {
        return englishSupport;
    }
    public void setJapaneseSupport(Integer japaneseSupport) 
    {
        this.japaneseSupport = japaneseSupport;
    }

    public Integer getJapaneseSupport() 
    {
        return japaneseSupport;
    }
    public void setChineseSupport(Integer chineseSupport) 
    {
        this.chineseSupport = chineseSupport;
    }

    public Integer getChineseSupport() 
    {
        return chineseSupport;
    }
    public void setVietnameseSupport(Integer vietnameseSupport) 
    {
        this.vietnameseSupport = vietnameseSupport;
    }

    public Integer getVietnameseSupport() 
    {
        return vietnameseSupport;
    }
    public void setKoreanSupport(Integer koreanSupport) 
    {
        this.koreanSupport = koreanSupport;
    }

    public Integer getKoreanSupport() 
    {
        return koreanSupport;
    }
    public void setConditions(String conditions) 
    {
        this.conditions = conditions;
    }

    public String getConditions() 
    {
        return conditions;
    }
    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    public List<SharehouseRoom> getSharehouseRoomList()
    {
        return sharehouseRoomList;
    }

    public void setSharehouseRoomList(List<SharehouseRoom> sharehouseRoomList)
    {
        this.sharehouseRoomList = sharehouseRoomList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sharehouseId", getSharehouseId())
            .append("userId", getUserId())
            .append("sharehouseName", getSharehouseName())
            .append("sharehouseImage", getSharehouseImage())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("postalCode", getPostalCode())
            .append("address01", getAddress01())
            .append("address02", getAddress02())
            .append("address03", getAddress03())
            .append("address04", getAddress04())
            .append("route01", getRoute01())
            .append("station01", getStation01())
            .append("walking01", getWalking01())
            .append("route02", getRoute02())
            .append("station02", getStation02())
            .append("walking02", getWalking02())
            .append("womenOnly", getWomenOnly())
            .append("foreignersAccept", getForeignersAccept())
            .append("englishSupport", getEnglishSupport())
            .append("japaneseSupport", getJapaneseSupport())
            .append("chineseSupport", getChineseSupport())
            .append("vietnameseSupport", getVietnameseSupport())
            .append("koreanSupport", getKoreanSupport())
            .append("conditions", getConditions())
            .append("sortOrder", getSortOrder())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("sharehouseRoomList", getSharehouseRoomList())
            .toString();
    }
}
