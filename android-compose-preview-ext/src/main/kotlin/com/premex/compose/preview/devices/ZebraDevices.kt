package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Zebra device specifications for Android Compose previews.
 *
 * This extension provides Zebra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zebra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zebra: Any
  get() = object {
      /** Zebra CC605LN */
      val CC605LN = "spec:width=720,height=1280,unit=px,dpi=160"

      /** Zebra CC610LC */
      val CC610LC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Zebra CC610PC */
      val CC610PC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Zebra EC30RT */
      val EC30RT = "spec:width=480,height=854,unit=px,dpi=320"

      /** Zebra EC50 */
      val EC50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra EC55 */
      val EC55 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra EM45 */
      val EM45 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Zebra ET40L */
      val ET40L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Zebra ET40S */
      val ET40S = "spec:width=800,height=1280,unit=px,dpi=220"

      /** Zebra ET45L */
      val ET45L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Zebra ET45S */
      val ET45S = "spec:width=800,height=1280,unit=px,dpi=220"

      /** Zebra ET50E */
      val ET50E = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Zebra ET50T */
      val ET50T = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Zebra ET51L */
      val ET51L = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** Zebra ET51S */
      val ET51S = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** Zebra ET55E */
      val ET55E = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Zebra ET55T */
      val ET55T = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Zebra ET56L */
      val ET56L = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** Zebra ET56S */
      val ET56S = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** Zebra ET60 */
      val ET60 = "spec:width=1200,height=1920,unit=px,dpi=220"

      /** Zebra ET65 */
      val ET65 = "spec:width=1200,height=1920,unit=px,dpi=220"

      /** Zebra KC50L */
      val KC50L = "spec:width=1080,height=1920,unit=px,dpi=220"

      /** Zebra KC50S */
      val KC50S = "spec:width=1080,height=1920,unit=px,dpi=220"

      /** Zebra L10AW */
      val L10AW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Zebra MC2200 */
      val MC2200 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra MC2700 */
      val MC2700 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra MC33 */
      val MC33 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra MC3300x */
      val MC3300X = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra MC3300xC */
      val MC3300XC = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra MC33C */
      val MC33C = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra MC3400 */
      val MC3400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra MC93 */
      val MC93 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra MC93C */
      val MC93C = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra MC9400 */
      val MC9400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra MC9450 */
      val MC9450 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra PS20JP */
      val PS20JP = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra TC15 */
      val TC15 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Zebra TC20KB */
      val TC20KB = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra TC20RD */
      val TC20RD = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra TC20RT */
      val TC20RT = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra TC21 */
      val TC21 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC22 */
      val TC22 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Zebra TC25FM */
      val TC25FM = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra TC26 */
      val TC26 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC27 */
      val TC27 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Zebra TC51 */
      val TC51 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC51HC */
      val TC51HC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC52 */
      val TC52 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC52X */
      val TC52X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Zebra TC53 */
      val TC53 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Zebra TC53E */
      val TC53E = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Zebra TC55 */
      val TC55 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra TC56 */
      val TC56 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC57 */
      val TC57 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC57X */
      val TC57X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Zebra TC58 */
      val TC58 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Zebra TC58E */
      val TC58E = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Zebra TC70 */
      val TC70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC70x */
      val TC70X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC72 */
      val TC72 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC73 */
      val TC73 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Zebra TC73T */
      val TC73T = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Zebra TC75 */
      val TC75 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC75x */
      val TC75X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC75xDF */
      val TC75XDF = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC77 */
      val TC77 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Zebra TC78 */
      val TC78 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Zebra TC78T */
      val TC78T = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Zebra TC8000 */
      val TC8000 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra TC83B0 */
      val TC83B0 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra TC83BH */
      val TC83BH = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra VC80x */
      val VC80X = "spec:width=768,height=1024,unit=px,dpi=160"

      /** Zebra VC8308 */
      val VC8308 = "spec:width=720,height=1280,unit=px,dpi=160"

      /** Zebra VC8310 */
      val VC8310 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** Zebra WT63B0 */
      val WT63B0 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Zebra WT6400 */
      val WT6400 = "spec:width=720,height=1280,unit=px,dpi=280"

  }
