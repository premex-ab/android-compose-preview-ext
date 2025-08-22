package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EANCOM device specifications for Android Compose previews.
 *
 * This extension provides EANCOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EANCOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EANCOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=EANCOM, code=PIXBA2019, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EANCOM, code=PIXBA2019, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PIXBA2019 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
