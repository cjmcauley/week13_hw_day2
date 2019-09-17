package com.relationships.example.relationships.projections;

import com.relationships.example.relationships.models.File;
import com.relationships.example.relationships.models.Folder;
import com.relationships.example.relationships.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embededFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
