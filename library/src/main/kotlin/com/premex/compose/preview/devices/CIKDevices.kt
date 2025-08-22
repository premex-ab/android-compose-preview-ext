package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CIK device specifications for Android Compose previews.
 *
 * This extension provides CIK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CIK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CIK: Any
  get() = object {
      /** CIK S4000 */
      val S4000 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
