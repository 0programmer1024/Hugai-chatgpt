package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysRolePermissionDTO;
import com.hugai.common.modules.entity.system.model.SysRolePermissionModel;
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
public class SysRolePermissionConvertImpl implements SysRolePermissionConvert {

    @Override
    public SysRolePermissionModel convertToModel(SysRolePermissionDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRolePermissionModel sysRolePermissionModel = new SysRolePermissionModel();

        sysRolePermissionModel.setId( arg0.getId() );
        sysRolePermissionModel.setCreateTime( arg0.getCreateTime() );
        sysRolePermissionModel.setCreateOper( arg0.getCreateOper() );
        sysRolePermissionModel.setUpdateTime( arg0.getUpdateTime() );
        sysRolePermissionModel.setUpdateOper( arg0.getUpdateOper() );
        sysRolePermissionModel.setCreateTime_( arg0.getCreateTime_() );
        sysRolePermissionModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysRolePermissionModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysRolePermissionModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysRolePermissionModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysRolePermissionModel.setPage( arg0.getPage() );
        sysRolePermissionModel.setSize( arg0.getSize() );
        sysRolePermissionModel.setDelFlag( arg0.getDelFlag() );
        sysRolePermissionModel.setPermissionId( arg0.getPermissionId() );
        sysRolePermissionModel.setRoleId( arg0.getRoleId() );

        return sysRolePermissionModel;
    }

    @Override
    public List<SysRolePermissionModel> convertToModel(List<SysRolePermissionDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysRolePermissionModel> list = new ArrayList<SysRolePermissionModel>( arg0.size() );
        for ( SysRolePermissionDTO sysRolePermissionDTO : arg0 ) {
            list.add( convertToModel( sysRolePermissionDTO ) );
        }

        return list;
    }

    @Override
    public SysRolePermissionDTO convertToDTO(SysRolePermissionModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRolePermissionDTO sysRolePermissionDTO = new SysRolePermissionDTO();

        sysRolePermissionDTO.setId( arg0.getId() );
        sysRolePermissionDTO.setCreateTime( arg0.getCreateTime() );
        sysRolePermissionDTO.setCreateOper( arg0.getCreateOper() );
        sysRolePermissionDTO.setUpdateTime( arg0.getUpdateTime() );
        sysRolePermissionDTO.setUpdateOper( arg0.getUpdateOper() );
        sysRolePermissionDTO.setCreateTime_( arg0.getCreateTime_() );
        sysRolePermissionDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysRolePermissionDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysRolePermissionDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysRolePermissionDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysRolePermissionDTO.setPage( arg0.getPage() );
        sysRolePermissionDTO.setSize( arg0.getSize() );
        sysRolePermissionDTO.setDelFlag( arg0.getDelFlag() );
        sysRolePermissionDTO.setPermissionId( arg0.getPermissionId() );
        sysRolePermissionDTO.setRoleId( arg0.getRoleId() );

        return sysRolePermissionDTO;
    }

    @Override
    public List<SysRolePermissionDTO> convertToDTO(List<SysRolePermissionModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysRolePermissionDTO> list = new ArrayList<SysRolePermissionDTO>( arg0.size() );
        for ( SysRolePermissionModel sysRolePermissionModel : arg0 ) {
            list.add( convertToDTO( sysRolePermissionModel ) );
        }

        return list;
    }
}
