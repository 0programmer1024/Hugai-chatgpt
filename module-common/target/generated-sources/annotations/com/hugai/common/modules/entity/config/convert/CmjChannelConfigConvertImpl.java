package com.hugai.common.modules.entity.config.convert;

import com.hugai.common.modules.entity.config.dto.CmjChannelConfigDTO;
import com.hugai.common.modules.entity.config.model.CmjChannelConfigModel;
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
public class CmjChannelConfigConvertImpl implements CmjChannelConfigConvert {

    @Override
    public CmjChannelConfigModel convertToModel(CmjChannelConfigDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CmjChannelConfigModel cmjChannelConfigModel = new CmjChannelConfigModel();

        cmjChannelConfigModel.setId( arg0.getId() );
        cmjChannelConfigModel.setCreateTime( arg0.getCreateTime() );
        cmjChannelConfigModel.setCreateOper( arg0.getCreateOper() );
        cmjChannelConfigModel.setUpdateTime( arg0.getUpdateTime() );
        cmjChannelConfigModel.setUpdateOper( arg0.getUpdateOper() );
        cmjChannelConfigModel.setDelFlag( arg0.getDelFlag() );
        cmjChannelConfigModel.setCreateTime_( arg0.getCreateTime_() );
        cmjChannelConfigModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            cmjChannelConfigModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            cmjChannelConfigModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            cmjChannelConfigModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        cmjChannelConfigModel.setPage( arg0.getPage() );
        cmjChannelConfigModel.setSize( arg0.getSize() );
        cmjChannelConfigModel.setCmjAccountId( arg0.getCmjAccountId() );
        cmjChannelConfigModel.setGuildId( arg0.getGuildId() );
        cmjChannelConfigModel.setChannelId( arg0.getChannelId() );

        return cmjChannelConfigModel;
    }

    @Override
    public List<CmjChannelConfigModel> convertToModel(List<CmjChannelConfigDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CmjChannelConfigModel> list = new ArrayList<CmjChannelConfigModel>( arg0.size() );
        for ( CmjChannelConfigDTO cmjChannelConfigDTO : arg0 ) {
            list.add( convertToModel( cmjChannelConfigDTO ) );
        }

        return list;
    }

    @Override
    public CmjChannelConfigDTO convertToDTO(CmjChannelConfigModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CmjChannelConfigDTO cmjChannelConfigDTO = new CmjChannelConfigDTO();

        cmjChannelConfigDTO.setId( arg0.getId() );
        cmjChannelConfigDTO.setCreateTime( arg0.getCreateTime() );
        cmjChannelConfigDTO.setCreateOper( arg0.getCreateOper() );
        cmjChannelConfigDTO.setUpdateTime( arg0.getUpdateTime() );
        cmjChannelConfigDTO.setUpdateOper( arg0.getUpdateOper() );
        cmjChannelConfigDTO.setDelFlag( arg0.getDelFlag() );
        cmjChannelConfigDTO.setCreateTime_( arg0.getCreateTime_() );
        cmjChannelConfigDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            cmjChannelConfigDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            cmjChannelConfigDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            cmjChannelConfigDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        cmjChannelConfigDTO.setPage( arg0.getPage() );
        cmjChannelConfigDTO.setSize( arg0.getSize() );
        cmjChannelConfigDTO.setCmjAccountId( arg0.getCmjAccountId() );
        cmjChannelConfigDTO.setGuildId( arg0.getGuildId() );
        cmjChannelConfigDTO.setChannelId( arg0.getChannelId() );

        return cmjChannelConfigDTO;
    }

    @Override
    public List<CmjChannelConfigDTO> convertToDTO(List<CmjChannelConfigModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CmjChannelConfigDTO> list = new ArrayList<CmjChannelConfigDTO>( arg0.size() );
        for ( CmjChannelConfigModel cmjChannelConfigModel : arg0 ) {
            list.add( convertToDTO( cmjChannelConfigModel ) );
        }

        return list;
    }
}
