package io.github.gregiagu.pattern.templatemethod.dataprocessor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jspecify.annotations.NonNull;

import com.google.common.base.Preconditions;

public class Cpf {


    private final Pattern rawPattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
    
    public Cpf(@NonNull String rawCpf) {
        Matcher matcher = rawPattern.matcher(rawCpf);
        Preconditions.checkArgument(matcher.find());

        cleanCpfNumber = matcher.group(1) + matcher.group(2) + matcher.group(3) + matcher.group(4);
        dottedCpfNumber = matcher.group(1) + "." + matcher.group(2) + "." + matcher.group(3) + "-" + matcher.group(4);
    }

    private final String cleanCpfNumber;

    public String getCleanCpfNumber() {
        return cleanCpfNumber;
    }

    private final String dottedCpfNumber;

    public String getDottedCpfNumber() {
        return dottedCpfNumber;
    }

    public Boolean isValid() {
        return true;
    }
}
