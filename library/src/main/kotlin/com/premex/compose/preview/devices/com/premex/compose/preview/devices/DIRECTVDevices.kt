package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIRECTV device specifications for Android Compose previews.
 *
 * This extension provides DIRECTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIRECTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIRECTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=DIRECTV, code=HP40A, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIRECTV, code=HP40A, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HP40A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIRECTV, code=HYS0A, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIRECTV, code=HYS0A, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HYS0A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIRECTV, code=p21kw500, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIRECTV, code=p21kw500, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P21KW500 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
