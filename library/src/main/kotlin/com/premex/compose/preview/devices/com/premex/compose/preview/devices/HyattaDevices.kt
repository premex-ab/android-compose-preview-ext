package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hyatta device specifications for Android Compose previews.
 *
 * This extension provides Hyatta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hyatta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hyatta: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hyatta, code=Model_5, width=480, height=800, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyatta, code=Model_5, width=480,
      height=800, dpi=220, isGoogleDevice=false).code */
      val MODEL_5 = "spec:width=480,height=800,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Hyatta, code=Model_6s, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyatta, code=Model_6s, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val MODEL_6S = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
