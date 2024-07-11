package com.hugai.common.modules.entity.session.convert;

import com.hugai.common.modules.entity.session.dto.DomainDTO;
import com.hugai.common.modules.entity.session.model.DomainModel;
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
public class DomainConvertImpl implements DomainConvert {

    @Override
    public DomainModel convertToModel(DomainDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DomainModel domainModel = new DomainModel();

        domainModel.setId( arg0.getId() );
        domainModel.setCreateTime( arg0.getCreateTime() );
        domainModel.setCreateOper( arg0.getCreateOper() );
        domainModel.setUpdateTime( arg0.getUpdateTime() );
        domainModel.setUpdateOper( arg0.getUpdateOper() );
        domainModel.setDelFlag( arg0.getDelFlag() );
        domainModel.setCreateTime_( arg0.getCreateTime_() );
        domainModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            domainModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            domainModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            domainModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        domainModel.setPage( arg0.getPage() );
        domainModel.setSize( arg0.getSize() );
        domainModel.setUniqueKey( arg0.getUniqueKey() );
        domainModel.setAboveContent( arg0.getAboveContent() );
        domainModel.setSort( arg0.getSort() );
        domainModel.setRemark( arg0.getRemark() );
        domainModel.setRoutePath( arg0.getRoutePath() );
        domainModel.setIconName( arg0.getIconName() );
        domainModel.setIconPath( arg0.getIconPath() );
        domainModel.setWindowData( arg0.getWindowData() );
        domainModel.setType( arg0.getType() );
        domainModel.setIfShow( arg0.getIfShow() );
        domainModel.setFirstContent( arg0.getFirstContent() );
        domainModel.setIfDeskShow( arg0.getIfDeskShow() );

        return domainModel;
    }

    @Override
    public List<DomainModel> convertToModel(List<DomainDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DomainModel> list = new ArrayList<DomainModel>( arg0.size() );
        for ( DomainDTO domainDTO : arg0 ) {
            list.add( convertToModel( domainDTO ) );
        }

        return list;
    }

    @Override
    public DomainDTO convertToDTO(DomainModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DomainDTO domainDTO = new DomainDTO();

        domainDTO.setId( arg0.getId() );
        domainDTO.setCreateTime( arg0.getCreateTime() );
        domainDTO.setCreateOper( arg0.getCreateOper() );
        domainDTO.setUpdateTime( arg0.getUpdateTime() );
        domainDTO.setUpdateOper( arg0.getUpdateOper() );
        domainDTO.setDelFlag( arg0.getDelFlag() );
        domainDTO.setCreateTime_( arg0.getCreateTime_() );
        domainDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            domainDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            domainDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            domainDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        domainDTO.setPage( arg0.getPage() );
        domainDTO.setSize( arg0.getSize() );
        domainDTO.setUniqueKey( arg0.getUniqueKey() );
        domainDTO.setAboveContent( arg0.getAboveContent() );
        domainDTO.setSort( arg0.getSort() );
        domainDTO.setRemark( arg0.getRemark() );
        domainDTO.setRoutePath( arg0.getRoutePath() );
        domainDTO.setIconName( arg0.getIconName() );
        domainDTO.setIconPath( arg0.getIconPath() );
        domainDTO.setWindowData( arg0.getWindowData() );
        domainDTO.setType( arg0.getType() );
        domainDTO.setIfShow( arg0.getIfShow() );
        domainDTO.setFirstContent( arg0.getFirstContent() );
        domainDTO.setIfDeskShow( arg0.getIfDeskShow() );

        return domainDTO;
    }

    @Override
    public List<DomainDTO> convertToDTO(List<DomainModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DomainDTO> list = new ArrayList<DomainDTO>( arg0.size() );
        for ( DomainModel domainModel : arg0 ) {
            list.add( convertToDTO( domainModel ) );
        }

        return list;
    }
}
