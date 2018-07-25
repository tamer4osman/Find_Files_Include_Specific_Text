private Set<Path> findTextIncludes(Set<Path> sourceFiles) {
        Set<Path> containingFiles = new HashSet<>();
        sourceFiles.forEach(path ->
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(path.toString()))) {
                for (String line; (line = reader.readLine()) != null; ) {
                    if (line.contains("you text"))
                        containingFiles.add(path);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        return containingFiles;
    }
