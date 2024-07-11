package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysOperLogDTO;
import com.hugai.common.modules.entity.system.model.SysOperLogModel;
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
public class SysOperLogConvertImpl implements SysOperLogConvert {

    @Override
    public SysOperLogModel convertToModel(SysOperLogDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOperLogModel sysOperLogModel = new SysOperLogModel();

        sysOperLogModel.setId( arg0.getId() );
        sysOperLogModel.setCreateTime( arg0.getCreateTime() );
        sysOperLogModel.setCreateOper( arg0.getCreateOper() );
        sysOperLogModel.setUpdateTime( arg0.getUpdateTime() );
        sysOperLogModel.setUpdateOper( arg0.getUpdateOper() );
        sysOperLogModel.setCreateTime_( arg0.getCreateTime_() );
        sysOperLogModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysOperLogModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysOperLogModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysOperLogModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysOperLogModel.setPage( arg0.getPage() );
        sysOperLogModel.setSize( arg0.getSize() );
        sysOperLogModel.setDelFlag( arg0.getDelFlag() );
        sysOperLogModel.setTitle( arg0.getTitle() );
        sysOperLogModel.setMethod( arg0.getMethod() );
        sysOperLogModel.setRequestMethod( arg0.getRequestMethod() );
        sysOperLogModel.setOperatorType( arg0.getOperatorType() );
        sysOperLogModel.setOperName( arg0.getOperName() );
        sysOperLogModel.setOperUrl( arg0.getOperUrl() );
        sysOperLogModel.setOperIp( arg0.getOperIp() );
        sysOperLogModel.setOperLocation( arg0.getOperLocation() );
        sysOperLogModel.setOperParam( arg0.getOperParam() );
        sysOperLogModel.setJsonResult( arg0.getJsonResult() );
        sysOperLogModel.setStatus( arg0.getStatus() );
        sysOperLogModel.setErrorMsg( arg0.getErrorMsg() );
        sysOperLogModel.setOperTime( arg0.getOperTime() );

        return sysOperLogModel;
    }

    @Override
    public List<SysOperLogModel> convertToModel(List<SysOperLogDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysOperLogModel> list = new ArrayList<SysOperLogModel>( arg0.size() );
        for ( SysOperLogDTO sysOperLogDTO : arg0 ) {
            list.add( convertToModel( sysOperLogDTO ) );
        }

        return list;
    }

    @Override
    public SysOperLogDTO convertToDTO(SysOperLogModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOperLogDTO sysOperLogDTO = new SysOperLogDTO();

        sysOperLogDTO.setId( arg0.getId() );
        sysOperLogDTO.setCreateTime( arg0.getCreateTime() );
        sysOperLogDTO.setCreateOper( arg0.getCreateOper() );
        sysOperLogDTO.setUpdateTime( arg0.getUpdateTime() );
        sysOperLogDTO.setUpdateOper( arg0.getUpdateOper() );
        sysOperLogDTO.setCreateTime_( arg0.getCreateTime_() );
        sysOperLogDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysOperLogDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysOperLogDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysOperLogDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysOperLogDTO.setPage( arg0.getPage() );
        sysOperLogDTO.setSize( arg0.getSize() );
        sysOperLogDTO.setDelFlag( arg0.getDelFlag() );
        sysOperLogDTO.setTitle( arg0.getTitle() );
        sysOperLogDTO.setMethod( arg0.getMethod() );
        sysOperLogDTO.setRequestMethod( arg0.getRequestMethod() );
        sysOperLogDTO.setOperatorType( arg0.getOperatorType() );
        sysOperLogDTO.setOperName( arg0.getOperName() );
        sysOperLogDTO.setOperUrl( arg0.getOperUrl() );
        sysOperLogDTO.setOperIp( arg0.getOperIp() );
        sysOperLogDTO.setOperLocation( arg0.getOperLocation() );
        sysOperLogDTO.setOperParam( arg0.getOperParam() );
        sysOperLogDTO.setJsonResult( arg0.getJsonResult() );
        sysOperLogDTO.setStatus( arg0.getStatus() );
        sysOperLogDTO.setErrorMsg( arg0.getErrorMsg() );
        sysOperLogDTO.setOperTime( arg0.getOperTime() );

        return sysOperLogDTO;
    }

    @Override
    public List<SysOperLogDTO> convertToDTO(List<SysOperLogModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysOperLogDTO> list = new ArrayList<SysOperLogDTO>( arg0.size() );
        for ( SysOperLogModel sysOperLogModel : arg0 ) {
            list.add( convertToDTO( sysOperLogModel ) );
        }

        return list;
    }
}
