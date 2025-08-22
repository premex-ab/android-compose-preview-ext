package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CORN device specifications for Android Compose previews.
 *
 * This extension provides CORN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CORN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CORN: Any
  get() = object {
      /** DeviceSpec(manufacturer=CORN, code=C5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=C5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CORN, code=C55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=C55, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CORN, code=C55_Pro, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=C55_Pro, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val C55_PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CORN, code=C60, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=C60, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val C60 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CORN, code=C60_Ultra, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=C60_Ultra, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val C60_ULTRA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CORN, code=Coco10_Ultra_4G, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Coco10_Ultra_4G,
      width=720, height=1600, dpi=480, isGoogleDevice=false).code */
      val COCO10_ULTRA_4G = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CORN, code=CORN_R10, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=CORN_R10, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val CORN_R10 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CORN, code=Corn_Star8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Corn_Star8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CORN_STAR8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CORN, code=CORN_X5, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=CORN_X5, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val CORN_X5 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=CORN, code=CORN_X55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=CORN_X55, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val CORN_X55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CORN, code=G60, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=G60, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val G60 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=CORN, code=G60_Pro_4G, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=G60_Pro_4G, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val G60_PRO_4G = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=CORN, code=Note1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Note1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOTE1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CORN, code=Play25_Pro_4G, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Play25_Pro_4G,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val PLAY25_PRO_4G = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CORN, code=R10E, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=R10E, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R10E = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CORN, code=R10S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=R10S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val R10S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CORN, code=R20, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=R20, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CORN, code=R40, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=R40, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val R40 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CORN, code=Star10_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Star10_3G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STAR10_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CORN, code=Star10_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Star10_Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STAR10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CORN, code=Star8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Star8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val STAR8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CORN, code=Star8_3G, width=600, height=1024, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Star8_3G, width=600,
      height=1024, dpi=220, isGoogleDevice=false).code */
      val STAR8_3G = "spec:width=600,height=1024,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=CORN, code=Tronik_12, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Tronik_12, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TRONIK_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CORN, code=Tronik_12S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Tronik_12S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TRONIK_12S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CORN, code=Tronik_13S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Tronik_13S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TRONIK_13S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CORN, code=X5S, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=X5S, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X5S = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CORN, code=X60, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=X60, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val X60 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=CORN, code=Y60, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CORN, code=Y60, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val Y60 = "spec:width=480,height=1014,unit=px,dpi=200"

  }
