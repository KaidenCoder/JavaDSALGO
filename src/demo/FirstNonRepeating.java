package demo;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static void main(String[] args) {
        String str1 = "ZoWECnMTTnCjXnEsYdofRUhJanLhSUKKTjScWGsvhMWJQJOJYGgFGQuNbZgtcwthWlsqqzxOgAJDVRyXiNCLQDmpYdcLKexGoJETQBKKjLKznaXwCoZWVWjWUUKocIzsEwOzrmuTBozEHTwWiSjAFffCRuVszBuvlTGQaFfCflHcBwZhxzbXOcKEbRqRYMKyPhHhwxoEXcqbblmtatqQCNtBDskHPjhSYJaXGUHjOIUhfpJvZZPzKriBKRhVbGtvlSneduejQznHFXXZWvURulepsTLWfOUeWTBSCwZUwnKwswHCkHpBOmJXzgeadIatmvbytTiDdABKWwlaRBWFaHKuNZVLgDoQsThZonkzRYEpLjZmhStPPSuIphOYcBapLItaKNzhbVZKmfdgqkfMJtZLbRmhSFoCmaMOyjIkamDzCWUaYiTvQiSYYLeboLABwIKqGIwgoygtjRQKLmMFFOHWkgyzisxpVTnoiymGtUciUfIBtPpJGIeSRFRgMpRliyVCmjbUNmBoErpTwmwvZvOmMMrnQzxwFFSoZNHZBzrEaUyiHVoJxvrYmovRtjjsBEVjjcUftXjMnLFcJFLfCZTZthHmtERIfEvSJGYzqucIzOWYYJUbBGqAjZGsCnBIullBnzjmwyveaDrjTdMlodNlsAtucJKFLhmkyLJKTocDdgvEACRYATyCbjwTMuiErViKWOfLELzoXUPjBhnoyOgbqQzPPIAhHBNhshlJMiQecrfoAgVisjbivVZglzdzatBddQEaeSLZvyyYEEtJKbALecJBTrhcuwEONkSoJDvYkFhlCNOVyeDPHfQJWzKvDZyvjeNQeTATKkKewEMhHEBhYzHEWAdxkOCtrlHoPpElxbXsCvTwdOVczKAlnNChNnUAVetNVwSOABkZJZJDblzgQyOdDFTLMPmiwLZKmwVCPQnzgdaLYCcTbWPdywOqNEMKSURJmzmCqnLYhPQEVcQewatPZgvoWFRspGymFjWNKrjXXLeeonYHQjJwzdluQxXUILFhxLogWuYvEprwHuPqGSOeEcwPReZSCHuwwxsriACcNJoUvqCdRXshxuZNRIfsKZxRvExDkyCDYejOapMUkZmjNCVSMpaLiAAgNYjUaiDarmlsNxNraCKGDLtAgqvYsgPUBTzFpaZrPfmJyuLekECyCZSWZDaZdOoZolRgzgPGVnIZDyEjvApcWiaUZtLObcrHQUruUAabTlwnLwOZZdinXeYCZCNPwCsHylqOLHoHXafxUytACdWMylzMPBQEWGhsdXqYQOCMubXYcoJdXPkSIceTTPUCspEAIboUyUGeCgSXNIOUcdYwbDolRMoVeXtyLOjXzXfJhmrlUcnNUywEnFFJbXZrupMuYNWNcTDEYRjfrUtiXWyCTNjJBgqZOCpQgflCwDcPhPZmmxKokmeeeKXhQvhNpKjGJIypDSGgHbqDUYGxIqXbWcbBrTKOxFvHCvbhqUHKkWBWBaQZTKYBWrtWWtJTxPPXJZPtBxAPCapASKNtMUKewudSRDuBgDaMARxStwWOhlypSNtaUoWbMrYCxoYMYZswgQfhAVyeoXarFlUkVQBBvDQbYDelmLYJexNeEsktdVmTsTmlAUCKdsdJNVLOhaKqjOYluPZGDXeWinUblbAfoVXnqkpjPjupvNYZRrCxQrCQHeYCfXbbZwTjhrJqpnvdCQGOxJULDPRAtralwFdEPTZoAwlfUCNJDbYbMvKYwLJrruMMcFArSsOmYqEEvaRdNguBJqsHGXxOrmPChxnTiTpyovlffcVtIVlRhizGXGgqQXgtmEIcWqPBmNrWfGcuXiObLhcLhlUAjVoFYiDCyYowkewiTGQpZNmJMqSFqPCcHceFPhoHNNDTZzrkxUdwxWWuaUamTTqVkjXxFLgllWbWLFcSyLXZScHLNINNfclNiTWcHnVNBbjImZsKaIPhiZbCXbvWGmuJJcHFUFfCsryPiBQpJaiRStEMjoGLPuxJHgrvogvjSFXBODGlPPYWUiiCkOTMAfvHbvatRdvGGTPbjQIrmilINLbjZqfQgvVvPprNdANCAMAvvIkLpIPvtLIaRtvRRwyBUHSdkOYFHoKnCiJHhwLzejLvkSZfybkbUvepmTBaqXEgonKGaXWvwCOWwDViXytibegCWuQkknAiixfCknUxifNKuyetERdqRJdGmWikPjlBskqYvBgbYUNotQEuSdpYxMXTDfAGLgEoKZvEWgForrMDIOchkoZpjTAnwMIHdvzNFDoqgEsblOkjOyJENzOXblAcOykMypMOBOmJoxuOEKMcglsGchbBNvNfXmTbOwnBqmoSvVHIatVpzlxupkWmtxdJCdMLjBKzXrlRpNGFIcFTwPFFVqlvgjoUherkoFesCveROsgLhXUxbYXytzJLXQpiWEIAfYDhGqRvQByqUxeCtOvGSpbRcoNJxcvkHmRdJWeHDZoWCxOsXgApPdJyrzTIFgzxowCpIyqghVbXEdRlxeSMbhEEMMOXuObFKyBJqjbNrDxYeFvOZBqtKjrqxOPWMreclGLaJEwStcdHzSKTYxVxwsGJWLPVRKOvukzHFEdzDUhFuAQdnVwIQIydXvrdTQMmaHkXHKdtIgsudgulpUiATXPuTZNQiDxpUfpOGJBMZWqnmJVEPDBQMiGnOYnFAlKJcIFHHTWjevhOqBgAGCzylWiKZwoiGZarjoToJxCebYgLQhDLIZRrZFKOauDhTYDpffFyZALDuNyXwWUgoLArMBQgOsxfCWgglsgbnsvIvSwvOojHSPwdlgctBXQSEDPdWtnmOkKtgAbucSuPKLFrnvKgnhyfVGixHlVQLjaWHYbwScSiWHLWrETlySZPHsGVLKHPGiAgghRsAyFeareOofkEXQcZcttFhigprQVKlQHGluZlydhJHHwocZyWFCSedvZYmKYcAnynEkOeLEKoHJaNBAAjyScAoKYJqbBthxuClmeMRvCUeIsKZkCoMOdZIUSYCVqAEkmNKeIvlVuzReeVezmapEpqAWTbDqvZJGktBvEjxmMkdknhqtXRtMvIJSlgMhHZDVEPGAFqpJhlEPtZSpKHwcnDWVMaOMckaaxiObNfnZxAhHWmnIoYVQZKSvqRuLuYHeaCCnrATwSLutjQtVLIEUulhGbUoWKcgBLcUGKdDKkxQlcdXTXsXISiZhSAyzqsMlzBWDkzFGOoxenYLPnNrxYpmYygKTGucnLBzgosbcztKQjGWcynnjOqqkuczIlDCxMRBkHUhZUEpmiHZmIJPaXgPgFQKXhXEdfmtkKcrDpJyaBdaiFNHFxZdaDWCUrKmjuZhDlGTkOCeqhAbejACfiAYtfUHQMlZEVSbGAWTHwNyRvvuEbmERVFPYTkgqYtzRKXOBMAjdmMmHjqXzeZPHkwiRwdGtjINMKaELPNDemnCFBseLpGKNysSdZkNOLTezgMeHwUjJkgsrNBYrOjkyWJFSGsRmTyFrhQVYPYMBRrlcxymgMgIRrlmuKJCMfiNyeXSvpvKdbvltkLqKNkLQgSSwfMxcMpsrIsOfbGIsNnwKuuDpxWaSKJOJrybtqPwaBNipyIRsuUcTyaYYChtCNwolqnzVYZNYcAaqPpZiJBCHBBTdTHvGIkwyRAihFeKeHgBsOhYHOMPExVavgpeaLWyHeCXYAMdNnyJemQiYhfGgXRZIAnJWrccAQLDsgQEPfoSXnTFUeoTmcFQzQhITRvRLhfnbLpxFxzvlgRrqxoxHLacRLuArAfOSdOVCuIJvcaXTPAotwgaPyssGNGTcRYjMGTNUkLRHFptkmoXvZYNoXTkQIvmHDiDMACRdGZWlfFlpQFHHefgMnKHVfzOztmUIpzMuFNqZURbHGPbSTIWmnthqOyZLdlafLIAxhsJvCvVgmReqxaWZoWKKAknccGSgNxDQvvCzsDaZTlHGsPQiYEALaqAZbxUWZFjoCfQFsWmeYZWtEZRKDoqZEIujEQoXyp";
        String str = "ZoWECnMTTnLjZmtUciUfIBtPpJGIeSvDZyvjeNQerupMuYNWNcTDEYRjfrUtiXWyCTNjJBgqZOCpQgflCwDcPhPZmmxKokmeeeKXhQvhNpKjGJIypDSGgHbqDUYGxIqXbWcbBrTKOxFvHCvbhqUHKkWBWBaQZTKYBWrtWWtJTxPPXJZPtBxAPCapASKNtMUKewudSRDuBgDaMARxStwWOhlyp";
       String str2 = "aDcadhc";
        System.out.print(firstNonRepeatingChar(str));

    }

    public static char firstNonRepeatingChar(String str)
    {
       int idx = helper(str);
       return str.charAt(idx);
       // char[] chars = str.toCharArray();

//        for(int i = 0; i < chars.length; i++){
//            System.out.print(chars[i] + " ");
//        }

//        Map<Character, Integer> map = new HashMap<>();
//
//        for(char c: chars){
//            if(map.get(c) == null){
//                map.put(c, 1);
//            }else{
//                map.put(c, map.get(c) + 1);
//            }
//        }
//
//        char d = '\0';
//
//        for(Map.Entry entry: map.entrySet()){
//            if((int)entry.getValue() == 1) {
//                return (char) entry.getKey();
//
//            }
//        }
//        return d;

    }

    public static int helper(String str){
        char [] arr = new char[256];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)]++;
        }

        int index = -1, i;

        for(i = 0; i < str.length(); i++){
            if(arr[str.charAt(i)] == 1){
                index = i;
                break;
            }

        }

        return index;


    }

}
