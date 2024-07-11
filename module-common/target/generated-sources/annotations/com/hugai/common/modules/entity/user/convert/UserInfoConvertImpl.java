package com.hugai.common.modules.entity.user.convert;

import com.hugai.common.modules.entity.system.vo.auth.RegisterBody;
import com.hugai.common.modules.entity.user.dto.UserInfoDTO;
import com.hugai.common.modules.entity.user.model.UserInfoModel;
import com.hugai.common.modules.entity.user.vo.ClientRegisterBody;
import com.hugai.common.modules.entity.user.vo.UserInfoDetailVo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-11T16:17:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class UserInfoConvertImpl implements UserInfoConvert {

    @Override
    public UserInfoModel convertToModel(UserInfoDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        UserInfoModel userInfoModel = new UserInfoModel();

        userInfoModel.setId( arg0.getId() );
        userInfoModel.setCreateTime( arg0.getCreateTime() );
        userInfoModel.setCreateOper( arg0.getCreateOper() );
        userInfoModel.setUpdateTime( arg0.getUpdateTime() );
        userInfoModel.setUpdateOper( arg0.getUpdateOper() );
        userInfoModel.setDelFlag( arg0.getDelFlag() );
        userInfoModel.setCreateTime_( arg0.getCreateTime_() );
        userInfoModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            userInfoModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            userInfoModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            userInfoModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        userInfoModel.setPage( arg0.getPage() );
        userInfoModel.setSize( arg0.getSize() );
        userInfoModel.setUserName( arg0.getUserName() );
        userInfoModel.setPassword( arg0.getPassword() );
        userInfoModel.setNickName( arg0.getNickName() );
        userInfoModel.setSex( arg0.getSex() );
        userInfoModel.setImgUrl( arg0.getImgUrl() );
        userInfoModel.setStatus( arg0.getStatus() );
        userInfoModel.setIfTourist( arg0.getIfTourist() );
        userInfoModel.setIpaddress( arg0.getIpaddress() );
        userInfoModel.setIpLocation( arg0.getIpLocation() );
        userInfoModel.setEmail( arg0.getEmail() );
        userInfoModel.setPhone( arg0.getPhone() );
        userInfoModel.setQqNumber( arg0.getQqNumber() );
        userInfoModel.setPromoCode( arg0.getPromoCode() );
        userInfoModel.setPromoUserId( arg0.getPromoUserId() );
        userInfoModel.setInviteePromoCode( arg0.getInviteePromoCode() );

        return userInfoModel;
    }

    @Override
    public List<UserInfoModel> convertToModel(List<UserInfoDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<UserInfoModel> list = new ArrayList<UserInfoModel>( arg0.size() );
        for ( UserInfoDTO userInfoDTO : arg0 ) {
            list.add( convertToModel( userInfoDTO ) );
        }

        return list;
    }

    @Override
    public UserInfoDTO convertToDTO(UserInfoModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        UserInfoDTO userInfoDTO = new UserInfoDTO();

        userInfoDTO.setId( arg0.getId() );
        userInfoDTO.setCreateTime( arg0.getCreateTime() );
        userInfoDTO.setCreateOper( arg0.getCreateOper() );
        userInfoDTO.setUpdateTime( arg0.getUpdateTime() );
        userInfoDTO.setUpdateOper( arg0.getUpdateOper() );
        userInfoDTO.setDelFlag( arg0.getDelFlag() );
        userInfoDTO.setCreateTime_( arg0.getCreateTime_() );
        userInfoDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            userInfoDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            userInfoDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            userInfoDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        userInfoDTO.setPage( arg0.getPage() );
        userInfoDTO.setSize( arg0.getSize() );
        userInfoDTO.setUserName( arg0.getUserName() );
        userInfoDTO.setPassword( arg0.getPassword() );
        userInfoDTO.setNickName( arg0.getNickName() );
        userInfoDTO.setSex( arg0.getSex() );
        userInfoDTO.setImgUrl( arg0.getImgUrl() );
        userInfoDTO.setStatus( arg0.getStatus() );
        userInfoDTO.setIfTourist( arg0.getIfTourist() );
        userInfoDTO.setIpaddress( arg0.getIpaddress() );
        userInfoDTO.setIpLocation( arg0.getIpLocation() );
        userInfoDTO.setEmail( arg0.getEmail() );
        userInfoDTO.setPhone( arg0.getPhone() );
        userInfoDTO.setQqNumber( arg0.getQqNumber() );
        userInfoDTO.setPromoCode( arg0.getPromoCode() );
        userInfoDTO.setPromoUserId( arg0.getPromoUserId() );
        userInfoDTO.setInviteePromoCode( arg0.getInviteePromoCode() );

        return userInfoDTO;
    }

    @Override
    public List<UserInfoDTO> convertToDTO(List<UserInfoModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<UserInfoDTO> list = new ArrayList<UserInfoDTO>( arg0.size() );
        for ( UserInfoModel userInfoModel : arg0 ) {
            list.add( convertToDTO( userInfoModel ) );
        }

        return list;
    }

    @Override
    public UserInfoDTO convertToRegister(RegisterBody param) {
        if ( param == null ) {
            return null;
        }

        UserInfoDTO userInfoDTO = new UserInfoDTO();

        userInfoDTO.setUserName( param.getUserName() );
        userInfoDTO.setPassword( param.getPassword() );
        userInfoDTO.setNickName( param.getNickName() );

        return userInfoDTO;
    }

    @Override
    public UserInfoDetailVo convertDetail(UserInfoModel param) {
        if ( param == null ) {
            return null;
        }

        UserInfoDetailVo userInfoDetailVo = new UserInfoDetailVo();

        userInfoDetailVo.setId( param.getId() );
        userInfoDetailVo.setCreateTime( param.getCreateTime() );
        userInfoDetailVo.setCreateOper( param.getCreateOper() );
        userInfoDetailVo.setUpdateTime( param.getUpdateTime() );
        userInfoDetailVo.setUpdateOper( param.getUpdateOper() );
        userInfoDetailVo.setDelFlag( param.getDelFlag() );
        userInfoDetailVo.setCreateTime_( param.getCreateTime_() );
        userInfoDetailVo.setUpdateTime_( param.getUpdateTime_() );
        Map<String, Object> map = param.getParamExtMap();
        if ( map != null ) {
            userInfoDetailVo.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = param.getQueryCondition();
        if ( map1 != null ) {
            userInfoDetailVo.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = param.getSortCondition();
        if ( map2 != null ) {
            userInfoDetailVo.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        userInfoDetailVo.setPage( param.getPage() );
        userInfoDetailVo.setSize( param.getSize() );
        userInfoDetailVo.setUserName( param.getUserName() );
        userInfoDetailVo.setPassword( param.getPassword() );
        userInfoDetailVo.setNickName( param.getNickName() );
        userInfoDetailVo.setSex( param.getSex() );
        userInfoDetailVo.setImgUrl( param.getImgUrl() );
        userInfoDetailVo.setStatus( param.getStatus() );
        userInfoDetailVo.setIfTourist( param.getIfTourist() );
        userInfoDetailVo.setIpaddress( param.getIpaddress() );
        userInfoDetailVo.setIpLocation( param.getIpLocation() );
        userInfoDetailVo.setEmail( param.getEmail() );
        userInfoDetailVo.setPhone( param.getPhone() );
        userInfoDetailVo.setQqNumber( param.getQqNumber() );
        userInfoDetailVo.setPromoCode( param.getPromoCode() );
        userInfoDetailVo.setPromoUserId( param.getPromoUserId() );
        userInfoDetailVo.setInviteePromoCode( param.getInviteePromoCode() );

        return userInfoDetailVo;
    }

    @Override
    public UserInfoModel convertClientRegisterToModel(ClientRegisterBody param) {
        if ( param == null ) {
            return null;
        }

        UserInfoModel userInfoModel = new UserInfoModel();

        userInfoModel.setPassword( param.getPassword() );
        userInfoModel.setEmail( param.getEmail() );
        userInfoModel.setPromoCode( param.getPromoCode() );

        return userInfoModel;
    }
}
