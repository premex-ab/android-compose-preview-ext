package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLACKLINE device specifications for Android Compose previews.
 *
 * This extension provides BLACKLINE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLACKLINE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLACKLINE: Any
  get() = object {
      /** BLACKLINE R10G */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** BLACKLINE R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLACKLINE R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLACKLINE R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLACKLINE R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
