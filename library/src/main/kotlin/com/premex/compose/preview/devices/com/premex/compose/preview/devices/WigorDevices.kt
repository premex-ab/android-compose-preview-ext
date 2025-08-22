package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wigor device specifications for Android Compose previews.
 *
 * This extension provides Wigor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wigor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wigor: Any
  get() = object {
      /** DeviceSpec(manufacturer=Wigor, code=V5, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wigor, code=V5, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val V5 = "spec:width=720,height=1512,unit=px,dpi=320"

  }
