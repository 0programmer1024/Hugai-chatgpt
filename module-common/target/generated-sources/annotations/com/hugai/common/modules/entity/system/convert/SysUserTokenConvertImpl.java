package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysUserTokenDTO;
import com.hugai.common.modules.entity.system.model.SysUserTokenModel;
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
public class SysUserTokenConvertImpl implements SysUserTokenConvert {

    @Override
    public SysUserTokenModel convertToModel(SysUserTokenDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserTokenModel sysUserTokenModel = new SysUserTokenModel();

        sysUserTokenModel.setId( arg0.getId() );
        sysUserTokenModel.setCreateTime( arg0.getCreateTime() );
        sysUserTokenModel.setCreateOper( arg0.getCreateOper() );
        sysUserTokenModel.setUpdateTime( arg0.getUpdateTime() );
        sysUserTokenModel.setUpdateOper( arg0.getUpdateOper() );
        sysUserTokenModel.setCreateTime_( arg0.getCreateTime_() );
        sysUserTokenModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysUserTokenModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysUserTokenModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysUserTokenModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysUserTokenModel.setPage( arg0.getPage() );
        sysUserTokenModel.setSize( arg0.getSize() );
        sysUserTokenModel.setDelFlag( arg0.getDelFlag() );
        sysUserTokenModel.setUserId( arg0.getUserId() );
        sysUserTokenModel.setToken( arg0.getToken() );
        sysUserTokenModel.setLastTime( arg0.getLastTime() );

        return sysUserTokenModel;
    }

    @Override
    public List<SysUserTokenModel> convertToModel(List<SysUserTokenDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysUserTokenModel> list = new ArrayList<SysUserTokenModel>( arg0.size() );
        for ( SysUserTokenDTO sysUserTokenDTO : arg0 ) {
            list.add( convertToModel( sysUserTokenDTO ) );
        }

        return list;
    }

    @Override
    public SysUserTokenDTO convertToDTO(SysUserTokenModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserTokenDTO sysUserTokenDTO = new SysUserTokenDTO();

        sysUserTokenDTO.setId( arg0.getId() );
        sysUserTokenDTO.setCreateTime( arg0.getCreateTime() );
        sysUserTokenDTO.setCreateOper( arg0.getCreateOper() );
        sysUserTokenDTO.setUpdateTime( arg0.getUpdateTime() );
        sysUserTokenDTO.setUpdateOper( arg0.getUpdateOper() );
        sysUserTokenDTO.setCreateTime_( arg0.getCreateTime_() );
        sysUserTokenDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysUserTokenDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysUserTokenDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysUserTokenDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysUserTokenDTO.setPage( arg0.getPage() );
        sysUserTokenDTO.setSize( arg0.getSize() );
        sysUserTokenDTO.setDelFlag( arg0.getDelFlag() );
        sysUserTokenDTO.setUserId( arg0.getUserId() );
        sysUserTokenDTO.setToken( arg0.getToken() );
        sysUserTokenDTO.setLastTime( arg0.getLastTime() );

        return sysUserTokenDTO;
    }

    @Override
    public List<SysUserTokenDTO> convertToDTO(List<SysUserTokenModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysUserTokenDTO> list = new ArrayList<SysUserTokenDTO>( arg0.size() );
        for ( SysUserTokenModel sysUserTokenModel : arg0 ) {
            list.add( convertToDTO( sysUserTokenModel ) );
        }

        return list;
    }
}
