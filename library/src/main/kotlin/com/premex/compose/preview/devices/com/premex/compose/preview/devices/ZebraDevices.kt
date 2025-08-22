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
      /** DeviceSpec(manufacturer=Zebra, code=CC605LN, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=CC605LN, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CC605LN = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Zebra, code=CC610LC, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=CC610LC, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CC610LC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Zebra, code=CC610PC, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=CC610PC, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CC610PC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Zebra, code=EC30RT, width=480, height=854, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=EC30RT, width=480,
      height=854, dpi=320, isGoogleDevice=false).code */
      val EC30RT = "spec:width=480,height=854,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=EC50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=EC50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EC50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=EC55, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=EC55, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EC55 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=EM45, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=EM45, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val EM45 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=ET40L, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET40L, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ET40L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=ET40S, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET40S, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val ET40S = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Zebra, code=ET45L, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET45L, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ET45L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=ET45S, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET45S, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val ET45S = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Zebra, code=ET50E, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET50E, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ET50E = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=ET50T, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET50T, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ET50T = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=ET51L, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET51L, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val ET51L = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=ET51S, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET51S, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val ET51S = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=ET55E, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET55E, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ET55E = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=ET55T, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET55T, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ET55T = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=ET56L, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET56L, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val ET56L = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=ET56S, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET56S, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val ET56S = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=ET60, width=1200, height=1920, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET60, width=1200,
      height=1920, dpi=220, isGoogleDevice=false).code */
      val ET60 = "spec:width=1200,height=1920,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Zebra, code=ET65, width=1200, height=1920, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=ET65, width=1200,
      height=1920, dpi=220, isGoogleDevice=false).code */
      val ET65 = "spec:width=1200,height=1920,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Zebra, code=KC50L, width=1080, height=1920, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=KC50L, width=1080,
      height=1920, dpi=220, isGoogleDevice=false).code */
      val KC50L = "spec:width=1080,height=1920,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Zebra, code=KC50S, width=1080, height=1920, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=KC50S, width=1080,
      height=1920, dpi=220, isGoogleDevice=false).code */
      val KC50S = "spec:width=1080,height=1920,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Zebra, code=L10AW, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=L10AW, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val L10AW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC2200, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC2200, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC2200 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC2700, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC2700, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC2700 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC33, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC33, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC33 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC3300x, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC3300x, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC3300X = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC3300xC, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC3300xC, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC3300XC = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC33C, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC33C, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC33C = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC3400, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC3400, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC3400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC93, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC93, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC93 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC93C, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC93C, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC93C = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC9400, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC9400, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC9400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=MC9450, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=MC9450, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC9450 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=PS20JP, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=PS20JP, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PS20JP = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=TC15, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC15, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TC15 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC20KB, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC20KB, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TC20KB = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=TC20RD, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC20RD, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TC20RD = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=TC20RT, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC20RT, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TC20RT = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=TC21, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC21, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC21 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC22, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC22, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TC22 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC25FM, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC25FM, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TC25FM = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=TC26, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC26, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC26 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC27, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC27, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TC27 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC51, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC51, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC51 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC51HC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC51HC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC51HC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC52, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC52, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC52 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC52X, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC52X, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TC52X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC53, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC53, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TC53 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC53E, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC53E, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TC53E = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC55, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC55, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TC55 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=TC56, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC56, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC56 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC57, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC57, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC57 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC57X, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC57X, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TC57X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC58, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC58, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TC58 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC58E, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC58E, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TC58E = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC70, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC70, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC70x, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC70x, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC70X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC72, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC72, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC72 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC73, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC73, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TC73 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC73T, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC73T, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TC73T = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC75, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC75, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC75 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC75x, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC75x, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC75X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC75xDF, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC75xDF, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC75XDF = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC77, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC77, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TC77 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zebra, code=TC78, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC78, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TC78 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC78T, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC78T, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TC78T = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Zebra, code=TC8000, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC8000, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TC8000 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=TC83B0, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC83B0, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TC83B0 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=TC83BH, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=TC83BH, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TC83BH = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=VC80x, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=VC80x, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VC80X = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Zebra, code=VC8308, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=VC8308, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val VC8308 = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Zebra, code=VC8310, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=VC8310, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VC8310 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Zebra, code=WT63B0, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=WT63B0, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val WT63B0 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Zebra, code=WT6400, width=720, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zebra, code=WT6400, width=720,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val WT6400 = "spec:width=720,height=1280,unit=px,dpi=280"

  }
