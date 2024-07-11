package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysMenuDTO;
import com.hugai.common.modules.entity.system.model.SysMenuModel;
import com.hugai.common.modules.entity.system.vo.sysMenu.SysMenuTreeVo;
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
public class SysMenuConvertImpl implements SysMenuConvert {

    @Override
    public SysMenuModel convertToModel(SysMenuDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysMenuModel sysMenuModel = new SysMenuModel();

        sysMenuModel.setId( arg0.getId() );
        sysMenuModel.setCreateTime( arg0.getCreateTime() );
        sysMenuModel.setCreateOper( arg0.getCreateOper() );
        sysMenuModel.setUpdateTime( arg0.getUpdateTime() );
        sysMenuModel.setUpdateOper( arg0.getUpdateOper() );
        sysMenuModel.setCreateTime_( arg0.getCreateTime_() );
        sysMenuModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysMenuModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysMenuModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysMenuModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysMenuModel.setPage( arg0.getPage() );
        sysMenuModel.setSize( arg0.getSize() );
        sysMenuModel.setDelFlag( arg0.getDelFlag() );
        sysMenuModel.setMenuName( arg0.getMenuName() );
        sysMenuModel.setParentId( arg0.getParentId() );
        sysMenuModel.setSort( arg0.getSort() );
        sysMenuModel.setPath( arg0.getPath() );
        sysMenuModel.setComponent( arg0.getComponent() );
        sysMenuModel.setQuery( arg0.getQuery() );
        sysMenuModel.setStateFrame( arg0.getStateFrame() );
        sysMenuModel.setStateCache( arg0.getStateCache() );
        sysMenuModel.setMenuType( arg0.getMenuType() );
        sysMenuModel.setVisible( arg0.getVisible() );
        sysMenuModel.setStatus( arg0.getStatus() );
        sysMenuModel.setIcon( arg0.getIcon() );
        sysMenuModel.setName( arg0.getName() );

        return sysMenuModel;
    }

    @Override
    public List<SysMenuModel> convertToModel(List<SysMenuDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysMenuModel> list = new ArrayList<SysMenuModel>( arg0.size() );
        for ( SysMenuDTO sysMenuDTO : arg0 ) {
            list.add( convertToModel( sysMenuDTO ) );
        }

        return list;
    }

    @Override
    public SysMenuDTO convertToDTO(SysMenuModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysMenuDTO sysMenuDTO = new SysMenuDTO();

        sysMenuDTO.setId( arg0.getId() );
        sysMenuDTO.setCreateTime( arg0.getCreateTime() );
        sysMenuDTO.setCreateOper( arg0.getCreateOper() );
        sysMenuDTO.setUpdateTime( arg0.getUpdateTime() );
        sysMenuDTO.setUpdateOper( arg0.getUpdateOper() );
        sysMenuDTO.setCreateTime_( arg0.getCreateTime_() );
        sysMenuDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysMenuDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysMenuDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysMenuDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysMenuDTO.setPage( arg0.getPage() );
        sysMenuDTO.setSize( arg0.getSize() );
        sysMenuDTO.setDelFlag( arg0.getDelFlag() );
        sysMenuDTO.setMenuName( arg0.getMenuName() );
        sysMenuDTO.setParentId( arg0.getParentId() );
        sysMenuDTO.setSort( arg0.getSort() );
        sysMenuDTO.setPath( arg0.getPath() );
        sysMenuDTO.setComponent( arg0.getComponent() );
        sysMenuDTO.setQuery( arg0.getQuery() );
        sysMenuDTO.setStateFrame( arg0.getStateFrame() );
        sysMenuDTO.setStateCache( arg0.getStateCache() );
        sysMenuDTO.setMenuType( arg0.getMenuType() );
        sysMenuDTO.setVisible( arg0.getVisible() );
        sysMenuDTO.setStatus( arg0.getStatus() );
        sysMenuDTO.setIcon( arg0.getIcon() );
        sysMenuDTO.setName( arg0.getName() );

        return sysMenuDTO;
    }

    @Override
    public List<SysMenuDTO> convertToDTO(List<SysMenuModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysMenuDTO> list = new ArrayList<SysMenuDTO>( arg0.size() );
        for ( SysMenuModel sysMenuModel : arg0 ) {
            list.add( convertToDTO( sysMenuModel ) );
        }

        return list;
    }

    @Override
    public SysMenuTreeVo convertTree(SysMenuModel param) {
        if ( param == null ) {
            return null;
        }

        SysMenuTreeVo sysMenuTreeVo = new SysMenuTreeVo();

        sysMenuTreeVo.setLabel( param.getMenuName() );
        sysMenuTreeVo.setId( param.getId() );
        sysMenuTreeVo.setCreateTime( param.getCreateTime() );
        sysMenuTreeVo.setCreateOper( param.getCreateOper() );
        sysMenuTreeVo.setUpdateTime( param.getUpdateTime() );
        sysMenuTreeVo.setUpdateOper( param.getUpdateOper() );
        sysMenuTreeVo.setDelFlag( param.getDelFlag() );
        sysMenuTreeVo.setCreateTime_( param.getCreateTime_() );
        sysMenuTreeVo.setUpdateTime_( param.getUpdateTime_() );
        Map<String, Object> map = param.getParamExtMap();
        if ( map != null ) {
            sysMenuTreeVo.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = param.getQueryCondition();
        if ( map1 != null ) {
            sysMenuTreeVo.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = param.getSortCondition();
        if ( map2 != null ) {
            sysMenuTreeVo.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysMenuTreeVo.setPage( param.getPage() );
        sysMenuTreeVo.setSize( param.getSize() );
        sysMenuTreeVo.setMenuName( param.getMenuName() );
        sysMenuTreeVo.setParentId( param.getParentId() );
        sysMenuTreeVo.setSort( param.getSort() );
        sysMenuTreeVo.setPath( param.getPath() );
        sysMenuTreeVo.setComponent( param.getComponent() );
        sysMenuTreeVo.setQuery( param.getQuery() );
        sysMenuTreeVo.setStateFrame( param.getStateFrame() );
        sysMenuTreeVo.setStateCache( param.getStateCache() );
        sysMenuTreeVo.setMenuType( param.getMenuType() );
        sysMenuTreeVo.setVisible( param.getVisible() );
        sysMenuTreeVo.setStatus( param.getStatus() );
        sysMenuTreeVo.setIcon( param.getIcon() );
        sysMenuTreeVo.setName( param.getName() );

        return sysMenuTreeVo;
    }

    @Override
    public List<SysMenuTreeVo> convertTree(List<SysMenuModel> param) {
        if ( param == null ) {
            return null;
        }

        List<SysMenuTreeVo> list = new ArrayList<SysMenuTreeVo>( param.size() );
        for ( SysMenuModel sysMenuModel : param ) {
            list.add( convertTree( sysMenuModel ) );
        }

        return list;
    }

    @Override
    public SysMenuTreeVo dtoConvertTree(SysMenuDTO param) {
        if ( param == null ) {
            return null;
        }

        SysMenuTreeVo sysMenuTreeVo = new SysMenuTreeVo();

        sysMenuTreeVo.setLabel( param.getMenuName() );
        sysMenuTreeVo.setId( param.getId() );
        sysMenuTreeVo.setCreateTime( param.getCreateTime() );
        sysMenuTreeVo.setCreateOper( param.getCreateOper() );
        sysMenuTreeVo.setUpdateTime( param.getUpdateTime() );
        sysMenuTreeVo.setUpdateOper( param.getUpdateOper() );
        sysMenuTreeVo.setDelFlag( param.getDelFlag() );
        sysMenuTreeVo.setCreateTime_( param.getCreateTime_() );
        sysMenuTreeVo.setUpdateTime_( param.getUpdateTime_() );
        Map<String, Object> map = param.getParamExtMap();
        if ( map != null ) {
            sysMenuTreeVo.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = param.getQueryCondition();
        if ( map1 != null ) {
            sysMenuTreeVo.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = param.getSortCondition();
        if ( map2 != null ) {
            sysMenuTreeVo.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysMenuTreeVo.setPage( param.getPage() );
        sysMenuTreeVo.setSize( param.getSize() );
        sysMenuTreeVo.setUserId( param.getUserId() );
        sysMenuTreeVo.setMenuName( param.getMenuName() );
        sysMenuTreeVo.setParentId( param.getParentId() );
        sysMenuTreeVo.setSort( param.getSort() );
        sysMenuTreeVo.setPath( param.getPath() );
        sysMenuTreeVo.setComponent( param.getComponent() );
        sysMenuTreeVo.setQuery( param.getQuery() );
        sysMenuTreeVo.setStateFrame( param.getStateFrame() );
        sysMenuTreeVo.setStateCache( param.getStateCache() );
        sysMenuTreeVo.setMenuType( param.getMenuType() );
        sysMenuTreeVo.setVisible( param.getVisible() );
        sysMenuTreeVo.setStatus( param.getStatus() );
        sysMenuTreeVo.setIcon( param.getIcon() );
        sysMenuTreeVo.setName( param.getName() );

        return sysMenuTreeVo;
    }

    @Override
    public List<SysMenuTreeVo> dtoConvertTree(List<SysMenuDTO> param) {
        if ( param == null ) {
            return null;
        }

        List<SysMenuTreeVo> list = new ArrayList<SysMenuTreeVo>( param.size() );
        for ( SysMenuDTO sysMenuDTO : param ) {
            list.add( dtoConvertTree( sysMenuDTO ) );
        }

        return list;
    }
}
