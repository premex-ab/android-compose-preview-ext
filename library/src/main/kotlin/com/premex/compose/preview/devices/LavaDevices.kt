package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lava device specifications for Android Compose previews.
 *
 * This extension provides Lava device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lava.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lava get() = object {
    /** Lava A1 */
    val A1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava A3 */
    val A3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava A3_mini */
    val A3_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava A44 */
    val A44 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lava A52 */
    val A52 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lava A76plus */
    val A76PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava A77 */
    val A77 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava A79 */
    val A79 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava A82 */
    val A82 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava A97 */
    val A97 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava A97 2GB Plus */
    val A97_2GB_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava Agni 3 */
    val AGNI_3 = "spec:width=1200,height=2652,unit=px,dpi=520"

    /** Lava Aura Plus */
    val AURA_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Lava BE_U */
    val BE_U = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Lava BLAZE */
    val BLAZE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava Blaze 2 Pro */
    val BLAZE_2_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Lava ERA 1X */
    val ERA_1X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava Era 2X 3GB */
    val ERA_2X_3GB = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava ir59 */
    val IR59 = "spec:width=600,height=1280,unit=px,dpi=280"

    /** Lava iris30 */
    val IRIS30 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lava iris40 */
    val IRIS40 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava iris42 */
    val IRIS42 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava iris46 */
    val IRIS46 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava iris50 */
    val IRIS50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava iris50c */
    val IRIS50C = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava iris51 */
    val IRIS51 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava iris53 */
    val IRIS53 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava iris 54 */
    val IRIS_54 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lava iris60 */
    val IRIS60 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava iris60c */
    val IRIS60C = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava Iris61 */
    val IRIS61 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava iris65 */
    val IRIS65 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava iris702 */
    val IRIS702 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava iris80 */
    val IRIS80 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava Iris820 */
    val IRIS820 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava iris821 */
    val IRIS821 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava iris870 */
    val IRIS870 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava iris88 */
    val IRIS88 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava iris880 */
    val IRIS880 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava iris88_go */
    val IRIS88_GO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava iris88_lite */
    val IRIS88_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava iris88s */
    val IRIS88S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava LAVA AGNI 5G */
    val LAVA_AGNI_5G = "spec:width=1080,height=2160,unit=px,dpi=403"

    /** Lava LAVA LXX503 */
    val LAVA_LXX503 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Lava LAVA LXX504 */
    val LAVA_LXX504 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava LAVA LXX505 */
    val LAVA_LXX505 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Lava LAVA LXX506 */
    val LAVA_LXX506 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Lava LAVA LXX507 */
    val LAVA_LXX507 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Lava LAVA LXX508 */
    val LAVA_LXX508 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Lava LAVA LXX510 */
    val LAVA_LXX510 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Lava LAVA LXX511 */
    val LAVA_LXX511 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Lava LAVA LXX513 */
    val LAVA_LXX513 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Lava LAVA LXX514 */
    val LAVA_LXX514 = "spec:width=720,height=1604,unit=px,dpi=280"

    /** Lava LAVA LXX515 */
    val LAVA_LXX515 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Lava LAVA LXX516 */
    val LAVA_LXX516 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava Lava LXX517 */
    val LAVA_LXX517 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava LAVA LXX522 */
    val LAVA_LXX522 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava LAVA LZG410 */
    val LAVA_LZG410 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava LAVA LZX414 */
    val LAVA_LZX414 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Lava LAVA LZX419 */
    val LAVA_LZX419 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava LAVA Z35 */
    val LAVA_Z35 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava LAVA Z66 */
    val LAVA_Z66 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Lava LE000Z93P */
    val LE000Z93P = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Lava LE9810 */
    val LE9810 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Lava LE9820 */
    val LE9820 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Lava LF9810_2GB */
    val LF9810_2GB = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lava LH9810 */
    val LH9810 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lava LMG02 */
    val LMG02 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Lava LMX02 */
    val LMX02 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Lava LN9810 */
    val LN9810 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lava LN9820 */
    val LN9820 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lava LZG01 */
    val LZG01 = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Lava Magnum Pro */
    val MAGNUM_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lava P7 */
    val P7 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava R1 */
    val R1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava R1LITE */
    val R1LITE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava R3 */
    val R3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava R3 Prime */
    val R3_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava T101 */
    val T101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lava T101 */
    val T101_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lava T101N */
    val T101N = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lava T71N */
    val T71N = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lava T71N_M */
    val T71N_M = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lava T71_w */
    val T71_W = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Lava T81 */
    val T81 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Lava T81N */
    val T81N = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Lava V2 3GB */
    val V2_3GB = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava V7 */
    val V7 = "spec:width=600,height=1280,unit=px,dpi=280"

    /** Lava V7s Prime */
    val V7S_PRIME = "spec:width=600,height=1280,unit=px,dpi=300"

    /** Lava V8 */
    val V8 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Lava X10 */
    val X10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava X2 */
    val X2 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava X41Plus */
    val X41PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava X50 Plus */
    val X50_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava X81 */
    val X81 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava Xolo era 2 */
    val XOLO_ERA_2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava Xolo Era 2X */
    val XOLO_ERA_2X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava XOLO era 4K */
    val XOLO_ERA_4K = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava Y50 */
    val Y50 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Lava YUVA 2 PRO */
    val YUVA_2_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava YUVA 3 */
    val YUVA_3 = "spec:width=720,height=1612,unit=px,dpi=480"

    /** Lava Yuva 4 */
    val YUVA_4 = "spec:width=720,height=1612,unit=px,dpi=480"

    /** Lava Yuva Star */
    val YUVA_STAR = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava Z1 */
    val Z1 = "spec:width=480,height=854,unit=px,dpi=180"

    /** Lava Z10 */
    val Z10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava Z100 */
    val Z100 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava Z1 Pro */
    val Z1_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava Z1S */
    val Z1S = "spec:width=480,height=854,unit=px,dpi=200"

    /** Lava Z2 */
    val Z2 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Lava Z21 */
    val Z21 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Lava Z25 */
    val Z25 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava Z3 */
    val Z3 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Lava Z3 */
    val Z3_720X1600 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava Z33 */
    val Z33 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Lava Z3 PRO */
    val Z3_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lava Z40 */
    val Z40 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Lava Z4/Z6 */
    val Z4_Z6 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Lava Z50 */
    val Z50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava Z50_Pro */
    val Z50_PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava Z51 */
    val Z51 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lava Z52 Pro */
    val Z52_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lava Z53 */
    val Z53 = "spec:width=600,height=1280,unit=px,dpi=280"

    /** Lava Z60 */
    val Z60 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Lava Z60S */
    val Z60S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava Z61 */
    val Z61 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava Z61-2GB */
    val Z61_2GB = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava Z61P */
    val Z61P = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava Z70 */
    val Z70 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava Z80 */
    val Z80 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava Z81 */
    val Z81 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava Z90 */
    val Z90 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Lava Z91 */
    val Z91 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Lava Z92 */
    val Z92 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Lava Z93P */
    val Z93P = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Lava ZX */
    val ZX = "spec:width=720,height=1520,unit=px,dpi=320"

}
