        Map<Integer,List<Integer>>last_st_ind=new HashMap<>();
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(u[i]);
            last_st_ind.computeIfAbsent(u[i], x -> new ArrayList<>()).add(i);
        }



        /*
        String ans=new BigInteger(s.startsWith("9") ? "1".repeat(n + 1) : "9".repeat(s.length()))
                .subtract(new BigInteger(s)).toString();
        */
