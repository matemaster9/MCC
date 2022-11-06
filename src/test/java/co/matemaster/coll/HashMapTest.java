package co.matemaster.coll;

import org.junit.Test;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author matemaster
 */
public class HashMapTest {

    @Test
    public void test1() {
        String randomStr = """
                214y65624SzXTBbFgnuWjpndUIMtJfRIbZwxQVwTvfgehvpQIVtyllDoJuIwuBuLLBuQnjXOBxDwXthzWDvsUM
                tcJFkEcbIywEHJvIvOvJMiCJhniZFKIeIBamlckzYjhygTKERsKIxQNajLFDFQpbXxcQKxtKRlrYkk
                EozCAxrTXYjFcFWILoxdzRTJMCFIcFwIuGlhJwPbixYPpiOiCVDqIDcigpezvTWHUNsXOwnOHhiUc
                vQhrYmHNCDQoPNapBajpALQKIbgFVCaUzqyRSxokuzJOjFLJsVOPyHnQivbSBcLadPcEppwuMKiJG
                lwNaSmAMYNDJeJffxZThkvZjXgLBcEdRvwBMXovfissoaAhGykYhEKGIuIVKpAEayoXWqyOrQvVvjr
                etogdFxqOWuyxTXdLCVxDPshyQeYeVmNutBGWqycYpQsFrWWyjTPkHYMgnaWwTOoJBaGslZVbyXvDp
                vaLSThCDMVtisdanXOxnXKIzgOhuSuiHhxJomGduOSIzqtJrtOzdQWwyNChndqEnHPJbLthGFnLYgU
                kQnrBmJOWGReqSCtKkSfwELiCokdYKjWObHfvxOTLdWOpUaYnrfEjYJOoDcPClzdzjASCLCPSCgGjn
                ffWLCFboJJeVhCGahNJSpuZRDIKegSKzbFFcwXVxeJSIzejdejJPUUZGwKvsgpKfZtaWQxCTxiZKpiC
                OmdabftToTRvRDQHbpbqxxCnmwBVGVUsQSoOENsDoYFmfdYfAdlHiikQVNIoTCLaOXXrwkrRZwuoZew
                bHkZqjnBOOgkyNYDaMGglEYuYhQMRHVtzlJfhjlcckdgOojKgYTwLAGNHSUEzwCfigwvLTjcVEcLOAK
                HqgLkIAghURqmLALMGVmyrLyufzvrcWWyvlzbCrjLwqrLWicdFBWOauIMPsSNLLIBunioOvCtvIdFNH
                MXpjakHDyRWrqPJmsZRKLHmnqAzxaHkQZqkfbTnJUThYzYkVlDIQzToPRcYljPF
                """;
        Map<Character, Long> wordCountMap = randomStr.chars()
                .mapToObj(charNumber -> (char) charNumber)
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()));
        System.out.println(wordCountMap);
    }
}
