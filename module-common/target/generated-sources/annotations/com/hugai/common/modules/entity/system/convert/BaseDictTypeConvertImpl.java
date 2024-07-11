package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.BaseDictTypeDTO;
import com.hugai.common.modules.entity.system.model.BaseDictTypeModel;
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
public class BaseDictTypeConvertImpl implements BaseDictTypeConvert {

    @Override
    public BaseDictTypeModel convertToModel(BaseDictTypeDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BaseDictTypeModel baseDictTypeModel = new BaseDictTypeModel();

        baseDictTypeModel.setId( arg0.getId() );
        baseDictTypeModel.setCreateTime( arg0.getCreateTime() );
        baseDictTypeModel.setCreateOper( arg0.getCreateOper() );
        baseDictTypeModel.setUpdateTime( arg0.getUpdateTime() );
        baseDictTypeModel.setUpdateOper( arg0.getUpdateOper() );
        baseDictTypeModel.setDelFlag( arg0.getDelFlag() );
        baseDictTypeModel.setCreateTime_( arg0.getCreateTime_() );
        baseDictTypeModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            baseDictTypeModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            baseDictTypeModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            baseDictTypeModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        baseDictTypeModel.setPage( arg0.getPage() );
        baseDictTypeModel.setSize( arg0.getSize() );
        baseDictTypeModel.setDictType( arg0.getDictType() );
        baseDictTypeModel.setDictName( arg0.getDictName() );
        baseDictTypeModel.setStatus( arg0.getStatus() );
        baseDictTypeModel.setRemark( arg0.getRemark() );

        return baseDictTypeModel;
    }

    @Override
    public List<BaseDictTypeModel> convertToModel(List<BaseDictTypeDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BaseDictTypeModel> list = new ArrayList<BaseDictTypeModel>( arg0.size() );
        for ( BaseDictTypeDTO baseDictTypeDTO : arg0 ) {
            list.add( convertToModel( baseDictTypeDTO ) );
        }

        return list;
    }

    @Override
    public BaseDictTypeDTO convertToDTO(BaseDictTypeModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BaseDictTypeDTO baseDictTypeDTO = new BaseDictTypeDTO();

        baseDictTypeDTO.setId( arg0.getId() );
        baseDictTypeDTO.setCreateTime( arg0.getCreateTime() );
        baseDictTypeDTO.setCreateOper( arg0.getCreateOper() );
        baseDictTypeDTO.setUpdateTime( arg0.getUpdateTime() );
        baseDictTypeDTO.setUpdateOper( arg0.getUpdateOper() );
        baseDictTypeDTO.setDelFlag( arg0.getDelFlag() );
        baseDictTypeDTO.setCreateTime_( arg0.getCreateTime_() );
        baseDictTypeDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            baseDictTypeDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            baseDictTypeDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            baseDictTypeDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        baseDictTypeDTO.setPage( arg0.getPage() );
        baseDictTypeDTO.setSize( arg0.getSize() );
        baseDictTypeDTO.setDictType( arg0.getDictType() );
        baseDictTypeDTO.setDictName( arg0.getDictName() );
        baseDictTypeDTO.setStatus( arg0.getStatus() );
        baseDictTypeDTO.setRemark( arg0.getRemark() );

        return baseDictTypeDTO;
    }

    @Override
    public List<BaseDictTypeDTO> convertToDTO(List<BaseDictTypeModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BaseDictTypeDTO> list = new ArrayList<BaseDictTypeDTO>( arg0.size() );
        for ( BaseDictTypeModel baseDictTypeModel : arg0 ) {
            list.add( convertToDTO( baseDictTypeModel ) );
        }

        return list;
    }
}
