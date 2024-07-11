package com.hugai.common.modules.entity.config.convert;

import com.hugai.common.modules.entity.config.dto.CmjAccountDTO;
import com.hugai.common.modules.entity.config.model.CmjAccountModel;
import com.hugai.common.modules.entity.config.vo.CmjAccountDetailVO;
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
public class CmjAccountConvertImpl implements CmjAccountConvert {

    @Override
    public CmjAccountModel convertToModel(CmjAccountDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CmjAccountModel cmjAccountModel = new CmjAccountModel();

        cmjAccountModel.setId( arg0.getId() );
        cmjAccountModel.setCreateTime( arg0.getCreateTime() );
        cmjAccountModel.setCreateOper( arg0.getCreateOper() );
        cmjAccountModel.setUpdateTime( arg0.getUpdateTime() );
        cmjAccountModel.setUpdateOper( arg0.getUpdateOper() );
        cmjAccountModel.setDelFlag( arg0.getDelFlag() );
        cmjAccountModel.setCreateTime_( arg0.getCreateTime_() );
        cmjAccountModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            cmjAccountModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            cmjAccountModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            cmjAccountModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        cmjAccountModel.setPage( arg0.getPage() );
        cmjAccountModel.setSize( arg0.getSize() );
        cmjAccountModel.setUserName( arg0.getUserName() );
        cmjAccountModel.setUserToken( arg0.getUserToken() );
        cmjAccountModel.setUserAgent( arg0.getUserAgent() );
        cmjAccountModel.setDataObject( arg0.getDataObject() );
        cmjAccountModel.setAccountStatus( arg0.getAccountStatus() );
        cmjAccountModel.setIfProxy( arg0.getIfProxy() );

        return cmjAccountModel;
    }

    @Override
    public List<CmjAccountModel> convertToModel(List<CmjAccountDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CmjAccountModel> list = new ArrayList<CmjAccountModel>( arg0.size() );
        for ( CmjAccountDTO cmjAccountDTO : arg0 ) {
            list.add( convertToModel( cmjAccountDTO ) );
        }

        return list;
    }

    @Override
    public CmjAccountDTO convertToDTO(CmjAccountModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CmjAccountDTO cmjAccountDTO = new CmjAccountDTO();

        cmjAccountDTO.setId( arg0.getId() );
        cmjAccountDTO.setCreateTime( arg0.getCreateTime() );
        cmjAccountDTO.setCreateOper( arg0.getCreateOper() );
        cmjAccountDTO.setUpdateTime( arg0.getUpdateTime() );
        cmjAccountDTO.setUpdateOper( arg0.getUpdateOper() );
        cmjAccountDTO.setDelFlag( arg0.getDelFlag() );
        cmjAccountDTO.setCreateTime_( arg0.getCreateTime_() );
        cmjAccountDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            cmjAccountDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            cmjAccountDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            cmjAccountDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        cmjAccountDTO.setPage( arg0.getPage() );
        cmjAccountDTO.setSize( arg0.getSize() );
        cmjAccountDTO.setUserName( arg0.getUserName() );
        cmjAccountDTO.setUserToken( arg0.getUserToken() );
        cmjAccountDTO.setUserAgent( arg0.getUserAgent() );
        cmjAccountDTO.setDataObject( arg0.getDataObject() );
        cmjAccountDTO.setAccountStatus( arg0.getAccountStatus() );
        cmjAccountDTO.setIfProxy( arg0.getIfProxy() );

        return cmjAccountDTO;
    }

    @Override
    public List<CmjAccountDTO> convertToDTO(List<CmjAccountModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CmjAccountDTO> list = new ArrayList<CmjAccountDTO>( arg0.size() );
        for ( CmjAccountModel cmjAccountModel : arg0 ) {
            list.add( convertToDTO( cmjAccountModel ) );
        }

        return list;
    }

    @Override
    public CmjAccountDetailVO convertDetailVo(CmjAccountModel model) {
        if ( model == null ) {
            return null;
        }

        CmjAccountDetailVO cmjAccountDetailVO = new CmjAccountDetailVO();

        cmjAccountDetailVO.setId( model.getId() );
        cmjAccountDetailVO.setCreateTime( model.getCreateTime() );
        cmjAccountDetailVO.setCreateOper( model.getCreateOper() );
        cmjAccountDetailVO.setUpdateTime( model.getUpdateTime() );
        cmjAccountDetailVO.setUpdateOper( model.getUpdateOper() );
        cmjAccountDetailVO.setDelFlag( model.getDelFlag() );
        cmjAccountDetailVO.setCreateTime_( model.getCreateTime_() );
        cmjAccountDetailVO.setUpdateTime_( model.getUpdateTime_() );
        Map<String, Object> map = model.getParamExtMap();
        if ( map != null ) {
            cmjAccountDetailVO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = model.getQueryCondition();
        if ( map1 != null ) {
            cmjAccountDetailVO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = model.getSortCondition();
        if ( map2 != null ) {
            cmjAccountDetailVO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        cmjAccountDetailVO.setPage( model.getPage() );
        cmjAccountDetailVO.setSize( model.getSize() );
        cmjAccountDetailVO.setUserName( model.getUserName() );
        cmjAccountDetailVO.setUserToken( model.getUserToken() );
        cmjAccountDetailVO.setUserAgent( model.getUserAgent() );
        cmjAccountDetailVO.setDataObject( model.getDataObject() );
        cmjAccountDetailVO.setAccountStatus( model.getAccountStatus() );
        cmjAccountDetailVO.setIfProxy( model.getIfProxy() );

        return cmjAccountDetailVO;
    }
}
