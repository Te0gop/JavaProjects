package com.springbootfundamentals.services;

import com.springbootfundamentals.models.Release;

import java.util.List;

public interface ReleaseService {
    List<Release> listReleases();
}
