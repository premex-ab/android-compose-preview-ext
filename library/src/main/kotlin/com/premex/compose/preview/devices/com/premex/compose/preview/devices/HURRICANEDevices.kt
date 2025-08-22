package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HURRICANE device specifications for Android Compose previews.
 *
 * This extension provides HURRICANE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HURRICANE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HURRICANE: Any
  get() = object {
      /** DeviceSpec(manufacturer=HURRICANE, code=Iris_Plus, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HURRICANE, code=Iris_Plus,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val IRIS_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

  }
