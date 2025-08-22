package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OWN device specifications for Android Compose previews.
 *
 * This extension provides OWN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OWN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OWN: Any
  get() = object {
      /** DeviceSpec(manufacturer=OWN, code=OWN_FUN_6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OWN, code=OWN_FUN_6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val OWN_FUN_6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OWN, code=OWN_FUN_7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OWN, code=OWN_FUN_7, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val OWN_FUN_7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OWN, code=OWN_SMART_9, width=720, height=1528, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OWN, code=OWN_SMART_9, width=720,
      height=1528, dpi=280, isGoogleDevice=false).code */
      val OWN_SMART_9 = "spec:width=720,height=1528,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OWN, code=Smart_9_Pro, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OWN, code=Smart_9_Pro, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val SMART_9_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OWN, code=SMART_O2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OWN, code=SMART_O2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SMART_O2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OWN, code=VFD511, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OWN, code=VFD511, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val VFD511 = "spec:width=480,height=854,unit=px,dpi=240"

  }
