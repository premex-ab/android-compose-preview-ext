package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CJHV device specifications for Android Compose previews.
 *
 * This extension provides CJHV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CJHV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CJHV: Any
  get() = object {
      /** DeviceSpec(manufacturer=CJHV, code=kr101, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CJHV, code=kr101, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KR101 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
