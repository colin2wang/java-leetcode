package com.colin.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class S0866_Prime_Palindrome {

    class Solution {
        List<Integer> list = new ArrayList<>();

        public Solution() {
            list.add(2);
            list.add(3);
            list.add(5);
            list.add(7);
            list.add(11);
            list.add(101);
            list.add(131);
            list.add(151);
            list.add(181);
            list.add(191);
            list.add(313);
            list.add(353);
            list.add(373);
            list.add(383);
            list.add(727);
            list.add(757);
            list.add(787);
            list.add(797);
            list.add(919);
            list.add(929);
            list.add(10301);
            list.add(10501);
            list.add(10601);
            list.add(11311);
            list.add(11411);
            list.add(12421);
            list.add(12721);
            list.add(12821);
            list.add(13331);
            list.add(13831);
            list.add(13931);
            list.add(14341);
            list.add(14741);
            list.add(15451);
            list.add(15551);
            list.add(16061);
            list.add(16361);
            list.add(16561);
            list.add(16661);
            list.add(17471);
            list.add(17971);
            list.add(18181);
            list.add(18481);
            list.add(19391);
            list.add(19891);
            list.add(19991);
            list.add(30103);
            list.add(30203);
            list.add(30403);
            list.add(30703);
            list.add(30803);
            list.add(31013);
            list.add(31513);
            list.add(32323);
            list.add(32423);
            list.add(33533);
            list.add(34543);
            list.add(34843);
            list.add(35053);
            list.add(35153);
            list.add(35353);
            list.add(35753);
            list.add(36263);
            list.add(36563);
            list.add(37273);
            list.add(37573);
            list.add(38083);
            list.add(38183);
            list.add(38783);
            list.add(39293);
            list.add(70207);
            list.add(70507);
            list.add(70607);
            list.add(71317);
            list.add(71917);
            list.add(72227);
            list.add(72727);
            list.add(73037);
            list.add(73237);
            list.add(73637);
            list.add(74047);
            list.add(74747);
            list.add(75557);
            list.add(76367);
            list.add(76667);
            list.add(77377);
            list.add(77477);
            list.add(77977);
            list.add(78487);
            list.add(78787);
            list.add(78887);
            list.add(79397);
            list.add(79697);
            list.add(79997);
            list.add(90709);
            list.add(91019);
            list.add(93139);
            list.add(93239);
            list.add(93739);
            list.add(94049);
            list.add(94349);
            list.add(94649);
            list.add(94849);
            list.add(94949);
            list.add(95959);
            list.add(96269);
            list.add(96469);
            list.add(96769);
            list.add(97379);
            list.add(97579);
            list.add(97879);
            list.add(98389);
            list.add(98689);
            list.add(1003001);
            list.add(1008001);
            list.add(1022201);
            list.add(1028201);
            list.add(1035301);
            list.add(1043401);
            list.add(1055501);
            list.add(1062601);
            list.add(1065601);
            list.add(1074701);
            list.add(1082801);
            list.add(1085801);
            list.add(1092901);
            list.add(1093901);
            list.add(1114111);
            list.add(1117111);
            list.add(1120211);
            list.add(1123211);
            list.add(1126211);
            list.add(1129211);
            list.add(1134311);
            list.add(1145411);
            list.add(1150511);
            list.add(1153511);
            list.add(1160611);
            list.add(1163611);
            list.add(1175711);
            list.add(1177711);
            list.add(1178711);
            list.add(1180811);
            list.add(1183811);
            list.add(1186811);
            list.add(1190911);
            list.add(1193911);
            list.add(1196911);
            list.add(1201021);
            list.add(1208021);
            list.add(1212121);
            list.add(1215121);
            list.add(1218121);
            list.add(1221221);
            list.add(1235321);
            list.add(1242421);
            list.add(1243421);
            list.add(1245421);
            list.add(1250521);
            list.add(1253521);
            list.add(1257521);
            list.add(1262621);
            list.add(1268621);
            list.add(1273721);
            list.add(1276721);
            list.add(1278721);
            list.add(1280821);
            list.add(1281821);
            list.add(1286821);
            list.add(1287821);
            list.add(1300031);
            list.add(1303031);
            list.add(1311131);
            list.add(1317131);
            list.add(1327231);
            list.add(1328231);
            list.add(1333331);
            list.add(1335331);
            list.add(1338331);
            list.add(1343431);
            list.add(1360631);
            list.add(1362631);
            list.add(1363631);
            list.add(1371731);
            list.add(1374731);
            list.add(1390931);
            list.add(1407041);
            list.add(1409041);
            list.add(1411141);
            list.add(1412141);
            list.add(1422241);
            list.add(1437341);
            list.add(1444441);
            list.add(1447441);
            list.add(1452541);
            list.add(1456541);
            list.add(1461641);
            list.add(1463641);
            list.add(1464641);
            list.add(1469641);
            list.add(1486841);
            list.add(1489841);
            list.add(1490941);
            list.add(1496941);
            list.add(1508051);
            list.add(1513151);
            list.add(1520251);
            list.add(1532351);
            list.add(1535351);
            list.add(1542451);
            list.add(1548451);
            list.add(1550551);
            list.add(1551551);
            list.add(1556551);
            list.add(1557551);
            list.add(1565651);
            list.add(1572751);
            list.add(1579751);
            list.add(1580851);
            list.add(1583851);
            list.add(1589851);
            list.add(1594951);
            list.add(1597951);
            list.add(1598951);
            list.add(1600061);
            list.add(1609061);
            list.add(1611161);
            list.add(1616161);
            list.add(1628261);
            list.add(1630361);
            list.add(1633361);
            list.add(1640461);
            list.add(1643461);
            list.add(1646461);
            list.add(1654561);
            list.add(1657561);
            list.add(1658561);
            list.add(1660661);
            list.add(1670761);
            list.add(1684861);
            list.add(1685861);
            list.add(1688861);
            list.add(1695961);
            list.add(1703071);
            list.add(1707071);
            list.add(1712171);
            list.add(1714171);
            list.add(1730371);
            list.add(1734371);
            list.add(1737371);
            list.add(1748471);
            list.add(1755571);
            list.add(1761671);
            list.add(1764671);
            list.add(1777771);
            list.add(1793971);
            list.add(1802081);
            list.add(1805081);
            list.add(1820281);
            list.add(1823281);
            list.add(1824281);
            list.add(1826281);
            list.add(1829281);
            list.add(1831381);
            list.add(1832381);
            list.add(1842481);
            list.add(1851581);
            list.add(1853581);
            list.add(1856581);
            list.add(1865681);
            list.add(1876781);
            list.add(1878781);
            list.add(1879781);
            list.add(1880881);
            list.add(1881881);
            list.add(1883881);
            list.add(1884881);
            list.add(1895981);
            list.add(1903091);
            list.add(1908091);
            list.add(1909091);
            list.add(1917191);
            list.add(1924291);
            list.add(1930391);
            list.add(1936391);
            list.add(1941491);
            list.add(1951591);
            list.add(1952591);
            list.add(1957591);
            list.add(1958591);
            list.add(1963691);
            list.add(1968691);
            list.add(1969691);
            list.add(1970791);
            list.add(1976791);
            list.add(1981891);
            list.add(1982891);
            list.add(1984891);
            list.add(1987891);
            list.add(1988891);
            list.add(1993991);
            list.add(1995991);
            list.add(1998991);
            list.add(3001003);
            list.add(3002003);
            list.add(3007003);
            list.add(3016103);
            list.add(3026203);
            list.add(3064603);
            list.add(3065603);
            list.add(3072703);
            list.add(3073703);
            list.add(3075703);
            list.add(3083803);
            list.add(3089803);
            list.add(3091903);
            list.add(3095903);
            list.add(3103013);
            list.add(3106013);
            list.add(3127213);
            list.add(3135313);
            list.add(3140413);
            list.add(3155513);
            list.add(3158513);
            list.add(3160613);
            list.add(3166613);
            list.add(3181813);
            list.add(3187813);
            list.add(3193913);
            list.add(3196913);
            list.add(3198913);
            list.add(3211123);
            list.add(3212123);
            list.add(3218123);
            list.add(3222223);
            list.add(3223223);
            list.add(3228223);
            list.add(3233323);
            list.add(3236323);
            list.add(3241423);
            list.add(3245423);
            list.add(3252523);
            list.add(3256523);
            list.add(3258523);
            list.add(3260623);
            list.add(3267623);
            list.add(3272723);
            list.add(3283823);
            list.add(3285823);
            list.add(3286823);
            list.add(3288823);
            list.add(3291923);
            list.add(3293923);
            list.add(3304033);
            list.add(3305033);
            list.add(3307033);
            list.add(3310133);
            list.add(3315133);
            list.add(3319133);
            list.add(3321233);
            list.add(3329233);
            list.add(3331333);
            list.add(3337333);
            list.add(3343433);
            list.add(3353533);
            list.add(3362633);
            list.add(3364633);
            list.add(3365633);
            list.add(3368633);
            list.add(3380833);
            list.add(3391933);
            list.add(3392933);
            list.add(3400043);
            list.add(3411143);
            list.add(3417143);
            list.add(3424243);
            list.add(3425243);
            list.add(3427243);
            list.add(3439343);
            list.add(3441443);
            list.add(3443443);
            list.add(3444443);
            list.add(3447443);
            list.add(3449443);
            list.add(3452543);
            list.add(3460643);
            list.add(3466643);
            list.add(3470743);
            list.add(3479743);
            list.add(3485843);
            list.add(3487843);
            list.add(3503053);
            list.add(3515153);
            list.add(3517153);
            list.add(3528253);
            list.add(3541453);
            list.add(3553553);
            list.add(3558553);
            list.add(3563653);
            list.add(3569653);
            list.add(3586853);
            list.add(3589853);
            list.add(3590953);
            list.add(3591953);
            list.add(3594953);
            list.add(3601063);
            list.add(3607063);
            list.add(3618163);
            list.add(3621263);
            list.add(3627263);
            list.add(3635363);
            list.add(3643463);
            list.add(3646463);
            list.add(3670763);
            list.add(3673763);
            list.add(3680863);
            list.add(3689863);
            list.add(3698963);
            list.add(3708073);
            list.add(3709073);
            list.add(3716173);
            list.add(3717173);
            list.add(3721273);
            list.add(3722273);
            list.add(3728273);
            list.add(3732373);
            list.add(3743473);
            list.add(3746473);
            list.add(3762673);
            list.add(3763673);
            list.add(3765673);
            list.add(3768673);
            list.add(3769673);
            list.add(3773773);
            list.add(3774773);
            list.add(3781873);
            list.add(3784873);
            list.add(3792973);
            list.add(3793973);
            list.add(3799973);
            list.add(3804083);
            list.add(3806083);
            list.add(3812183);
            list.add(3814183);
            list.add(3826283);
            list.add(3829283);
            list.add(3836383);
            list.add(3842483);
            list.add(3853583);
            list.add(3858583);
            list.add(3863683);
            list.add(3864683);
            list.add(3867683);
            list.add(3869683);
            list.add(3871783);
            list.add(3878783);
            list.add(3893983);
            list.add(3899983);
            list.add(3913193);
            list.add(3916193);
            list.add(3918193);
            list.add(3924293);
            list.add(3927293);
            list.add(3931393);
            list.add(3938393);
            list.add(3942493);
            list.add(3946493);
            list.add(3948493);
            list.add(3964693);
            list.add(3970793);
            list.add(3983893);
            list.add(3991993);
            list.add(3994993);
            list.add(3997993);
            list.add(3998993);
            list.add(7014107);
            list.add(7035307);
            list.add(7036307);
            list.add(7041407);
            list.add(7046407);
            list.add(7057507);
            list.add(7065607);
            list.add(7069607);
            list.add(7073707);
            list.add(7079707);
            list.add(7082807);
            list.add(7084807);
            list.add(7087807);
            list.add(7093907);
            list.add(7096907);
            list.add(7100017);
            list.add(7114117);
            list.add(7115117);
            list.add(7118117);
            list.add(7129217);
            list.add(7134317);
            list.add(7136317);
            list.add(7141417);
            list.add(7145417);
            list.add(7155517);
            list.add(7156517);
            list.add(7158517);
            list.add(7159517);
            list.add(7177717);
            list.add(7190917);
            list.add(7194917);
            list.add(7215127);
            list.add(7226227);
            list.add(7246427);
            list.add(7249427);
            list.add(7250527);
            list.add(7256527);
            list.add(7257527);
            list.add(7261627);
            list.add(7267627);
            list.add(7276727);
            list.add(7278727);
            list.add(7291927);
            list.add(7300037);
            list.add(7302037);
            list.add(7310137);
            list.add(7314137);
            list.add(7324237);
            list.add(7327237);
            list.add(7347437);
            list.add(7352537);
            list.add(7354537);
            list.add(7362637);
            list.add(7365637);
            list.add(7381837);
            list.add(7388837);
            list.add(7392937);
            list.add(7401047);
            list.add(7403047);
            list.add(7409047);
            list.add(7415147);
            list.add(7434347);
            list.add(7436347);
            list.add(7439347);
            list.add(7452547);
            list.add(7461647);
            list.add(7466647);
            list.add(7472747);
            list.add(7475747);
            list.add(7485847);
            list.add(7486847);
            list.add(7489847);
            list.add(7493947);
            list.add(7507057);
            list.add(7508057);
            list.add(7518157);
            list.add(7519157);
            list.add(7521257);
            list.add(7527257);
            list.add(7540457);
            list.add(7562657);
            list.add(7564657);
            list.add(7576757);
            list.add(7586857);
            list.add(7592957);
            list.add(7594957);
            list.add(7600067);
            list.add(7611167);
            list.add(7619167);
            list.add(7622267);
            list.add(7630367);
            list.add(7632367);
            list.add(7644467);
            list.add(7654567);
            list.add(7662667);
            list.add(7665667);
            list.add(7666667);
            list.add(7668667);
            list.add(7669667);
            list.add(7674767);
            list.add(7681867);
            list.add(7690967);
            list.add(7693967);
            list.add(7696967);
            list.add(7715177);
            list.add(7718177);
            list.add(7722277);
            list.add(7729277);
            list.add(7733377);
            list.add(7742477);
            list.add(7747477);
            list.add(7750577);
            list.add(7758577);
            list.add(7764677);
            list.add(7772777);
            list.add(7774777);
            list.add(7778777);
            list.add(7782877);
            list.add(7783877);
            list.add(7791977);
            list.add(7794977);
            list.add(7807087);
            list.add(7819187);
            list.add(7820287);
            list.add(7821287);
            list.add(7831387);
            list.add(7832387);
            list.add(7838387);
            list.add(7843487);
            list.add(7850587);
            list.add(7856587);
            list.add(7865687);
            list.add(7867687);
            list.add(7868687);
            list.add(7873787);
            list.add(7884887);
            list.add(7891987);
            list.add(7897987);
            list.add(7913197);
            list.add(7916197);
            list.add(7930397);
            list.add(7933397);
            list.add(7935397);
            list.add(7938397);
            list.add(7941497);
            list.add(7943497);
            list.add(7949497);
            list.add(7957597);
            list.add(7958597);
            list.add(7960697);
            list.add(7977797);
            list.add(7984897);
            list.add(7985897);
            list.add(7987897);
            list.add(7996997);
            list.add(9002009);
            list.add(9015109);
            list.add(9024209);
            list.add(9037309);
            list.add(9042409);
            list.add(9043409);
            list.add(9045409);
            list.add(9046409);
            list.add(9049409);
            list.add(9067609);
            list.add(9073709);
            list.add(9076709);
            list.add(9078709);
            list.add(9091909);
            list.add(9095909);
            list.add(9103019);
            list.add(9109019);
            list.add(9110119);
            list.add(9127219);
            list.add(9128219);
            list.add(9136319);
            list.add(9149419);
            list.add(9169619);
            list.add(9173719);
            list.add(9174719);
            list.add(9179719);
            list.add(9185819);
            list.add(9196919);
            list.add(9199919);
            list.add(9200029);
            list.add(9209029);
            list.add(9212129);
            list.add(9217129);
            list.add(9222229);
            list.add(9223229);
            list.add(9230329);
            list.add(9231329);
            list.add(9255529);
            list.add(9269629);
            list.add(9271729);
            list.add(9277729);
            list.add(9280829);
            list.add(9286829);
            list.add(9289829);
            list.add(9318139);
            list.add(9320239);
            list.add(9324239);
            list.add(9329239);
            list.add(9332339);
            list.add(9338339);
            list.add(9351539);
            list.add(9357539);
            list.add(9375739);
            list.add(9384839);
            list.add(9397939);
            list.add(9400049);
            list.add(9414149);
            list.add(9419149);
            list.add(9433349);
            list.add(9439349);
            list.add(9440449);
            list.add(9446449);
            list.add(9451549);
            list.add(9470749);
            list.add(9477749);
            list.add(9492949);
            list.add(9493949);
            list.add(9495949);
            list.add(9504059);
            list.add(9514159);
            list.add(9526259);
            list.add(9529259);
            list.add(9547459);
            list.add(9556559);
            list.add(9558559);
            list.add(9561659);
            list.add(9577759);
            list.add(9583859);
            list.add(9585859);
            list.add(9586859);
            list.add(9601069);
            list.add(9602069);
            list.add(9604069);
            list.add(9610169);
            list.add(9620269);
            list.add(9624269);
            list.add(9626269);
            list.add(9632369);
            list.add(9634369);
            list.add(9645469);
            list.add(9650569);
            list.add(9657569);
            list.add(9670769);
            list.add(9686869);
            list.add(9700079);
            list.add(9709079);
            list.add(9711179);
            list.add(9714179);
            list.add(9724279);
            list.add(9727279);
            list.add(9732379);
            list.add(9733379);
            list.add(9743479);
            list.add(9749479);
            list.add(9752579);
            list.add(9754579);
            list.add(9758579);
            list.add(9762679);
            list.add(9770779);
            list.add(9776779);
            list.add(9779779);
            list.add(9781879);
            list.add(9782879);
            list.add(9787879);
            list.add(9788879);
            list.add(9795979);
            list.add(9801089);
            list.add(9807089);
            list.add(9809089);
            list.add(9817189);
            list.add(9818189);
            list.add(9820289);
            list.add(9822289);
            list.add(9836389);
            list.add(9837389);
            list.add(9845489);
            list.add(9852589);
            list.add(9871789);
            list.add(9888889);
            list.add(9889889);
            list.add(9896989);
            list.add(9902099);
            list.add(9907099);
            list.add(9908099);
            list.add(9916199);
            list.add(9918199);
            list.add(9919199);
            list.add(9921299);
            list.add(9923299);
            list.add(9926299);
            list.add(9927299);
            list.add(9931399);
            list.add(9932399);
            list.add(9935399);
            list.add(9938399);
            list.add(9957599);
            list.add(9965699);
            list.add(9978799);
            list.add(9980899);
            list.add(9981899);
            list.add(9989899);
            list.add(100030001);
        }

        public int primePalindrome(int N) {

//            if (N > 9989899) {
//                return 100030001;
//            }
//            for (int idx = N; idx < Integer.MAX_VALUE; idx++) {
//                if (isPalindrome(idx) && isPrime(idx)) {
//                    return idx;
//                }
//            }
//            return -1;

            for (int current : list) {
                if (current >= N) {
                    return current;
                }
            }
            return -1;
        }

        boolean isPrime(int value) {

            if (value == 1) {
                return false;
            }

            if (value == 2) {
                return true;
            }

            if (value % 2 == 0) {
                return false;
            }

            if (value < 7) {
                return true;
            }

            for (int idx = 3; idx <= Math.sqrt(value); idx+=2) {
                if (value % idx == 0) {
                    return false;
                }
            }

            return true;
        }

        boolean isPalindrome(int value) {
            byte[] bytes = String.valueOf(value).getBytes();

            for (int idx = 0; idx < bytes.length / 2; idx++) {
                if (bytes[idx] != bytes[bytes.length - 1 - idx]) {
                    return false;
                }
            }

            return true;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();

//        System.out.println(solution.isPrime(9));
//        System.out.println(solution.isPalindrome(9));

        Assert.assertEquals(2, solution.primePalindrome(1));
        Assert.assertEquals(7, solution.primePalindrome(6));
        Assert.assertEquals(11, solution.primePalindrome(8));
        Assert.assertEquals(101, solution.primePalindrome(13));

//        System.out.println(solution.primePalindrome(9989900));

//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            if (solution.isPrime(i) && solution.isPalindrome(i)) {
//                System.out.printf("list.add(%s);\n", i);
//            }
//        }
    }
}