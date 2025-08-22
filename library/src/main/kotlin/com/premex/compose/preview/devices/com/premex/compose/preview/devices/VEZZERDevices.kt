package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VEZZER device specifications for Android Compose previews.
 *
 * This extension provides VEZZER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VEZZER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VEZZER: Any
  get() = object {
      /** DeviceSpec(manufacturer=VEZZER, code=lakeside, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEZZER, code=lakeside, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VEZZER, code=piha, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEZZER, code=piha, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PIHA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
