package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JDS device specifications for Android Compose previews.
 *
 * This extension provides JDS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jds.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jds: Any
  get() = object {
      /** JDS Amigo7xJDS */
      val AMIGO7XJDS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
