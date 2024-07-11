package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysRoleMenuDTO;
import com.hugai.common.modules.entity.system.model.SysRoleMenuModel;
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
public class SysRoleMenuConvertImpl implements SysRoleMenuConvert {

    @Override
    public SysRoleMenuModel convertToModel(SysRoleMenuDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRoleMenuModel sysRoleMenuModel = new SysRoleMenuModel();

        sysRoleMenuModel.setId( arg0.getId() );
        sysRoleMenuModel.setCreateTime( arg0.getCreateTime() );
        sysRoleMenuModel.setCreateOper( arg0.getCreateOper() );
        sysRoleMenuModel.setUpdateTime( arg0.getUpdateTime() );
        sysRoleMenuModel.setUpdateOper( arg0.getUpdateOper() );
        sysRoleMenuModel.setCreateTime_( arg0.getCreateTime_() );
        sysRoleMenuModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysRoleMenuModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysRoleMenuModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysRoleMenuModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysRoleMenuModel.setPage( arg0.getPage() );
        sysRoleMenuModel.setSize( arg0.getSize() );
        sysRoleMenuModel.setDelFlag( arg0.getDelFlag() );
        sysRoleMenuModel.setRoleId( arg0.getRoleId() );
        sysRoleMenuModel.setMenuId( arg0.getMenuId() );

        return sysRoleMenuModel;
    }

    @Override
    public List<SysRoleMenuModel> convertToModel(List<SysRoleMenuDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysRoleMenuModel> list = new ArrayList<SysRoleMenuModel>( arg0.size() );
        for ( SysRoleMenuDTO sysRoleMenuDTO : arg0 ) {
            list.add( convertToModel( sysRoleMenuDTO ) );
        }

        return list;
    }

    @Override
    public SysRoleMenuDTO convertToDTO(SysRoleMenuModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRoleMenuDTO sysRoleMenuDTO = new SysRoleMenuDTO();

        sysRoleMenuDTO.setId( arg0.getId() );
        sysRoleMenuDTO.setCreateTime( arg0.getCreateTime() );
        sysRoleMenuDTO.setCreateOper( arg0.getCreateOper() );
        sysRoleMenuDTO.setUpdateTime( arg0.getUpdateTime() );
        sysRoleMenuDTO.setUpdateOper( arg0.getUpdateOper() );
        sysRoleMenuDTO.setCreateTime_( arg0.getCreateTime_() );
        sysRoleMenuDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysRoleMenuDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysRoleMenuDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysRoleMenuDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysRoleMenuDTO.setPage( arg0.getPage() );
        sysRoleMenuDTO.setSize( arg0.getSize() );
        sysRoleMenuDTO.setDelFlag( arg0.getDelFlag() );
        sysRoleMenuDTO.setRoleId( arg0.getRoleId() );
        sysRoleMenuDTO.setMenuId( arg0.getMenuId() );

        return sysRoleMenuDTO;
    }

    @Override
    public List<SysRoleMenuDTO> convertToDTO(List<SysRoleMenuModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysRoleMenuDTO> list = new ArrayList<SysRoleMenuDTO>( arg0.size() );
        for ( SysRoleMenuModel sysRoleMenuModel : arg0 ) {
            list.add( convertToDTO( sysRoleMenuModel ) );
        }

        return list;
    }
}
