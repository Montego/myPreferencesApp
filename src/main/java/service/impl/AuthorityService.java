package service.impl;

import entity.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AuthorityRepository;
import service.IAuthorityService;
@Service
public class AuthorityService implements IAuthorityService {

    private AuthorityRepository authorityRepository;
    @Autowired
    public AuthorityService(AuthorityRepository authorityRepository){
        this.authorityRepository = authorityRepository;
    }

    @Override
    public Authority getAuthority(Authority authority) {
        return null;
    }

    @Override
    public Authority addAuthority(Authority authority) {
        return null;
    }

    @Override
    public Authority getByRole(String role) {
        return null;
    }

    @Override
    public Authority getAllRoles() {
        return null;
    }
}
