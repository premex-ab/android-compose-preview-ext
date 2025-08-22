package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Symphony device specifications for Android Compose previews.
 *
 * This extension provides Symphony device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Symphony.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Symphony get() = object {
    /** Symphony ATOM */
    val ATOM = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Symphony Atom3 */
    val ATOM3 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony ATOM4 */
    val ATOM4 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Symphony Atom ii */
    val ATOM_II = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony E90 */
    val E90 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Symphony E95 */
    val E95 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Symphony G10 */
    val G10 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony G100 */
    val G100 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony G10plus */
    val G10PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony G27 */
    val G27 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Symphony G27 Lite */
    val G27_LITE = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Symphony G50 */
    val G50 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony H300 */
    val H300 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony H400 */
    val H400 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony helio_30 */
    val HELIO_30 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Symphony helio_80 */
    val HELIO_80 = "spec:width=1080,height=2412,unit=px,dpi=480"

    /** Symphony Helio S60 */
    val HELIO_S60 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Symphony i10 */
    val I10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony i100 */
    val I100 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony i10 plus */
    val I10_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony i12 */
    val I12 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i120 */
    val I120 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i15 */
    val I15 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i18 */
    val I18 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i20 */
    val I20 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony i25 */
    val I25 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony i30 */
    val I30 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i32 */
    val I32 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony i50 */
    val I50 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony i60 */
    val I60 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony i65 */
    val I65 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i66 */
    val I66 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i67 */
    val I67 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i68 */
    val I68 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i69 */
    val I69 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i71 */
    val I71 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i72 */
    val I72 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i74 */
    val I74 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony  i80  */
    val I80 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Symphony i85 */
    val I85 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony i90 */
    val I90 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony i95 */
    val I95 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i96 */
    val I96 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony i97 */
    val I97 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i98 */
    val I98 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony i99 */
    val I99 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Symphony innova10 */
    val INNOVA10 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony innova20 */
    val INNOVA20 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony innova30 */
    val INNOVA30 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Symphony innova_40 */
    val INNOVA_40 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Symphony P11 */
    val P11 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony P6 PRO */
    val P6_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony P7 Pro */
    val P7_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony P8 PRO */
    val P8_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony P9+ */
    val P9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Symphony P9 */
    val P9_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony R100 */
    val R100 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony R20 */
    val R20 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony R30 */
    val R30 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony R40 */
    val R40 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony roar_V150 */
    val ROAR_V150 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony Roar_V78 */
    val ROAR_V78 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony roarV95 */
    val ROARV95 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony Symphony G26 */
    val SYMPHONY_G26 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Symphony Symphony i73 */
    val SYMPHONY_I73 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony Symphony V138Lite */
    val SYMPHONY_V138LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony  Symphony_Z12  */
    val SYMPHONY_Z12 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Symphony Symphony_Z50 */
    val SYMPHONY_Z50 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony Symphony_Z9 */
    val SYMPHONY_Z9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Symphony SYMTAB25 */
    val SYMTAB25 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Symphony SYMTAB60 */
    val SYMTAB60 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Symphony SYMTAB 80 */
    val SYMTAB_80 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Symphony V100 */
    val V100 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V102 */
    val V102 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V105 */
    val V105 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony V110 */
    val V110 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V120 */
    val V120 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V128 */
    val V128 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony V130 */
    val V130 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony V138 */
    val V138 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony V139 */
    val V139 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony V140 */
    val V140 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony V141 */
    val V141 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony V142 */
    val V142 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony V145 */
    val V145 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V155 */
    val V155 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony V34 */
    val V34 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Symphony V44 */
    val V44 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V47 */
    val V47 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V48 */
    val V48 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V65 */
    val V65 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V75 */
    val V75 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V75m */
    val V75M = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V85 */
    val V85 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Symphony V92 */
    val V92 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V94 */
    val V94 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony V96 */
    val V96 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V97 */
    val V97 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Symphony V98 */
    val V98 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V99 */
    val V99 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Symphony V99+ */
    val V99_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Symphony Z10 */
    val Z10 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Symphony Z15 */
    val Z15 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Symphony Z16 */
    val Z16 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony Z18 */
    val Z18 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony Z20 */
    val Z20 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Symphony Z22 */
    val Z22 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony Z25 */
    val Z25 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Symphony Z28 */
    val Z28 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony Z30 */
    val Z30 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony Z30 pro */
    val Z30_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony Z32 */
    val Z32 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony Z33 */
    val Z33 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony Z35 */
    val Z35 = "spec:width=720,height=1640,unit=px,dpi=260"

    /** Symphony Z40 */
    val Z40 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony Z42 */
    val Z42 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony Z42_pro */
    val Z42_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony Z45 */
    val Z45 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony Z55 */
    val Z55 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Symphony Z60 */
    val Z60 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony Z60 Plus */
    val Z60_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Symphony Z70 */
    val Z70 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Symphony Z72 */
    val Z72 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Symphony ZVII */
    val ZVII = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Symphony ZVIII */
    val ZVIII = "spec:width=1080,height=1920,unit=px,dpi=480"

}
