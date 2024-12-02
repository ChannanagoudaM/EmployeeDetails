package com.example.employeeDetails.jwt;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.Map;

@Service
public class JwtUtils {

    private final String secreteKey="nTcHbTBzfqSkbedG/pIHMVNYvi3M/4PCW69iVdXWaHA=";


    public String generateToken(Map<String ,Object>extraClaims, UserDetails userDetails)
    {
        return
                Jwts
                        .builder()
                        .setClaims(extraClaims)
                        .setSubject(userDetails.getUsername())
                        .setIssuedAt(new Date(System.currentTimeMillis()))
                        .setExpiration(new Date(System.currentTimeMillis()*1000*60*24))
                        .signWith(getSignInKey())
                        .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                        .compact();
    }

    private Key getSignInKey() {

    }

}
