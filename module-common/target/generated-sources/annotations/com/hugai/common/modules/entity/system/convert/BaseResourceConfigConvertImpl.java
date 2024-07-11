package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.BaseResourceConfigDTO;
import com.hugai.common.modules.entity.system.model.BaseResourceConfigModel;
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
public class BaseResourceConfigConvertImpl implements BaseResourceConfigConvert {

    @Override
    public BaseResourceConfigModel convertToModel(BaseResourceConfigDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BaseResourceConfigModel baseResourceConfigModel = new BaseResourceConfigModel();

        baseResourceConfigModel.setId( arg0.getId() );
        baseResourceConfigModel.setCreateTime( arg0.getCreateTime() );
        baseResourceConfigModel.setCreateOper( arg0.getCreateOper() );
        baseResourceConfigModel.setUpdateTime( arg0.getUpdateTime() );
        baseResourceConfigModel.setUpdateOper( arg0.getUpdateOper() );
        baseResourceConfigModel.setDelFlag( arg0.getDelFlag() );
        baseResourceConfigModel.setCreateTime_( arg0.getCreateTime_() );
        baseResourceConfigModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            baseResourceConfigModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            baseResourceConfigModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            baseResourceConfigModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        baseResourceConfigModel.setPage( arg0.getPage() );
        baseResourceConfigModel.setSize( arg0.getSize() );
        baseResourceConfigModel.setConfigKey( arg0.getConfigKey() );
        baseResourceConfigModel.setResourceValue( arg0.getResourceValue() );

        return baseResourceConfigModel;
    }

    @Override
    public List<BaseResourceConfigModel> convertToModel(List<BaseResourceConfigDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BaseResourceConfigModel> list = new ArrayList<BaseResourceConfigModel>( arg0.size() );
        for ( BaseResourceConfigDTO baseResourceConfigDTO : arg0 ) {
            list.add( convertToModel( baseResourceConfigDTO ) );
        }

        return list;
    }

    @Override
    public BaseResourceConfigDTO convertToDTO(BaseResourceConfigModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BaseResourceConfigDTO baseResourceConfigDTO = new BaseResourceConfigDTO();

        baseResourceConfigDTO.setId( arg0.getId() );
        baseResourceConfigDTO.setCreateTime( arg0.getCreateTime() );
        baseResourceConfigDTO.setCreateOper( arg0.getCreateOper() );
        baseResourceConfigDTO.setUpdateTime( arg0.getUpdateTime() );
        baseResourceConfigDTO.setUpdateOper( arg0.getUpdateOper() );
        baseResourceConfigDTO.setDelFlag( arg0.getDelFlag() );
        baseResourceConfigDTO.setCreateTime_( arg0.getCreateTime_() );
        baseResourceConfigDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            baseResourceConfigDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            baseResourceConfigDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            baseResourceConfigDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        baseResourceConfigDTO.setPage( arg0.getPage() );
        baseResourceConfigDTO.setSize( arg0.getSize() );
        baseResourceConfigDTO.setConfigKey( arg0.getConfigKey() );
        baseResourceConfigDTO.setResourceValue( arg0.getResourceValue() );

        return baseResourceConfigDTO;
    }

    @Override
    public List<BaseResourceConfigDTO> convertToDTO(List<BaseResourceConfigModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BaseResourceConfigDTO> list = new ArrayList<BaseResourceConfigDTO>( arg0.size() );
        for ( BaseResourceConfigModel baseResourceConfigModel : arg0 ) {
            list.add( convertToDTO( baseResourceConfigModel ) );
        }

        return list;
    }
}
