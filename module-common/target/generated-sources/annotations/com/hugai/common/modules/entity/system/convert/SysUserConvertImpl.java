package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysUserDTO;
import com.hugai.common.modules.entity.system.model.SysUserModel;
import com.hugai.common.modules.entity.system.vo.auth.RegisterBody;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-11T16:17:07+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class SysUserConvertImpl implements SysUserConvert {

    @Override
    public SysUserModel convertToModel(SysUserDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserModel sysUserModel = new SysUserModel();

        sysUserModel.setId( arg0.getId() );
        sysUserModel.setCreateTime( arg0.getCreateTime() );
        sysUserModel.setCreateOper( arg0.getCreateOper() );
        sysUserModel.setUpdateTime( arg0.getUpdateTime() );
        sysUserModel.setUpdateOper( arg0.getUpdateOper() );
        sysUserModel.setDelFlag( arg0.getDelFlag() );
        sysUserModel.setCreateTime_( arg0.getCreateTime_() );
        sysUserModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysUserModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysUserModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysUserModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysUserModel.setPage( arg0.getPage() );
        sysUserModel.setSize( arg0.getSize() );
        sysUserModel.setDeptId( arg0.getDeptId() );
        sysUserModel.setUserName( arg0.getUserName() );
        sysUserModel.setNickName( arg0.getNickName() );
        sysUserModel.setUserType( arg0.getUserType() );
        sysUserModel.setEmail( arg0.getEmail() );
        sysUserModel.setPhonenumber( arg0.getPhonenumber() );
        sysUserModel.setSex( arg0.getSex() );
        sysUserModel.setAvatar( arg0.getAvatar() );
        sysUserModel.setPassword( arg0.getPassword() );
        sysUserModel.setStatus( arg0.getStatus() );
        sysUserModel.setLoginIp( arg0.getLoginIp() );
        sysUserModel.setLoginDate( arg0.getLoginDate() );

        return sysUserModel;
    }

    @Override
    public List<SysUserModel> convertToModel(List<SysUserDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysUserModel> list = new ArrayList<SysUserModel>( arg0.size() );
        for ( SysUserDTO sysUserDTO : arg0 ) {
            list.add( convertToModel( sysUserDTO ) );
        }

        return list;
    }

    @Override
    public SysUserDTO convertToDTO(SysUserModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserDTO sysUserDTO = new SysUserDTO();

        sysUserDTO.setId( arg0.getId() );
        sysUserDTO.setCreateTime( arg0.getCreateTime() );
        sysUserDTO.setCreateOper( arg0.getCreateOper() );
        sysUserDTO.setUpdateTime( arg0.getUpdateTime() );
        sysUserDTO.setUpdateOper( arg0.getUpdateOper() );
        sysUserDTO.setDelFlag( arg0.getDelFlag() );
        sysUserDTO.setCreateTime_( arg0.getCreateTime_() );
        sysUserDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysUserDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysUserDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysUserDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysUserDTO.setPage( arg0.getPage() );
        sysUserDTO.setSize( arg0.getSize() );
        sysUserDTO.setDeptId( arg0.getDeptId() );
        sysUserDTO.setUserName( arg0.getUserName() );
        sysUserDTO.setNickName( arg0.getNickName() );
        sysUserDTO.setUserType( arg0.getUserType() );
        sysUserDTO.setEmail( arg0.getEmail() );
        sysUserDTO.setPhonenumber( arg0.getPhonenumber() );
        sysUserDTO.setSex( arg0.getSex() );
        sysUserDTO.setAvatar( arg0.getAvatar() );
        sysUserDTO.setPassword( arg0.getPassword() );
        sysUserDTO.setStatus( arg0.getStatus() );
        sysUserDTO.setLoginIp( arg0.getLoginIp() );
        sysUserDTO.setLoginDate( arg0.getLoginDate() );

        return sysUserDTO;
    }

    @Override
    public List<SysUserDTO> convertToDTO(List<SysUserModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysUserDTO> list = new ArrayList<SysUserDTO>( arg0.size() );
        for ( SysUserModel sysUserModel : arg0 ) {
            list.add( convertToDTO( sysUserModel ) );
        }

        return list;
    }

    @Override
    public SysUserDTO convertToRegister(RegisterBody register) {
        if ( register == null ) {
            return null;
        }

        SysUserDTO sysUserDTO = new SysUserDTO();

        sysUserDTO.setUserName( register.getUserName() );
        sysUserDTO.setNickName( register.getNickName() );
        sysUserDTO.setPassword( register.getPassword() );
        sysUserDTO.setRoleId( register.getRoleId() );

        return sysUserDTO;
    }
}
