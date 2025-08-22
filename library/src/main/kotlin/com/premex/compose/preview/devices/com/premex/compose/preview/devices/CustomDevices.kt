package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Custom device specifications for Android Compose previews.
 *
 * This extension provides Custom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Custom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Custom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Custom, code=Ares, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Custom, code=Ares, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val ARES = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Custom, code=K-Ranger, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Custom, code=K-Ranger, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val K_RANGER = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Custom, code=P-Ranger, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Custom, code=P-Ranger, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P_RANGER = "spec:width=720,height=1280,unit=px,dpi=320"

  }
