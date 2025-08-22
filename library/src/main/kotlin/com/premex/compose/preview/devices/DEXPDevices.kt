package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DEXP device specifications for Android Compose previews.
 *
 * This extension provides DEXP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DEXP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DEXP: Any
  get() = object {
      /** DEXP A160 */
      val A160 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DEXP A250 */
      val A250 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DEXP A350 */
      val A350 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DEXP A355 */
      val A355 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DEXP A360 */
      val A360 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DEXP A440 */
      val A440 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DEXP A455 */
      val A455 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DEXP A555 */
      val A555 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DEXP AL250 */
      val AL250 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DEXP AL350 */
      val AL350 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DEXP AS155 */
      val AS155 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DEXP AS260 */
      val AS260 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DEXP AS360 */
      val AS360 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DEXP B11 */
      val B11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP B17 */
      val B17 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEXP B18 */
      val B18 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DEXP B21 */
      val B21 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP B27 */
      val B27 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DEXP B28 */
      val B28 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DEXP B31 */
      val B31 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP B340 */
      val B340 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DEXP B355 */
      val B355 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DEXP B38 */
      val B38 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP B450 */
      val B450 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DEXP BL150 */
      val BL150 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DEXP BL155 */
      val BL155 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DEXP BL160 */
      val BL160 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DEXP BL250 */
      val BL250 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DEXP BL350 */
      val BL350 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DEXP BS155 */
      val BS155 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DEXP C18 */
      val C18 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP C37 */
      val C37 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP C38 */
      val C38 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP D11 */
      val D11 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DEXP D21 */
      val D21 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DEXP E110 */
      val E110 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP E170 */
      val E170 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DEXP E180 */
      val E180 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP E210 */
      val E210 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP EX111 */
      val EX111 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DEXP G255 */
      val G255 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DEXP G450 */
      val G450 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DEXP G450_2021 */
      val G450_2021 = "spec:width=480,height=854,unit=px,dpi=220"

      /** DEXP G550 */
      val G550 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DEXP GL355 */
      val GL355 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DEXP GS155 */
      val GS155 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DEXP H110 */
      val H110 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP H210 */
      val H210 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP H270 */
      val H270 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DEXP H28 */
      val H28 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DEXP H310 */
      val H310 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DEXP H370 */
      val H370 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEXP H410 */
      val H410 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DEXP K11 */
      val K11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP K17 */
      val K17 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DEXP K18 */
      val K18 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP K21 */
      val K21 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP K28_ */
      val K28 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DEXP K31_ */
      val K31 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP K38 */
      val K38 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DEXP K41 */
      val K41 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DEXP K48 */
      val K48 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DEXP K51 */
      val K51 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP K61 */
      val K61 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DEXP L110 */
      val L110 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DEXP L180 */
      val L180 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP L210 */
      val L210 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP L270 */
      val L270 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEXP L310i */
      val L310I = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP L370i */
      val L370I = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEXP L470 */
      val L470 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DEXP M110 */
      val M110 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DEXP M170 */
      val M170 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEXP M210 */
      val M210 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DEXP N180i */
      val N180I = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP N210 */
      val N210 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP N280 */
      val N280 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP N280i */
      val N280I = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP N310 */
      val N310 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP N370 */
      val N370 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DEXP N380i */
      val N380I = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP N410 */
      val N410 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP N570 */
      val N570 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DEXP P11 */
      val P11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP P210 */
      val P210 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP P280 */
      val P280 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP P350 */
      val P350 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DEXP P380 */
      val P380 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP P380i */
      val P380I = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DEXP P410 */
      val P410 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP P510 */
      val P510 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP Q110 */
      val Q110 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DEXP Q180 */
      val Q180 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DEXP Q210 */
      val Q210 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DEXP Q280 */
      val Q280 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DEXP Q310 */
      val Q310 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DEXP R110 */
      val R110 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP R180 */
      val R180 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP S110 */
      val S110 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DEXP S169 */
      val S169 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEXP S190 */
      val S190 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP S270i */
      val S270I = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP S280 */
      val S280 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DEXP S290 */
      val S290 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DEXP S370 */
      val S370 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEXP S470 */
      val S470 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DEXP S570 */
      val S570 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DEXP S670 */
      val S670 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEXP S770 */
      val S770 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEXP S770i */
      val S770I = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DEXP SENIOR */
      val SENIOR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DEXP T155 */
      val T155 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DEXP T21 */
      val T21 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP VA110 */
      val VA110 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DEXP VA210 */
      val VA210 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEXP XL150 */
      val XL150 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DEXP Z250 */
      val Z250 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DEXP Z455 */
      val Z455 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
