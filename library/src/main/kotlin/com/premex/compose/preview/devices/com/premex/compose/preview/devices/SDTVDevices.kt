package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SDTV device specifications for Android Compose previews.
 *
 * This extension provides SDTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SDTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SDTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=SDTV, code=HY44J, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SDTV, code=HY44J, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HY44J = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
