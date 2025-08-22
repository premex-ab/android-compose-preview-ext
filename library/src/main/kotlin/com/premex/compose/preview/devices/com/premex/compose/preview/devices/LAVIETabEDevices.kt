package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LAVIETabE device specifications for Android Compose previews.
 *
 * This extension provides LAVIETabE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LAVIETabE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LAVIETabE: Any
  get() = object {
      /** DeviceSpec(manufacturer=LAVIETabE, code=X704F, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVIETabE, code=X704F, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val X704F = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
