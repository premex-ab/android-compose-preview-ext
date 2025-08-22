package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Airpha device specifications for Android Compose previews.
 *
 * This extension provides Airpha device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Airpha.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Airpha: Any
  get() = object {
      /** DeviceSpec(manufacturer=Airpha, code=Halo3_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Airpha, code=Halo3_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val HALO3_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Airpha, code=Halo4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Airpha, code=Halo4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HALO4 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
