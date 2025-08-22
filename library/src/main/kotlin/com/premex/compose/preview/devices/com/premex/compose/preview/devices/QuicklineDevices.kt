package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Quickline device specifications for Android Compose previews.
 *
 * This extension provides Quickline device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Quickline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Quickline: Any
  get() = object {
      /** DeviceSpec(manufacturer=Quickline, code=dciw387, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Quickline, code=dciw387,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DCIW387 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
