package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TRUE_SLIM device specifications for Android Compose previews.
 *
 * This extension provides TRUE_SLIM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TRUESLIM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TRUESLIM: Any
  get() = object {
      /** DeviceSpec(manufacturer=TRUE_SLIM, code=T1586K, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TRUE_SLIM, code=T1586K, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val T1586K = "spec:width=480,height=960,unit=px,dpi=200"

  }
