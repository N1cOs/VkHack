package ru.ifmo.se.vkhack.controller;

import javafx.util.Pair;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

@Controller
public class MapController {

    @RequestMapping(value = "/parse", method = RequestMethod.POST)
    public String getSuitableEmployees(@RequestParam("start") String start,
                                       @RequestParam("end") String end,
                                       Model model) {
        //////////////
        int i = 0;

        nodes[i++] = new Node(299, 120, 337, 128, 338 );
        nodes[i++] = new Node(410, 52, 1, 338, 322    );
        nodes[i++] = new Node(316, 51, 338, 1, 339  );
        nodes[i++] = new Node(273, 75, 339, 338, 340  );
        nodes[i++] = new Node(237, 53, 340, 339, 341  );
        nodes[i++] = new Node(194, 53, 341, 340, 342  );
        nodes[i++] = new Node(104, 177, 342, 341, 343 );
        nodes[i++] = new Node(114, 522, 343, 342, 344 );
        nodes[i++] = new Node(138, 510, 344, 343, 345 );
        nodes[i++] = new Node(471, 403, 345, 344, 346 );
        nodes[i++] = new Node(466, 437, 346, 345, 347 );
        nodes[i++] = new Node(467, 485, 347, 346, 348 );
        nodes[i++] = new Node(527, 487, 348, 347, 360 );
        nodes[i++] = new Node(68, 452, 360, 348, 361  );
        nodes[i++] = new Node(61, 477, 361, 360, 362  );
        nodes[i++] = new Node(76, 495, 362, 361, 363  );
        nodes[i++] = new Node(91, 475, 363, 362, 364  );
        nodes[i++] = new Node(87, 446, 364, 363, 1    );
        nodes[i++] = new Node(568, 269, 322, 1, 323   );
        nodes[i++] = new Node(583, 246, 323, 322, 324 );
        nodes[i++] = new Node(611, 246, 324, 323, 325 );
        nodes[i++] = new Node(641, 246, 325, 324, 326 );
        nodes[i++] = new Node(657, 269, 326, 325, 327 );
        nodes[i++] = new Node(641, 290, 327, 326, 61  );
        nodes[i++] = new Node(627, 269, 61, 327, 328  );
        nodes[i++] = new Node(612, 290, 328, 61, 329  );
        nodes[i++] = new Node(597, 269, 329, 328, 330 );
        nodes[i++] = new Node(582, 290, 330, 329, 140 );
        nodes[i++] = new Node(682, 268, 140, 330, 141 );
        nodes[i++] = new Node(721, 269, 141, 140, 142 );
        nodes[i++] = new Node(755, 269, 142, 141, 143 );
        nodes[i++] = new Node(787, 269, 143, 142, 144 );
        nodes[i++] = new Node(827, 268, 144, 143, 145 );
        nodes[i++] = new Node(829, 297, 145, 144, 146 );
        nodes[i++] = new Node(844, 313, 146, 145, 62  );
        nodes[i++] = new Node(829, 332, 62, 146, 148  );
        nodes[i++] = new Node(844, 350, 148, 62, 149  );
        nodes[i++] = new Node(829, 369, 149, 148, 63  );
        nodes[i++] = new Node(830, 412, 63, 149, 151  );
        nodes[i++] = new Node(815, 436, 151, 63, 152  );
        nodes[i++] = new Node(851, 424, 152, 151, 153 );
        nodes[i++] = new Node(855, 58, 153, 152, 154  );
        nodes[i++] = new Node(818, 33, 154, 153, 155  );
        nodes[i++] = new Node(817, 60, 155, 154, 279  );
        nodes[i++] = new Node(872, 421, 279, 155, 280 );
        nodes[i++] = new Node(896, 415, 280, 279, 64  );
        nodes[i++] = new Node(927, 420, 64, 280, 191  );
        nodes[i++] = new Node(960, 419, 191, 64, 192  );
        nodes[i++] = new Node(960, 376, 192, 191, 193 );
        nodes[i++] = new Node(1001, 418, 193, 192, 194);
        nodes[i++] = new Node(1024, 429, 194, 193, 65 );
        nodes[i++] = new Node(1048, 418, 65, 194, 195 );
        nodes[i++] = new Node(1072, 429, 195, 65, 66  );
        nodes[i++] = new Node(1090, 413, 66, 195, 196 );
        nodes[i++] = new Node(1109, 430, 196, 66, 197 );
        nodes[i++] = new Node(1071, 392, 197, 196, 198);
        nodes[i++] = new Node(1091, 376, 198, 197, 67 );
        nodes[i++] = new Node(1108, 391, 67, 198, 199 );
        nodes[i++] = new Node(1082, 355, 199, 67, 200 );
        nodes[i++] = new Node(1090, 332, 200, 199, 201);
        nodes[i++] = new Node(1081, 312, 201, 200, 202);
        nodes[i++] = new Node(1072, 291, 202, 201, 203);
        nodes[i++] = new Node(1081, 268, 203, 202, 204);
        nodes[i++] = new Node(1054, 249, 204, 203, 69 );
        nodes[i++] = new Node(1054, 226, 69, 204, 205 );
        nodes[i++] = new Node(1030, 249, 205, 69, 206 );
        nodes[i++] = new Node(1001, 232, 206, 205, 207);
        nodes[i++] = new Node(1081, 179, 207, 206, 208);
        nodes[i++] = new Node(1042, 199, 208, 207, 209);
        nodes[i++] = new Node(1012, 199, 209, 208, 210);
        nodes[i++] = new Node(977, 200, 210, 209, 211 );
        nodes[i++] = new Node(977, 231, 211, 210, 212 );
        nodes[i++] = new Node(955, 226, 212, 211, 213 );
        nodes[i++] = new Node(946, 200, 213, 212, 214 );
        nodes[i++] = new Node(913, 197, 214, 213, 70  );
        nodes[i++] = new Node(888, 197, 70, 214, 215  );
        nodes[i++] = new Node(862, 197, 215, 70, 243  );
        nodes[i++] = new Node(917, 224, 243, 215, 244 );
        nodes[i++] = new Node(895, 242, 244, 243, 245 );
        nodes[i++] = new Node(873, 222, 245, 244, 246 );
        nodes[i++] = new Node(853, 239, 246, 245, 247 );
        nodes[i++] = new Node(916, 269, 247, 246, 188 );
        nodes[i++] = new Node(822, 163, 188, 247, 71  );
        nodes[i++] = new Node(833, 132, 71, 188, 189  );
        nodes[i++] = new Node(833, 99, 189, 71, 72    );
        nodes[i++] = new Node(823, 198, 72, 189, 73   );
        nodes[i++] = new Node(822, 231, 73, 72, 331   );
        nodes[i++] = new Node(133, 53, 331, 73, 74    );
        nodes[i++] = new Node(133, 32, 74, 331, 332   );
        nodes[i++] = new Node(133, 12, 332, 74, 333   );
        nodes[i++] = new Node(114, 35, 333, 332, 334  );
        nodes[i++] = new Node(114, 12, 334, 333, 75   );
        nodes[i++] = new Node(93, 31, 75, 334, 335    );
        nodes[i++] = new Node(82, 13, 335, 75, 336    );
        nodes[i++] = new Node(56, 11, 336, 335, 76    );
        nodes[i++] = new Node(56, 34, 76, 336, 77     );
        nodes[i++] = new Node(21, 23, 77, 76, 312     );
        nodes[i++] = new Node(145, 232, 312, 77, 78   );
        nodes[i++] = new Node(135, 204, 78, 312, 355  );
        nodes[i++] = new Node(154, 289, 355, 78, 79   );
        nodes[i++] = new Node(134, 289, 79, 355, 356  );
        nodes[i++] = new Node(138, 308, 356, 79, 357  );
        nodes[i++] = new Node(155, 321, 357, 356, 358 );
        nodes[i++] = new Node(150, 340, 358, 357, 359 );
        nodes[i++] = new Node(131, 340, 359, 358, 80  );
        nodes[i++] = new Node(150, 361, 80, 359, 313  );
        nodes[i++] = new Node(131, 361, 313, 80, 349  );
        nodes[i++] = new Node(150, 380, 349, 313, 350 );
        nodes[i++] = new Node(132, 380, 350, 349, 351 );
        nodes[i++] = new Node(136, 409, 351, 350, 81  );
        nodes[i++] = new Node(160, 406, 81, 351, 294  );
        nodes[i++] = new Node(184, 415, 294, 81, 295  );
        nodes[i++] = new Node(184, 436, 295, 294, 82  );
        nodes[i++] = new Node(184, 456, 82, 295, 296  );
        nodes[i++] = new Node(115, 298, 296, 82, 297  );
        nodes[i++] = new Node(115, 333, 297, 296, 298 );
        nodes[i++] = new Node(115, 366, 298, 297, 299 );
        nodes[i++] = new Node(115, 411, 299, 298, 352 );
        nodes[i++] = new Node(202, 409, 352, 299, 353 );
        nodes[i++] = new Node(196, 437, 353, 352, 83  );
        nodes[i++] = new Node(196, 462, 83, 353, 84   );
        nodes[i++] = new Node(218, 481, 84, 83, 85    );
        nodes[i++] = new Node(245, 486, 85, 84, 354   );
        nodes[i++] = new Node(228, 500, 354, 85, 86   );
        nodes[i++] = new Node(188, 485, 86, 354, 321  );
        nodes[i++] = new Node(188, 509, 321, 86, 87   );
        nodes[i++] = new Node(211, 514, 87, 321, 318  );
        nodes[i++] = new Node(263, 513, 318, 87, 319  );
        nodes[i++] = new Node(252, 532, 319, 318, 320 );
        nodes[i++] = new Node(223, 531, 320, 319, 300 );
        nodes[i++] = new Node(81, 396, 300, 320, 301  );
        nodes[i++] = new Node(82, 420, 301, 300, 302  );
        nodes[i++] = new Node(43, 425, 302, 301, 303  );
        nodes[i++] = new Node(16, 420, 303, 302, 88   );
        nodes[i++] = new Node(10, 441, 88, 303, 304   );
        nodes[i++] = new Node(26, 452, 304, 88, 89    );
        nodes[i++] = new Node(16, 477, 89, 304, 305   );
        nodes[i++] = new Node(9, 502, 305, 89, 306    );
        nodes[i++] = new Node(31, 503, 306, 305, 307  );
        nodes[i++] = new Node(51, 516, 307, 306, 308  );
        nodes[i++] = new Node(71, 517, 308, 307, 309  );
        nodes[i++] = new Node(91, 517, 309, 308, 310  );
        nodes[i++] = new Node(115, 477, 310, 309, 311 );
        nodes[i++] = new Node(111, 499, 311, 310, 90  );
        nodes[i++] = new Node(566, 393, 90, 311, 315  );
        nodes[i++] = new Node(545, 407, 315, 90, 316  );
        nodes[i++] = new Node(545, 381, 316, 315, 91  );
        nodes[i++] = new Node(503, 402, 91, 316, 314  );
        nodes[i++] = new Node(542, 286, 314, 91, 121  );
        nodes[i++] = new Node(766, 189, 121, 314, 122 );
        nodes[i++] = new Node(740, 168, 122, 121, 123 );
        nodes[i++] = new Node(740, 229, 123, 122, 124 );
        nodes[i++] = new Node(737, 307, 124, 123, 125 );
        nodes[i++] = new Node(737, 338, 125, 124, 126 );
        nodes[i++] = new Node(737, 365, 126, 125, 127 );
        nodes[i++] = new Node(737, 393, 127, 126, 128 );
        nodes[i++] = new Node(737, 420, 128, 127, 337 );

        //////////////

        int startNode = roomToNodeMap.get(start);
        int endNode = roomToNodeMap.get(end);

        int error = 0;
        int count = 0;
        LinkedList<Pair<Integer, Integer>> coordinatesForw = new LinkedList<>();
        int tempNode = startNode;
        try {
            while (tempNode != endNode && count++ < 180) {
                System.out.println("while" + tempNode + " " + endNode);
                for (Node node : nodes) {
                    if (node.node == tempNode) {
                        System.out.println(node.node + "node and next " + node.nextNode);
                        tempNode = node.nextNode;
                        System.out.println(tempNode + "set");
                        coordinatesForw.add(new Pair<Integer, Integer>(node.x, node.y));
                        break;
                    }
                    System.out.println("loop");
                }

            }
        } catch (Exception err) {
            error += 1;
        }

        count = 0;
        LinkedList<Pair<Integer, Integer>> coordinatesBack = new LinkedList<>();
        tempNode = startNode;
        try {
            while (tempNode != endNode && count++ < 180) {
                for (Node node : nodes) {
                    if (node.node == tempNode) {
                        tempNode = node.prevNode;
                        System.out.println(tempNode);
                        coordinatesBack.add(new Pair<Integer, Integer>(node.x, node.y));
                        break;
                    }
                }

            }
        } catch (Exception err) {
            error += 2;
        }
        switch (error) {
            case 0:
                if (coordinatesBack.size() > coordinatesForw.size())
                    model.addAttribute("coordinates", coordinatesForw);
                else
                    model.addAttribute("coordinates", coordinatesBack);
                break;
            case 1:
                model.addAttribute("coordinates", coordinatesForw);
                break;
            case 2:
                model.addAttribute("coordinates", coordinatesBack);
                break;
            default:
                break;
        }
        int LOL = coordinatesBack.size() * 1000 + coordinatesForw.size();
        model.addAttribute("err", error);
        model.addAttribute("count", LOL);
        return "mapSearchAnswer";
    }


    class Node {
        int x,y;
        int node, nextNode, prevNode;
        Node(int x, int y, int node, int nextNode, int prevNode){
            this.x = x;
            this.y = y;
            this.node = node;
            this.nextNode = nextNode;
            this.prevNode = prevNode;
        }
    }

    private static final HashMap<String, Integer> roomToNodeMap;
    private static final Node[] nodes;
    static
    {
        nodes = new Node[157];

        roomToNodeMap = new HashMap<String, Integer>();
        roomToNodeMap.put("0-1", 338);
        roomToNodeMap.put("28-2", 79);
        roomToNodeMap.put("0-2", 337);
        roomToNodeMap.put("28-3", 356);
        roomToNodeMap.put("0-3", 339);
        roomToNodeMap.put("29", 357);
        roomToNodeMap.put("30-1", 358);
        roomToNodeMap.put("0-5", 341);
        roomToNodeMap.put("30-2", 359);
        roomToNodeMap.put("1", 1);
        roomToNodeMap.put("101", 140);
        roomToNodeMap.put("102-1", 141);
        roomToNodeMap.put("32-1", 349);
        roomToNodeMap.put("102-2", 142);
        roomToNodeMap.put("32-2", 350);
        roomToNodeMap.put("102-3", 143);
        roomToNodeMap.put("33-1", 296);
        roomToNodeMap.put("106", 144);
        roomToNodeMap.put("33-2", 297);
        roomToNodeMap.put("107-1", 145);
        roomToNodeMap.put("33-3", 298);
        roomToNodeMap.put("107-2", 146);
        roomToNodeMap.put("33-4", 299);
        roomToNodeMap.put("107-3", 62);
        roomToNodeMap.put("41", 360);
        roomToNodeMap.put("107-4", 148);
        roomToNodeMap.put("42", 361);
        roomToNodeMap.put("107-5", 149);
        roomToNodeMap.put("43", 362);
        roomToNodeMap.put("108-1", 63);
        roomToNodeMap.put("44", 363);
        roomToNodeMap.put("108-2", 151);
        roomToNodeMap.put("45", 364);
        roomToNodeMap.put("108-3", 152);
        roomToNodeMap.put("38", 300);
        roomToNodeMap.put("109-1", 279);
        roomToNodeMap.put("39", 301);
        roomToNodeMap.put("109-2", 280);
        roomToNodeMap.put("46", 3012);
        roomToNodeMap.put("109-3", 64);
        roomToNodeMap.put("47", 303);
        roomToNodeMap.put("110-1", 191);
        roomToNodeMap.put("48-1", 88);
        roomToNodeMap.put("110-2", 192);
        roomToNodeMap.put("48-2", 304);
        roomToNodeMap.put("111-1", 193);
        roomToNodeMap.put("49", 89);
        roomToNodeMap.put("111-2", 194);
        roomToNodeMap.put("50", 305);
        roomToNodeMap.put("111-3", 65);
        roomToNodeMap.put("51", 306);
        roomToNodeMap.put("112-1", 195);
        roomToNodeMap.put("52", 307);
        roomToNodeMap.put("112-2", 66);
        roomToNodeMap.put("53", 308);
        roomToNodeMap.put("112-3", 196);
        roomToNodeMap.put("54", 309);
        roomToNodeMap.put("113-1", 197);
        roomToNodeMap.put("55", 351);
        roomToNodeMap.put("113-2", 198);
        roomToNodeMap.put("56", 81);
        roomToNodeMap.put("113-3", 67);
        roomToNodeMap.put("57-1", 294);
        roomToNodeMap.put("114-1", 199);
        roomToNodeMap.put("57-2", 295);
        roomToNodeMap.put("114-2", 200);
        roomToNodeMap.put("57-3", 82);
        roomToNodeMap.put("114-3", 201);
        roomToNodeMap.put("58", 352);
        roomToNodeMap.put("114-4", 202);
        roomToNodeMap.put("59", 353);
        roomToNodeMap.put("115", 203);
        roomToNodeMap.put("60", 83);
        roomToNodeMap.put("116-1", 204);
        roomToNodeMap.put("62", 84);
        roomToNodeMap.put("116-2", 69);
        roomToNodeMap.put("63-1", 85);
        roomToNodeMap.put("116-3", 205);
        roomToNodeMap.put("63-2", 354);
        roomToNodeMap.put("117", 206);
        roomToNodeMap.put("61", 86);
        roomToNodeMap.put("118", 207);
        roomToNodeMap.put("66", 321);
        roomToNodeMap.put("65-1", 87);
        roomToNodeMap.put("120-1", 209);
        roomToNodeMap.put("65-2", 318);
        roomToNodeMap.put("121-1", 210);
        roomToNodeMap.put("65-3", 319);
        roomToNodeMap.put("121-2", 211);
        roomToNodeMap.put("65-4", 320);
        roomToNodeMap.put("121-3", 212);
        roomToNodeMap.put("68", 310);
        roomToNodeMap.put("121-4", 213);
        roomToNodeMap.put("69", 311);
        roomToNodeMap.put("126", 247);
        roomToNodeMap.put("71-1", 343);
        roomToNodeMap.put("125", 246);
        roomToNodeMap.put("71-2", 344);
        roomToNodeMap.put("124", 245);
        roomToNodeMap.put("85", 314);
        roomToNodeMap.put("123", 244);
        roomToNodeMap.put("90", 90);
        roomToNodeMap.put("122", 243);
        roomToNodeMap.put("89-1", 315);
        roomToNodeMap.put("127-1", 214);
        roomToNodeMap.put("89-2", 316);
        roomToNodeMap.put("127-2", 70);
        roomToNodeMap.put("91", 91);
        roomToNodeMap.put("127-3", 215);
        roomToNodeMap.put("92", 345);
        roomToNodeMap.put("130-1", 188);
        roomToNodeMap.put("93", 346);
        roomToNodeMap.put("130-2", 71);
        roomToNodeMap.put("98", 347);
        roomToNodeMap.put("130-3", 189);
        roomToNodeMap.put("99", 348);
        roomToNodeMap.put("131", 153);
        roomToNodeMap.put("100-1", 322);
        roomToNodeMap.put("132-1", 154);
        roomToNodeMap.put("100-2", 323);
        roomToNodeMap.put("132-2", 155);
        roomToNodeMap.put("100-3", 324);
        roomToNodeMap.put("129", 72);
        roomToNodeMap.put("100-4", 325);
        roomToNodeMap.put("128", 73);
        roomToNodeMap.put("100-5", 326);
        roomToNodeMap.put("11-1", 331);
        roomToNodeMap.put("100-6", 327);
        roomToNodeMap.put("11-2", 74);
        roomToNodeMap.put("100-7", 61);
        roomToNodeMap.put("11-3", 332);
        roomToNodeMap.put("100-8", 328);
        roomToNodeMap.put("12-1", 333);
        roomToNodeMap.put("100-9", 329);
        roomToNodeMap.put("12-2", 334);
        roomToNodeMap.put("100-10", 330);
        roomToNodeMap.put("12-3", 75);
        roomToNodeMap.put("105-1", 121);
        roomToNodeMap.put("12-4", 335);
        roomToNodeMap.put("105-2", 122);
        roomToNodeMap.put("13-1", 336);
        roomToNodeMap.put("105-3", 123);
        roomToNodeMap.put("13-2", 76);
        roomToNodeMap.put("104-1", 124);
        roomToNodeMap.put("14", 77);
        roomToNodeMap.put("104-2", 125);
        roomToNodeMap.put("23", 432);
        roomToNodeMap.put("104-3", 126);
        roomToNodeMap.put("26-1", 312);
        roomToNodeMap.put("104-4", 127);
        roomToNodeMap.put("26-2", 78);
        roomToNodeMap.put("28-1", 355);
    }
}
