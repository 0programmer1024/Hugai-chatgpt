package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.BaseDictDataDTO;
import com.hugai.common.modules.entity.system.model.BaseDictDataModel;
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
public class BaseDictDataConvertImpl implements BaseDictDataConvert {

    @Override
    public BaseDictDataModel convertToModel(BaseDictDataDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BaseDictDataModel baseDictDataModel = new BaseDictDataModel();

        baseDictDataModel.setId( arg0.getId() );
        baseDictDataModel.setCreateTime( arg0.getCreateTime() );
        baseDictDataModel.setCreateOper( arg0.getCreateOper() );
        baseDictDataModel.setUpdateTime( arg0.getUpdateTime() );
        baseDictDataModel.setUpdateOper( arg0.getUpdateOper() );
        baseDictDataModel.setDelFlag( arg0.getDelFlag() );
        baseDictDataModel.setCreateTime_( arg0.getCreateTime_() );
        baseDictDataModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            baseDictDataModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            baseDictDataModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            baseDictDataModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        baseDictDataModel.setPage( arg0.getPage() );
        baseDictDataModel.setSize( arg0.getSize() );
        baseDictDataModel.setSort( arg0.getSort() );
        baseDictDataModel.setDictLabel( arg0.getDictLabel() );
        baseDictDataModel.setDictValue( arg0.getDictValue() );
        baseDictDataModel.setDictType( arg0.getDictType() );
        baseDictDataModel.setCssClass( arg0.getCssClass() );
        baseDictDataModel.setListClass( arg0.getListClass() );
        baseDictDataModel.setIsDefault( arg0.getIsDefault() );
        baseDictDataModel.setStatus( arg0.getStatus() );

        return baseDictDataModel;
    }

    @Override
    public List<BaseDictDataModel> convertToModel(List<BaseDictDataDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BaseDictDataModel> list = new ArrayList<BaseDictDataModel>( arg0.size() );
        for ( BaseDictDataDTO baseDictDataDTO : arg0 ) {
            list.add( convertToModel( baseDictDataDTO ) );
        }

        return list;
    }

    @Override
    public BaseDictDataDTO convertToDTO(BaseDictDataModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BaseDictDataDTO baseDictDataDTO = new BaseDictDataDTO();

        baseDictDataDTO.setId( arg0.getId() );
        baseDictDataDTO.setCreateTime( arg0.getCreateTime() );
        baseDictDataDTO.setCreateOper( arg0.getCreateOper() );
        baseDictDataDTO.setUpdateTime( arg0.getUpdateTime() );
        baseDictDataDTO.setUpdateOper( arg0.getUpdateOper() );
        baseDictDataDTO.setDelFlag( arg0.getDelFlag() );
        baseDictDataDTO.setCreateTime_( arg0.getCreateTime_() );
        baseDictDataDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            baseDictDataDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            baseDictDataDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            baseDictDataDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        baseDictDataDTO.setPage( arg0.getPage() );
        baseDictDataDTO.setSize( arg0.getSize() );
        baseDictDataDTO.setSort( arg0.getSort() );
        baseDictDataDTO.setDictLabel( arg0.getDictLabel() );
        baseDictDataDTO.setDictValue( arg0.getDictValue() );
        baseDictDataDTO.setDictType( arg0.getDictType() );
        baseDictDataDTO.setCssClass( arg0.getCssClass() );
        baseDictDataDTO.setListClass( arg0.getListClass() );
        baseDictDataDTO.setIsDefault( arg0.getIsDefault() );
        baseDictDataDTO.setStatus( arg0.getStatus() );

        return baseDictDataDTO;
    }

    @Override
    public List<BaseDictDataDTO> convertToDTO(List<BaseDictDataModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BaseDictDataDTO> list = new ArrayList<BaseDictDataDTO>( arg0.size() );
        for ( BaseDictDataModel baseDictDataModel : arg0 ) {
            list.add( convertToDTO( baseDictDataModel ) );
        }

        return list;
    }
}
