package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNIWA device specifications for Android Compose previews.
 *
 * This extension provides UNIWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Uniwa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Uniwa: Any
  get() = object {
      /** UNIWA K626 */
      val K626 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** UNIWA M101 */
      val M101 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** UNIWA UNIWA_W888 */
      val UNIWA_W888 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** UNIWA UNIWA_W999 */
      val UNIWA_W999 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** UNIWA W555 */
      val W555 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
