package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PCD device specifications for Android Compose previews.
 *
 * This extension provides PCD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PCD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PCD: Any
  get() = object {
      /** DeviceSpec(manufacturer=PCD, code=Bengal_Max_iW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=Bengal_Max_iW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BENGAL_MAX_IW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PCD, code=P40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val P40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=P41, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P41, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val P41 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=P50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=P50PR, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P50PR, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P50PR = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=P55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P55, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=P60, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P60, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P60 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=P60_CA, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P60_CA, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P60_CA = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PCD, code=P60_CENAM, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P60_CENAM, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P60_CENAM = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=P63L_PR, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P63L_PR, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val P63L_PR = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PCD, code=P65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PCD, code=P65_CA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=P65_CA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P65_CA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PCD, code=PH4003, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=PH4003, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PH4003 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=PH4003GO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=PH4003GO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PH4003GO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=PH5003, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=PH5003, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PH5003 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=PH5003_Go, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=PH5003_Go, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PH5003_GO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=PL550, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=PL550, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PL550 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PCD, code=PL571, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=PL571, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PL571 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PCD, code=PL571US, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCD, code=PL571US, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PL571US = "spec:width=720,height=1440,unit=px,dpi=320"

  }
