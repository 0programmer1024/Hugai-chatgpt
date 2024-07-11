package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysOpenConfigDTO;
import com.hugai.common.modules.entity.system.model.SysOpenConfigModel;
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
public class SysOpenConfigConvertImpl implements SysOpenConfigConvert {

    @Override
    public SysOpenConfigModel convertToModel(SysOpenConfigDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOpenConfigModel sysOpenConfigModel = new SysOpenConfigModel();

        sysOpenConfigModel.setId( arg0.getId() );
        sysOpenConfigModel.setCreateTime( arg0.getCreateTime() );
        sysOpenConfigModel.setCreateOper( arg0.getCreateOper() );
        sysOpenConfigModel.setUpdateTime( arg0.getUpdateTime() );
        sysOpenConfigModel.setUpdateOper( arg0.getUpdateOper() );
        sysOpenConfigModel.setDelFlag( arg0.getDelFlag() );
        sysOpenConfigModel.setCreateTime_( arg0.getCreateTime_() );
        sysOpenConfigModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysOpenConfigModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysOpenConfigModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysOpenConfigModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysOpenConfigModel.setPage( arg0.getPage() );
        sysOpenConfigModel.setSize( arg0.getSize() );
        sysOpenConfigModel.setUniqueKey( arg0.getUniqueKey() );
        sysOpenConfigModel.setTitle( arg0.getTitle() );
        sysOpenConfigModel.setAppId( arg0.getAppId() );
        sysOpenConfigModel.setAccessKey( arg0.getAccessKey() );
        sysOpenConfigModel.setSecretKey( arg0.getSecretKey() );
        sysOpenConfigModel.setBucketName( arg0.getBucketName() );
        sysOpenConfigModel.setDataHandleDomain( arg0.getDataHandleDomain() );
        sysOpenConfigModel.setFormData( arg0.getFormData() );
        sysOpenConfigModel.setCallbackUrl( arg0.getCallbackUrl() );
        sysOpenConfigModel.setTenantId( arg0.getTenantId() );
        sysOpenConfigModel.setPublicKey( arg0.getPublicKey() );
        sysOpenConfigModel.setPrivateKey( arg0.getPrivateKey() );
        sysOpenConfigModel.setGetawayUrl( arg0.getGetawayUrl() );
        sysOpenConfigModel.setReturnUrl( arg0.getReturnUrl() );
        sysOpenConfigModel.setSoftwarePublicKey( arg0.getSoftwarePublicKey() );

        return sysOpenConfigModel;
    }

    @Override
    public List<SysOpenConfigModel> convertToModel(List<SysOpenConfigDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysOpenConfigModel> list = new ArrayList<SysOpenConfigModel>( arg0.size() );
        for ( SysOpenConfigDTO sysOpenConfigDTO : arg0 ) {
            list.add( convertToModel( sysOpenConfigDTO ) );
        }

        return list;
    }

    @Override
    public SysOpenConfigDTO convertToDTO(SysOpenConfigModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOpenConfigDTO sysOpenConfigDTO = new SysOpenConfigDTO();

        sysOpenConfigDTO.setId( arg0.getId() );
        sysOpenConfigDTO.setCreateTime( arg0.getCreateTime() );
        sysOpenConfigDTO.setCreateOper( arg0.getCreateOper() );
        sysOpenConfigDTO.setUpdateTime( arg0.getUpdateTime() );
        sysOpenConfigDTO.setUpdateOper( arg0.getUpdateOper() );
        sysOpenConfigDTO.setDelFlag( arg0.getDelFlag() );
        sysOpenConfigDTO.setCreateTime_( arg0.getCreateTime_() );
        sysOpenConfigDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysOpenConfigDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysOpenConfigDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysOpenConfigDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysOpenConfigDTO.setPage( arg0.getPage() );
        sysOpenConfigDTO.setSize( arg0.getSize() );
        sysOpenConfigDTO.setUniqueKey( arg0.getUniqueKey() );
        sysOpenConfigDTO.setTitle( arg0.getTitle() );
        sysOpenConfigDTO.setAppId( arg0.getAppId() );
        sysOpenConfigDTO.setAccessKey( arg0.getAccessKey() );
        sysOpenConfigDTO.setSecretKey( arg0.getSecretKey() );
        sysOpenConfigDTO.setBucketName( arg0.getBucketName() );
        sysOpenConfigDTO.setDataHandleDomain( arg0.getDataHandleDomain() );
        sysOpenConfigDTO.setFormData( arg0.getFormData() );
        sysOpenConfigDTO.setCallbackUrl( arg0.getCallbackUrl() );
        sysOpenConfigDTO.setTenantId( arg0.getTenantId() );
        sysOpenConfigDTO.setPublicKey( arg0.getPublicKey() );
        sysOpenConfigDTO.setPrivateKey( arg0.getPrivateKey() );
        sysOpenConfigDTO.setGetawayUrl( arg0.getGetawayUrl() );
        sysOpenConfigDTO.setReturnUrl( arg0.getReturnUrl() );
        sysOpenConfigDTO.setSoftwarePublicKey( arg0.getSoftwarePublicKey() );

        return sysOpenConfigDTO;
    }

    @Override
    public List<SysOpenConfigDTO> convertToDTO(List<SysOpenConfigModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysOpenConfigDTO> list = new ArrayList<SysOpenConfigDTO>( arg0.size() );
        for ( SysOpenConfigModel sysOpenConfigModel : arg0 ) {
            list.add( convertToDTO( sysOpenConfigModel ) );
        }

        return list;
    }
}
