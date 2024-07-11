package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysRoleDTO;
import com.hugai.common.modules.entity.system.model.SysRoleModel;
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
public class SysRoleConvertImpl implements SysRoleConvert {

    @Override
    public SysRoleModel convertToModel(SysRoleDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRoleModel sysRoleModel = new SysRoleModel();

        sysRoleModel.setId( arg0.getId() );
        sysRoleModel.setCreateTime( arg0.getCreateTime() );
        sysRoleModel.setCreateOper( arg0.getCreateOper() );
        sysRoleModel.setUpdateTime( arg0.getUpdateTime() );
        sysRoleModel.setUpdateOper( arg0.getUpdateOper() );
        sysRoleModel.setDelFlag( arg0.getDelFlag() );
        sysRoleModel.setCreateTime_( arg0.getCreateTime_() );
        sysRoleModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysRoleModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysRoleModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysRoleModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysRoleModel.setPage( arg0.getPage() );
        sysRoleModel.setSize( arg0.getSize() );
        sysRoleModel.setRoleName( arg0.getRoleName() );
        sysRoleModel.setRoleKey( arg0.getRoleKey() );
        sysRoleModel.setRoleSort( arg0.getRoleSort() );
        sysRoleModel.setDataScope( arg0.getDataScope() );
        sysRoleModel.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysRoleModel.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        sysRoleModel.setStatus( arg0.getStatus() );

        return sysRoleModel;
    }

    @Override
    public List<SysRoleModel> convertToModel(List<SysRoleDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysRoleModel> list = new ArrayList<SysRoleModel>( arg0.size() );
        for ( SysRoleDTO sysRoleDTO : arg0 ) {
            list.add( convertToModel( sysRoleDTO ) );
        }

        return list;
    }

    @Override
    public SysRoleDTO convertToDTO(SysRoleModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRoleDTO sysRoleDTO = new SysRoleDTO();

        sysRoleDTO.setId( arg0.getId() );
        sysRoleDTO.setCreateTime( arg0.getCreateTime() );
        sysRoleDTO.setCreateOper( arg0.getCreateOper() );
        sysRoleDTO.setUpdateTime( arg0.getUpdateTime() );
        sysRoleDTO.setUpdateOper( arg0.getUpdateOper() );
        sysRoleDTO.setDelFlag( arg0.getDelFlag() );
        sysRoleDTO.setCreateTime_( arg0.getCreateTime_() );
        sysRoleDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysRoleDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysRoleDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysRoleDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysRoleDTO.setPage( arg0.getPage() );
        sysRoleDTO.setSize( arg0.getSize() );
        sysRoleDTO.setRoleName( arg0.getRoleName() );
        sysRoleDTO.setRoleKey( arg0.getRoleKey() );
        sysRoleDTO.setRoleSort( arg0.getRoleSort() );
        sysRoleDTO.setDataScope( arg0.getDataScope() );
        sysRoleDTO.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysRoleDTO.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        sysRoleDTO.setStatus( arg0.getStatus() );

        return sysRoleDTO;
    }

    @Override
    public List<SysRoleDTO> convertToDTO(List<SysRoleModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysRoleDTO> list = new ArrayList<SysRoleDTO>( arg0.size() );
        for ( SysRoleModel sysRoleModel : arg0 ) {
            list.add( convertToDTO( sysRoleModel ) );
        }

        return list;
    }
}
