package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysPermissionDTO;
import com.hugai.common.modules.entity.system.model.SysPermissionModel;
import com.hugai.common.modules.entity.system.vo.permission.RouteInfo;
import com.hugai.common.modules.entity.system.vo.permission.SysPermissionTreeVo;
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
public class SysPermissionConvertImpl implements SysPermissionConvert {

    @Override
    public SysPermissionModel convertToModel(SysPermissionDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysPermissionModel sysPermissionModel = new SysPermissionModel();

        sysPermissionModel.setId( arg0.getId() );
        sysPermissionModel.setCreateTime( arg0.getCreateTime() );
        sysPermissionModel.setCreateOper( arg0.getCreateOper() );
        sysPermissionModel.setUpdateTime( arg0.getUpdateTime() );
        sysPermissionModel.setUpdateOper( arg0.getUpdateOper() );
        sysPermissionModel.setCreateTime_( arg0.getCreateTime_() );
        sysPermissionModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysPermissionModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysPermissionModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysPermissionModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysPermissionModel.setPage( arg0.getPage() );
        sysPermissionModel.setSize( arg0.getSize() );
        sysPermissionModel.setDelFlag( arg0.getDelFlag() );
        sysPermissionModel.setParentId( arg0.getParentId() );
        sysPermissionModel.setAncestors( arg0.getAncestors() );
        sysPermissionModel.setIfRoute( arg0.getIfRoute() );
        sysPermissionModel.setTitle( arg0.getTitle() );
        sysPermissionModel.setRoutePath( arg0.getRoutePath() );
        sysPermissionModel.setOriginalRoutePath( arg0.getOriginalRoutePath() );
        sysPermissionModel.setPermissionTag( arg0.getPermissionTag() );
        sysPermissionModel.setRequestMethod( arg0.getRequestMethod() );
        sysPermissionModel.setModuleName( arg0.getModuleName() );
        sysPermissionModel.setModuleController( arg0.getModuleController() );
        sysPermissionModel.setRouteVisitRule( arg0.getRouteVisitRule() );
        sysPermissionModel.setIfUsable( arg0.getIfUsable() );

        return sysPermissionModel;
    }

    @Override
    public List<SysPermissionModel> convertToModel(List<SysPermissionDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysPermissionModel> list = new ArrayList<SysPermissionModel>( arg0.size() );
        for ( SysPermissionDTO sysPermissionDTO : arg0 ) {
            list.add( convertToModel( sysPermissionDTO ) );
        }

        return list;
    }

    @Override
    public SysPermissionDTO convertToDTO(SysPermissionModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysPermissionDTO sysPermissionDTO = new SysPermissionDTO();

        sysPermissionDTO.setId( arg0.getId() );
        sysPermissionDTO.setCreateTime( arg0.getCreateTime() );
        sysPermissionDTO.setCreateOper( arg0.getCreateOper() );
        sysPermissionDTO.setUpdateTime( arg0.getUpdateTime() );
        sysPermissionDTO.setUpdateOper( arg0.getUpdateOper() );
        sysPermissionDTO.setCreateTime_( arg0.getCreateTime_() );
        sysPermissionDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysPermissionDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysPermissionDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysPermissionDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysPermissionDTO.setPage( arg0.getPage() );
        sysPermissionDTO.setSize( arg0.getSize() );
        sysPermissionDTO.setDelFlag( arg0.getDelFlag() );
        sysPermissionDTO.setParentId( arg0.getParentId() );
        sysPermissionDTO.setAncestors( arg0.getAncestors() );
        sysPermissionDTO.setIfRoute( arg0.getIfRoute() );
        sysPermissionDTO.setTitle( arg0.getTitle() );
        sysPermissionDTO.setRoutePath( arg0.getRoutePath() );
        sysPermissionDTO.setOriginalRoutePath( arg0.getOriginalRoutePath() );
        sysPermissionDTO.setPermissionTag( arg0.getPermissionTag() );
        sysPermissionDTO.setRequestMethod( arg0.getRequestMethod() );
        sysPermissionDTO.setModuleName( arg0.getModuleName() );
        sysPermissionDTO.setModuleController( arg0.getModuleController() );
        sysPermissionDTO.setRouteVisitRule( arg0.getRouteVisitRule() );
        sysPermissionDTO.setIfUsable( arg0.getIfUsable() );

        return sysPermissionDTO;
    }

    @Override
    public List<SysPermissionDTO> convertToDTO(List<SysPermissionModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysPermissionDTO> list = new ArrayList<SysPermissionDTO>( arg0.size() );
        for ( SysPermissionModel sysPermissionModel : arg0 ) {
            list.add( convertToDTO( sysPermissionModel ) );
        }

        return list;
    }

    @Override
    public List<RouteInfo> convertToRouteInfo(List<SysPermissionModel> modelList) {
        if ( modelList == null ) {
            return null;
        }

        List<RouteInfo> list = new ArrayList<RouteInfo>( modelList.size() );
        for ( SysPermissionModel sysPermissionModel : modelList ) {
            list.add( sysPermissionModelToRouteInfo( sysPermissionModel ) );
        }

        return list;
    }

    @Override
    public SysPermissionTreeVo convertTree(SysPermissionModel param) {
        if ( param == null ) {
            return null;
        }

        SysPermissionTreeVo sysPermissionTreeVo = new SysPermissionTreeVo();

        sysPermissionTreeVo.setLabel( param.getTitle() );
        sysPermissionTreeVo.setId( param.getId() );
        sysPermissionTreeVo.setCreateTime( param.getCreateTime() );
        sysPermissionTreeVo.setCreateOper( param.getCreateOper() );
        sysPermissionTreeVo.setUpdateTime( param.getUpdateTime() );
        sysPermissionTreeVo.setUpdateOper( param.getUpdateOper() );
        sysPermissionTreeVo.setDelFlag( param.getDelFlag() );
        sysPermissionTreeVo.setCreateTime_( param.getCreateTime_() );
        sysPermissionTreeVo.setUpdateTime_( param.getUpdateTime_() );
        Map<String, Object> map = param.getParamExtMap();
        if ( map != null ) {
            sysPermissionTreeVo.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = param.getQueryCondition();
        if ( map1 != null ) {
            sysPermissionTreeVo.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = param.getSortCondition();
        if ( map2 != null ) {
            sysPermissionTreeVo.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysPermissionTreeVo.setPage( param.getPage() );
        sysPermissionTreeVo.setSize( param.getSize() );
        sysPermissionTreeVo.setParentId( param.getParentId() );
        sysPermissionTreeVo.setAncestors( param.getAncestors() );
        sysPermissionTreeVo.setIfRoute( param.getIfRoute() );
        sysPermissionTreeVo.setTitle( param.getTitle() );
        sysPermissionTreeVo.setRoutePath( param.getRoutePath() );
        sysPermissionTreeVo.setOriginalRoutePath( param.getOriginalRoutePath() );
        sysPermissionTreeVo.setPermissionTag( param.getPermissionTag() );
        sysPermissionTreeVo.setRequestMethod( param.getRequestMethod() );
        sysPermissionTreeVo.setModuleName( param.getModuleName() );
        sysPermissionTreeVo.setModuleController( param.getModuleController() );
        sysPermissionTreeVo.setRouteVisitRule( param.getRouteVisitRule() );

        return sysPermissionTreeVo;
    }

    @Override
    public List<SysPermissionTreeVo> convertTree(List<SysPermissionModel> param) {
        if ( param == null ) {
            return null;
        }

        List<SysPermissionTreeVo> list = new ArrayList<SysPermissionTreeVo>( param.size() );
        for ( SysPermissionModel sysPermissionModel : param ) {
            list.add( convertTree( sysPermissionModel ) );
        }

        return list;
    }

    @Override
    public SysPermissionTreeVo dtoConvertTree(SysPermissionDTO param) {
        if ( param == null ) {
            return null;
        }

        SysPermissionTreeVo sysPermissionTreeVo = new SysPermissionTreeVo();

        sysPermissionTreeVo.setLabel( param.getTitle() );
        sysPermissionTreeVo.setId( param.getId() );
        sysPermissionTreeVo.setCreateTime( param.getCreateTime() );
        sysPermissionTreeVo.setCreateOper( param.getCreateOper() );
        sysPermissionTreeVo.setUpdateTime( param.getUpdateTime() );
        sysPermissionTreeVo.setUpdateOper( param.getUpdateOper() );
        sysPermissionTreeVo.setDelFlag( param.getDelFlag() );
        sysPermissionTreeVo.setCreateTime_( param.getCreateTime_() );
        sysPermissionTreeVo.setUpdateTime_( param.getUpdateTime_() );
        Map<String, Object> map = param.getParamExtMap();
        if ( map != null ) {
            sysPermissionTreeVo.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = param.getQueryCondition();
        if ( map1 != null ) {
            sysPermissionTreeVo.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = param.getSortCondition();
        if ( map2 != null ) {
            sysPermissionTreeVo.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysPermissionTreeVo.setPage( param.getPage() );
        sysPermissionTreeVo.setSize( param.getSize() );
        sysPermissionTreeVo.setParentId( param.getParentId() );
        sysPermissionTreeVo.setAncestors( param.getAncestors() );
        sysPermissionTreeVo.setIfRoute( param.getIfRoute() );
        sysPermissionTreeVo.setTitle( param.getTitle() );
        sysPermissionTreeVo.setRoutePath( param.getRoutePath() );
        sysPermissionTreeVo.setOriginalRoutePath( param.getOriginalRoutePath() );
        sysPermissionTreeVo.setPermissionTag( param.getPermissionTag() );
        sysPermissionTreeVo.setRequestMethod( param.getRequestMethod() );
        sysPermissionTreeVo.setModuleName( param.getModuleName() );
        sysPermissionTreeVo.setModuleController( param.getModuleController() );
        sysPermissionTreeVo.setRouteVisitRule( param.getRouteVisitRule() );

        return sysPermissionTreeVo;
    }

    @Override
    public List<SysPermissionTreeVo> dtoConvertTree(List<SysPermissionDTO> param) {
        if ( param == null ) {
            return null;
        }

        List<SysPermissionTreeVo> list = new ArrayList<SysPermissionTreeVo>( param.size() );
        for ( SysPermissionDTO sysPermissionDTO : param ) {
            list.add( dtoConvertTree( sysPermissionDTO ) );
        }

        return list;
    }

    protected RouteInfo sysPermissionModelToRouteInfo(SysPermissionModel sysPermissionModel) {
        if ( sysPermissionModel == null ) {
            return null;
        }

        RouteInfo routeInfo = new RouteInfo();

        routeInfo.setId( sysPermissionModel.getId() );
        routeInfo.setParentId( sysPermissionModel.getParentId() );
        routeInfo.setRoutePath( sysPermissionModel.getRoutePath() );
        routeInfo.setOriginalRoutePath( sysPermissionModel.getOriginalRoutePath() );
        routeInfo.setPermissionTag( sysPermissionModel.getPermissionTag() );
        routeInfo.setRequestMethod( sysPermissionModel.getRequestMethod() );
        routeInfo.setRouteVisitRule( sysPermissionModel.getRouteVisitRule() );

        return routeInfo;
    }
}
