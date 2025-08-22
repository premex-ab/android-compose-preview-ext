package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dexp device specifications for Android Compose previews.
 *
 * This extension provides Dexp device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dexp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dexp get() = object {
    /** Dexp A160 */
    val A160 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Dexp A250 */
    val A250 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Dexp A.350 */
    val A_350 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Dexp A355 */
    val A355 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Dexp A360 */
    val A360 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Dexp A440 */
    val A440 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Dexp A455 */
    val A455 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Dexp A555 */
    val A555 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Dexp AL250 */
    val AL250 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Dexp AL350 */
    val AL350 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Dexp AS155 */
    val AS155 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Dexp AS260 */
    val AS260 = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Dexp AS360 */
    val AS360 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Dexp B11 */
    val B11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp B17 */
    val B17 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dexp B18 */
    val B18 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dexp B21 */
    val B21 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp B27 */
    val B27 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Dexp B28 */
    val B28 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dexp B31 */
    val B31 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp B340 */
    val B340 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Dexp B355 */
    val B355 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Dexp B38 */
    val B38 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp B450 */
    val B450 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Dexp BL150 */
    val BL150 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Dexp BL155 */
    val BL155 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Dexp BL160 */
    val BL160 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Dexp BL250 */
    val BL250 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Dexp BL350 */
    val BL350 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Dexp BS155 */
    val BS155 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Dexp C18 */
    val C18 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp C37 */
    val C37 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp C38 */
    val C38 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp D11 */
    val D11 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Dexp D21 */
    val D21 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Dexp DEXP M110 */
    val DEXP_M110 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Dexp DEXP M210 */
    val DEXP_M210 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Dexp DEXP S110 */
    val DEXP_S110 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dexp Dexp Ursus P210 */
    val DEXP_URSUS_P210 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp Dexp Ursus P380 */
    val DEXP_URSUS_P380 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp DEXP Ursus S169 */
    val DEXP_URSUS_S169 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dexp DNS_DEXP XL150 Project */
    val DNS_DEXP_XL150_PROJECT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Dexp E110 */
    val E110 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp E170 */
    val E170 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dexp E180 */
    val E180 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp E210 */
    val E210 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp EX111 */
    val EX111 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Dexp G255 */
    val G255 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Dexp G450 */
    val G450 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Dexp G450 2021 */
    val G450_2021 = "spec:width=480,height=854,unit=px,dpi=220"

    /** Dexp G550 */
    val G550 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Dexp GL355 */
    val GL355 = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Dexp GS155 */
    val GS155 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Dexp H110 */
    val H110 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp H210 */
    val H210 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp H270 */
    val H270 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Dexp H28 */
    val H28 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dexp H310 */
    val H310 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Dexp H370 */
    val H370 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dexp H410 */
    val H410 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Dexp Ixion P350 */
    val IXION_P350 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Dexp K11 */
    val K11 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp K17 */
    val K17 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Dexp K18 */
    val K18 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp K21 */
    val K21 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp K28 */
    val K28 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dexp K31 */
    val K31 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp K38 */
    val K38 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dexp K41 */
    val K41 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dexp K48 */
    val K48 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dexp K51 */
    val K51 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp K61 */
    val K61 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dexp L110 */
    val L110 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Dexp L180 */
    val L180 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp L210 */
    val L210 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp L270 */
    val L270 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dexp L310i */
    val L310I = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp L370i */
    val L370I = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dexp L470 */
    val L470 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Dexp M170 */
    val M170 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dexp N180i */
    val N180I = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp N210 */
    val N210 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp N280 */
    val N280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp N280i */
    val N280I = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp N310 */
    val N310 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp N370 */
    val N370 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Dexp N380i */
    val N380I = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp N410 */
    val N410 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp N570 */
    val N570 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dexp P11 */
    val P11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp P280 */
    val P280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp P380i */
    val P380I = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dexp P410 */
    val P410 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp P510 */
    val P510 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp Q110 */
    val Q110 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Dexp Q180 */
    val Q180 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Dexp Q210 */
    val Q210 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Dexp Q280 */
    val Q280 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Dexp Q310 */
    val Q310 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Dexp R110 */
    val R110 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp R180 */
    val R180 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp S190 */
    val S190 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp S270i */
    val S270I = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp S280 */
    val S280 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dexp S290 */
    val S290 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dexp S370 */
    val S370 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dexp S470 */
    val S470 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Dexp S570 */
    val S570 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Dexp S670 */
    val S670 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dexp S770 */
    val S770 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dexp S770i */
    val S770I = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dexp Senior */
    val SENIOR = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Dexp T155 */
    val T155 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Dexp T21 */
    val T21 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp VA110 */
    val VA110 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dexp VA210 */
    val VA210 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dexp Z250 */
    val Z250 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Dexp Z455 */
    val Z455 = "spec:width=720,height=1440,unit=px,dpi=320"

}
