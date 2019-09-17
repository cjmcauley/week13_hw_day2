package com.relationships.example.relationships.components;

import com.relationships.example.relationships.models.File;
import com.relationships.example.relationships.models.Folder;
import com.relationships.example.relationships.models.User;
import com.relationships.example.relationships.repositories.FileRepository;
import com.relationships.example.relationships.repositories.FolderRepository;
import com.relationships.example.relationships.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args) {

        User user1 = new User("Chris");
        userRepository.save(user1);

        Folder folder1 = new Folder("Important", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Very Important", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Do Not Touch", user1);
        folderRepository.save(folder3);

        File file1 = new File("Mortgage", "jpg", 64, folder1);
        fileRepository.save(file1);

        File file2 = new File("Rent", "jpg", 64, folder2);
        fileRepository.save(file2);

        File file3 = new File("Holiday", "jpg", 64, folder1);
        fileRepository.save(file3);

        File file4 = new File("Monday", "jpg", 64, folder2);
        fileRepository.save(file4);

        File file5 = new File("Funeral", "jpg", 64, folder1);
        fileRepository.save(file5);

        File file6 = new File("Recipes", "jpg", 64, folder2);
        fileRepository.save(file6);

    }
}
