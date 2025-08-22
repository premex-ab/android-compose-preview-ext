package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Digma device specifications for Android Compose previews.
 *
 * This extension provides Digma device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Digma.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Digma get() = object {
    /** Digma 1402D_4G */
    val _1402D_4G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Digma CITI_1312C_4G */
    val CITI_1312C_4G = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Digma CITI_13_X703_4G */
    val CITI_13_X703_4G = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Digma CITI_1590_3G_CS1207MG */
    val CITI_1590_3G_CS1207MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma CITI_1593_3G_CS1210MG */
    val CITI_1593_3G_CS1210MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma CITI 609 */
    val CITI_609 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Digma CITI_7586_3G */
    val CITI_7586_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma CITI_7591_3G_CS7208MG */
    val CITI_7591_3G_CS7208MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma CITI_8443E_4G */
    val CITI_8443E_4G = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Digma CITI_8589_3G_CS8206MG */
    val CITI_8589_3G_CS8206MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma CITI_Kids */
    val CITI_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma CITI_Kids_10 */
    val CITI_KIDS_10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma CITI_Kids_81_CS8233MG */
    val CITI_KIDS_81_CS8233MG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma CITI_Octa_10_CS1219PL */
    val CITI_OCTA_10_CS1219PL = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Digma CS1235PL */
    val CS1235PL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma CS7113PL */
    val CS7113PL = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Digma CS7204MG */
    val CS7204MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma CS7217PL */
    val CS7217PL = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Digma CS7234PL */
    val CS7234PL = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Digma CS8205PG */
    val CS8205PG = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Digma CS8218PL */
    val CS8218PL = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Digma CS8231PL */
    val CS8231PL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma CS8268PL */
    val CS8268PL = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Digma DIGMA CITI 1508 4G CS1114ML */
    val DIGMA_CITI_1508_4G_CS1114ML = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Digma DIGMA CITI 1576 3G CS1194MG */
    val DIGMA_CITI_1576_3G_CS1194MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA CITI 1577 3G CS1195MG */
    val DIGMA_CITI_1577_3G_CS1195MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA CITI 1578 4G CS1196ML */
    val DIGMA_CITI_1578_4G_CS1196ML = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA CITI 3000 4G CS3001ML */
    val DIGMA_CITI_3000_4G_CS3001ML = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Digma DIGMA CITI 7575 3G CS7193MG */
    val DIGMA_CITI_7575_3G_CS7193MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA CITI 8542 4G CS8152ML */
    val DIGMA_CITI_8542_4G_CS8152ML = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Digma DIGMA HIT Q401 3G HT4039PG */
    val DIGMA_HIT_Q401_3G_HT4039PG = "spec:width=480,height=800,unit=px,dpi=240"

    /** Digma DIGMA LINX A453 3G LT4038PG */
    val DIGMA_LINX_A453_3G_LT4038PG = "spec:width=480,height=854,unit=px,dpi=240"

    /** Digma DIGMA LINX ARGO 3G LT4054MG */
    val DIGMA_LINX_ARGO_3G_LT4054MG = "spec:width=480,height=854,unit=px,dpi=240"

    /** Digma DIGMA LINX ATOM 3G LT4049PG */
    val DIGMA_LINX_ATOM_3G_LT4049PG = "spec:width=480,height=800,unit=px,dpi=240"

    /** Digma DIGMA LINX BASE 4G LT5052ML */
    val DIGMA_LINX_BASE_4G_LT5052ML = "spec:width=480,height=960,unit=px,dpi=240"

    /** Digma DIGMA LINX PAY 4G LS5053ML */
    val DIGMA_LINX_PAY_4G_LS5053ML = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Digma DIGMA LINX RAGE 4G LS5040PL */
    val DIGMA_LINX_RAGE_4G_LS5040PL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Digma DIGMA LINX TRIX 4G LS5041PL */
    val DIGMA_LINX_TRIX_4G_LS5041PL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Digma DIGMA Optima 1022N 3G TS1184MG */
    val DIGMA_OPTIMA_1022N_3G_TS1184MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA Optima 1023N 3G TS1186MG */
    val DIGMA_OPTIMA_1023N_3G_TS1186MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA Optima 1024N 4G TT1188PL */
    val DIGMA_OPTIMA_1024N_4G_TT1188PL = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma DIGMA Optima 1025N 4G TS1190ML */
    val DIGMA_OPTIMA_1025N_4G_TS1190ML = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma DIGMA Optima 1026N 3G TT1192PG */
    val DIGMA_OPTIMA_1026N_3G_TT1192PG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma DIGMA Optima 7016N 3G TS7175MG */
    val DIGMA_OPTIMA_7016N_3G_TS7175MG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma DIGMA Optima 7017N 3G TS7177MG */
    val DIGMA_OPTIMA_7017N_3G_TS7177MG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma DIGMA Optima 7018N 4G TS7179ML */
    val DIGMA_OPTIMA_7018N_4G_TS7179ML = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma DIGMA Optima Prime 4 3G TT7174PG */
    val DIGMA_OPTIMA_PRIME_4_3G_TT7174PG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma Digma Optima Prime 5 3G TS7198PG */
    val DIGMA_OPTIMA_PRIME_5_3G_TS7198PG = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Digma DIGMA Plane 1523 3G PS1135MG */
    val DIGMA_PLANE_1523_3G_PS1135MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA Plane 1525 3G PS1137MG */
    val DIGMA_PLANE_1525_3G_PS1137MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA Plane 1538E 3G PS1150ML */
    val DIGMA_PLANE_1538E_3G_PS1150ML = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Digma DIGMA Plane 1550S 3G PS1163MG */
    val DIGMA_PLANE_1550S_3G_PS1163MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA Plane 1551S 4G PS1164ML */
    val DIGMA_PLANE_1551S_4G_PS1164ML = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma DIGMA Plane 1553M 4G PS1166ML */
    val DIGMA_PLANE_1553M_4G_PS1166ML = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Digma DIGMA Plane 1559 4G PS1173PL */
    val DIGMA_PLANE_1559_4G_PS1173PL = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA Plane 1570N 3G PS1185MG */
    val DIGMA_PLANE_1570N_3G_PS1185MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA Plane 1572N 3G PS1187MG */
    val DIGMA_PLANE_1572N_3G_PS1187MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma Digma Plane 1584S 3G PS1201PG */
    val DIGMA_PLANE_1584S_3G_PS1201PG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma Digma Plane 1585S 4G PS1502PL */
    val DIGMA_PLANE_1585S_4G_PS1502PL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma DIGMA Plane 1713T 3G PT1138MG */
    val DIGMA_PLANE_1713T_3G_PT1138MG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma DIGMA Plane 1715T 4G PT1139PL */
    val DIGMA_PLANE_1715T_4G_PT1139PL = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma DIGMA Plane 7552M 3G PS7165MG */
    val DIGMA_PLANE_7552M_3G_PS7165MG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma DIGMA Plane 7565N 3G PS7180PG */
    val DIGMA_PLANE_7565N_3G_PS7180PG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma DIGMA Plane 7574S 4G PS7191PL */
    val DIGMA_PLANE_7574S_4G_PS7191PL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Digma Plane 7580S 4G PS7192PL */
    val DIGMA_PLANE_7580S_4G_PS7192PL = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Digma DIGMA Plane 8540E 4G PS8156ML */
    val DIGMA_PLANE_8540E_4G_PS8156ML = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma DIGMA Plane 8566N 3G PS8181MG */
    val DIGMA_PLANE_8566N_3G_PS8181MG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Digma Plane 8580 4G PS8199ML */
    val DIGMA_PLANE_8580_4G_PS8199ML = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA Plane 9634 3G PS9146MG */
    val DIGMA_PLANE_9634_3G_PS9146MG = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Digma DIGMA Plane 9654M 3G PS9167PG */
    val DIGMA_PLANE_9654M_3G_PS9167PG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Digma Platina 1579M 4G NS1800ML */
    val DIGMA_PLATINA_1579M_4G_NS1800ML = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Digma DIGMA VOX E502 4G VS5036PL */
    val DIGMA_VOX_E502_4G_VS5036PL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Digma DIGMA VOX S513 4G VS5035ML */
    val DIGMA_VOX_S513_4G_VS5035ML = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Digma HIT Q500 3G HT5035PG */
    val HIT_Q500_3G_HT5035PG = "spec:width=480,height=854,unit=px,dpi=240"

    /** Digma Linx X1 PRO 3G LS4051MG */
    val LINX_X1_PRO_3G_LS4051MG = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Digma Optima 1028 3G TS1215PG */
    val OPTIMA_1028_3G_TS1215PG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima_10_A500S_3G_TS1220PG */
    val OPTIMA_10_A500S_3G_TS1220PG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima_10_A502_3G_TS1245PG */
    val OPTIMA_10_A502_3G_TS1245PG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima 10 E600 3G TS1246PG */
    val OPTIMA_10_E600_3G_TS1246PG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima_10_X702_4G */
    val OPTIMA_10_X702_4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima_1200B */
    val OPTIMA_1200B = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima 1411D 4G TS1273PL */
    val OPTIMA_1411D_4G_TS1273PL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima 1440E 4G TS1269PL */
    val OPTIMA_1440E_4G_TS1269PL = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Digma Optima_7_A100S_3G_TS7222PG */
    val OPTIMA_7_A100S_3G_TS7222PG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma Optima_7_A101_3G */
    val OPTIMA_7_A101_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma Optima 7 A102 3G TS7243PG */
    val OPTIMA_7_A102_3G_TS7243PG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma Optima 7 E200 3G TS7244PG */
    val OPTIMA_7_E200_3G_TS7244PG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma Optima_7_X700_4G */
    val OPTIMA_7_X700_4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima_8027_3G */
    val OPTIMA_8027_3G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Digma  Optima_8250C */
    val OPTIMA_8250C = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima 8258C 4G TS8275ML */
    val OPTIMA_8258C_4G_TS8275ML = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima_8_X701_4G */
    val OPTIMA_8_X701_4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Optima_8_Z801_4G */
    val OPTIMA_8_Z801_4G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Digma Optima Kids 7 */
    val OPTIMA_KIDS_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma Plane_1596_3G_PS1213PG */
    val PLANE_1596_3G_PS1213PG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Plane 7547S 3G PS7159PG */
    val PLANE_7547S_3G_PS7159PG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digma Plane_8548S_3G */
    val PLANE_8548S_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Plane_8549S_4G */
    val PLANE_8549S_4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Plane 8595 3G PS8212PG */
    val PLANE_8595_3G_PS8212PG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma Pro 1480E 4G */
    val PRO_1480E_4G = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Digma PRO 1600E 4G */
    val PRO_1600E_4G = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Digma PRO 1800F 4G */
    val PRO_1800F_4G = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Digma PS7210PG */
    val PS7210PG = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Digma PS8163PL */
    val PS8163PL = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Digma RS1253PL */
    val RS1253PL = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Digma TS1221PL */
    val TS1221PL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma TS1229PL */
    val TS1229PL = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Digma TS1277ML */
    val TS1277ML = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Digma TS7225PL */
    val TS7225PL = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Digma TT1236PG */
    val TT1236PG = "spec:width=600,height=1024,unit=px,dpi=160"

}
