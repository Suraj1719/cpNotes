        Collections.sort(ans,(a,b) ->
        {
            if (a.get(0) > b.get(0) ||
                    (a.get(0).equals(b.get(0)) && a.get(1) > b.get(1))) {
                return -1;
            } else if (a.get(0) < b.get(0) ||
                    (a.get(0).equals(b.get(0)) && a.get(1) < b.get(1))) {
                return 1;
            }
            return 0;
        });
