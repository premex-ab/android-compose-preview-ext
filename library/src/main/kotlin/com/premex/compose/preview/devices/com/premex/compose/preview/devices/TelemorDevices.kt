package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Telemor device specifications for Android Compose previews.
 *
 * This extension provides Telemor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telemor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telemor: Any
  get() = object {
      /** DeviceSpec(manufacturer=Telemor, code=T9503, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telemor, code=T9503, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T9503 = "spec:width=480,height=854,unit=px,dpi=240"

  }
