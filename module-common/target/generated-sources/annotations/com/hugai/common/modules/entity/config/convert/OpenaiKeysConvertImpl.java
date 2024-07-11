package com.hugai.common.modules.entity.config.convert;

import com.hugai.common.modules.entity.config.dto.OpenaiKeysDTO;
import com.hugai.common.modules.entity.config.model.OpenaiKeysModel;
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
public class OpenaiKeysConvertImpl implements OpenaiKeysConvert {

    @Override
    public OpenaiKeysModel convertToModel(OpenaiKeysDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OpenaiKeysModel openaiKeysModel = new OpenaiKeysModel();

        openaiKeysModel.setId( arg0.getId() );
        openaiKeysModel.setCreateTime( arg0.getCreateTime() );
        openaiKeysModel.setCreateOper( arg0.getCreateOper() );
        openaiKeysModel.setUpdateTime( arg0.getUpdateTime() );
        openaiKeysModel.setUpdateOper( arg0.getUpdateOper() );
        openaiKeysModel.setDelFlag( arg0.getDelFlag() );
        openaiKeysModel.setCreateTime_( arg0.getCreateTime_() );
        openaiKeysModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            openaiKeysModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            openaiKeysModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            openaiKeysModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        openaiKeysModel.setPage( arg0.getPage() );
        openaiKeysModel.setSize( arg0.getSize() );
        openaiKeysModel.setApiKey( arg0.getApiKey() );
        openaiKeysModel.setName( arg0.getName() );
        openaiKeysModel.setTotalAmount( arg0.getTotalAmount() );
        openaiKeysModel.setTotalUsage( arg0.getTotalUsage() );
        openaiKeysModel.setExpiredTime( arg0.getExpiredTime() );
        openaiKeysModel.setIfCommon( arg0.getIfCommon() );
        openaiKeysModel.setUserId( arg0.getUserId() );
        openaiKeysModel.setEnableStatus( arg0.getEnableStatus() );

        return openaiKeysModel;
    }

    @Override
    public List<OpenaiKeysModel> convertToModel(List<OpenaiKeysDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OpenaiKeysModel> list = new ArrayList<OpenaiKeysModel>( arg0.size() );
        for ( OpenaiKeysDTO openaiKeysDTO : arg0 ) {
            list.add( convertToModel( openaiKeysDTO ) );
        }

        return list;
    }

    @Override
    public OpenaiKeysDTO convertToDTO(OpenaiKeysModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OpenaiKeysDTO openaiKeysDTO = new OpenaiKeysDTO();

        openaiKeysDTO.setId( arg0.getId() );
        openaiKeysDTO.setCreateTime( arg0.getCreateTime() );
        openaiKeysDTO.setCreateOper( arg0.getCreateOper() );
        openaiKeysDTO.setUpdateTime( arg0.getUpdateTime() );
        openaiKeysDTO.setUpdateOper( arg0.getUpdateOper() );
        openaiKeysDTO.setDelFlag( arg0.getDelFlag() );
        openaiKeysDTO.setCreateTime_( arg0.getCreateTime_() );
        openaiKeysDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            openaiKeysDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            openaiKeysDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            openaiKeysDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        openaiKeysDTO.setPage( arg0.getPage() );
        openaiKeysDTO.setSize( arg0.getSize() );
        openaiKeysDTO.setApiKey( arg0.getApiKey() );
        openaiKeysDTO.setName( arg0.getName() );
        openaiKeysDTO.setTotalAmount( arg0.getTotalAmount() );
        openaiKeysDTO.setTotalUsage( arg0.getTotalUsage() );
        openaiKeysDTO.setExpiredTime( arg0.getExpiredTime() );
        openaiKeysDTO.setIfCommon( arg0.getIfCommon() );
        openaiKeysDTO.setUserId( arg0.getUserId() );
        openaiKeysDTO.setEnableStatus( arg0.getEnableStatus() );

        return openaiKeysDTO;
    }

    @Override
    public List<OpenaiKeysDTO> convertToDTO(List<OpenaiKeysModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OpenaiKeysDTO> list = new ArrayList<OpenaiKeysDTO>( arg0.size() );
        for ( OpenaiKeysModel openaiKeysModel : arg0 ) {
            list.add( convertToDTO( openaiKeysModel ) );
        }

        return list;
    }
}
