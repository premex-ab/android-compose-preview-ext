package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RAMTECHNOLOGY device specifications for Android Compose previews.
 *
 * This extension provides RAMTECHNOLOGY device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RAMTECHNOLOGY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RAMTECHNOLOGY: Any
  get() = object {
      /** DeviceSpec(manufacturer=RAMTECHNOLOGY, code=STAR, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAMTECHNOLOGY, code=STAR,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val STAR = "spec:width=600,height=1024,unit=px,dpi=160"

  }
