package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysUserRoleDTO;
import com.hugai.common.modules.entity.system.model.SysUserRoleModel;
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
public class SysUserRoleConvertImpl implements SysUserRoleConvert {

    @Override
    public SysUserRoleModel convertToModel(SysUserRoleDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserRoleModel sysUserRoleModel = new SysUserRoleModel();

        sysUserRoleModel.setId( arg0.getId() );
        sysUserRoleModel.setCreateTime( arg0.getCreateTime() );
        sysUserRoleModel.setCreateOper( arg0.getCreateOper() );
        sysUserRoleModel.setUpdateTime( arg0.getUpdateTime() );
        sysUserRoleModel.setUpdateOper( arg0.getUpdateOper() );
        sysUserRoleModel.setCreateTime_( arg0.getCreateTime_() );
        sysUserRoleModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysUserRoleModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysUserRoleModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysUserRoleModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysUserRoleModel.setPage( arg0.getPage() );
        sysUserRoleModel.setSize( arg0.getSize() );
        sysUserRoleModel.setDelFlag( arg0.getDelFlag() );
        sysUserRoleModel.setUserId( arg0.getUserId() );
        sysUserRoleModel.setRoleId( arg0.getRoleId() );

        return sysUserRoleModel;
    }

    @Override
    public List<SysUserRoleModel> convertToModel(List<SysUserRoleDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysUserRoleModel> list = new ArrayList<SysUserRoleModel>( arg0.size() );
        for ( SysUserRoleDTO sysUserRoleDTO : arg0 ) {
            list.add( convertToModel( sysUserRoleDTO ) );
        }

        return list;
    }

    @Override
    public SysUserRoleDTO convertToDTO(SysUserRoleModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserRoleDTO sysUserRoleDTO = new SysUserRoleDTO();

        sysUserRoleDTO.setId( arg0.getId() );
        sysUserRoleDTO.setCreateTime( arg0.getCreateTime() );
        sysUserRoleDTO.setCreateOper( arg0.getCreateOper() );
        sysUserRoleDTO.setUpdateTime( arg0.getUpdateTime() );
        sysUserRoleDTO.setUpdateOper( arg0.getUpdateOper() );
        sysUserRoleDTO.setCreateTime_( arg0.getCreateTime_() );
        sysUserRoleDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysUserRoleDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysUserRoleDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysUserRoleDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysUserRoleDTO.setPage( arg0.getPage() );
        sysUserRoleDTO.setSize( arg0.getSize() );
        sysUserRoleDTO.setDelFlag( arg0.getDelFlag() );
        sysUserRoleDTO.setUserId( arg0.getUserId() );
        sysUserRoleDTO.setRoleId( arg0.getRoleId() );

        return sysUserRoleDTO;
    }

    @Override
    public List<SysUserRoleDTO> convertToDTO(List<SysUserRoleModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysUserRoleDTO> list = new ArrayList<SysUserRoleDTO>( arg0.size() );
        for ( SysUserRoleModel sysUserRoleModel : arg0 ) {
            list.add( convertToDTO( sysUserRoleModel ) );
        }

        return list;
    }
}
