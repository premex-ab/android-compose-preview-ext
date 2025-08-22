package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARBOR device specifications for Android Compose previews.
 *
 * This extension provides ARBOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARBOR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARBOR: Any
  get() = object {
      /** ARBOR G47 */
      val G47 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ARBOR GT78-VN */
      val GT78_VN = "spec:width=800,height=1280,unit=px,dpi=240"

  }
