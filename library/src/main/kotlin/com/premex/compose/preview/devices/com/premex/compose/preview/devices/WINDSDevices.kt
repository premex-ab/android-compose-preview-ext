package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WINDS device specifications for Android Compose previews.
 *
 * This extension provides WINDS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WINDS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WINDS: Any
  get() = object {
      /** DeviceSpec(manufacturer=WINDS, code=WINDS-T3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WINDS, code=WINDS-T3, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val WINDS_T3 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
