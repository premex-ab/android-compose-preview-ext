package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AKA device specifications for Android Compose previews.
 *
 * This extension provides AKA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AKA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AKA: Any
  get() = object {
      /** DeviceSpec(manufacturer=AKA, code=Model_A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AKA, code=Model_A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MODEL_A = "spec:width=480,height=854,unit=px,dpi=240"

  }
