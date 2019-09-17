package com.relationships.example.relationships.projections;

import com.relationships.example.relationships.models.File;
import com.relationships.example.relationships.models.Folder;
import com.relationships.example.relationships.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embededUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    User getUser();
    List<File> getFiles();
}
