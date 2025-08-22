package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CignalPlayTV device specifications for Android Compose previews.
 *
 * This extension provides CignalPlayTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CignalPlayTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CignalPlayTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=CignalPlayTV, code=CIGSEI100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CignalPlayTV, code=CIGSEI100,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CIGSEI100 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
