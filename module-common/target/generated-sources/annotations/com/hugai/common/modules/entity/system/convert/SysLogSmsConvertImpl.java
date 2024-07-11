package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysLogSmsDTO;
import com.hugai.common.modules.entity.system.model.SysLogSmsModel;
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
public class SysLogSmsConvertImpl implements SysLogSmsConvert {

    @Override
    public SysLogSmsModel convertToModel(SysLogSmsDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLogSmsModel sysLogSmsModel = new SysLogSmsModel();

        sysLogSmsModel.setId( arg0.getId() );
        sysLogSmsModel.setCreateTime( arg0.getCreateTime() );
        sysLogSmsModel.setCreateOper( arg0.getCreateOper() );
        sysLogSmsModel.setUpdateTime( arg0.getUpdateTime() );
        sysLogSmsModel.setUpdateOper( arg0.getUpdateOper() );
        sysLogSmsModel.setDelFlag( arg0.getDelFlag() );
        sysLogSmsModel.setCreateTime_( arg0.getCreateTime_() );
        sysLogSmsModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysLogSmsModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysLogSmsModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysLogSmsModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysLogSmsModel.setPage( arg0.getPage() );
        sysLogSmsModel.setSize( arg0.getSize() );
        sysLogSmsModel.setSmsType( arg0.getSmsType() );
        sysLogSmsModel.setSmsTypeDescription( arg0.getSmsTypeDescription() );
        sysLogSmsModel.setUniqueKey( arg0.getUniqueKey() );
        sysLogSmsModel.setContent( arg0.getContent() );

        return sysLogSmsModel;
    }

    @Override
    public List<SysLogSmsModel> convertToModel(List<SysLogSmsDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysLogSmsModel> list = new ArrayList<SysLogSmsModel>( arg0.size() );
        for ( SysLogSmsDTO sysLogSmsDTO : arg0 ) {
            list.add( convertToModel( sysLogSmsDTO ) );
        }

        return list;
    }

    @Override
    public SysLogSmsDTO convertToDTO(SysLogSmsModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLogSmsDTO sysLogSmsDTO = new SysLogSmsDTO();

        sysLogSmsDTO.setId( arg0.getId() );
        sysLogSmsDTO.setCreateTime( arg0.getCreateTime() );
        sysLogSmsDTO.setCreateOper( arg0.getCreateOper() );
        sysLogSmsDTO.setUpdateTime( arg0.getUpdateTime() );
        sysLogSmsDTO.setUpdateOper( arg0.getUpdateOper() );
        sysLogSmsDTO.setDelFlag( arg0.getDelFlag() );
        sysLogSmsDTO.setCreateTime_( arg0.getCreateTime_() );
        sysLogSmsDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysLogSmsDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysLogSmsDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysLogSmsDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysLogSmsDTO.setPage( arg0.getPage() );
        sysLogSmsDTO.setSize( arg0.getSize() );
        sysLogSmsDTO.setSmsType( arg0.getSmsType() );
        sysLogSmsDTO.setSmsTypeDescription( arg0.getSmsTypeDescription() );
        sysLogSmsDTO.setUniqueKey( arg0.getUniqueKey() );
        sysLogSmsDTO.setContent( arg0.getContent() );

        return sysLogSmsDTO;
    }

    @Override
    public List<SysLogSmsDTO> convertToDTO(List<SysLogSmsModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysLogSmsDTO> list = new ArrayList<SysLogSmsDTO>( arg0.size() );
        for ( SysLogSmsModel sysLogSmsModel : arg0 ) {
            list.add( convertToDTO( sysLogSmsModel ) );
        }

        return list;
    }
}
