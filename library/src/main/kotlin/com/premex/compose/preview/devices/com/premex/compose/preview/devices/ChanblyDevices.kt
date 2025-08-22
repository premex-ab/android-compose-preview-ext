package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Chanbly device specifications for Android Compose previews.
 *
 * This extension provides Chanbly device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Chanbly.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Chanbly: Any
  get() = object {
      /** DeviceSpec(manufacturer=Chanbly, code=q7, width=480, height=800, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Chanbly, code=q7, width=480,
      height=800, dpi=120, isGoogleDevice=false).code */
      val Q7 = "spec:width=480,height=800,unit=px,dpi=120"

  }
