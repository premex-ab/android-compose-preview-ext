package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MLOGIX device specifications for Android Compose previews.
 *
 * This extension provides MLOGIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MLOGIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MLOGIX: Any
  get() = object {
      /** DeviceSpec(manufacturer=MLOGIX, code=10ML_012G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLOGIX, code=10ML_012G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _10ML_012G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MLOGIX, code=8ML_08G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLOGIX, code=8ML_08G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _8ML_08G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
