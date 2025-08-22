package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * infocus device specifications for Android Compose previews.
 *
 * This extension provides infocus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Infocus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Infocus: Any
  get() = object {
      /** infocus M320 */
      val M320 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
