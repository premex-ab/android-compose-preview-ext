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
 * @Preview(device = Devices.GreentelMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GreentelMobile: Any
  get() = object {
      /** greentel_mobile X_MAX */
      val X_MAX = "spec:width=480,height=800,unit=px,dpi=240"

  }
