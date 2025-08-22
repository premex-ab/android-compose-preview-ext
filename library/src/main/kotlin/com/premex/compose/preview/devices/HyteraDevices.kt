package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hytera device specifications for Android Compose previews.
 *
 * This extension provides Hytera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hytera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hytera: Any
  get() = object {
      /** Hytera PDC680 */
      val PDC680 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hytera PNC460 */
      val PNC460 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Hytera PNC550 */
      val PNC550 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Hytera PNC560 */
      val PNC560 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Hytera PTC680 */
      val PTC680 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
