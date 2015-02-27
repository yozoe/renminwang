package com.android.service.internal.remote.models;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by issuser on 15/2/16.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 9198631467823364758L;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    private String authenticateInfo;//具体认证内容,最多20个汉字或40个字符
    private String authenticateTime;
    private String backTag;//监控、运营可以打标签
    private String belongsCrowd="1";//默认1
    private String bindPhoneNo;//用户填写的手机号，绑定的手机号
    private String coverFigureModifyTime;//后台记录用户修改封面图的时间
    private String deleted;//1：是；0：否；
    private String gagDeadline;//在此时间之前该用户不能发言、跟帖
    private String headPortrait;//用户头像,用户可以上传、修改，大小不超过2m(待定)，若用户不上传，显示默认头像，用户头像（圆头像）客户端尺寸：50*50   70*70    100*100   185*185
    private String headPortraitModifyTime;//后台记录用户修改头像的时间
    private String idCard;//身份证号
    private String isVip;//1：是；0：否；
    private String location;//完善基本信息时由用户自行填写，可以更改,省份精确到地级市，直辖市精确到辖区
    private String loginEquipment;//记录用户每次登录Live时所用的设备，1：PC；2：iPhone客户端；3：Android客户端；
    private String loginIp;//记录用户每次登录时iP地址
    private String loginLocation;//字段存储为经度纬度坐标（X、Y），坐标解析成地址串要求：直辖市精确到“/城市/区/商圈”；省会城市精确到“/城市/区”其他为“城市”；国外只显示国家名称。若用户选择了某个POI，则除了解析城市外，还需要显示具体POI名称
    private String loginLocationLatitude;//保留小数点后6位
    private String loginLocationLongitude;//保留小数点后6位
    private String loginName;//手机号可以作为登录名；若第三方注册则为用户分配的一个随机登录名和第三方账号绑定，用户用第三方登录也可以登录。
    private String loginTime;//记录用户每次登录时间
    private Map<String,Object> map ;//
    private String otherPropertyModifyTime;//
    private String password;//6-16位英文、数字或字符组合
    private String registEquipment;//用户注册设备    1：PC；2：iPhone客户端；3：Android客户端；
    private String registIp;//用户注册账号时的所在iP地址
    private String registLocation;//字段存储为经度纬度坐标（X、Y），坐标解析成地址串要求：直辖市精确到“/城市/区/商圈”；省会城市精确到“/城市/区”其他为“城市”；国外只显示国家名称。若用户选择了某个POI，则除了解析城市外，还需要显示具体POI名称
    private String registLocationName;//经纬度解析后的地址信息
    private String registLocationLatitude;//保留小数点后6位
    private String registLocationLongitude;//保留小数点后6位
    private String registResource;//注册来源   1：用手机号注册；2：第三方账号注册；
    private String registTime;//用户注册账号的时间
    private String sex="1";//用户性别       1男2女
    private String signature;//个性签名只支持文字,最多20个汉字或40个字符
    private String threeThRegistId="";//第三方账号注册id
    private String threeThRegistResource;//第三方账号注册来源   1：人民网通行证；2：新浪微博；3：QQ账号；
    private String userCoverFigure;//封面
    private String userId;//主键自动增长，后台返回，唯一
    private String userName;//用户昵称唯一
    private String userRole;//标识该用户管理后台用户身份角色，1：超级管理员；2：运营人员；3：产品人员；4：监控人员；5：普通用户(APP、PC)
    private String userService;//
    private String userStatus;//待审、正常、禁言、封禁；
    private String userTDCode;//
    private String userNameModifyTime;//后台记录用户昵称修改时间
    private String twoDimenCodeUrl;
    public String getRegistLocationName() {
        return registLocationName;
    }
    public void setRegistLocationName(String registLocationName) {
        this.registLocationName = registLocationName;
    }
    public String getAuthenticateInfo() {
        return authenticateInfo;
    }
    public void setAuthenticateInfo(String authenticateInfo) {
        this.authenticateInfo = authenticateInfo;
    }
    public String getAuthenticateTime() {
        return authenticateTime;
    }
    public void setAuthenticateTime(String authenticateTime) {
        this.authenticateTime = authenticateTime;
    }
    public String getBackTag() {
        return backTag;
    }
    public void setBackTag(String backTag) {
        this.backTag = backTag;
    }
    public String getBelongsCrowd() {
        return belongsCrowd;
    }
    public void setBelongsCrowd(String belongsCrowd) {
        this.belongsCrowd = belongsCrowd;
    }
    public String getBindPhoneNo() {
        return bindPhoneNo;
    }
    public void setBindPhoneNo(String bindPhoneNo) {
        this.bindPhoneNo = bindPhoneNo;
    }
    public String getCoverFigureModifyTime() {
        return coverFigureModifyTime;
    }
    public void setCoverFigureModifyTime(String coverFigureModifyTime) {
        this.coverFigureModifyTime = coverFigureModifyTime;
    }
    public String getDeleted() {
        return deleted;
    }
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
    public String getGagDeadline() {
        return gagDeadline;
    }
    public void setGagDeadline(String gagDeadline) {
        this.gagDeadline = gagDeadline;
    }
    public String getHeadPortrait() {
        return headPortrait;
    }
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }
    public String getHeadPortraitModifyTime() {
        return headPortraitModifyTime;
    }
    public void setHeadPortraitModifyTime(String headPortraitModifyTime) {
        this.headPortraitModifyTime = headPortraitModifyTime;
    }
    public String getIdCard() {
        return idCard;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public String getIsVip() {
        return isVip;
    }
    public void setIsVip(String isVip) {
        this.isVip = isVip;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLoginEquipment() {
        return loginEquipment;
    }
    public void setLoginEquipment(String loginEquipment) {
        this.loginEquipment = loginEquipment;
    }
    public String getLoginIp() {
        return loginIp;
    }
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
    public String getLoginLocation() {
        return loginLocation;
    }
    public void setLoginLocation(String loginLocation) {
        this.loginLocation = loginLocation;
    }
    public String getLoginLocationLatitude() {
        return loginLocationLatitude;
    }
    public void setLoginLocationLatitude(String loginLocationLatitude) {
        this.loginLocationLatitude = loginLocationLatitude;
    }
    public String getLoginLocationLongitude() {
        return loginLocationLongitude;
    }
    public void setLoginLocationLongitude(String loginLocationLongitude) {
        this.loginLocationLongitude = loginLocationLongitude;
    }
    public String getLoginName() {
        return loginName;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    public String getLoginTime() {
        return loginTime;
    }
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
    public Map<String,Object> getMap() {
        return map;
    }
    public void setMap(Map<String,Object> map) {
        this.map = map;
    }
    public String getOtherPropertyModifyTime() {
        return otherPropertyModifyTime;
    }
    public void setOtherPropertyModifyTime(String otherPropertyModifyTime) {
        this.otherPropertyModifyTime = otherPropertyModifyTime;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRegistEquipment() {
        return registEquipment;
    }
    public void setRegistEquipment(String registEquipment) {
        this.registEquipment = registEquipment;
    }
    public String getRegistIp() {
        return registIp;
    }
    public void setRegistIp(String registIp) {
        this.registIp = registIp;
    }
    public String getRegistLocation() {
        return registLocation;
    }
    public void setRegistLocation(String registLocation) {
        this.registLocation = registLocation;
    }
    public String getRegistLocationLatitude() {
        return registLocationLatitude;
    }
    public void setRegistLocationLatitude(String registLocationLatitude) {
        this.registLocationLatitude = registLocationLatitude;
    }
    public String getRegistLocationLongitude() {
        return registLocationLongitude;
    }
    public void setRegistLocationLongitude(String registLocationLongitude) {
        this.registLocationLongitude = registLocationLongitude;
    }
    public String getRegistResource() {
        return registResource;
    }
    public void setRegistResource(String registResource) {
        this.registResource = registResource;
    }
    public String getRegistTime() {
        return registTime;
    }
    public void setRegistTime(String registTime) {
        this.registTime = registTime;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }
    public String getThreeThRegistId() {
        return threeThRegistId;
    }
    public void setThreeThRegistId(String threeThRegistId) {
        this.threeThRegistId = threeThRegistId;
    }
    public String getThreeThRegistResource() {
        return threeThRegistResource;
    }
    public void setThreeThRegistResource(String threeThRegistResource) {
        this.threeThRegistResource = threeThRegistResource;
    }
    public String getUserCoverFigure() {
        return userCoverFigure;
    }
    public void setUserCoverFigure(String userCoverFigure) {
        this.userCoverFigure = userCoverFigure;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserRole() {
        return userRole;
    }
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    public String getUserService() {
        return userService;
    }
    public void setUserService(String userService) {
        this.userService = userService;
    }
    public String getUserStatus() {
        return userStatus;
    }
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    public String getUserTDCode() {
        return userTDCode;
    }
    public void setUserTDCode(String userTDCode) {
        this.userTDCode = userTDCode;
    }
    public String getUserNameModifyTime() {
        return userNameModifyTime;
    }
    public void setUserNameModifyTime(String userNameModifyTime) {
        this.userNameModifyTime = userNameModifyTime;
    }
    @Override
    public String toString() {
        return "User [headPortrait=" + headPortrait + ", isVip=" + isVip + ", password=" + password + ", userId="
                + userId + ", userName=" + userName + "]";
    }
}
