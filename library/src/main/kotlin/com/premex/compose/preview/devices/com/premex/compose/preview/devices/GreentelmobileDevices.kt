package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * greentel_mobile device specifications for Android Compose previews.
 *
 * This extension provides greentel_mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Greentelmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Greentelmobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=greentel_mobile, code=X_MAX, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=greentel_mobile, code=X_MAX,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val X_MAX = "spec:width=480,height=800,unit=px,dpi=240"

  }
