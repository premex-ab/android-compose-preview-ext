package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Myria device specifications for Android Compose previews.
 *
 * This extension provides Myria device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Myria.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Myria: Any
  get() = object {
      /** Myria Myria_Grand_4G */
      val MYRIA_GRAND_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Myria Myria_L550 */
      val MYRIA_L550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Myria Myria_L600 */
      val MYRIA_L600 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
