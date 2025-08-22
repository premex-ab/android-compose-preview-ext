package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * X-mobile device specifications for Android Compose previews.
 *
 * This extension provides X-mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xmobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=X-mobile, code=XM-SW1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X-mobile, code=XM-SW1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val XM_SW1 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
