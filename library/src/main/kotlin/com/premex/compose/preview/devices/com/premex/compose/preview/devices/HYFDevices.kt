package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HYF device specifications for Android Compose previews.
 *
 * This extension provides HYF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HYF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HYF: Any
  get() = object {
      /** DeviceSpec(manufacturer=HYF, code=SQ126G, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HYF, code=SQ126G, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val SQ126G = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
