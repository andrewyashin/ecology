package org.studying.service;

import org.studying.dto.EmissionsData;

import java.util.List;

public interface EmissionsService {
    List<EmissionsData> getOnlyDangerous();
}
