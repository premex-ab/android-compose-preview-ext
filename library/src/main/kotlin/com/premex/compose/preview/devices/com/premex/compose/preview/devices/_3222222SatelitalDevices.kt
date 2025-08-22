package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * 3222222Satelital device specifications for Android Compose previews.
 *
 * This extension provides 3222222Satelital device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._3222222Satelital.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._3222222Satelital: Any
  get() = object {
      /** DeviceSpec(manufacturer=3222222Satelital, code=G706, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=3222222Satelital, code=G706,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val G706 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
