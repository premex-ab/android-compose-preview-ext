package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Just5 device specifications for Android Compose previews.
 *
 * This extension provides Just5 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Just5.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Just5: Any
  get() = object {
      /** Just5 Konrow */
      val KONROW = "spec:width=480,height=854,unit=px,dpi=240"

      /** Just5 M503 */
      val M503 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Just5 MD-02P */
      val MD_02P = "spec:width=480,height=800,unit=px,dpi=240"

  }
